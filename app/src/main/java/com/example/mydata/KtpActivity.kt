package com.example.mydata

import android.app.DatePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import java.util.*

class KtpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ktp)

        val cal = findViewById<ImageView>(R.id.home1)
        cal.setOnClickListener {
            val intent = Intent(this,riwayat::class.java)
            startActivity(intent)
        }
        val back = findViewById<ImageView>(R.id.home)
        back.setOnClickListener {
            val intent = Intent(this,home::class.java)
            startActivity(intent)
        }
        val send = findViewById<Button>(R.id.Login4)
        send.setOnClickListener {
            val intent = Intent(this,riwayat::class.java)
            startActivity(intent)
        }
        val tanggal = findViewById<TextView>(R.id.fill4)
        tanggal.setOnClickListener {
            val c = Calendar.getInstance()
            c.add(Calendar.YEAR,18)
            val year = c.get(Calendar.YEAR)
            val month = c.get(Calendar.MONTH)
            val day = c.get(Calendar.DAY_OF_MONTH)

            val dp = DatePickerDialog(this,
                DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->
                val months = monthOfYear+1
                tanggal.setText("$dayOfMonth-$month-$year")
            },year,month,day)
            dp.datePicker.maxDate = c.timeInMillis
            dp.show()
        }
    }
}