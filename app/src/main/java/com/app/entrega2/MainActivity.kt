package com.app.entrega2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var totalOrden = 0.0
    var btn1Seleccionado = false
    var btn2Seleccionado = false
    var btn3Seleccionado = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnopcion1 = findViewById<RadioButton>(R.id.btnopcion1)
        var btnopcion2 = findViewById<RadioButton>(R.id.btnopcion2)
        var btnopcion3 = findViewById<RadioButton>(R.id.btnopcion3)

        var checkopcion1 = findViewById<CheckBox>(R.id.checkopcion1)
        var checkopcion2 = findViewById<CheckBox>(R.id.checkopcion2)
        var checkopcion3 = findViewById<CheckBox>(R.id.checkopcion3)

        var btnordenar = findViewById<Button>(R.id.btnordenar)

        var txttotal = findViewById<TextView>(R.id.txttotal)

        btnopcion1.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                btn1Seleccionado = true
                totalOrden += 5.0
            } else {
                btn1Seleccionado = false
                totalOrden -= 5.0
            }
        }

        btnopcion2.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                btn2Seleccionado = true
                totalOrden += 7.0
            } else {
                btn2Seleccionado = false
                totalOrden -= 7.0
            }
        }

        btnopcion3.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                btn3Seleccionado = true
                totalOrden += 9.0
            } else {
                btn3Seleccionado = false
                totalOrden -= 9.0
            }
        }

        checkopcion1.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                totalOrden += 1
            } else {
                totalOrden -= 1 // Restara el precio si el CheckBox se desmarca
            }

        }
        checkopcion2.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                totalOrden += 2
            } else {
                totalOrden -= 2
            }

        }
        checkopcion3.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                totalOrden += 3
            } else {
                totalOrden -= 3
            }

        }


        btnordenar.setOnClickListener(){
            txttotal.text= "$$totalOrden"
        }

    }
}