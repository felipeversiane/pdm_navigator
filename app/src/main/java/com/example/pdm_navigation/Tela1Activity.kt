package com.example.pdm_navigation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class Tela1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela1)

        val btnNext: ImageButton = findViewById(R.id.btnNext)

        btnNext.setOnClickListener {
            // Vai para Tela2
            val intent = Intent(this, Tela2Activity::class.java)
            startActivity(intent)
        }
    }
}
