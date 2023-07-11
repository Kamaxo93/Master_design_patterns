package com.example.masterdesignpatterns.abstracfactorypattern

class Cheese : Filling {

    override fun name(): String = "Cheese"

    override fun calories(): String = " : 238 kcal"

    override fun toString(): String {
        return "${name()} ${calories()}"
    }
}