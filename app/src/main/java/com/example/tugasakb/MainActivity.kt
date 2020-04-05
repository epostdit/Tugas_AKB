package com.example.tugasakb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

         class MainActivity : AppCompatActivity() {
             private lateinit var button:  Button
             override fun onCreate(savedInstanceState: Bundle?) {
                 super.onCreate(savedInstanceState)
                 setContentView(R.layout.activity_main)
                 button = findViewById(R.id.Button1)
                 button.setOnClickListener {
                     startActivity(Intent(this, Menu2::class.java))
                 }
             }
         }

