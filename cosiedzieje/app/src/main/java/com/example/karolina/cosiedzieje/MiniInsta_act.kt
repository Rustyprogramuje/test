package com.example.karolina.cosiedzieje

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_mini_insta_act.*

class MiniInsta_act : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mini_insta_act)

        //recyclerView.setBackgroundColor(Color.CYAN)
        /*recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = InstaAdapter()*/
        val recycler = findViewById<RecyclerView>(R.id.recyclerView) as RecyclerView
        recycler.layoutManager = LinearLayoutManager(this)
/* val postaci = listOf("Ron Weasley", "Harry Potter", "Hermiona Granger")*/
        val Ron = insta_class("Ron Weasley", "Gryffindor", "Don't let the Muggles get you down!", "https://binged.it/2seG94G")
        val Hermiona = insta_class("Hermiona Granger", "Gryffindor", "Twitchy little ferret, aren't you, Malfoy?", "https://binged.it/2sdiPEs")
        val Harry = insta_class("Harry Potter", "Gryffindor", "I solemly swear I am up to no good!", "https://binged.it/2signwm")
        val Luna = insta_class ("Luna Lovegood", "", "", "")
        val Albus = insta_class ("Albus Dumbledore", "", "It takes a great deal of bravery to stand up to our enemies, but just as much to stand up to our friends", "")

        val listapostaci = ArrayList<insta_class>()
        listapostaci.add(Ron)
        listapostaci.add(Hermiona)
        listapostaci.add(Harry)
    val adapter = InstaAdapter (listapostaci)
        recycler.adapter = adapter

    //val Ron = insta_class ("Ron Weasley", "Gryffindor", "Jakiś cyctat o szczurze")

}

}
