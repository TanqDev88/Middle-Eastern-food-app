package com.example.ppoliverajorgedaniel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide

class DetailActivity : AppCompatActivity() {
    private lateinit var tvnombreDetail: TextView
    private lateinit var tvIngredientesDetail: TextView
    private lateinit var ivLogo: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val receta = intent.getParcelableExtra<Receta>("receta")

        tvnombreDetail = findViewById(R.id.tv_nombre_detail)
        tvIngredientesDetail = findViewById(R.id.tv_ingredientesDetail)

        ivLogo = findViewById(R.id.iv_logo_detail)


        tvnombreDetail.text = receta?.nombre
        tvIngredientesDetail.text = receta?.ingredientes

        Glide.with(this).load(receta?.logo).into(ivLogo)
    }
}