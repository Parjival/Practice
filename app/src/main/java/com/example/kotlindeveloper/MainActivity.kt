package com.example.kotlindeveloper

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.kotlindeveloper.ui.theme.KotlinDeveloperTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KotlinDeveloperTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    KotlinImage("Android")
                }
            }
        }
    }
}

@Composable
fun KotlinText(message: String, modifier: Modifier = Modifier) {
    Text(
        text = message,
        modifier = modifier,
    )
}
@Composable
fun KotlinImage(name: String, modifier: Modifier = Modifier){
   val image= painterResource(R.drawable.bg_compose_background)
   Image(
       painter = image,
       contentDescription=null

   )
}

@Preview(showBackground = false)
@Composable
fun GreetingPreview() {
    KotlinDeveloperTheme {
        KotlinImage("Android")
    }
}