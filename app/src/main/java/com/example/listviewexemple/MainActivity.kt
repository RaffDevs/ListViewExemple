package com.example.listviewexemple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import android.widget.ListView
import com.example.listviewexemple.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var lista: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        bindingElements()
        setupList()
    }

    private fun bindingElements() {
        lista = binding.listDados
    }

    private fun setupList() {
        val dados = listOf<String>(
            "Banana",
            "Apple",
            "Grape",
            "Pineapple",
            "Orange",
            "Lemon",
            "Avocado",
            "Banana",
            "Apple",
            "Grape",
            "Pineapple",
            "Orange",
            "Lemon",
            "Avocado",
            "Banana",
            "Apple",
            "Grape",
            "Pineapple",
            "Orange",
            "Lemon",
            "Avocado"
        )

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, dados)
        lista.adapter = adapter
    }
}