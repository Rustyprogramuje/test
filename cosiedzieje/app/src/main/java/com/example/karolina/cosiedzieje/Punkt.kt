package com.example.karolina.cosiedzieje

class Punkt {
    var nazwa: String? = null
    var x: Int = 0
    var y: Int = 0

    constructor(x: Int, y: Int) {
        this.x = x
        this.y = y
    }

    fun obliczCudo() : String{
        return  "super " + nazwa
    }

    constructor()
}