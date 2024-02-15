package com.kaush.foodie

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.cardview.widget.CardView


class MainActivity : AppCompatActivity() {




    private lateinit var mainCourseCard: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var startersCard = findViewById<CardView>(R.id.card_starters)
        var  mainCourseCard = findViewById<CardView>(R.id.card_main)
        var  dessertsCard = findViewById<CardView>(R.id.card_desserts)

        startersCard.setOnClickListener {
            val intent = Intent(this, StartersActivity::class.java)
            startActivity(intent)
        }

        mainCourseCard.setOnClickListener {
            val intent = Intent(this, MainCourse::class.java)
            startActivity(intent)
        }

        dessertsCard.setOnClickListener {
            val intent = Intent(this, DessertsActivity::class.java)
            startActivity(intent)
        }


    }
}