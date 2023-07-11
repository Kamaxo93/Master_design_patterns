package com.example.masterdesignpatterns.abstracfactorypattern

class Roll : Bread {
    override fun name(): String = "Roll"

    override fun calories(): String = " : 125 kcal"
}