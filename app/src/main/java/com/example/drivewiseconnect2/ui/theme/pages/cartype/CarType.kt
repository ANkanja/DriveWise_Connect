package com.example.drivewiseconnect2.ui.theme.pages.cartype

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.drivewiseconnect2.R
import com.example.drivewiseconnect2.ui.theme.DriveWiseConnect2Theme
import com.example.drivewiseconnect2.ui.theme.black
import com.example.drivewiseconnect2.ui.theme.pages.home.HomeScreen

@Composable
fun CarType(navController: NavHostController) {


    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {


        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxSize()
        ) {

            Column(

                modifier = Modifier
                    .padding(20.dp, 40.dp, 30.dp, 0.dp)
            ) {
                Text(
                    text = "Car type",
                    fontSize = 25.sp,
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.ExtraBold,
                    modifier = Modifier
                )

                Spacer(modifier = Modifier.height(35.dp))


            }

        }

        Spacer(modifier = Modifier.height(15.dp))


        Row (
            horizontalArrangement = Arrangement.spacedBy(20.dp),
        ){
            ElevatedCard(
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 6.dp
                ),
                modifier = Modifier
                    .size(width = 170.dp, height = 170.dp)
            ) {

                Image(painter = painterResource(id = R.drawable.small),
                    contentDescription = null,
                    modifier = Modifier
                        .size(100.dp)
                        .padding(16.dp))

                Text(text = "Small",
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(start = 10.dp))
            }

            ElevatedCard(
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 6.dp
                ),
                modifier = Modifier
                    .size(width = 170.dp, height = 170.dp)
            ) {

                Image(painter = painterResource(id = R.drawable.medium),
                    contentDescription = null,
                    modifier = Modifier
                        .size(100.dp)
                        .padding(16.dp))

                Text(text = "Medium",
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(start = 10.dp))
            }
        }

        Spacer(modifier = Modifier.height(10.dp))


        Row (
            horizontalArrangement = Arrangement.spacedBy(20.dp),
        ){
            ElevatedCard(
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 6.dp
                ),
                modifier = Modifier
                    .size(width = 170.dp, height = 170.dp)
            ) {
                Image(painter = painterResource(id = R.drawable.large),
                    contentDescription = null,
                    modifier = Modifier
                        .size(100.dp)
                        .padding(16.dp))

                Text(text = "Large",
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(start = 10.dp))
            }

            ElevatedCard(
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 6.dp
                ),
                modifier = Modifier
                    .size(width = 170.dp, height = 170.dp)
            ) {
                Image(painter = painterResource(id = R.drawable.suv),
                    contentDescription = null,
                    modifier = Modifier
                        .size(100.dp)
                        .padding(16.dp))

                Text(text = "SUV",
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(start = 10.dp))
            }
        }


        Spacer(modifier = Modifier.height(10.dp))


        Row (
            horizontalArrangement = Arrangement.spacedBy(20.dp),
        ){
            ElevatedCard(
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 6.dp
                ),
                modifier = Modifier
                    .size(width = 170.dp, height = 170.dp)
            ) {
                Image(painter = painterResource(id = R.drawable.carrier),
                    contentDescription = null,
                    modifier = Modifier
                        .size(100.dp)
                        .padding(16.dp))

                Text(text = "People carrier",
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(start = 10.dp))
            }

            ElevatedCard(
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 6.dp
                ),
                modifier = Modifier
                    .size(width = 170.dp, height = 170.dp)
            ) {
                Image(painter = painterResource(id = R.drawable.luxury),
                    contentDescription = null,
                    modifier = Modifier
                        .size(100.dp)
                        .padding(16.dp))

                Text(text = "Luxury",
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(start = 10.dp))
            }
        }



        Spacer(modifier = Modifier.height(35.dp))

        Button(onClick = { navController.navigate("car_rental") },
            colors = ButtonDefaults.buttonColors(black),
            modifier = Modifier
                .clip(RoundedCornerShape(100.dp))
        ) {
            Text(text = "See all cars")
        }


        Button(onClick = { navController.navigate("home_screen") },
            colors = ButtonDefaults.buttonColors(black),
            modifier = Modifier
                .clip(RoundedCornerShape(100.dp))
        ) {
            Text(text = "Go back")
        }

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DriveWiseConnect2Theme {
        CarType(rememberNavController() )
    }
}


