package com.example.w07_activitiesusingintent

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class SecondActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Get data from Intent
        val userName = intent.getStringExtra("USER_NAME") ?: "User"
        val userCity = intent.getStringExtra("USER_CITY") ?: "Unknown City"

        setContent {
            MaterialTheme {
                SecondScreen(
                    userName = userName,
                    userCity = userCity
                )
            }
        }
    }
}

@Composable
fun SecondScreen(
    userName: String,
    userCity: String
) {

    Scaffold(
        modifier = Modifier.fillMaxSize()
    ) { innerPadding ->

        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(24.dp),
            contentAlignment = Alignment.Center
        ) {

            Text(
                text = "Welcome, $userName from $userCity!",
                style = MaterialTheme.typography.headlineMedium
            )
        }
    }
}