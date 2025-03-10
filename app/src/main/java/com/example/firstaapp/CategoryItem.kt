package com.example.firstaapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Badge
import androidx.compose.material3.ExperimentalMaterial3Api
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
fun CategoryItem(category: FoodCategory) {

    Row(
        modifier = Modifier
            .padding(horizontal = 10.dp, vertical = 20.dp)
            .fillMaxWidth(0.9f)
            .padding(8.dp)
            .background(Color.Gray),
        verticalAlignment = Alignment.CenterVertically

    ) {
        Image(
            painter = painterResource(id = category.icon),
            contentDescription = category.name,
            modifier = Modifier
                .size(40.dp)
                .padding(end = 8.dp),
            contentScale = ContentScale.Crop
        )
        Text(
            text = category.name,
            fontSize = 16.sp
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CategoryItemC(menuItem: MenuItem) {
    Column(
        modifier = Modifier
            .padding(horizontal = 10.dp, vertical = 20.dp)
            .fillMaxWidth(0.9f)
            .padding(8.dp)
            .background(Color.Gray),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = menuItem.image),
            contentDescription = menuItem.name,
            modifier = Modifier
                .size(40.dp)
                .padding(end = 8.dp),
            contentScale = ContentScale.Crop
        )
        Text(
            text = "${menuItem.name} - \$${menuItem.price}",
            fontSize = 20.sp,
            modifier = Modifier.padding(top = 8.dp)
        )
        Text(
            text = menuItem.description,
            fontSize = 14.sp,
            modifier = Modifier.padding(top = 4.dp)
        )
        if (menuItem.isPopular) {
            Text(
                text = "Popular",
                color = Color.White,
                fontSize = 12.sp,
                modifier = Modifier
                    .padding(top = 8.dp)
                    .background(Color.Red)
                    .padding(4.dp)
            )
        }
    }
}