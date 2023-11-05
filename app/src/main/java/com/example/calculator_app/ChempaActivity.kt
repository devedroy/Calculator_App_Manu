package com.example.calculator_app

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.calculator_app.databinding.ActivityChempaBinding

class ChempaActivity : AppCompatActivity() {
    private lateinit var binding: ActivityChempaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChempaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.myChempa.btnChempa.setOnClickListener {
            Toast.makeText(
                this@ChempaActivity,
                "CHEMPAA......PALUGUTADI🤚, ARTHAMAINDA😡",
                Toast.LENGTH_LONG
            ).show()
        }
    }
}