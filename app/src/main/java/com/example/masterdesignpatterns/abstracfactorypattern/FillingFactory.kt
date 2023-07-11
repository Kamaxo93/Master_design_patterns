package com.example.masterdesignpatterns.abstracfactorypattern

class FillingFactory : AbstractFactory() {
    override fun getBread(breadType: String?): Bread? = null

    override fun getFilling(fillingType: String?): Filling? =
        when(fillingType) {
        "HAM" -> Ham()
        "CHE" -> Cheese()
        "TOM" -> Tomato()
        else -> null
    }

    override fun getDrink(drinkType: String?): Drink? = null
}