package com.example.karolina.cosiedzieje

import android.app.Activity
import android.content.res.Resources
import android.os.Bundle
import android.support.annotation.StringRes
import android.support.v7.app.AppCompatActivity;
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.hpcharacters1.*
import android.widget.Spinner
import android.widget.TextView


class HP_Wizards_act : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hpcharacters1)



         /*fun wybierzdom() {
            wybierz_dom.setOnClickListener {
                //
//            lista_domow.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
//                override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
//                    if (this.equals(dom))
//                        pokaz_czarodziejow.text = "Gryffindor"
//                }
//
//                override fun onNothingSelected(parent: AdapterView<*>?) {
//
//                }
//            }
                pokaz_czarodziejow.text = "Gryffindor"
            }
        }*/

        val w = lista_domow3.onItemSelectedListener

        pokaz_czarodziejow.text = w.toString()

    }
}
