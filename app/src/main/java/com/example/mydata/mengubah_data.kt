package com.example.mydata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageView
import com.example.mydata.databinding.ActivityMenambahAnggotaBinding
import com.example.mydata.databinding.ActivityMengubahDataBinding

class mengubah_data : AppCompatActivity() {
    private lateinit var binding: ActivityMengubahDataBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMengubahDataBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val data3 = listOf("Blimbing", "Klojen", "Kedungkandang", "Sukun")
        val adapter3 = ArrayAdapter(this,R.layout.list_item,data3)
        binding.dropdownField2.setAdapter(adapter3)

        if (adapter3.getItem(0).toString().equals("Blimbing")){
            val Isi5 = listOf("Balearjosari", "Arjosari", "Polowijen", "Purwodadi", "Pandanwangi")
            val start5 = ArrayAdapter(this,R.layout.list_item,Isi5)
            binding.dropdownField3.setAdapter(start5)
        }
        else if (adapter3.getItem(1).toString().equals("Klojen")){
            val Isi6 = listOf("Kiduldalem", "Sukoharjo", "Kauman", "Bareng", "Gadingkasri")
            val start6 = ArrayAdapter(this,R.layout.list_item,Isi6)
            binding.dropdownField3.setAdapter(start6)
        }
        else if (adapter3.getItem(2).toString().equals("Kedungkandang")){
            val Isi7 = listOf("Kotalama", "Mergosono", "Bumiayu", "Sawojajar", "Madyopuro")
            val start7 = ArrayAdapter(this,R.layout.list_item,Isi7)
            binding.dropdownField3.setAdapter(start7)
        }
        else if (adapter3.getItem(3).toString().equals("Sukun")){
            val Isi8 = listOf("Ciptomulyo", "Gadang", "Kebonsari", "Karangbesuki", "Mulyorejo")
            val start8 = ArrayAdapter(this,R.layout.list_item,Isi8)
            binding.dropdownField3.setAdapter(start8)
        }

        val nt = findViewById<Button>(R.id.Login2)
        nt.setOnClickListener {
            val intent = Intent(this,mengubah_data_next::class.java)
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