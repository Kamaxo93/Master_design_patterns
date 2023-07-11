package com.example.masterdesignpatterns.abstracfactorypattern

object FactoryGenerator {

    fun getFactory(factoryType: String?): AbstractFactory? =
        when(factoryType) {
            "BRE".uppercase() -> BreadFactory()
            "FIL".uppercase() -> FillingFactory()
            "DRI".uppercase() -> DrinkFactory()
            else -> null
        }

}