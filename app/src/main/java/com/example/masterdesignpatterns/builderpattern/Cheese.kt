package com.example.masterdesignpatterns.builderpattern

import com.example.masterdesignpatterns.R

class Cheese : Filling() {

    override fun name(): String = "Cheese"

    override fun calories(): Int = 238

    override fun description(): String = "El relleno está compuesto de unas lonchas de queso curado"

    override fun image(): Int = R.drawable.f_cheese

    override fun toString(): String {
        return "${name()} ${calories()}"
    }
}