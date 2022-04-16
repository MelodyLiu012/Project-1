package com.example.project1

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.project1.model.FoodTruck

class RecyclerViewAdapter(private var trucks: List<FoodTruck>)
    : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemImage = itemView.findViewById<ImageView>(R.id.imageView)
        val itemName = itemView.findViewById<TextView>(R.id.nameView)
        val itemLocAndTime = itemView.findViewById<TextView>(R.id.locAndTimeView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.activity_main, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val truck = trucks[position]
        holder.itemImage.setImageResource(truckList[truck.ID].image)
        holder.itemName.text = truckList[truck.ID].name
        holder.itemLocAndTime.text = "${truck.location}  •  ${truck.openTime}"
        holder.itemView.setOnClickListener { v ->
            val intent = Intent(v.context, FoodTruckDetail::class.java)
            intent.putExtra("itemIndex", truck.ID)
            v.context.startActivity(intent)
        }
        // can also be written as:
        // holder.apply { /* the above block without "holder." */}
    }

    override fun getItemCount(): Int {
        return trucks.size
    }
    // can also be written as:
    // override fun getItemCount(): Int = trucks.size
}