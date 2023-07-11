package com.example.masterdesignpatterns.abstracfactorypattern

class BreadFactory : AbstractFactory() {

    override fun getBread(breadType: String?): Bread? =
        when(breadType) {
            "BAT" -> Baguette()
            "SLI" -> SlicedBread()
            "ROL" -> Roll()
            else -> null
        }

    override fun getFilling(fillingType: String?): Filling? = null

    override fun getDrink(drinkType: String?): Drink? = null
}