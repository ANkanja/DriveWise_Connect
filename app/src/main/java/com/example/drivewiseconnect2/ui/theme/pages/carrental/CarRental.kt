package com.example.drivewiseconnect2.ui.theme.pages.carrental

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
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
import com.example.drivewiseconnect2.ui.theme.Gold
import com.example.drivewiseconnect2.ui.theme.black
import com.example.drivewiseconnect2.ui.theme.pages.display.DisplayScreen

@Composable
fun CarRental(navController: NavHostController) {
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
                        text = " Audi e-tron GT Premium Plus",
                        fontFamily = FontFamily.Default,
                        modifier = Modifier.padding(15.dp),
                        fontWeight = FontWeight.ExtraBold,

                        )

                    Text(
                        text = "4 door-Economy",
                        fontFamily = FontFamily.Default,
                        modifier = Modifier.padding(5.dp)
                    )


                    Text(
                        text = "5 people - Automatic",
                        fontFamily = FontFamily.Default,
                        modifier = Modifier.padding(5.dp)
                    )


                    Text(
                        text = "$ 11,499",
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
                        id = R.drawable.car3
                    ),
                    contentDescription = null,
                    modifier = Modifier
                        .size(width = 300.dp, height = 400.dp)
                        .clip(RoundedCornerShape(16.dp))
                )



            }

        }


        Spacer(modifier = Modifier.height(40.dp))

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
                        text = " Audi e-tron GT Premium Plus",
                        fontFamily = FontFamily.Default,
                        modifier = Modifier.padding(15.dp),
                        fontWeight = FontWeight.ExtraBold,

                        )

                    Text(
                        text = "4 door-Economy",
                        fontFamily = FontFamily.Default,
                        modifier = Modifier.padding(5.dp)
                    )


                    Text(
                        text = "5 people - Automatic",
                        fontFamily = FontFamily.Default,
                        modifier = Modifier.padding(5.dp)
                    )


                    Text(
                        text = "$ 11,499",
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
                        id = R.drawable.car5
                    ),
                    contentDescription = null,
                    modifier = Modifier
                        .size(width = 300.dp, height = 400.dp)
                        .clip(RoundedCornerShape(16.dp))
                )



            }

        }

        Spacer(modifier = Modifier.height(40.dp))

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
                        text = "2022 Audi S7",
                        fontFamily = FontFamily.Default,
                        modifier = Modifier.padding(15.dp),
                        fontWeight = FontWeight.ExtraBold,

                        )

                    Text(
                        text = "4 door-Economy",
                        fontFamily = FontFamily.Default,
                        modifier = Modifier.padding(5.dp)
                    )


                    Text(
                        text = "5 people - Automatic",
                        fontFamily = FontFamily.Default,
                        modifier = Modifier.padding(5.dp)
                    )


                    Text(
                        text = "$ 14,499",
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
                        id = R.drawable.car6
                    ),
                    contentDescription = null,
                    modifier = Modifier
                        .size(width = 300.dp, height = 400.dp)
                        .clip(RoundedCornerShape(16.dp))
                )



            }

        }


        Spacer(modifier = Modifier.height(40.dp))

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
                        text = "2023 Audi Q7 Premium Plus",
                        fontFamily = FontFamily.Default,
                        modifier = Modifier.padding(15.dp),
                        fontWeight = FontWeight.ExtraBold,

                        )

                    Text(
                        text = "4 door-SUV",
                        fontFamily = FontFamily.Default,
                        modifier = Modifier.padding(5.dp)
                    )


                    Text(
                        text = "7 people - Automatic",
                        fontFamily = FontFamily.Default,
                        modifier = Modifier.padding(5.dp)
                    )


                    Text(
                        text = "$ 19,499",
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
                        id = R.drawable.car7
                    ),
                    contentDescription = null,
                    modifier = Modifier
                        .size(width = 300.dp, height = 400.dp)
                        .clip(RoundedCornerShape(16.dp))
                )



            }

        }


        Spacer(modifier = Modifier.height(40.dp))

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
                        text = " BMW m4 coupe 2019",
                        fontFamily = FontFamily.Default,
                        modifier = Modifier.padding(15.dp),
                        fontWeight = FontWeight.ExtraBold,

                        )

                    Text(
                        text = "4 door-Economy",
                        fontFamily = FontFamily.Default,
                        modifier = Modifier.padding(5.dp)
                    )


                    Text(
                        text = "5 people - Automatic",
                        fontFamily = FontFamily.Default,
                        modifier = Modifier.padding(5.dp)
                    )


                    Text(
                        text = "$ 11,499",
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
                        id = R.drawable.car8
                    ),
                    contentDescription = null,
                    modifier = Modifier
                        .size(width = 300.dp, height = 400.dp)
                        .clip(RoundedCornerShape(16.dp))
                )



            }

        }


        Spacer(modifier = Modifier.height(40.dp))

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
                        text = "Rolls-Royce Ghost",
                        fontFamily = FontFamily.Default,
                        modifier = Modifier.padding(15.dp),
                        fontWeight = FontWeight.ExtraBold,

                        )

                    Text(
                        text = "4 door-Luxury car",
                        fontFamily = FontFamily.Default,
                        modifier = Modifier.padding(5.dp)
                    )


                    Text(
                        text = "3 people - Automatic",
                        fontFamily = FontFamily.Default,
                        modifier = Modifier.padding(5.dp)
                    )


                    Text(
                        text = "$ 190,499",
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
                        id = R.drawable.car9
                    ),
                    contentDescription = null,
                    modifier = Modifier
                        .size(width = 300.dp, height = 400.dp)
                        .clip(RoundedCornerShape(16.dp))
                )



            }

        }


        Spacer(modifier = Modifier.height(80.dp))


    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DriveWiseConnect2Theme {
        CarRental(rememberNavController() )
    }
}




