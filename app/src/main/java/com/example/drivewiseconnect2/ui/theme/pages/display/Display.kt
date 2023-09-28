package com.example.drivewiseconnect2.ui.theme.pages.display

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
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
fun DisplayScreen(navController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {


        Image(
            painter = painterResource(id = R.drawable.audi1),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.matchParentSize()
        )

        Column (
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ){


            Spacer(modifier = Modifier.height(35.dp))


            Text(
                text = "DriveWise Connect",
                fontSize = 30.sp,
                fontWeight = FontWeight.ExtraBold,
            )

            Button(onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(black),
                modifier = Modifier
                    .clip(RoundedCornerShape(100.dp))
            ) {
                Text(text = "Login")

            }


            Button(onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(black),
                modifier = Modifier
                    .clip(RoundedCornerShape(100.dp))
            ) {
                Text(text = "Sign up")

            }

        }

    }

}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DriveWiseConnect2Theme {
        DisplayScreen(rememberNavController() )
    }
}