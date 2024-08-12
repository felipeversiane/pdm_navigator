package com.example.pdm_navigation

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class Activity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val toolbar = findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar)
        val btnPrev = findViewById<android.widget.ImageButton>(R.id.btnPrev)
        val btnNext = findViewById<android.widget.ImageButton>(R.id.btnNext)

        toolbar.setNavigationOnClickListener {
            val intent = Intent(this, Activity1::class.java)
            startActivity(intent)
        }

        btnNext.setOnClickListener {
            val intent = Intent(this, Activity3::class.java)
            startActivity(intent)
        }

        btnPrev.visibility = View.VISIBLE
    }
}
