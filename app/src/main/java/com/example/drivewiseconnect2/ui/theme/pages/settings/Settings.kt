package com.example.drivewiseconnect2.ui.theme.pages.settings

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.drivewiseconnect2.R
import com.example.drivewiseconnect2.ui.theme.DriveWiseConnect2Theme
import com.example.drivewiseconnect2.ui.theme.pages.dashboard.Dashboard

@Composable
fun SettingsScreen(navController: NavHostController) {

    Column(horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {

        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxSize()
        ) {

            Text(
                text = "Settings",
                fontSize = 25.sp,
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier
                    .padding(20.dp, 50.dp, 0.dp, 0.dp)
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Regional",
            fontSize = 20.sp,
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.ExtraBold,
            modifier = Modifier
                .padding(0.dp, 30.dp, 0.dp, 0.dp)
        )

        Spacer(modifier = Modifier.height(15.dp))

        Row(
            modifier = Modifier.fillMaxWidth()
        ) {

            Image(painter = painterResource(id = R.drawable.dollar),
                contentDescription = null,
                modifier = Modifier
                    .height(30.dp)
                    .width(30.dp)
                    .padding(0.dp, 0.dp, 0.dp, 0.dp),
            )

            ClickableText(
                text = AnnotatedString("Currency"),
                onClick ={},
                style = TextStyle(
                    fontSize = 17.sp,
                    fontWeight = FontWeight.SemiBold
                ),
                modifier = Modifier.padding(15.dp, 12.dp, 0.dp, 0.dp)
            )


        }



        Row(
            modifier = Modifier.fillMaxWidth()
        ) {

            Image(painter = painterResource(id = R.drawable.region),
                contentDescription = null,
                modifier = Modifier
                    .height(30.dp)
                    .width(30.dp)
                    .padding(0.dp, 10.dp, 0.dp, 0.dp),
            )

            ClickableText(
                text = AnnotatedString("Country or region"),
                onClick ={},
                style = TextStyle(
                    fontSize = 17.sp,
                    fontWeight = FontWeight.SemiBold
                ),
                modifier = Modifier.padding(15.dp, 12.dp, 20.dp, 0.dp)
            )


        }


        Row(
            modifier = Modifier.fillMaxWidth()
        ) {

            Text(text = "Other",
                fontSize = 20.sp,
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier
                    .padding(150.dp, 50.dp, 0.dp, 0.dp)
            )


        }


        Row(
            modifier = Modifier.fillMaxWidth()
        ) {

            Image(painter = painterResource(id = R.drawable.marketing),
                contentDescription = null,
                modifier = Modifier
                    .height(30.dp)
                    .width(30.dp)
                    .padding(0.dp, 0.dp, 0.dp, 0.dp),
            )

            ClickableText(
                text = AnnotatedString("Maketing options"),
                onClick ={},
                style = TextStyle(
                    fontSize = 17.sp,
                    fontWeight = FontWeight.SemiBold
                ),
                modifier = Modifier.padding(15.dp, 8.dp, 0.dp, 0.dp)
            )


        }

        Row(
            modifier = Modifier.fillMaxWidth()
        ) {

            Image(painter = painterResource(id = R.drawable.connection),
                contentDescription = null,
                modifier = Modifier
                        .height(30.dp)
                        .width(30.dp)
                        .padding(0.dp, 10.dp, 0.dp, 0.dp),
                )


            ClickableText(
                text = AnnotatedString("Data settings"),
                onClick ={},
                style = TextStyle(
                    fontSize = 17.sp,
                    fontWeight = FontWeight.SemiBold
                ),
                modifier = Modifier.padding(15.dp, 12.dp, 0.dp, 0.dp)
            )


        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DriveWiseConnect2Theme {
        SettingsScreen(rememberNavController() )
    }
}