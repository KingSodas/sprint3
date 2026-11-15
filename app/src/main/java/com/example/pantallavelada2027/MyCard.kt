package com.example.pantallavelada2027

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.example.pantallavelada2027.databinding.ViewMyCardBinding

class MyCard @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {

    private val binding = ViewMyCardBinding.inflate(
        LayoutInflater.from(context),
        this,
        true
    )

    var titulo: String
        get() = binding.txtTitulo.text.toString()
        set(value) { binding.txtTitulo.text = value }

    var subtitulo: String
        get() = binding.txtSubtitulo.text.toString()
        set(value) { binding.txtSubtitulo.text = value }

    var descripcion: String
        get() = binding.txtDescripcion.text.toString()
        set(value) { binding.txtDescripcion.text = value }

    fun setImageResource(resId: Int) {
        binding.imgCard.setImageResource(resId)
    }

    fun setOnAccion1ClickListener(listener: () -> Unit) {
        binding.btnAccion1.setOnClickListener { listener() }
    }

    fun setOnAccion2ClickListener(listener: () -> Unit) {
        binding.btnAccion2.setOnClickListener { listener() }
    }
}