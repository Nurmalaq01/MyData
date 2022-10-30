package com.example.mydata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.Toast
import com.example.mydata.databinding.ActivityRegisterBinding
import com.google.firebase.auth.FirebaseAuth

class register : AppCompatActivity() {

    lateinit var binding : ActivityRegisterBinding
    lateinit var auth : FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val registry = findViewById<Button>(R.id.registry)
        registry.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }

        auth = FirebaseAuth.getInstance()

        binding.registry.setOnClickListener{
            val email = binding.etemail.text.toString()
            val pass = binding.etpass.text.toString()
            val namaawal = binding.etname.text.toString()

            //Validasi
            if (email.isEmpty()){
                binding.etemail.error="Email Harus Diisi"
                binding.etemail.requestFocus()
                return@setOnClickListener
            }
            if (namaawal.isEmpty()){
                binding.etname.error="Nama Harus Diisi"
                binding.etname.requestFocus()
                return@setOnClickListener
            }

            if(pass.length<8){
                binding.etpass.error="Password Harus Minimal 8 Karakter"
                binding.etpass.requestFocus()
                return@setOnClickListener
            }

            if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                binding.etemail.error="Email Tidak Valid"
                binding.etemail.requestFocus()
                return@setOnClickListener
            }

            if (pass.isEmpty()){
                binding.etpass.error="Password Harus Diisi"
                binding.etpass.requestFocus()
                return@setOnClickListener
            }

            RegisterFirebase(email,pass)

        }

    }

    private fun RegisterFirebase(email: String, pass: String) {
        auth.createUserWithEmailAndPassword(email,pass)
            .addOnCompleteListener(this){
                if(it.isSuccessful) {
                    Toast.makeText(this, "Register Berhasil", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                }else{
                    Toast.makeText(this,"${it.exception?.message}", Toast.LENGTH_SHORT).show()
                }
            }
    }
}