package com.example.filmo

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class BaseDatosUser(context: Context?) : SQLiteOpenHelper(context, "bd", null, 1) {

    companion object {
        const val COLUMN_ID = "id"
        const val COLUMN_NOMBRE_USUARIO = "nombre_usuario"
        const val COLUMN_CORREO_ELECTRONICO = "correo_electronico"
        const val COLUMN_CONTRASEÑA = "contraseña"
    }

    override fun onCreate(db: SQLiteDatabase?) {
        // Crear la tabla usuarios
        db?.execSQL("CREATE TABLE usuarios ($COLUMN_ID INTEGER PRIMARY KEY AUTOINCREMENT, $COLUMN_NOMBRE_USUARIO TEXT NOT NULL, $COLUMN_CORREO_ELECTRONICO TEXT UNIQUE NOT NULL, $COLUMN_CONTRASEÑA TEXT NOT NULL);")

        // Insertar datos en la tabla
        db?.execSQL("INSERT INTO usuarios ($COLUMN_NOMBRE_USUARIO, $COLUMN_CORREO_ELECTRONICO, $COLUMN_CONTRASEÑA) VALUES ('John Doe', 'johndoe@example.com', '123456');")
        db?.execSQL("INSERT INTO usuarios ($COLUMN_NOMBRE_USUARIO, $COLUMN_CORREO_ELECTRONICO, $COLUMN_CONTRASEÑA) VALUES ('Jane Doe', 'janedoe@example.com', '789012');")
        db?.execSQL("INSERT INTO usuarios ($COLUMN_NOMBRE_USUARIO, $COLUMN_CORREO_ELECTRONICO, $COLUMN_CONTRASEÑA) VALUES ('Peter Parker', 'peterparker@example.com', 'spiderman123');")
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        // Implementa acciones específicas al actualizar la base de datos (si es necesario)
    }
}