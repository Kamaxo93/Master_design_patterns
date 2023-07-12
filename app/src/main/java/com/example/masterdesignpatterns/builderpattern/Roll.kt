package com.example.masterdesignpatterns.builderpattern

class Roll : Bread() {
    override fun name(): String = "Roll"

    override fun calories(): Int = 125

    override fun description(): String {
        TODO("Not yet implemented")
    }

    override fun image(): Int {
        TODO("Not yet implemented")
    }

    override fun toString(): String {
        return "${name()} ${calories()}"
    }
}