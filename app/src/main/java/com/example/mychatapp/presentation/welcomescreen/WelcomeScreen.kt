package com.example.mychatapp.presentation.welcomescreen

import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mychatapp.R

@Composable
@Preview(showSystemUi = true)

fun WelcomeScreen() {
    Box(Modifier.fillMaxSize()) {
        Column(Modifier.align(Alignment.Center)) {
            Image( painterResource(R.drawable.whatsapp_sticker),
                contentDescription = null,
                Modifier
                    .size(300.dp)
                    .align(Alignment.CenterHorizontally)
            )
            Text("Welcome to myChatApp",
                fontWeight = FontWeight.Bold,
                style = TextStyle(fontSize = 20.sp),
                modifier = Modifier
                    .align(alignment = Alignment.CenterHorizontally)
            )

            Spacer(modifier = Modifier.height(10.dp))
            Row {
                Text("Read our")
                Spacer(modifier = Modifier.width(8.dp))
                Text("Privacy Policy",
                        style = TextStyle(
                            fontFamily = FontFamily.Serif,
                            color = colorResource(R.color.dark_green)
                        ),
                    modifier = Modifier.clickable {  }
                    )
                Spacer(modifier = Modifier.width(8.dp))
                Text("Tap Agree and continue to")
            }

            Spacer(modifier = Modifier.height(5.dp))

            Row(modifier = Modifier.align(Alignment.CenterHorizontally)) {
                Text("accept the")
                Spacer(modifier = Modifier.width(8.dp))
                Text("Term of services",
                    style = TextStyle(
                        fontFamily = FontFamily.Serif,
                        color = colorResource(R.color.dark_green)
                    ),
                    modifier = Modifier.clickable {  }
                )
            }
            Spacer(modifier = Modifier.height(10.dp))
           Button(
               onClick = { },
               modifier = Modifier
                   .size(250.dp, 45.dp)
                   .align(Alignment.CenterHorizontally),
               shape = RoundedCornerShape(8.dp),
               colors = ButtonColors(containerColor = colorResource(R.color.dark_green),
                   Color.White, Color.Blue, Color.Blue)

           ) {
               Text("Agree and Continue")
           }
        }
    }
}