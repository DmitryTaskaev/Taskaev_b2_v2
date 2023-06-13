package com.example.taskaev_b2_v2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ChoiceFigure : AppCompatActivity() {

    private lateinit var Calculate: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choice_figure)

        Calculate = findViewById(R.id.Сalculation)

        Calculate.setOnClickListener{
            val intent = Intent(this@ChoiceFigure, Result::class.java)
            startActivity(intent)
        }

    }
}