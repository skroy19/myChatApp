package com.example.mychatapp.presentation.homescreen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mychatapp.R
import com.example.mychatapp.presentation.bottomnavigation.BottomNavigation

@Composable
@Preview(showSystemUi = true)

fun HomeScreen() {

    val chatData =
        listOf(ChatDesignModel(
            R.drawable.rashmika,
            "Rashmika",
            "10:02 AM",
            "I am Rashmika!!!"),
            ChatDesignModel(
                R.drawable.sharukh_khan,
                "Sharukh Khan",
                "10:05 AM",
                "I am king Khan!!"
            ),
            ChatDesignModel(
                R.drawable.sharadha_kapoor,
                "Shradha Kapoor",
                "10:06 AM",
                "I am Kapoor!!"
            ),
            ChatDesignModel(
                R.drawable.sharukh_khan,
                "Sharukh Khan",
                "10:05 AM",
                "I am king Khan!!"
            ),
            ChatDesignModel(
                R.drawable.sharadha_kapoor,
                "Shradha Kapoor",
                "10:06 AM",
                "I am Kapoor!!"
            ),
            ChatDesignModel(
                R.drawable.salman_khan,
                "Salman Khan",
                "10:05 AM",
                "I am king Khan!!"
            ),
            ChatDesignModel(
                R.drawable.sharadha_kapoor,
                "Shradha Kapoor",
                "10:06 AM",
                "I am Kapoor!!"
            ),

            ChatDesignModel(
                R.drawable.sharukh_khan,
                "Sharukh Khan",
                "10:05 AM",
                "I am king Khan!!"
            ),
            ChatDesignModel(
                R.drawable.sharadha_kapoor,
                "Shradha Kapoor",
                "10:06 AM",
                "I am Kapoor!!"
            ),
            ChatDesignModel(
                R.drawable.sharukh_khan,
                "Sharukh Khan",
                "10:05 AM",
                "I am king Khan!!"
            ),
            ChatDesignModel(
                R.drawable.sharadha_kapoor,
                "Shradha Kapoor",
                "10:06 AM",
                "I am Kapoor!!"
            )
        )

    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                onClick = {},
                containerColor = colorResource(R.color.light_green),
                modifier = Modifier.size(65.dp),
                contentColor = Color.White
            ) {

                Icon(
                    painter = painterResource(id = R.drawable.chat_icon),
                    contentDescription = null,
                    modifier = Modifier.size(28.dp)
                )
            }
        },
        bottomBar = {
            BottomNavigation()
        }
    ) {
        Column(modifier = Modifier.padding(it)) {
            Box(modifier = Modifier.fillMaxWidth()) {
                Text(
                    text = "myChatApp",
                    fontSize = 28.sp,
                    color = colorResource(R.color.light_green),
                    modifier = Modifier
                        .align(Alignment.CenterStart)
                        .padding(start = 16.dp),
                    fontWeight = FontWeight.Bold
                )

                Row(modifier = Modifier.align(Alignment.CenterEnd)) {
                    IconButton(onClick = { }) {
                        Icon(
                            painter = painterResource(R.drawable.camera),
                            contentDescription = null,
                            modifier = Modifier.size(24.dp)
                        )
                    }

                    IconButton(onClick = { }) {
                        Icon(
                            painter = painterResource(R.drawable.search),
                            contentDescription = null,
                            modifier = Modifier.size(24.dp)
                        )
                    }

                    IconButton(onClick = { }) {
                        Icon(
                            painter = painterResource(R.drawable.more),
                            contentDescription = null,
                            modifier = Modifier.size(24.dp)
                        )
                    }
                }
            }
            HorizontalDivider()

            LazyColumn {
                items(chatData){
                    ChatDesign(chatDesignModel = it)
                }
            }
        }
    }
}