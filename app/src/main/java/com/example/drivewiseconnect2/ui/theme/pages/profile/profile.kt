package com.example.drivewiseconnect2.ui.theme.pages.profile

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
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
import com.example.drivewiseconnect2.ui.theme.pages.dashboard.Dashboard

@Composable
fun ProfileScreen(navController: NavHostController) {

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
                    text = "Profile",
                    fontSize = 25.sp,
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.ExtraBold,
                    modifier = Modifier
                )

            }

            Column(

                modifier = Modifier
                    .padding(20.dp, 40.dp, 30.dp, 0.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = "Home",
                    modifier = Modifier
                        .height(60.dp)
                        .width(60.dp)
                        .padding(0.dp, 0.dp, 0.dp, 0.dp),
                )

            }
        }

        Spacer(modifier = Modifier.height(25.dp))

        Text(
            text = "Manage your account",
            fontSize = 25.sp,
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.ExtraBold,
            modifier = Modifier
                .padding(20.dp, 0.dp, 120.dp, 0.dp)
        )

        Spacer(modifier = Modifier.height(15.dp))







        Row (
            horizontalArrangement = Arrangement.spacedBy(20.dp),
        ) {
            Card(
                modifier = Modifier
                    .size(width = 340.dp, height = 170.dp)
                    .clickable { navController.navigate("home") }
            ) {

                Image(
                    painter = painterResource(id = R.drawable.file),
                    contentDescription = null,
                    modifier = Modifier
                        .size(100.dp)
                        .padding(16.dp)
                )

                Text(
                    text = "Your details",
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(start = 10.dp)
                )
            }
        }

        Spacer(modifier = Modifier.height(20.dp))


        Row (
                horizontalArrangement = Arrangement.spacedBy(20.dp),
            ){
            Card(
                modifier = Modifier
                    .size(width = 340.dp, height = 170.dp)
                    .clickable { navController.navigate("home") }
            ) {

                Image(painter = painterResource(id = R.drawable.globe),
                    contentDescription = null,
                    modifier = Modifier
                        .size(100.dp)
                        .padding(16.dp))

                Text(text = "Discover",
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(start = 10.dp))
            }
        }

        Spacer(modifier = Modifier.height(20.dp))


        Row (
            horizontalArrangement = Arrangement.spacedBy(20.dp),
        ) {
            Card(
                modifier = Modifier
                    .size(width = 340.dp, height = 170.dp)
                    .clickable { navController.navigate("settings") }
            ) {
                Image(
                    painter = painterResource(id = R.drawable.cogwheels),
                    contentDescription = null,
                    modifier = Modifier
                        .size(100.dp)
                        .padding(16.dp)
                )

                Text(
                    text = "Settings",
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(start = 10.dp)
                )
            }
        }

            Spacer(modifier = Modifier.height(20.dp))


            Row(
                horizontalArrangement = Arrangement.spacedBy(20.dp),
            ) {
                Card(
                    modifier = Modifier
                        .size(width = 340.dp, height = 170.dp)
                        .clickable { navController.navigate("home") }
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.help),
                        contentDescription = null,
                        modifier = Modifier
                            .size(100.dp)
                            .padding(16.dp)
                    )

                    Text(
                        text = "Support",
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(start = 10.dp)
                    )
                }
            }
        Spacer(modifier = Modifier.height(90.dp))

    }


}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DriveWiseConnect2Theme {
        ProfileScreen(rememberNavController() )
    }
}