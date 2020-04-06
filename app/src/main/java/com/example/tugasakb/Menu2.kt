package com.example.tugasakb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Menu2 : AppCompatActivity() {
    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu2)
        button = findViewById(R.id.Button2)
        button.setOnClickListener {
            startActivity(Intent(this, Menu3::class.java))
        }
    }
}
