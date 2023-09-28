package com.example.drivewiseconnect2.ui.theme.pages.saved

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.drivewiseconnect2.R
import com.example.drivewiseconnect2.ui.theme.black

@Composable
fun Saved(navController: NavHostController) {

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




        ElevatedCard(
            elevation = CardDefaults.cardElevation(defaultElevation = 6.dp),
            modifier = Modifier
                .size(width = 350.dp, height = 250.dp)
                .padding(0.dp, 20.dp, 0.dp, 0.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
            ) {

                Column(
                    modifier = Modifier
                        .fillMaxHeight()
                ) {

                    Text(
                        text = "Isuzu Forward",
                        fontFamily = FontFamily.Default,
                        modifier = Modifier.padding(15.dp),
                        fontWeight = FontWeight.ExtraBold,

                        )



                    Text(
                        text = "$ 20,499 per day",
                        fontFamily = FontFamily.Default,
                        modifier = Modifier.padding(5.dp)
                    )

                    Button(onClick = { navController.navigate("saved") },
                        colors = ButtonDefaults.buttonColors(black),
                        modifier = Modifier
                            .clip(RoundedCornerShape(100.dp))
                    ) {
                        Text(text = "Add to Favorites")
                    }


                }

                Image(
                    painter = painterResource(
                        id = R.drawable.lorry
                    ),
                    contentDescription = null,
                    modifier = Modifier
                        .size(width = 300.dp, height = 400.dp)
                        .clip(RoundedCornerShape(16.dp))
                )



            }

        }

    }
}