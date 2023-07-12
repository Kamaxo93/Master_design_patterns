package com.example.masterdesignpatterns.builderpattern

import com.example.masterdesignpatterns.R

class Coke : Drink {
    override fun name(): String = "Coca cola"

    override fun calories(): Int = 600

    override fun description(): String = "Coca cola bien fresquita"

    override fun image(): Int = R.drawable.d_coca

    override fun toString(): String {
        return "${name()} ${calories()}"
    }

}
