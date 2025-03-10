## Food Menu App

A simple Jetpack Compose-based Android application that displays food categories and menu items in a structured list format.

## Features 
1- Displays a list of food categories in a horizontal scrollable row.

2-Displays a list of menu items in a vertical scrollable column.

3-Shows category and menu item details, including name, description, price, and popularity badge.

## Project Structure
**Data Classes (FoodCategory & MenuItem)**
Located in the data package:

**FoodCategory:** Represents a food category with an id, name, description, and an icon.

**MenuItem:** Represents a menu item with an id, name, price, description, category, image, and a flag to indicate if it is popular.

## UI Components

**Located in the com.example.firstaapp package:**

**CategoryItem(category:** FoodCategory): Displays a food category with its name and icon.

**CategoryItemC(menuItem: MenuItem):** Displays a menu item with its name, price, description, image, and a "Popular" badge if applicable.

## ListScreen.kt

**ListScreen(categories: List, menuItems: List):** 

*Renders the main UI with:*

A horizontally scrollable list of food categories.

A vertically scrollable list of menu items.

## Screenshots
![image](https://github.com/user-attachments/assets/9acd0d8d-7ff7-4470-9c2a-f75d0f78e1b7)


## How to Use

1- Clone the repository.

2- Open the project in Android Studio.

3- Run the application on an emulator or physical device.





