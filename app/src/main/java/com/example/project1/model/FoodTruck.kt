package com.example.project1.model

/*
   * An ID (Int)
   * Name of the food truck (String)
   * Image of the Food Truck (Int)
   * Its location; ex. Silo, Quad, etc.  (String)
   * Time that it is open; ex. 11:00AM - 4:00PM (String)
   * Description of the food truck (String)
   * A link to the food truck’s website (String)
   * */

data class FoodTruck(
    val ID: Int,
    val name: String,
    val image: Int,
    val location: String,
    val openTime: String,
    val description: String,
    val link: String
    ) { }


