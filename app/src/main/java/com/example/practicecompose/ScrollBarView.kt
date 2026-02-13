package com.example.practicecompose

import android.R
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Sms
import androidx.compose.material.icons.filled.Tsunami
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Sms
import androidx.compose.material.icons.outlined.Tsunami
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.practicecompose.ui.theme.LightBlue

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun ScrollBarView(){
    var Navcontroller = rememberNavController()
    var selectedIndex by remember{mutableStateOf(0)}
    var CurrentRoute = Navcontroller.currentBackStackEntryAsState().value?.destination?.route
    selectedIndex = when(CurrentRoute){
        "home"->0
        "message"->1
        "sos"->2
        else -> 0
    }
    Scaffold(topBar = {
        TopAppBar(title = {
            Text(text = "Top App Bar")
        },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = LightBlue
            ))
    },
        bottomBar = {
            BottomAppBar(
                containerColor = Color.Black
            ) {
                Row(modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceAround) {
                    Icon( if(selectedIndex ==0){
                        Icons.Filled.Home}
                    else
                        Icons.Outlined.Home,
                        contentDescription = "",
                        tint = Color.White,
                        modifier = Modifier.clickable(
                            indication = null,
                            interactionSource = remember { MutableInteractionSource() },
                        ){
                            Navcontroller.navigate("home"){
                                popUpTo(Navcontroller.graph.startDestinationId){
                                    saveState =true
                                }
                                launchSingleTop = true
                                restoreState = true
                            }
                        })

                    Icon(if (selectedIndex ==1){
                        Icons.Default.Sms}
                    else
                        Icons.Outlined.Sms,
                        contentDescription = "",
                        tint = Color.White,
                        modifier = Modifier.clickable(
                            indication = null,
                            interactionSource = remember { MutableInteractionSource() },
                        ){
                            Navcontroller.navigate("message"){
                                popUpTo(Navcontroller.graph.startDestinationId){
                                    saveState =true
                                }
                                launchSingleTop = true
                                restoreState = true
                            }
                        }
                    )

                    Icon(if (selectedIndex ==2){
                        Icons.Default.Tsunami}
                    else
                        Icons.Outlined.Tsunami,
                        contentDescription = "",
                        tint = Color.White,
                        modifier = Modifier.clickable(
                            indication = null,
                            interactionSource = remember { MutableInteractionSource() },
                        ){
                            Navcontroller.navigate("sos"){
                                popUpTo(Navcontroller.graph.startDestinationId){
                                    saveState = true
                                }
                                restoreState = true
                                launchSingleTop = true
                            }
                        }
                    )
                }

            }
        }
    ){
            innerpadding->

        NavHost(navController = Navcontroller,
            startDestination = "home",
            modifier = Modifier.padding(innerpadding).fillMaxSize()) {
            composable("home") {
                HomeScreen()
            }
            composable("message") {
                mainscreen()
            }
            composable("sos") {
                ProfileScreen()
            }
        }



    }

}

@Composable
fun HomeScreen() {
    Text(text = "Home Screen")
}
