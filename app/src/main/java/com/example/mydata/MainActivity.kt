package com.example.mydata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.mydata.databinding.ActivityMainBinding
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var auth : FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityMainBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        auth = FirebaseAuth.getInstance()

        val next = findViewById<TextView>(R.id.next)
        next.setOnClickListener {
            val intent = Intent(this, register::class.java)
            startActivity(intent)
        }
        val Login = findViewById<Button>(R.id.Login)
        Login.setOnClickListener {
            val intent = Intent(this, home::class.java)
            startActivity(intent)
        }

        binding.next.setOnClickListener{
            val intent= Intent(this, register::class.java)
            startActivity(intent)
        }

        binding.Login.setOnClickListener{
            val email = binding.mskemail.text.toString()
            val pass = binding.mskpass.text.toString()

            //Validasi
            if (email.isEmpty()){
                binding.mskemail.error="Email Harus Diisi"
                binding.mskemail.requestFocus()
                return@setOnClickListener
            }
            if (pass.isEmpty()){
                binding.mskpass.error="Password Harus Diisi"
                binding.mskpass.requestFocus()
                return@setOnClickListener
            }

            if(pass.length<8){
                binding.mskpass.error="Password Harus Minimal 8 Karakter"
                binding.mskpass.requestFocus()
                return@setOnClickListener
            }

            if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                binding.mskemail.error="Email Tidak Valid"
                binding.mskemail.requestFocus()
                return@setOnClickListener
            }

            LoginFirebase(email,pass)
        }

    }

    private fun LoginFirebase(email: String, pass: String) {
        auth.signInWithEmailAndPassword(email,pass)
            .addOnCompleteListener(this){
                if(it.isSuccessful) {
                    Toast.makeText(this, "Selamat datang $email", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this, home::class.java)
                    startActivity(intent)
                }else{
                    Toast.makeText(this,"${it.exception?.message}", Toast.LENGTH_SHORT).show()
                }
            }
    }

}