package com.kaush.foodie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class DessertsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_desserts)

        val listView = findViewById<ListView>(R.id.list_view_desserts)

        val dishes = arrayOf(
             Dish("Cocoa and blackcurrant cake", "Moist cake made with cocoa and fresh blackcurrant", 499),
        Dish("Mulberry and cardamom crumble", "Fresh mulberry and green cardamom topped with butter crumble", 699),
         Dish("Lemon scones with chilli jam", "Vegan scones served with chilli jam and fresh coconut cream", 599),
         Dish("Potato and banana vegan crepes", "Crispy vegan crepes filled with fresh potato and banana", 599),
        Dish("Cinnamon and treacle buns", "Crumbly buns made with cinnamon and dark treacle", 499),
        )


        val dessertsAdapter = ArrayAdapter<Dish>(this,android.R.layout.simple_list_item_1,dishes);

        listView.adapter = dessertsAdapter
    }
}