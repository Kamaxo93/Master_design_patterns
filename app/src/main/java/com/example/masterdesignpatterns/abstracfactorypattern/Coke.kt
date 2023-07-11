package com.example.masterdesignpatterns.abstracfactorypattern

class Coke : Drink {
    override fun name(): String = "Coca cola"

    override fun calories(): String = " : 600 Kcal"

    override fun toString(): String {
        return "${name()} ${calories()}"
    }

}
