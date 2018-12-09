package com.example.karolina.cosiedzieje

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_hphouses2.*

class HPHouses2 : AppCompatActivity() {

    lateinit var option: Spinner
    lateinit var result: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hphouses2)


        /*val wybierz = findViewById<Button>(R.id.wybierz_dom2)
        val aaa = "a"
        val abb = "ab"

        wybierz.setOnClickListener        {
            if (abb.contains(aaa)) {
                pokaz_czarodziejow2.text = getString(R.string.gr)
            }
        }
    }*/


    }

    fun wybierzdom() {
        //wybierz_dom2.setOnClickListener {
        //val dom = "Gryffindor"
        /*lista_domow2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                if (this.toString() == dom) {
                    pokaz_czarodziejow2.text = "Gryffindor"}
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
            }
        }*/
        // pokaz_czarodziejow2.text = "Gryffindor"
        val lista = arrayOf("Gryffindor", "Slytherin", "Huffelpuff", "Ravenclaw")
        option.adapter = ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, lista)

        option = findViewById(R.id.lista_domow2) as Spinner
        result = findViewById(R.id.pokaz_czarodziejow2) as TextView
        option.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                pokaz_czarodziejow2.text = lista.get(position)
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                pokaz_czarodziejow2.text = "Wybierz dom"
            }
        }
        //}
    }
}


