package com.example.masterdesignpatterns.builderpattern

class Beer : Drink {

    override fun name(): String = "Beer"

    override fun calories(): Int = 370

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
