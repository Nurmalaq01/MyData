package com.example.mydata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val message = intent.getStringExtra("Admin")
        val textView = findViewById<TextView>(R.id.sapaan).apply {
            text = message
        }

        val cal = findViewById<ImageView>(R.id.calendar)
        cal.setOnClickListener {
            val intent = Intent(this,riwayat::class.java)
            startActivity(intent)
        }
        val back = findViewById<ImageView>(R.id.home)
        back.setOnClickListener {
            val intent = Intent(this,home::class.java)
            startActivity(intent)
        }
        val kk = findViewById<Button>(R.id.kk)
        kk.setOnClickListener {
            val intent = Intent(this,kk::class.java)
            startActivity(intent)
        }
        val aktaKel = findViewById<Button>(R.id.aktekelahiran)
        aktaKel.setOnClickListener {
            val intent = Intent(this,akta_kelahiran::class.java)
            startActivity(intent)
        }
        val button = findViewById<Button>(R.id.AK)
        button.setOnClickListener {
            val intent = Intent(this, AktaKematian::class.java)
            startActivity(intent)
        }
        val ktp = findViewById<Button>(R.id.ktp)
        ktp.setOnClickListener {
            val intent = Intent(this,KtpActivity::class.java)
            startActivity(intent)
        }
    }
}