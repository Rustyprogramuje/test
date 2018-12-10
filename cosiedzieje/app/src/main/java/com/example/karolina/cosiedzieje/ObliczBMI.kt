package com.example.karolina.cosiedzieje

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import kotlinx.android.synthetic.main.bmi.*

class ObliczBMI : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.bmi)

        var waga1 = 0.0
        wpiszwage.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {

            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                val waga = s.toString()
                waga1 = waga.toDouble()
            }
        })

        var wzrost1 = 0.0
        wpiszwzrost.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {

            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                val wzrost = s.toString()
                wzrost1 = wzrost.toDouble()
            }
        })

        val kliknij = findViewById<Button>(R.id.kliknij)
        kliknij.setOnClickListener {
            val mojebmi = BMI(
                wzrost1,
                waga1
            )
            mojebmi.obliczbmi()
            bmitekst.text = mojebmi.bmi.toString()

        }
        wroc.setOnClickListener {
            val intent = Intent(this, startPage::class.java)
            startActivity(intent)
        }

    }
}
