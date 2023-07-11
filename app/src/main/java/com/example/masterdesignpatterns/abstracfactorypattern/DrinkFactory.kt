package com.example.masterdesignpatterns.abstracfactorypattern

class DrinkFactory : AbstractFactory() {

    override fun getBread(breadType: String?): Bread? = null

    override fun getFilling(fillingType: String?): Filling? = null

    override fun getDrink(drinkType: String?): Drink? =
        when(drinkType) {
            "COK".uppercase() -> Coke()
            "BEE".uppercase() -> Beer()
            else -> null
        }
}
