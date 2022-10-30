package com.example.mydata

import android.app.Activity
import android.content.DialogInterface
import android.content.Intent
import android.content.UriPermission
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.net.UriCompat
import android.net.Uri as Uri

class AkteKel_Next : AppCompatActivity() {
    private val REQUEST_IMAGE_GALLERY = 132
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_akte_kel_next)

        val kirim = findViewById<Button>(R.id.Login3)
        kirim.setOnClickListener {
            val intent = Intent(this, riwayat::class.java)
            startActivity(intent)
        }
        val cal = findViewById<ImageView>(R.id.home1)
        cal.setOnClickListener {
            val intent = Intent(this, riwayat::class.java)
            startActivity(intent)
        }
        val home = findViewById<ImageView>(R.id.home)
        home.setOnClickListener {
            val intent = Intent(this, home::class.java)
            startActivity(intent)
        }
    }
}
