package com.example.ejerciciovalidacionif

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    private lateinit var button: Button
    private lateinit var textInputEditText: TextInputEditText
    private lateinit var tvMessageError: TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)
        textInputEditText = findViewById(R.id.textInputEditText)
        tvMessageError = findViewById(R.id.tvMessageError)

        val text = textInputEditText.text

        button.setOnClickListener {
            if (text != null && text.length == 0) {
                tvMessageError.text = "El nombre esta vacio"
            } else {
                tvMessageError.text = ""
            }
        }
    }
}