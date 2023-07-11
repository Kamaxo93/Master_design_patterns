package com.example.masterdesignpatterns.abstracfactorypattern

class Beer : Drink {

    override fun name(): String = "Beer"

    override fun calories(): String = " : 370 Kcal"

    override fun toString(): String {
        return "${name()} ${calories()}"
    }
}
