package com.example.karolina.cosiedzieje

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_start_page.*
import kotlinx.android.synthetic.main.bmi.*

class startPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_page)
        // dzialająca reakcja na klikniecie buttona, nie
        // uwzględnia na razie podawania danych
        /*val liczby = arrayListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        val suma = liczby.sum()
        // tekst.text = suma.toString()*/

        /*val klik = findViewById<Button>(R.id.klik)
        klik.setOnClickListener {
            var mojebmi = BMI(
                1.72,
                80.0
            )
            mojebmi.obliczbmi()
            bmitekst1.text = mojebmi.bmi.toString()

        }*/
        btn.setOnClickListener {
            val intent = Intent (this, activ::class.java)
        startActivity(intent)
        }

        btn2.setOnClickListener {
            val intent = Intent (this, HPHouses2::class.java)
            startActivity(intent)

        }
        btn3.setOnClickListener {
            val intent = Intent (this, ObliczBMI::class.java)
            startActivity(intent)
        }
        btn4.setOnClickListener {
            val intent = Intent (this, MiniInsta_act::class.java)
            startActivity(intent)
        }
    }
}
