package com.example.filmo.controller

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.filmo.R
import com.example.filmo.data.Pelicula
import com.example.filmo.data.Serie

class PeliculasAdapter(var peliculas: List<Pelicula>) : RecyclerView.Adapter<PeliculasAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tituloTextView: TextView = itemView.findViewById(R.id.tituloTextView)
        val generoTextView: TextView = itemView.findViewById(R.id.generoTextView)
        val duracionTextView: TextView = itemView.findViewById(R.id.duracionTextView)
        val fechaEstrenoTextView: TextView = itemView.findViewById(R.id.fechaEstrenoTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_pelicula, parent, false)
        return ViewHolder(view)
    }
    fun updateData(newPelis: List<Pelicula>) {
        peliculas = newPelis
        notifyDataSetChanged()
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val pelicula = peliculas[position]
        holder.tituloTextView.text = pelicula.titulo
        holder.generoTextView.text = pelicula.genero
        holder.duracionTextView.text = "Duración: ${pelicula.duracion} min"
        holder.fechaEstrenoTextView.text = "Estreno: ${pelicula.fechaEstreno}"
    }

    override fun getItemCount(): Int {
        return peliculas.size
    }
}