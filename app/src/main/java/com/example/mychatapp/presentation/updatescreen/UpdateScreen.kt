package com.example.mychatapp.presentation.updatescreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mychatapp.R

@Composable
@Preview(showSystemUi = true)
fun UpdateScreen() {

    val scrollState = rememberScrollState()

    val sampleStatus = listOf(
        StatusData(image = R.drawable.sharukh_khan, name = "Sharukh Khan", time = "10 mins ago"),
        StatusData(image = R.drawable.salman_khan, name = "Salman Khan", time = "11 mins ago"),
        StatusData(
            image = R.drawable.sharadha_kapoor,
            name = "Sharadha Kapoor",
            time = "12 mins ago"
        ),
        StatusData(image = R.drawable.rashmika, name = "Rashmika", time = "13 mins ago")

    )

    val sampleChannels = listOf(
        Channels(
            image = R.drawable.neat_roots,
            name = "Neat Roots",
            description = "Latest news of tech"
        ),
        Channels(image = R.drawable.img, name = "Food Lovers", description = "Food kingdom"),
        Channels(image = R.drawable.meta, name = "Facebook", description = "Social platform")

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
                    painter = painterResource(R.drawable.baseline_photo_camera_24),
                    contentDescription = null
                )

            }
        },
        topBar = {
            Topbar()
        }
    ) {
        Column(
            modifier = Modifier
                .padding(it)
                .fillMaxWidth()
                .verticalScroll(scrollState)
        ) {

            Text(
                text = "Status",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp)
            )
            MyStatus()

            sampleStatus.forEach { data ->
                StatusItem(statusData = data)
            }
            Spacer(modifier = Modifier.height(16.dp))
            HorizontalDivider(color = Color.Gray)

            Text(
                text = "Channels",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp)
            )

            Spacer(modifier = Modifier.height(8.dp))

            Column(modifier = Modifier.padding(horizontal = 16.dp)) {
                Text(text = "stay update on topics that matter to you")
            }

            Spacer(modifier = Modifier.height(16.dp))

            sampleChannels.forEach { channels ->
                ChannelItemDesign(channels = channels)

            }
        }
    }
}