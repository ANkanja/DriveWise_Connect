package com.example.drivewiseconnect2.ui.theme.pages.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.drivewiseconnect2.R
import com.example.drivewiseconnect2.ui.theme.DriveWiseConnect2Theme
import com.example.drivewiseconnect2.ui.theme.Gold
import com.example.drivewiseconnect2.ui.theme.black
import com.example.drivewiseconnect2.ui.theme.pages.dashboard.Dashboard

@Composable
fun HomeScreen(navController: NavHostController) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {



        var context = LocalContext.current
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
        ) {

            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Default.Notifications,
                    contentDescription = "Account",
                    modifier = Modifier
                        .height(30.dp)
                        .width(30.dp),
                )
            }

            Text(
                text = "DriveWise Connect",
                fontSize = 20.sp,
                fontFamily = FontFamily.Default,
                color = Color.Black,
                modifier = Modifier.padding(20.dp, 50.dp, 0.dp, 0.dp),
                fontWeight = FontWeight.ExtraBold,
            )

            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Default.AccountCircle,
                    contentDescription = "Account",
                    modifier = Modifier
                        .height(30.dp)
                        .width(30.dp),
                )
            }
        }



        Spacer(modifier = Modifier.height(40.dp))
        Spacer(modifier = Modifier.width(10.dp))


        Row (
            horizontalArrangement = Arrangement.spacedBy(20.dp),
            modifier = Modifier
                .horizontalScroll(rememberScrollState())
        ){
            ElevatedCard(
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 6.dp

                ),
                modifier = Modifier
                    .size(width = 170.dp, height = 170.dp)
            ) {

                Image(painter = painterResource(id = R.drawable.car1),
                    contentDescription = null,
                    modifier = Modifier
                        .size(140.dp)
                        .padding(16.dp))

                ClickableText(text = AnnotatedString("Car rental"),
                    onClick ={navController.navigate("car_rental")} )


            }



            ElevatedCard(
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 6.dp
                ),
                modifier = Modifier
                    .size(width = 170.dp, height = 170.dp)
            ) {

                Image(painter = painterResource(id = R.drawable.lorrylogo),
                    contentDescription = null,
                    modifier = Modifier
                        .size(140.dp)
                        .padding(16.dp))

                ClickableText(text = AnnotatedString("lorry"),
                    onClick ={navController.navigate("lorry")} )

            }

        }


        Spacer(modifier = Modifier.height(40.dp))


        ElevatedCard(

            elevation = CardDefaults.cardElevation(
                defaultElevation = 6.dp
            ),
            modifier = Modifier
                .padding(20.dp, 0.dp, 20.dp, 0.dp)
                .size(width = 450.dp, height = 200.dp)
        ) {

            Box(
                modifier = Modifier
                    .fillMaxSize()
            ) {

                Image(
                    painter = painterResource(id = R.drawable.lorry),
                    modifier = Modifier.fillMaxSize(),
                    contentDescription = "Background Image",
                    contentScale = ContentScale.Crop
                )
                Column(
                    modifier = Modifier
                        .padding(30.dp, 20.dp, 30.dp, 100.dp)
                ) {


                    Text(
                        text = "Book a truck now",
                        color = Gold,
                        fontSize = 25.sp,
                        fontFamily = FontFamily.SansSerif,
                        fontWeight = FontWeight.ExtraBold,




                        )




                }
            }

        }

        Spacer(modifier = Modifier.height(20.dp))

        ElevatedCard(

            elevation = CardDefaults.cardElevation(
                defaultElevation = 6.dp
            ),
            modifier = Modifier
                .padding(20.dp, 0.dp, 20.dp, 0.dp)
                .size(width = 450.dp, height = 200.dp)
        ) {

            Box(
                modifier = Modifier
                    .fillMaxSize()
            ) {


                Image(
                    painter = painterResource(id = R.drawable.car2),
                    modifier = Modifier.fillMaxSize(),
                    contentDescription = "Background Image",
                    contentScale = ContentScale.Crop
                )
                Column(
                    modifier = Modifier
                        .padding(30.dp, 20.dp, 30.dp, 100.dp)
                ) {
                    Text(
                        text = "Pick the best rental ",
                        color = Gold,
                        fontSize = 25.sp,
                        fontFamily = FontFamily.SansSerif,
                        fontWeight = FontWeight.ExtraBold,
                        modifier = Modifier

                    )

                    Text(
                        text = "car deal for you ",
                        color = Gold,
                        fontSize = 25.sp,
                        fontFamily = FontFamily.SansSerif,
                        fontWeight = FontWeight.ExtraBold,
                        modifier = Modifier

                    )

                }

            }

        }
        Spacer(modifier = Modifier.height(100.dp))

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DriveWiseConnect2Theme {
        HomeScreen(rememberNavController() )
    }
}