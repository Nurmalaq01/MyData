package com.example.mydata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout

class riwayat : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_riwayat)

        val riw = findViewById<LinearLayout>(R.id.riwayat)
        riw.setOnClickListener {
            val intent = Intent(this,jadwal::class.java)
            startActivity(intent)
        }
        val riw2 = findViewById<LinearLayout>(R.id.riwayat2)
        riw2.setOnClickListener {
            val intent = Intent(this,jadwal::class.java)
            startActivity(intent)
        }
        val riw3 = findViewById<LinearLayout>(R.id.riwayat3)
        riw3.setOnClickListener {
            val intent = Intent(this,jadwal::class.java)
            startActivity(intent)
        }
        val riw4 = findViewById<LinearLayout>(R.id.riwayat4)
        riw4.setOnClickListener {
            val intent = Intent(this,jadwal::class.java)
            startActivity(intent)
        }
        val riw5 = findViewById<LinearLayout>(R.id.riwayat5)
        riw5.setOnClickListener {
            val intent = Intent(this,jadwal::class.java)
            startActivity(intent)
        }
    }
}