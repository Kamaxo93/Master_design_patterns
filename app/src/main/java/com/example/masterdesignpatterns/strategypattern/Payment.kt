package com.example.masterdesignpatterns.strategypattern

class Payment(private val strategy: Strategy) {
    fun employStrategy(price: Float) = strategy.processPayment(price)
}