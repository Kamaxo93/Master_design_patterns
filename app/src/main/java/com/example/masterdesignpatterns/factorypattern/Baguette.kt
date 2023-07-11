package com.example.masterdesignpatterns.factorypattern

class Baguette : Bread {

    override fun name(): String = "Baguette"

    override fun calories(): String = " : 238 kcal"

    override fun toString(): String {
        return "${name()} ${calories()}"
    }
}