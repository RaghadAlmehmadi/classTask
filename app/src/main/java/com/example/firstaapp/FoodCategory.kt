package com.example.firstaapp

data class FoodCategory(
    val id:Int,
    val name: String,
    val description: String,
    val icon: Int,
    )
data class MenuItem (
val id: Int,
val name: String,
val price: Double,
val description:String,
val category:String,
val image: Int,
val isPopular:Boolean
)