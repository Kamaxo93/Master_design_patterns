package com.example.masterdesignpatterns.factorypattern

class BreadFactory {

    fun getBread(breadType: String): Bread? =
        when(breadType) {
            "BAT" -> Baguette()
            "SLI" -> SlicedBread()
            "ROL" -> Roll()
            else -> null
        }
}