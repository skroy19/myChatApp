package com.example.mychatapp.presentation.splashscreen

import android.window.SplashScreen
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFrom
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mychatapp.R

@Composable
@Preview(showSystemUi = true)
fun SplashScreen(){

    Box(modifier = Modifier.fillMaxSize(),
    contentAlignment = Alignment.Center
    ){
        Image(painter = painterResource(id = R.drawable.whatsapp_icon),
            contentDescription = null,
            modifier = Modifier
                .size(100.dp)
                .align(Alignment.Center)
        )

        Column (modifier = Modifier
            .align(alignment = Alignment.BottomCenter)
            .padding(bottom = 30.dp),
            horizontalAlignment = Alignment.CenterHorizontally,

        ) {
            Text(text = "From",
                fontWeight = FontWeight.Bold,
                fontSize = 25.sp
            )

            Row {
                Icon(painter = painterResource(id = R.drawable.meta),
                contentDescription = null,
                    modifier = Modifier.size(24.dp),
                    tint = colorResource(R.color.light_green)
                )
                Text(text = "Meta", fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}