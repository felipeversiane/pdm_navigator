package com.example.pdm_navigation

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class Activity1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_1)

        val toolbar = findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar)
        val btnNext = findViewById<android.widget.ImageButton>(R.id.btnNext)
        val btnPrev = findViewById<android.widget.ImageButton>(R.id.btnPrev)

        toolbar.setNavigationOnClickListener {
        }

        btnNext.setOnClickListener {
            val intent = Intent(this, Activity2::class.java)
            startActivity(intent)
        }

        btnPrev.visibility = View.GONE
    }
}
