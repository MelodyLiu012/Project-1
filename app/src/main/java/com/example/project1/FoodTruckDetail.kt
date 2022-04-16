package com.example.project1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class FoodTruckDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_truck_detail)

        var itemIndexNum: Int = intent.getIntExtra("itemIndex", 0) // hope default value never used

        // Image
        val itemImage = findViewById<ImageView>(R.id.imageView2)
        itemImage.setImageResource(truckList[itemIndexNum].image)

        // Name
        val itemName = findViewById<TextView>(R.id.nameView2)
        itemName.text = truckList[itemIndexNum].name

        // Location
        val itemLocation = findViewById<TextView>(R.id.locationView)
        itemLocation.text = truckList[itemIndexNum].location

        // Time
        val itemTime = findViewById<TextView>(R.id.timeView)
        itemTime.text = truckList[itemIndexNum].openTime

        // Description
        val itemDesc = findViewById<TextView>(R.id.descriptionTextView)
        itemDesc.text = truckList[itemIndexNum].description

        // Website Link
        val itemLink = findViewById<TextView>(R.id.websiteLink)
        itemLink.setOnClickListener {
            val uri = Uri.parse(truckList[itemIndexNum].link)
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }
    }
}