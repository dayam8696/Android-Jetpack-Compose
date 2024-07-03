package com.example.sideeeffectinjetpackcompose

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.sideeeffectinjetpackcompose.ui.theme.SideEeffectInJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SideEeffectInJetpackComposeTheme {
                Greeting()

                }
            }
        }
    }


@Composable
fun Greeting() {
  var count by remember {
      mutableStateOf(0)
  }
    Log.d("Dayam","stateChanged")
    Column(modifier = Modifier.fillMaxSize()
    , verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally){
        Text(text = "current Count is :$count")
        Button(onClick = {count++}) {
            Text(text = "Click Me")

        }

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SideEeffectInJetpackComposeTheme {
        Greeting()
    }
}