package com.example.masterdesignpatterns.builderpattern

import com.example.masterdesignpatterns.R

class Baguette : Bread() {

    override fun name(): String = "Baguette"

    override fun calories(): Int = 238

    override fun description(): String = "Una baguette recién echa y muy crujiente"

    override fun image(): Int = R.drawable.b_bauette

    override fun toString(): String {
        return "${name()} ${calories()} ${description()}"
    }
}