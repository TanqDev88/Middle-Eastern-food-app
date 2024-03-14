package com.example.ppoliverajorgedaniel

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class Adapter(val context: Context) : ListAdapter<Receta, Adapter.ViewHolder>(DiffCallBack) {

    lateinit var onItemClickListener: (Receta) -> Unit

    inner class ViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        private val nombre: TextView = view.findViewById(R.id.tv_nombre)
        private val dificultad: TextView = view.findViewById(R.id.tv_dificultad)
        private val pais: TextView = view.findViewById(R.id.tv_pais)
        private val logo: ImageView = view.findViewById(R.id.iv_logo)
        private val bandera: ImageView = view.findViewById(R.id.iv_bandera)

        fun bind (receta: Receta) {

            nombre.text = receta.nombre
        dificultad.text = receta.dificultad.toString()
        pais.text = receta.pais.toString()

            val imagen = when (receta.pais) {
                Origen.EGIPTO -> R.drawable.egypt
                Origen.TURQUIA -> R.drawable.turkey
                Origen.AFGANISTAN -> R.drawable.afghanistan
                Origen.LIBANO -> R.drawable.lebanon
                Origen.ARABIA -> R.drawable.arabia
                Origen.IRAN -> R.drawable.iran
                else -> {
                    R.drawable.iraq
                }
            }

            bandera.setImageResource(imagen)
            Glide.with(context).load(receta.logo).into(logo)

            view.setOnClickListener {
                onItemClickListener(receta)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter.ViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: Adapter.ViewHolder, position: Int) {
        val receta = getItem(position)
        holder.bind(receta)
    }

    companion object DiffCallBack : DiffUtil.ItemCallback<Receta>() {
        override fun areItemsTheSame(oldItem: Receta, newItem: Receta): Boolean {
            return  oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Receta, newItem: Receta): Boolean {
            return oldItem == newItem
        }
    }
}
