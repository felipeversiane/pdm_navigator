package com.example.pdm_navigation

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class Activity4 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_4)

        val toolbar = findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar)
        val btnNext = findViewById<android.widget.ImageButton>(R.id.btnNext)

        toolbar.setNavigationOnClickListener {
            val intent = Intent(this, Activity1::class.java)
            startActivity(intent)
        }

        btnNext.setOnClickListener {
            val intent = Intent(this, Activity1::class.java)
            startActivity(intent)
        }
    }
}
