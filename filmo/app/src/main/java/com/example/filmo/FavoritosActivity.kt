package com.example.filmo

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class FavoritosActivity : AppCompatActivity() {
    fun irAMenuPrincipal(view: View) {
        val intent = Intent(this, men_principal::class.java)
        startActivity(intent)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favoritos)

        val botonHome = findViewById<Button>(R.id.botonFavoritosHome)
        botonHome.setOnClickListener {
            irAMenuPrincipal(it)
        }

    }
}