package com.example.masterdesignpatterns.builderpattern

class SlicedBread : Bread() {
    override fun name(): String = "Sliced Bread"

    override fun calories(): Int = 235
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