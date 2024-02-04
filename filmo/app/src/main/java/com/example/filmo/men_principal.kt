package com.example.filmo

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class men_principal : AppCompatActivity() {
    fun irAMenPelis(view: View) {
        val intent = Intent(this, men_pelis::class.java)
        startActivity(intent)
    }
    fun irAMainActivity(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
    fun irAMenSeries(view: View) {
        val intent = Intent(this, men_serie::class.java)
        startActivity(intent)
    }
    fun irAModPerfil(view: View) {
        val intent = Intent(this, menu_modificar_perfil::class.java)
        startActivity(intent)
    }
    fun irAFavoritos(view: View) {
        val intent = Intent(this, FavoritosActivity::class.java)
        startActivity(intent)
    }

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_men_principal)

        // Asignar valores a las vistas
        val logo = findViewById<ImageView>(R.id.logo)
        logo.setImageResource(R.drawable.logo)

        val botonHome = findViewById<Button>(R.id.botonHome)
        botonHome.setOnClickListener {
            irAMainActivity(it)
        }
        val botonPelis = findViewById<Button>(R.id.botonPelis)
        botonPelis.setOnClickListener {
            irAMenPelis(it)
        }
        val botonSeries = findViewById<Button>(R.id.botonSeries)
        botonSeries.setOnClickListener{
            irAMenSeries(it)
        }
        val botonModPerfil = findViewById<ImageView>(R.id.logoUsuario)
        botonModPerfil.setOnClickListener {
            irAModPerfil(it)
        }
        val botonFavoritos = findViewById<Button>(R.id.botonFavoritos)
        botonFavoritos.setOnClickListener {
            irAFavoritos(it)
        }

    }

}
