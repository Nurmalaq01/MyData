package com.example.mydata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout

class kk : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kk)

        val tombol = findViewById<LinearLayout>(R.id.tombol)
        tombol.setOnClickListener {
            val intent = Intent(this,Menambah_Anggota::class.java)
            startActivity(intent)
        }
        val tombol2 = findViewById<LinearLayout>(R.id.tombol2)
        tombol2.setOnClickListener {
            val intent = Intent(this,menghapus_anggota::class.java)
            startActivity(intent)
        }
        val tombol3 = findViewById<LinearLayout>(R.id.tombol3)
        tombol3.setOnClickListener {
            val intent = Intent(this,mengubah_data::class.java)
            startActivity(intent)
        }
        val cal = findViewById<ImageView>(R.id.home1)
        cal.setOnClickListener {
            val intent = Intent(this,riwayat::class.java)
            startActivity(intent)
        }
        val home = findViewById<ImageView>(R.id.home)
        home.setOnClickListener {
            val intent = Intent(this,home::class.java)
            startActivity(intent)
        }
    }
}