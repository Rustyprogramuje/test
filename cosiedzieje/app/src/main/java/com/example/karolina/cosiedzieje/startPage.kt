package com.example.karolina.cosiedzieje

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_start_page.*

class startPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.bmi)

        val liczby = arrayListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        val suma = liczby.sum()
        // tekst.text = suma.toString()

        val klik = findViewById<Button>(R.id.klik)
        klik.setOnClickListener {
            var mojebmi = BMI(
                1.72,
                80.0
            )
            mojebmi.obliczbmi()
            bmitekst.text = mojebmi.bmi.toString()

        }

    }
}
