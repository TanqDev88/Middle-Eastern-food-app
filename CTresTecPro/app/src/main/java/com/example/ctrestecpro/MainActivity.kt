package com.example.ctrestecpro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val numeroUno = 10
        val numeroDos = 40
        val suma = ClaseSuma()
        var resultado = suma.sumarDosNumeros(numeroUno , numeroDos)

        if (resultado > 50){
            log.i("infomracion", "El numero es mayor a 50")
        }
        else if (resultado == 50){
            Log.i("informacion", "El numero es iguial a 50")
        }
        else{
        Log.i("informacion", "El numero es menor a 50")
        }
    }
}