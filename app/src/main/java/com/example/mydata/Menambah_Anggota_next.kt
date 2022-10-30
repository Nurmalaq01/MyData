package com.example.mydata

import android.app.DatePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.example.mydata.databinding.ActivityMenambahAnggotaBinding
import com.example.mydata.databinding.ActivityMenambahAnggotaNextBinding
import java.util.*

class Menambah_Anggota_next : AppCompatActivity() {
    private lateinit var binding: ActivityMenambahAnggotaNextBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMenambahAnggotaNextBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val data2 = listOf("Laki-Laki", "Perempuan")
        val adapter2 = ArrayAdapter(this,R.layout.list_item,data2)
        binding.dropdownField4.setAdapter(adapter2)

        val data3 = listOf("SD/MI", "SMP/MTS", "SMA/SMA/MA", "D1", "D2", "D3", "D4","S1", "S2", "S3", "TIDAK ADA")
        val adapter3 = ArrayAdapter(this,R.layout.list_item,data3)
        binding.dropdownField5.setAdapter(adapter3)

        val tgl2 = findViewById<TextView>(R.id.form3)
        tgl2.setOnClickListener {
            val c = Calendar.getInstance()
            c.add(Calendar.YEAR,18)
            val year = c.get(Calendar.YEAR)
            val month = c.get(Calendar.MONTH)
            val day = c.get(Calendar.DAY_OF_MONTH)

            val dp = DatePickerDialog(this,
                DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->
                    val months = monthOfYear+1
                    tgl2.setText("$dayOfMonth-$month-$year")
                },year,month,day)
            dp.datePicker.maxDate = c.timeInMillis
            dp.show()
        }
        val kirim = findViewById<Button>(R.id.Login3)
        kirim.setOnClickListener {
            val intent = Intent(this,riwayat::class.java)
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