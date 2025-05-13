package com.example.mychatapp.presentation.homescreen

import android.media.Image
import androidx.core.app.NotificationCompat.MessagingStyle.Message

data class ChatDesignModel(
    val image: Int,
    val name: String,
    val time: String,
    val message: String
)