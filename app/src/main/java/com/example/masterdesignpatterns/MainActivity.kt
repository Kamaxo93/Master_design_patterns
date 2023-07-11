package com.example.masterdesignpatterns

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.util.Log
import android.view.View
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
        exampleFactoryPatter()
        return super.onCreateView(name, context, attrs)
    }

    private fun exampleFactoryPatter() {
        val factory = BreadFactory()
        val bread = factory.getBread("bat".uppercase())
        val baguette = (bread as? Baguette)
        Log.i(TAG, "onCreate: ${baguette?.toString()}")
        binding?.activityMainLabelPrincipal?.text = baguette?.name()
    }
}