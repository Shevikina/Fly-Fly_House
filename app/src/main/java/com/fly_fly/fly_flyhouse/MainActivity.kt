package com.fly_fly.fly_flyhouse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.fly_fly.fly_flyhouse.ui.theme.FlyFlyHouseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FlyFlyHouseTheme {
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

sealed class NavScreen {
    data object Home : NavScreen()
    data object UserProfile : NavScreen()
    data object Search : NavScreen()
    data object MapObjects : NavScreen()
    data object Events : NavScreen()
    data object Entertainments : NavScreen()
    data object Restaurants : NavScreen()
    data class SpecialOfferPage(val offerId: Int) : NavScreen()
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FlyFlyHouseTheme {
        Greeting("Android")
    }
}