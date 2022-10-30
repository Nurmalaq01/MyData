package com.example.mydata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageView
import com.example.mydata.databinding.ActivityAktaKelahiranBinding
import com.example.mydata.databinding.ActivityMenambahAnggotaBinding

class Menambah_Anggota : AppCompatActivity() {
    private lateinit var binding: ActivityMenambahAnggotaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMenambahAnggotaBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val data = listOf("Blimbing", "Klojen", "Kedungkandang", "Sukun")
        val adapter = ArrayAdapter(this,R.layout.list_item,data)
        binding.dropdownField2.setAdapter(adapter)

        if (adapter.getItem(0).toString().equals("Blimbing")){
            val Isi = listOf("Balearjosari", "Arjosari", "Polowijen", "Purwodadi", "Pandanwangi")
            val start = ArrayAdapter(this,R.layout.list_item,Isi)
            binding.dropdownField3.setAdapter(start)
        }
        else if (adapter.getItem(1).toString().equals("Klojen")){
            val Isi2 = listOf("Kiduldalem", "Sukoharjo", "Kauman", "Bareng", "Gadingkasri")
            val start2 = ArrayAdapter(this,R.layout.list_item,Isi2)
            binding.dropdownField3.setAdapter(start2)
        }
        else if (adapter.getItem(2).toString().equals("Kedungkandang")){
            val Isi3 = listOf("Kotalama", "Mergosono", "Bumiayu", "Sawojajar", "Madyopuro")
            val start3 = ArrayAdapter(this,R.layout.list_item,Isi3)
            binding.dropdownField3.setAdapter(start3)
        }
        else if (adapter.getItem(3).toString().equals("Sukun")){
            val Isi4 = listOf("Ciptomulyo", "Gadang", "Kebonsari", "Karangbesuki", "Mulyorejo")
            val start4 = ArrayAdapter(this,R.layout.list_item,Isi4)
            binding.dropdownField3.setAdapter(start4)
        }

        val nt = findViewById<Button>(R.id.Login2)
        nt.setOnClickListener {
            val intent = Intent(this,Menambah_Anggota_next::class.java)
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