package com.example.hellokotlin428

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
// val btnHello = findViewById<Button>(R.id.btnHello)
//var btnhello : Button
// btnhello = findViewById(R.id.btnhello) //
// Toast.makeText(this@MainActivity, "Hello Kotlin",Toast.LENGTH_LONG).show()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // val btnHello = findViewById<Button>(R.id.btnHello)
        var btnhello : Button
// btnhello = findViewById(R.id.btnhello) //
        Toast.makeText(this@MainActivity, "Hello Kotlin",Toast.LENGTH_LONG).show()
    }

}