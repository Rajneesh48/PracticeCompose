package com.example.practicecompose
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.Icon
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale.Companion.Crop
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.practicecompose.ui.theme.Grey
import com.example.practicecompose.ui.theme.LightBlue


@Preview(showBackground = true)
@Composable
fun ProfileScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .systemBarsPadding()
            .padding(top = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
        ) {

            Image(
                painter = painterResource(R.drawable.profile_bg),
                contentDescription = "Profile image",
                modifier = Modifier
                    .size(100.dp)
                    .align(Alignment.Center)
                    .clip(CircleShape),
                contentScale = Crop,

                )
            Icon(
                painter = painterResource(R.drawable.edit),
                contentDescription = "Edit",
                modifier = Modifier
                    .padding(end = 20.dp)
                    .size(24.dp)
                    .align(Alignment.TopEnd),
                tint = Color.Blue
            )
        }
        Spacer(
            modifier = Modifier
                .height(18.dp)
        )

        Text(
            text = "Rajneesh Kumar",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(6.dp))

        Text(
            text = "Android Developer",
            fontSize = 18.sp,
            color = Color.Gray
        )
        Spacer(modifier = Modifier.height(10.dp))
        Box(
            modifier = Modifier.fillMaxWidth()
                .padding(horizontal = 10.dp)
                .background(color = LightBlue, shape = RoundedCornerShape(18.dp)),
        ) {
            Column(
                modifier = Modifier.fillMaxWidth().padding(10.dp)
                    .padding(start = 16.dp)
            ) {
                Text(
                    text = "Find a job faster",
                    fontSize = 22.sp,
                    color = Color.White
                )
                Spacer(modifier = Modifier.height(6.dp))
                Text(
                    text = "Attract more attention to your resume",
                    fontSize = 16.sp,
                    color = Color.White
                )
            }
            Icon(
                imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                contentDescription = "arrow",
                modifier = Modifier.align(Alignment.CenterEnd)
                    .size(50.dp),
                tint = Color.White
            )

        }
        Spacer(modifier = Modifier.height(10.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(40.dp)
                .padding(horizontal = 20.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Resume",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
            )

            Spacer(modifier = Modifier.weight(1f))

            Text(
                text = "Create Resume",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                color = Color.Blue
            )
Box(modifier = Modifier.size(40.dp), contentAlignment = Alignment.Center){
            Icon(
                imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                contentDescription = null,
                tint = Color.Blue,
                modifier = Modifier
                    .requiredSize(28.dp)
            )}
        }
        Card(modifier = Modifier.fillMaxWidth()
            .padding(4.dp)
        , elevation = CardDefaults.cardElevation(2.dp)
        , colors = CardDefaults.cardColors(containerColor = Color.White)) {
                Column(modifier = Modifier.padding(10.dp)) {
            Text(
                text = "UI/UX Designer",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
                    Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = "Updated on Feb 12, 12:33",
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold,
                    color = Grey
                )
                Spacer(modifier = Modifier.height(20.dp))
                Row(modifier = Modifier.fillMaxWidth()
                    .height(40.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column(  horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(
                            text = "12",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = "Views",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold,
                            color = Grey
                        )}
                    Column() {
                        Row() {
                        Text(
                            text = "24 ",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = "+4",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Red
                        )}
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = "Profile Views",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold,
                            color = Grey
                        )}
                    Column() {
                        Row() {
                        Text(
                            text = "6 " ,
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = "+1 " ,
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Red
                        )}
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = "Invitations",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold,
                            color = Grey)}}
                    Spacer(modifier = Modifier.height(10.dp))
                    Row(modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween) {
                    Button(onClick = {}, shape = (RoundedCornerShape(10.dp))
                    , colors = ButtonDefaults.buttonColors(containerColor = LightBlue)
                    ){
                        Text(text = "Boost in Search")
                    }
                    OutlinedButton(onClick = {}, shape = (RoundedCornerShape(10.dp))){
                        Text(text = "Vacancies")
                    }}
                }}

        Spacer(modifier = Modifier.height(10.dp))
        Row(modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center) {
            Box(
                modifier = Modifier.size(10.dp)
                    .background(color = Color.Blue, shape = CircleShape),
            ){}

            Box(
                modifier = Modifier.size(10.dp)
                    .offset(2.dp)
                    .background(color = Grey, shape = CircleShape),
            ){}

        }
        Card(
            modifier = Modifier
                .fillMaxWidth()

                .padding(horizontal = 8.dp),
                elevation = CardDefaults.cardElevation(2.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White)

        ) {
            Row(modifier = Modifier.fillMaxWidth().padding(5.dp)
            , verticalAlignment = Alignment.CenterVertically){
            Text(
                text = "Search Country",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                modifier = Modifier.padding(start = 8.dp)
            )

            Spacer(modifier = Modifier.weight(1f))

            Text(
                text = "Russia",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                color = Color.Gray
            )
            Box(modifier = Modifier.size(40.dp),
                contentAlignment = Alignment.Center){
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                    contentDescription = null,
                    tint = Grey,
                    modifier = Modifier
                        .requiredSize(28.dp)
                )}
            }
    }
        Spacer(modifier = Modifier.height(10.dp))
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp),
            elevation = CardDefaults.cardElevation(2.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White)

        ) {
            Row(modifier = Modifier.fillMaxWidth().padding(5.dp)
                , verticalAlignment = Alignment.CenterVertically){
                Text(
                    text = "Notifications",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    modifier = Modifier.padding(start = 8.dp)
                )

                Spacer(modifier = Modifier.weight(1f))

Box(modifier = Modifier.size(20.dp)
    .offset(x = 10.dp)
    .background(color = Color.Red , shape = CircleShape),
    contentAlignment = Alignment.Center,
){
    Text(
        text = "1",
        color = Color.White,
        fontSize = 12.sp,
        fontWeight = FontWeight.Bold,)
}
                Box(modifier = Modifier.size(40.dp),
                    contentAlignment = Alignment.Center){
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                        contentDescription = null,
                        tint = Grey,
                        modifier = Modifier
                            .size(28.dp)
                    )}
            }
        }


}}

