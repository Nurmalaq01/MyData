package com.example.mydata

import android.app.DatePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import java.util.*

class AktaKematian : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_akta_kematian)

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
        val kirim = findViewById<Button>(R.id.Login3)
        kirim.setOnClickListener {
            val intent = Intent(this,riwayat::class.java)
            startActivity(intent)
        }
        val date = findViewById<TextView>(R.id.isi2)
        date.setOnClickListener {
            val c = Calendar.getInstance()
            c.add(Calendar.YEAR,18)
            val year = c.get(Calendar.YEAR)
            val month = c.get(Calendar.MONTH)
            val day = c.get(Calendar.DAY_OF_MONTH)

            val dp = DatePickerDialog(this,DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->
                val months = monthOfYear+1
                date.setText("$dayOfMonth-$month-$year")
            },year,month,day)
            dp.datePicker.maxDate = c.timeInMillis
            dp.show()
        }
        val date2 = findViewById<TextView>(R.id.isi5)
        date2.setOnClickListener {
            val c = Calendar.getInstance()
            c.add(Calendar.YEAR,18)
            val year = c.get(Calendar.YEAR)
            val month = c.get(Calendar.MONTH)
            val day = c.get(Calendar.DAY_OF_MONTH)

            val dp = DatePickerDialog(this,DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->
                val months = monthOfYear+1
                date2.setText("$dayOfMonth-$month-$year")
            },year,month,day)
            dp.datePicker.maxDate = c.timeInMillis
            dp.show()
        }
    }


}