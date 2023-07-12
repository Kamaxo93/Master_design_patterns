package com.example.masterdesignpatterns.builderpattern

import android.util.Log

class Sandwich {
    private val TAG = "Sandwich"

    private val ingredients = mutableListOf<Ingredient>()

    fun addIngredient(ingredient: Ingredient) {
        ingredients.add(ingredient)
    }

    fun getIngredientList() = ingredients.toList()

    fun getIngredients(): String {
        val nameIngredient = ingredients.map { it.name() }
        Log.i(TAG, "getIngredients: $nameIngredient")
        return nameIngredient.toString().replace("[", "").replace("]", "")
    }

    fun removeIngredient(ingredient: Ingredient) {
        ingredients.removeIf { it.name() == ingredient.name() }
    }

}

fun Sandwich.getCalories() {
    var calories = 0
    for (ingredient in this.getIngredientList()) {
        calories += ingredient.calories()
    }
    Log.i("Sandwich", "Total de calorias: $calories")
}