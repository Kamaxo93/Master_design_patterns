package com.example.masterdesignpatterns.builderpattern

object SandwichBuilder {

    fun cheeseAndHam(): Sandwich {
        val sandwich = Sandwich()
        sandwich.addIngredient(SlicedBread())
        sandwich.addIngredient(Cheese())
        sandwich.addIngredient(Ham())
        return sandwich
    }

    fun addIngredientBuild(sandwich: Sandwich, ingredient: Ingredient): Sandwich {
        sandwich.addIngredient(ingredient)
        return sandwich
    }

    fun removeIngredientBuild(sandwich: Sandwich, ingredient: Ingredient): Sandwich {
        sandwich.removeIngredient(ingredient)
        return sandwich
    }
}