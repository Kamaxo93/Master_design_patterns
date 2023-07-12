package com.example.masterdesignpatterns.builderpattern

class Ham : Filling() {

    override fun name(): String = "Ham"

    override fun calories(): Int = 170
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