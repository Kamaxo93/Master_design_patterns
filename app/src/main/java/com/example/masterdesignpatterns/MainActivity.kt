package com.example.masterdesignpatterns

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.util.Log
import android.view.View
import com.example.masterdesignpatterns.abstracfactorypattern.FactoryGenerator
import com.example.masterdesignpatterns.builderpattern.Cheese
import com.example.masterdesignpatterns.builderpattern.Sandwich
import com.example.masterdesignpatterns.builderpattern.SandwichBuilder
import com.example.masterdesignpatterns.builderpattern.SlicedBread
import com.example.masterdesignpatterns.builderpattern.Tomato
import com.example.masterdesignpatterns.builderpattern.getCalories
import com.example.masterdesignpatterns.databinding.ActivityMainBinding
import com.example.masterdesignpatterns.factorypattern.Baguette
import com.example.masterdesignpatterns.factorypattern.BreadFactory
import com.example.masterdesignpatterns.singletonpattern.User
import com.example.masterdesignpatterns.singletonpattern.UserUtils

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"
    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
    }

    override fun onCreateView(name: String, context: Context, attrs: AttributeSet): View? {
//        exampleFactoryPatter()
//        exampleAbstractFactoryPatter()
//        exampleBuilderPatterns()
//        exampleSingletonPattern()
        return super.onCreateView(name, context, attrs)
    }

    private fun exampleSingletonPattern() {
        val userUtils = UserUtils.getUser()
        val user = User()
        userUtils.name = "Hector Camacho"
        binding?.activityMainLabelPrincipal?.text = "Hello $user"
        binding?.activityMainLabelPrincipal?.text = "Hello $userUtils"
        Log.i(TAG, "exampleSingletonPattern: ${user.name}")
        Log.i(TAG, "exampleSingletonPattern: ${userUtils.name}")
    }

    private fun exampleBuilderPatterns() {
        val sandwich = SandwichBuilder.cheeseAndHam()
        sandwich.getIngredients()
        SandwichBuilder.addIngredientBuild(sandwich, Tomato())
        SandwichBuilder.removeIngredientBuild(sandwich, Cheese())
        sandwich.getIngredients()
        SandwichBuilder.removeIngredientBuild(sandwich, SlicedBread())
        sandwich.addIngredient(com.example.masterdesignpatterns.builderpattern.Baguette())
        sandwich.getCalories()
        binding?.activityMainLabelPrincipal?.text = sandwich.getIngredients()
    }

    private fun exampleFactoryPatter() {
        val factory = BreadFactory()
        val bread = factory.getBread("bat".uppercase())
        val baguette = (bread as? Baguette)
        Log.i(TAG, "onCreate: ${baguette?.toString()}")
        binding?.activityMainLabelPrincipal?.text = baguette?.name()
    }

    private fun exampleAbstractFactoryPatter() {
        val factory = FactoryGenerator.getFactory("BRE".uppercase())
        val baguette = factory?.getBread("bat".uppercase())

        val filling = FactoryGenerator.getFactory("Fil".uppercase())?.getFilling("che".uppercase())
        val drink = FactoryGenerator.getFactory("Dri".uppercase())?.getDrink("cok".uppercase())

        Log.i(TAG, "onCreate: Bread = ${baguette?.toString()}, Filling = ${filling.toString()}, Drink = ${drink.toString()}")
        binding?.activityMainLabelPrincipal?.text = "Pan: ${baguette?.name()}, relleno: ${filling?.name()}, bebida: ${drink?.name()}"
    }
}