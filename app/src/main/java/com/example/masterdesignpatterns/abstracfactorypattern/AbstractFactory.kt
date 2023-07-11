package com.example.masterdesignpatterns.abstracfactorypattern

abstract class AbstractFactory {
    abstract fun getBread(breadType: String?): Bread?
    abstract fun getFilling(fillingType: String?): Filling?
    abstract fun getDrink(drinkType: String?): Drink?
}