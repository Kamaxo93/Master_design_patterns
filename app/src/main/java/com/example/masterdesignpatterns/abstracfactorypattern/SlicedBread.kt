package com.example.masterdesignpatterns.abstracfactorypattern

class SlicedBread : Bread {
    override fun name(): String = "Sliced Bread"

    override fun calories(): String = " : 235 kcal"

    override fun toString(): String {
        return "${name()} ${calories()}"
    }
}