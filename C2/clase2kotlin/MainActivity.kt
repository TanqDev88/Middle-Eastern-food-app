package com.example.clase2kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, "Hola desde main activity", Toast.LENGTH_LONG).show()

        val button : Button = findViewById(R.id.buttonPrimero)
        val texto : TextView = findViewById(R.id.textViewMensaje)
        button.setOnClickListener {
            texto.text = "Cambiamos dede el main"
        }



    //button.setOnClickListener { texto.text }
    }
}


