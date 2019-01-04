package com.example.karolina.cosiedzieje

import android.support.v7.view.menu.ActionMenuItemView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.instalayout.view.*

class InstaAdapter(val listapostaci1: ArrayList<insta_class>) : RecyclerView.Adapter<CustomViewHolder>() {

    override fun getItemCount(): Int {
        return listapostaci1.size
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): CustomViewHolder {
        val layoutInflater = LayoutInflater.from(p0.context).inflate(R.layout.instalayout, p0, false)
        return CustomViewHolder(layoutInflater)
    }

    override fun onBindViewHolder(p0: CustomViewHolder, p1: Int) {
        /*val postac = postaci.get (p1)
         p0.itemView.imiepostaci.text = postac*/
        /*for (element in listapostaci) {
            val postac = listapostaci.get(p1)
                p0.itemView.imiepostaci =
        }*/
        p0.bindItems(listapostaci1[p1])
        // val postac: insta_class = listapostaci1 [p1]
//        p0.imie.text = postac.imie
//        p0.dom.text = postac.dom
    }

}

class CustomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bindItems(insta: insta_class) {
        val imie = itemView.findViewById<TextView>(R.id.imiepostaci) as TextView
        val dom = itemView.findViewById<TextView>(R.id.zjakiegodomu) as TextView
        val cyt = itemView.findViewById<TextView>(R.id.cytat) as TextView
        imie.text = insta.imie
        dom.text = insta.dom
        cyt.text = insta.cytat
    }
}