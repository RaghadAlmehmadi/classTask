package com.example.firstaapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.firstaapp.ui.theme.FirstaappTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirstaappTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ListScreen(
                        categories = listOf(
                            FoodCategory(1, "Burgers", "", R.drawable.burger),
                            FoodCategory(2, "Pizza", "", R.drawable.pizza),
                            FoodCategory(3, "Desserts", "", R.drawable.shortcake),
                            FoodCategory(4, "Orange juice", "", R.drawable.drinks)
                        ),
                        menuItems = listOf(
                            MenuItem(1, "Burgers", 8.99, "Savory", " ", R.drawable.burger, true),
                            MenuItem(2, "Pizza", 11.99, "Cheesy", "", R.drawable.pizza, true),
                            MenuItem(3, "Desserts", 20.99, "Sweet", "", R.drawable.shortcake, false),
                            MenuItem(4, "Orange juice", 6.99, "Drink", "", R.drawable.drinks, true),

                            )
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

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FirstaappTheme {
        Greeting("Android")
    }
}