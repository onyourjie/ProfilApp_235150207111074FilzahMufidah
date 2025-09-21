package com.example.profilapp_235150207111074filzahmufidah

import android.os.Bundle
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.profilapp_235150207111074filzahmufidah.ui.theme.ProfilApp_235150207111074FilzahMufidahTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProfilApp_235150207111074FilzahMufidahTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}
@Composable
fun FollowButton() {
    var isFollowing by remember { mutableStateOf(false) }
    Button(onClick = { isFollowing = !isFollowing }) {
        Text(text = if (isFollowing) "Unfollow" else "Follow")
    }
}

@Composable
fun ProfileScreen() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.profile_picture),
            contentDescription = "Profile Picture",
            modifier = Modifier
                .size(120.dp)
                .clip(CircleShape)
                .border(2.dp, Color.Gray, CircleShape)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "John Doe", style = MaterialTheme.typography.h5)
        Text(text = "Android Developer", style = MaterialTheme.typography.body2, color = Color.Gray)
        Spacer(modifier = Modifier.height(16.dp))
        FollowButton()
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ProfilApp_235150207111074FilzahMufidahTheme {
        Greeting("Android")
    }
}