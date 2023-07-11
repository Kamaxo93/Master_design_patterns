package com.example.masterdesignpatterns.abstracfactorypattern

class Ham : Filling {

    override fun name(): String = "Ham"

    override fun calories(): String = " : 170 kcal"

    override fun toString(): String {
        return "${name()} ${calories()}"
    }
}