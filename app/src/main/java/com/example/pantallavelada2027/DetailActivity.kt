package com.example.pantallavelada2027

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.pantallavelada2027.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Asignación flexible de textos a través de las propiedades
        binding.miCardCustom.titulo = "Encabezado o título"
        binding.miCardCustom.subtitulo = "Subtítulo"
        binding.miCardCustom.descripcion = "Esta es una breve descripción sobre la Card."

        // Añadir imagen de manera programática
        binding.miCardCustom.setImageResource(R.drawable.fotovelada)

        // Configurar eventos de clic en los botones de acción
        binding.miCardCustom.setOnAccion1ClickListener {
            Toast.makeText(this, "Acción 1 pulsada", Toast.LENGTH_SHORT).show()
        }

        binding.miCardCustom.setOnAccion2ClickListener {
            Toast.makeText(this, "Acción 2 pulsada", Toast.LENGTH_SHORT).show()
        }
    }
}