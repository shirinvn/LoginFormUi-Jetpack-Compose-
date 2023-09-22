package com.example.loginform

import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.loginform.ui.theme.LoginFormTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginFormTheme {


                        LoginUi2()
                    }
                }
            }
        }




@Composable
fun LoginUi2 () {
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }


    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFF00A8A3))) {

        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            Image(
                painter = painterResource(id = R.drawable.shape5),
                contentDescription = "", modifier = Modifier
                    .width(500.dp)
                    .height(350.dp)
            , contentScale = ContentScale.FillBounds

            )
        }

            Column(
                modifier = Modifier
                    .fillMaxSize(),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally

            ) {

                
                Text(text = "Vatannet", fontSize = 50.sp,
                    modifier = Modifier.padding(top = 80.dp)

                , color = Color.White, fontFamily = FontFamily(Font(R.font.cralington))
                )

                Spacer(modifier = Modifier.padding(top = 20.dp))


                MyTextField(icon = Icons.Default.Person, label = "username")
                Spacer(modifier = Modifier.padding(top = 15.dp))

                MyTextField(icon = Icons.Default.Email, label = "email")
                Spacer(modifier = Modifier.padding(top = 15.dp))

                MyTextField(icon = Icons.Default.Lock, label = "password")
                Text(text = "Forgot Password?!", fontSize = 20.sp, modifier = Modifier.padding(top = 15.dp), color = Color.White)


                Spacer(modifier = Modifier.padding(top = 15.dp))

                IconButton(onClick = { /*TODO*/ },
                    modifier = Modifier
                        .size(60.dp)
                        .shadow(shape = CircleShape, elevation = 5.dp),
                    colors = IconButtonDefaults.iconButtonColors(
                        containerColor = Color.White
                    , contentColor = Color(0xFF00A8A3)
                    )
                ) {
                   Icon(Icons.Default.ArrowForward
                       , contentDescription = "")
                }



                Spacer(modifier = Modifier.weight(1f))

                Text(text = "You have another account?!", fontSize = 20.sp,
                    modifier = Modifier.padding(bottom = 15.dp), color = Color.Gray)


                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 25.dp)
                , verticalAlignment = Alignment.Bottom
                , horizontalArrangement = Arrangement.SpaceEvenly){

                    Spacer(modifier = Modifier.padding(start = 40.dp))


                    IconButton(onClick = { /*TODO*/ },
                        modifier = Modifier
                            .size(60.dp)
                            .shadow(shape = CircleShape, elevation = 5.dp),
                        colors = IconButtonDefaults.iconButtonColors(
                            containerColor = Color(0xFF00A8A3),
                            contentColor = Color.White
                        )
                    ) {
                        Icon(painterResource(id = R.drawable.instagram)
                            , contentDescription = "",
                            modifier = Modifier.size(30.dp)
                        )
                    }



                    IconButton(onClick = { /*TODO*/ },
                        modifier = Modifier
                            .size(60.dp)
                            .shadow(shape = CircleShape, elevation = 5.dp),
                        colors = IconButtonDefaults.iconButtonColors(
                            containerColor = Color(0xFF00A8A3),
                            contentColor = Color.White
                        )
                    ) {
                        Icon(painterResource(id = R.drawable.facebook)
                            , contentDescription = "",
                            modifier = Modifier.size(30.dp))
                    }

                    IconButton(onClick = { /*TODO*/ },
                        modifier = Modifier
                            .size(60.dp)
                            .shadow(shape = CircleShape, elevation = 5.dp),
                        colors = IconButtonDefaults.iconButtonColors(
                            containerColor = Color(0xFF00A8A3),
                            contentColor = Color.White
                        )
                    ) {
                        Icon(painterResource(id = R.drawable.twitter)
                            , contentDescription = "",
                            modifier = Modifier.size(30.dp))
                    }

                    Spacer(modifier = Modifier.padding(end = 40.dp))


                }
            }





    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTextField(value:String="", onValueChange: (String)-> Unit={},
                icon:ImageVector, label:String){

    OutlinedTextField(
        value = value,
        onValueChange = onValueChange ,
        leadingIcon = {
            Icon(imageVector = icon,
                contentDescription = "",
                tint = Color(0xFFCCCCCC)
            )
        } ,
        label = { Text(text = label, color = Color(0xFFCCCCCC)) } ,
        colors = TextFieldDefaults.textFieldColors(
            focusedIndicatorColor = Color.White,
            unfocusedIndicatorColor = Color.White,
            containerColor = Color.Transparent,
            textColor = Color.White

        ),

        shape = RoundedCornerShape(40.dp),
        singleLine = true,
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 15.dp, end = 15.dp)
    )
}


    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        LoginFormTheme {
            LoginUi2()
        }
    }


