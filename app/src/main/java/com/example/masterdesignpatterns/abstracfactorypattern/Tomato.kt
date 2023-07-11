package com.example.masterdesignpatterns.abstracfactorypattern

class Tomato: Filling {

    override fun name(): String = "Tomato"

    override fun calories(): String = " : 15 kcal"

    override fun toString(): String {
        return "${name()} ${calories()}"
    }
}