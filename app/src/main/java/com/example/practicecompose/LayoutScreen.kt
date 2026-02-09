package com.example.practicecompose


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview(showBackground = true)
@Composable
fun layoutscreen(){
    Box(modifier = Modifier.fillMaxSize().systemBarsPadding()){
        Image(painter = painterResource(R.drawable.profile_bg),
            contentDescription = "background image",
            contentScale = ContentScale.Crop,
            modifier = Modifier.matchParentSize().alpha(0.48f))
        Box(modifier = Modifier.background(color = Color.Black).height(100.dp)
            .width(100.dp).align(Alignment.BottomStart)){}
        Box(modifier = Modifier.background(color = Color.Black).height(100.dp)
            .width(100.dp).align(Alignment.TopStart)){}
        Box(modifier = Modifier.background(color = Color.Black).height(100.dp)
            .width(100.dp).align(Alignment.BottomEnd)){}
        Box(modifier = Modifier.background(color = Color.Black).height(100.dp)
            .width(100.dp).align(Alignment.TopEnd)){}
        Box(modifier = Modifier.background(color = Color.Black).height(200.dp)
            .width(200.dp).align(Alignment.Center)){}

    }


}
