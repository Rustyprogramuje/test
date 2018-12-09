package com.example.karolina.cosiedzieje

import java.math.RoundingMode
import java.text.DecimalFormat
import kotlin.math.roundToInt
import kotlin.math.roundToLong

class BMI {
    var h = 0.0
    var w = 0.0
    var nazwa: String? = null
    var bmi = 0.0

    constructor(h: Double, w: Double) {
        this.h = h
        this.w = w
    }

    fun roundToDecimals(number: Double, numDecimalPlaces: Int): Double {
        val factor = Math.pow(10.0, numDecimalPlaces.toDouble())
        return Math.round(number * factor) / factor
    }

    fun obliczbmi(): Double {
        bmi = roundToDecimals((w / (h * h)), 2)
        return bmi
    }


}
