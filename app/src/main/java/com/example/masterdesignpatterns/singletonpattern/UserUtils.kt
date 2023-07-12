package com.example.masterdesignpatterns.singletonpattern
object UserUtils {
    val user = User

    private var INSTANCE: User? = null

    fun getUser(): User = INSTANCE ?: User()
}

