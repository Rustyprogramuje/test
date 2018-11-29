package com.example.karolina.cosiedzieje

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class activ : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activ)
        val klik = findViewById<Button>(R.id.pick)
        klik.setOnClickListener {

            val ksiazka = "THE BOY WHO LIVED Mr. and Mrs. Dursley, of number four, Privet Drive, " +
                    "were proud to say that they were perfectly normal, thank you very much. " +
                    "They were the last people you'd expect to be involved in anything strange or mysterious, " +
                    "because they just didn't hold with such nonsense. Mr. Dursley was the director of a firm " +
                    "called Grunnings, which made drills. He was a big, beefy man with hardly any neck," +
                    " although he did have a very large mustache. Mrs. Dursley was thin and blonde " +
                    "and had nearly twice the usual amount of neck, which came in very useful as she " +
                    "spent so much of her time craning over garden fences, spying on the neighbors. " +
                    "The Dursleys had a small son called Dudley and in their opinion there was no finer boy anywhere."
            val oldValue = "Mr."
            val oldValue2 = "Mrs."
            val newValue = "Mr"
            val newValue2 = "Mrs"
            val ksiazka2 = ksiazka.replace(oldValue, newValue)
            val ksiazka3 = ksiazka2.replace(oldValue2, newValue2)
            val ksiazka4 = ksiazka3.replace(".", ".<")
            val zdania = ksiazka4.split("<")
            val liczbazdan = zdania.size - 1
            var zdanie = ""
            for (i in zdania.indices) {
                val random = Random().nextInt(liczbazdan) + 1
                zdanie = zdania[random]
            }
            lol.text = zdanie
        }


    }
}
