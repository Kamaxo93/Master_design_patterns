package com.example.masterdesignpatterns.abstracfactorypattern

class BreadFactory {

    fun getBread(breadType: String): Bread? =
        when(breadType) {
            "BAT" -> Baguette()
            "SLI" -> SlicedBread()
            "ROL" -> Roll()
            else -> null
        }
}