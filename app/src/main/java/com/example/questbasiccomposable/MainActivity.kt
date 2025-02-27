package com.example.questbasiccomposable

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.questbasiccomposable.ui.theme.QuestBasicComposableTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuestBasicComposableTheme {
                //
                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) {innerPadding ->
                    BasicCompose( modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Preview (showBackground = true)
@Composable
fun BasicCompose(modifier: Modifier = Modifier) {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ){
        Text(
            text = "LOGIN",
            style = TextStyle(
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
        )
        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Ini adalah halaman login",
            style = TextStyle(
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
        )
        Spacer(modifier = Modifier.height(8.dp))

        Image(painter = painterResource(id = R.drawable.download),
            contentDescription = null,
            modifier = Modifier.fillMaxSize()
        )
        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Nama",
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
        )
        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Safira Nurul Hidayah",
            style = TextStyle(
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
        )
        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "20220140054",
            style = TextStyle(
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
        )
        Spacer(modifier = Modifier.height(8.dp))

        Image(painter = painterResource(id = R.drawable.downloadd),
            contentDescription = null,
            modifier = Modifier.fillMaxSize()
        )
        Spacer(modifier = Modifier.height(8.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    QuestBasicComposableTheme {
        BasicCompose()
    }
}