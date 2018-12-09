package com.example.karolina.cosiedzieje

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.bmi.*

class ObliczBMI : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.bmi)

        var kliknij = findViewById<Button>(R.id.kliknij)
        kliknij.setOnClickListener {
            var mojebmi = BMI(
                1.72,
                80.0
            )
            mojebmi.obliczbmi()
            bmitekst.text = mojebmi.bmi.toString()

        }
        wroc.setOnClickListener {
            val intent = Intent (this, startPage::class.java)
            startActivity(intent)
        }

    }
}
