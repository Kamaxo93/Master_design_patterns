package com.example.masterdesignpatterns.strategypattern

interface Strategy {
    fun processPayment(price: Float): String
}