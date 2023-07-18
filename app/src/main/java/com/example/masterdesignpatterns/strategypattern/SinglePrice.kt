package com.example.masterdesignpatterns.strategypattern

class SinglePrice(var price: Float = 0f) {

    companion object {
        private val INSTANCE: SinglePrice by lazy { SinglePrice() }

        fun getInstance() = INSTANCE
    }

}