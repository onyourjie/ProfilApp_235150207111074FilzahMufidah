package com.example.profilapp_235150207111074filzahmufidah

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.profilapp_235150207111074filzahmufidah.ui.theme.ProfilApp_235150207111074FilzahMufidahTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProfilApp_235150207111074FilzahMufidahTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ProfilScreen()
                }
            }
        }
    }
}

@Composable
fun ProfilScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(
                color = Color(0xFFF5F5F5),
                shape = androidx.compose.foundation.shape.RoundedCornerShape(12.dp)
            )
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground), // Ganti dengan gambar profil Anda
            contentDescription = "Foto Profil Filzah Mufidah",
            modifier = Modifier
                .size(120.dp)
                .clip(CircleShape)
                .background(Color(0xFF6200EE))
        )

        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Filzah Mufidah",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF333333)
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "NIM: 235150207111074",
            fontSize = 16.sp,
            color = Color(0xFF666666)
        )

        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Mahasiswa Teknik Informatika",
            fontSize = 14.sp,
            color = Color(0xFF888888)
        )

        Spacer(modifier = Modifier.height(24.dp))

        FollowButton()
    }
}

@Composable
fun FollowButton() {
    var isFollowed by remember { mutableStateOf(false) }

    Button(
        onClick = { isFollowed = !isFollowed },
        modifier = Modifier
            .fillMaxWidth(0.6f)
            .height(48.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = if (isFollowed) Color(0xFFFF5722) else Color(0xFF6200EE),
            contentColor = Color.White
        )
    ) {
        Text(
            text = if (isFollowed) "Unfollow" else "Follow",
            fontSize = 16.sp,
            fontWeight = FontWeight.Medium
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ProfilScreenPreview() {
    ProfilApp_235150207111074FilzahMufidahTheme {
        ProfilScreen()
    }
}