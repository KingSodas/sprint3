package com.example.pantallavelada2027

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.pantallavelada2027.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.miBoton.setOnClickListener {
            Toast.makeText(this, "Todavía no está implementado", Toast.LENGTH_SHORT).show()
        }
    }
}
/*
* CONSIDERACIONES DE UI/UX, CRAP Y ACCESIBILIDAD:
*
* 1. Principios CRAP (Diseño Visual):
*    - Contraste (C): Se han usado textos oscuros/claros bien contrastados
*      sobre el fondo para cumplir con las pautas WCAG AA (ratio > 4.5:1).
*    - Repetición (R): Coherencia en los márgenes y tipografías en 'sp'.
*    - Alineación (A): Estructura vertical centrada y ordenada.
*    - Proximidad (P): Título y subtítulo agrupados juntos; separación
*      adecuada con el botón para evitar clics accidentales.
*
* 2. Leyes de UX:
*    - Ley de Fitts: El botón principal ocupa un tamaño generoso (56dp de alto)
*      para que sea fácil de pulsar con el pulgar.
*
* 3. Accesibilidad:
*    - ImageView incluye 'contentDescription' descriptiva.
*    - Uso de unidades 'sp' para que el texto escale si el usuario agranda la fuente.
*    - Título marcado como encabezado ('accessibilityHeading').
*/