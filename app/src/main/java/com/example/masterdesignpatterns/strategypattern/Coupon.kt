package com.example.masterdesignpatterns.strategypattern

class Coupon : Strategy {
    override fun processPayment(price: Float) = String.format("%.2f", price * 0.9f)
}