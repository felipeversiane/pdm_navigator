package com.example.pdm_navigation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class Tela2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela2)

        val btnPrev: ImageButton = findViewById(R.id.btnPrev)
        val btnNext: ImageButton = findViewById(R.id.btnNext)

        btnPrev.setOnClickListener {
            // Volta para Tela1
            val intent = Intent(this, Tela1Activity::class.java)
            startActivity(intent)
            finish()
        }

        btnNext.setOnClickListener {
            // Vai para Tela3
            val intent = Intent(this, Tela3Activity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
