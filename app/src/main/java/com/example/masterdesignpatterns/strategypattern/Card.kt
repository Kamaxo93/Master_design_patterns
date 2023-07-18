package com.example.masterdesignpatterns.strategypattern

class Card : Strategy {
    override fun processPayment(price: Float) = String.format("%.2f", price + 0.5f)
}