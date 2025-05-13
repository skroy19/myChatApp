package com.example.mychatapp.presentation.userregistrationscreen

import android.graphics.drawable.Icon
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mychatapp.R
import androidx.compose.runtime.setValue
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color


@Composable
@Preview(showSystemUi = true)
fun UserRegistrationScreen() {
    val countries = listOf("Bangladesh", "USA", "India", "UK", "Canada", "Australia")
    var expanded by remember { mutableStateOf(false) }
    var selectedCountry by remember { mutableStateOf(countries[0]) }
    var countryCode by remember {
        mutableStateOf("+88")
    }
    var phoneNumber by remember {
        mutableStateOf("")
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(5.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                "Enter Your Phone Number",
                modifier = Modifier.padding(5.dp),
                color = colorResource(R.color.dark_green),
                style = TextStyle(
                    fontSize = 20.sp, fontWeight = FontWeight.Bold
                )
            )

            Spacer(modifier = Modifier.height(24.dp))

            Text("myChatApp will need to verify your phone number")
            Spacer(modifier = Modifier.height(5.dp))
            Text(
                "what's my number?",
                color = colorResource(R.color.dark_green)
            )

            Spacer(modifier = Modifier.height(20.dp))

            TextButton(
                onClick = { expanded = true },
                modifier = Modifier.fillMaxWidth()
            ) {
                Box(
                    modifier = Modifier.width(230.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = selectedCountry,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.align(Alignment.Center)
                    )

                    Icon(
                        imageVector = Icons.Default.ArrowDropDown,
                        contentDescription = "Dropdown Arrow",
                        tint = colorResource(R.color.dark_green),
                        modifier = Modifier.align(Alignment.CenterEnd)
                    )

                }
            }
            HorizontalDivider(
                modifier = Modifier.padding(horizontal = 66.dp),
                thickness = 2.dp,
                color = colorResource(R.color.dark_green)
            )

            DropdownMenu(expanded = expanded, onDismissRequest = { expanded = false }) {
                countries.forEach { country ->
                    DropdownMenuItem(text = { Text(text = country) }, onClick = {
                        selectedCountry = country
                        expanded = false
                    })
                }
            }

            Spacer(modifier = Modifier.height(24.dp))

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row {
                    TextField(
                        value = countryCode,
                        onValueChange = {
                            countryCode = it
                        },
                        modifier = Modifier.width(70.dp),
                        singleLine = true,
                        textStyle = LocalTextStyle.current.copy(fontSize = 18.sp),
                        colors = TextFieldDefaults.colors(
                            unfocusedContainerColor = Color.Transparent,
                            focusedContainerColor = Color.Transparent,
                            unfocusedIndicatorColor = colorResource(R.color.light_green),
                            focusedIndicatorColor = colorResource(R.color.light_green)
                        )
                    )

                    Spacer(modifier = Modifier.width(5.dp))

                    TextField(
                        value = phoneNumber, onValueChange = {
                            phoneNumber = it
                        }, placeholder = { Text(text = "phone number") },
                        singleLine = true,
                        textStyle = LocalTextStyle.current.copy(fontSize = 18.sp),
                        colors = TextFieldDefaults.colors(
                            unfocusedContainerColor = Color.Transparent,
                            focusedContainerColor = Color.Transparent,
                            unfocusedIndicatorColor = colorResource(R.color.light_green),
                            focusedIndicatorColor = colorResource(R.color.light_green)
                        )
                    )
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Carrier charges may apply",
                color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.6f),
                fontSize = 12.sp
            )

            Button(
                onClick = {},
                shape = RoundedCornerShape(6.dp),
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(R.color.dark_green))
            ) {
                Text(text = "Next", fontSize = 16.sp)
            }
        }
    }

}


