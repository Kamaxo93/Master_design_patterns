package com.example.masterdesignpatterns.strategypattern

class Cash : Strategy {
    override fun processPayment(price: Float) = String.format("%.2f", price)
}