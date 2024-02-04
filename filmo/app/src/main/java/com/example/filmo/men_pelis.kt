package com.example.filmo

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.filmo.controller.PeliculasAdapter
import com.example.filmo.controller.SerieAdapter
import com.example.filmo.data.Pelicula

class men_pelis : AppCompatActivity() {

    private lateinit var peliculasAdapter: PeliculasAdapter
    private lateinit var baseDatosPelis: BaseDatos



    fun irAMenuPrincipal(view: View) {
        val intent = Intent(this, men_principal::class.java)
        startActivity(intent)
    }

    fun irAFavoritos(view: View) {
        val intent = Intent(this, FavoritosActivity::class.java)
        startActivity(intent)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_men_pelis)

        baseDatosPelis = BaseDatos(this)  // Inicializa la instancia de BaseDatosPelis

        val botonHome = findViewById<Button>(R.id.botonHome)
        botonHome.setOnClickListener {
            irAMenuPrincipal(it)
        }

        val botonFavoritos = findViewById<Button>(R.id.botonFavoritos)
        botonFavoritos.setOnClickListener {
            irAFavoritos(it)
        }
        val recyclerViewGenero = findViewById<RecyclerView>(R.id.recyclerViewPelis)
        val allSeriesFromDatabase = baseDatosPelis.obtenerPeliculas()
        peliculasAdapter = PeliculasAdapter(allSeriesFromDatabase)

        recyclerViewGenero.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerViewGenero.adapter = peliculasAdapter


        peliculasAdapter.updateData(allSeriesFromDatabase)
        peliculasAdapter.notifyDataSetChanged()
    }

}
