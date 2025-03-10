package com.example.firstaapp
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable

fun ListScreen(
    categories: List<FoodCategory>,
    menuItems: List<MenuItem>
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        // LazyRow for Categories (Horizontal Scroll)
        LazyRow(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(categories) { category ->
                CategoryItem(category)
            }
        }

        // Spacer for separation (optional)
        Spacer(modifier = Modifier.padding(vertical = 10.dp))

        // LazyColumn for Menu Items (Vertical Scroll)
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f), // Ensures it expands downwards
            verticalArrangement = Arrangement.spacedBy(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            items(menuItems) { menuItem ->
                CategoryItemC(menuItem)
            }

        }
    }
}
