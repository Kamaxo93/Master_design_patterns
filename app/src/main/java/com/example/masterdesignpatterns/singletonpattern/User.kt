package com.example.masterdesignpatterns.singletonpattern

class User(
    var name: String = "José Antonio Camacho",
    val email: String = "josea.camacho@prueba.es",
    val password: String = "1234") {


    override fun toString(): String {
        return "$name, $email"
    }

    companion object {
        val user = User()
    }
}