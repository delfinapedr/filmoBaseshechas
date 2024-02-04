package com.example.filmo

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class men_perfil : AppCompatActivity() {
    fun irAMenuPrincipal(view: View) {
        val intent = Intent(this, men_principal::class.java)
        startActivity(intent)
    }
    fun irACrearCuenta(view: View) {
        val intent = Intent(this, men_crearCuenta::class.java)
        startActivity(intent)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_men_perfil)

        val botonInicioSesion = findViewById<Button>(R.id.buttonLogin)
        botonInicioSesion.setOnClickListener{
            irAMenuPrincipal(it)
        }
        val botonRegistro = findViewById<Button>(R.id.buttonRegister)
        botonRegistro.setOnClickListener{
            irACrearCuenta(it)
        }
    }

}