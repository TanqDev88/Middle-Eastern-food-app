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


    }
}