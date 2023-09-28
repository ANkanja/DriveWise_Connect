package com.example.drivewiseconnect2.ui.theme.pages.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.drivewiseconnect2.R
import com.example.drivewiseconnect2.ui.theme.DriveWiseConnect2Theme
import com.example.drivewiseconnect2.ui.theme.pages.dashboard.Dashboard

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Login( navController: NavController) {
    Column(
        Modifier
            .fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {


        Image(painter = painterResource(id = R.drawable.car),
            contentDescription = null,
            modifier = Modifier
                .width(150.dp)
                .height(300.dp)
        )

        Spacer(modifier = Modifier.height(30.dp))

        Text(
            text = "Login",
            fontSize = 40.sp,
            fontFamily = FontFamily.SansSerif,
            color = Color.LightGray,
            modifier = Modifier.padding(0.dp,0.dp,150.dp,0.dp),
            fontWeight = FontWeight.ExtraBold

        )

        var email by remember { mutableStateOf(TextFieldValue("")) }
        var password by remember { mutableStateOf(TextFieldValue("")) }

        OutlinedTextField(
            value = email,
            onValueChange = {email = it},
            label = { Text(text = "Enter email") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            shape = RoundedCornerShape(25.dp)
        )

        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(
            value = password,
            onValueChange = {password = it},
            label = { Text(text = "Enter password") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            shape = RoundedCornerShape(25.dp)
        )


        Spacer(modifier = Modifier.height(10.dp))

        val buttonColor = remember { mutableStateOf(Color.Gray) }
        Button(onClick = { buttonColor.value = Color.Cyan},

            colors = ButtonDefaults.buttonColors(Color.Transparent),
            shape = RoundedCornerShape(25.dp),
            modifier = Modifier
                .width(280.dp)
                .background(buttonColor.value)
        ) {
            Text(
                text = "Login",
                fontFamily = FontFamily.SansSerif,
                fontSize = 20.sp
            )
        }

        Spacer(modifier = Modifier.height(10.dp))

        Row (){
            ClickableText(text = AnnotatedString("Remember me"), onClick ={})

            Spacer(modifier = Modifier.width(30.dp))

            ClickableText(text = AnnotatedString("Forgot password"), onClick ={} )

        }


    }


}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DriveWiseConnect2Theme {
        Login(rememberNavController() )
    }
}