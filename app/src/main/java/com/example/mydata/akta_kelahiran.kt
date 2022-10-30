package com.example.mydata

import android.app.DatePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.example.mydata.databinding.ActivityAktaKelahiranBinding
import com.example.mydata.databinding.ActivityMainBinding
import com.example.mydata.databinding.ActivityRegisterBinding
import com.example.mydata.databinding.ActivityRegisterBinding.*
import java.util.*

class akta_kelahiran : AppCompatActivity() {
    private lateinit var binding: ActivityAktaKelahiranBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityAktaKelahiranBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val items = listOf("Laki-Laki", "Perempuan")
        val adapter = ArrayAdapter(this,R.layout.list_item,items)
        binding.dropdownField.setAdapter(adapter)

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
        val lanjut = findViewById<Button>(R.id.Login2)
        lanjut.setOnClickListener {
            val intent = Intent(this,AkteKel_Next::class.java)
            startActivity(intent)
        }
        val tgl = findViewById<TextView>(R.id.form3)
        tgl.setOnClickListener {
            val c = Calendar.getInstance()
            c.add(Calendar.YEAR,18)
            val year = c.get(Calendar.YEAR)
            val month = c.get(Calendar.MONTH)
            val day = c.get(Calendar.DAY_OF_MONTH)

            val dp = DatePickerDialog(this,
                DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->
                val months = monthOfYear+1
                tgl.setText("$dayOfMonth-$month-$year")
            },year,month,day)
            dp.datePicker.maxDate = c.timeInMillis
            dp.show()
        }
    }
}