package com.example.masterdesignpatterns

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.util.Log
import android.view.View
import com.example.masterdesignpatterns.abstracfactorypattern.FactoryGenerator
import com.example.masterdesignpatterns.databinding.ActivityMainBinding
import com.example.masterdesignpatterns.factorypattern.Baguette
import com.example.masterdesignpatterns.factorypattern.BreadFactory

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
        return super.onCreateView(name, context, attrs)
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