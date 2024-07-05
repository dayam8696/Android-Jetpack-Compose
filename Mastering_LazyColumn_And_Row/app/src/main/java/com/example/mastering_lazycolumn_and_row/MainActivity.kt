package com.example.mastering_lazycolumn_and_row

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mastering_lazycolumn_and_row.ui.theme.Mastering_LazyColumn_And_RowTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Mastering_LazyColumn_And_RowTheme {
                MainScreen()
            }
        }
    }
}

@Composable
fun MainScreen() {
    val list= List(20) {"Hello Android $it"}
    val list1= List(20) {"Hello Dayam $it"}
    val list2= List(20) {"Hello Quriify $it"}
    LazyRow(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center, modifier = Modifier.fillMaxSize()) {

        item {
            Text(
            text = "Hello Android",
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
        ) }
        items(list){item->
           Item(item = item)

        }
        item {
            Text(
                text = "Hello Dayam",
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
            ) }
        items(list1){item->
            Item(item = item)

        }
        item {
            Text(
                text = "Hello Qurify",
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
            ) }
        items(list2){item->
            Item(item = item)

        }
    }
}

@Composable
fun Item(item:String) {
    Text(
        text = item,
        modifier = Modifier
            .padding(4.dp)
            .background(Color.Gray)
            .padding(16.dp)
            .fillMaxWidth()
    )
    
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Mastering_LazyColumn_And_RowTheme {
     MainScreen()
    }
}