package com.example.masterdesignpatterns.factorypattern

class Roll : Bread {
    override fun name(): String = "Roll"

    override fun calories(): String = " : 125 kcal"
}