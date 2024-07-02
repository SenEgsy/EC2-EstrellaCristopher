package com.example.ecandroid

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ecandroid.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAcceder.setOnClickListener {
            // Implementar la lógica de registro aquí
            finish()
        }
    }
}