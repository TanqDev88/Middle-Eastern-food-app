package com.example.middle_eastern_food_app

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity(){

    private lateinit var rvRecetas: RecyclerView
    private lateinit var adapter: Adapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvRecetas = findViewById(R.id.rv_recetas)
        rvRecetas.layoutManager = LinearLayoutManager(this)
        adapter = Adapter(this)
        rvRecetas.adapter = adapter
        adapter.submitList(getListadoRecetas())

        adapter.onItemClickListener = {
            navegarDetalle(it)
        }
    }

    private fun navegarDetalle(receta: Receta) {
        val intent = Intent(this, DetailActivity::class.java)
        intent.putExtra("receta", receta)
        startActivity(intent)
    }