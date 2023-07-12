package com.example.masterdesignpatterns.builderpattern

class Tomato: Filling() {

    override fun name(): String = "Tomato"

    override fun calories(): Int = 15

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