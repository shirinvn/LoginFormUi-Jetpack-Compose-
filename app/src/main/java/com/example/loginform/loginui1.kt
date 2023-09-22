package com.example.loginform

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
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.loginform.ui.theme.LoginFormTheme


@Composable
fun LoginUi(){

    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.Red)){

        Column(modifier = Modifier
            .fillMaxSize(),
            verticalArrangement = Arrangement.Center

        ){
            Image(painter = painterResource(id = R.drawable.rec5),
                contentDescription ="")
        }

        Column(modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Top) {

            Spacer(modifier = Modifier.padding(top = 220.dp))
            Text(text = "welcome to",
                modifier = Modifier.padding(start = 30.dp)
                ,fontSize = 18.sp)

            Text(text = "VatanNet",
                modifier = Modifier.padding(start = 30.dp),
                fontSize = 30.sp,
                color = Color.Red)

            Spacer(modifier = Modifier.padding(top = 20.dp))

            Text(text = "Please Sign in to continue",
                modifier = Modifier.padding(start = 30.dp)
                ,fontSize = 18.sp)

            Spacer(modifier = Modifier.padding(top = 10.dp))


            TextFields("Enter your username",
                icon = Icons.Default.Person,
                onValueChange = {username=it})

            Spacer(modifier = Modifier.padding(top = 10.dp))

            TextFields("Enter your password",
                icon = Icons.Default.Lock,
                onValueChange = {password=it})

            Spacer(modifier = Modifier.padding(top = 40.dp))




            Row(modifier = Modifier.fillMaxWidth()
                .padding(top = 5.dp, bottom = 5.dp)) {
                Spacer(modifier = Modifier.padding(start = 200.dp))
                Button(onClick = { /*TODO*/ }
                    , modifier = Modifier
                        .width(165.dp)
                        .height(55.dp)
                        .shadow(
                            elevation = 15.dp, ambientColor = Color.Black,
                            shape = RoundedCornerShape(25.dp)
                        )
                    , colors = ButtonDefaults
                        .buttonColors(containerColor = Color.White)
                ) {
                    Row(modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically) {

                        Text(text = "Login", fontSize =20.sp,
                            color = Color.Red)
                        Spacer(modifier = Modifier.padding(start = 40.dp))
                        Image(painter = painterResource(id = R.drawable.ic_arrow),
                            contentDescription = "", modifier = Modifier.size(20.dp))
                    } } }
            Spacer(modifier = Modifier.padding(top = 20.dp))
            Text(text = "Forget Password?",
                modifier = Modifier.padding(start =20.dp))
        } } }




@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextFields (value:String="", icon: ImageVector,
                onValueChange: (String)-> Unit={},
                label:String=""){

    TextField(
        value = value, onValueChange = onValueChange,
        colors = TextFieldDefaults.textFieldColors(
            focusedIndicatorColor = Color.Red,
            unfocusedIndicatorColor = Color.Gray,
            containerColor = Color.Transparent,
            textColor = Color.Gray,
            placeholderColor = Color.Gray,
            disabledIndicatorColor = Color.Gray
        ),
        leadingIcon = {
            Icon(
                imageVector = icon,
                contentDescription = null,
                tint = Color(0xFFFF5C5C)
            ) },
        shape = RoundedCornerShape(40.dp),
        modifier = Modifier.width(300.dp)
            .padding(start = 25.dp))
}


/*
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LoginFormTheme() {
        LoginUi()
    }
}*/
