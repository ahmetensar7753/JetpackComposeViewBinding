package com.example.viewbindingkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.viewbindingkotlin.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

    }

    fun topla(view : View){
        if (binding.editTextText2.text.isNotEmpty() && binding.editTextText3.text.isNotEmpty() ){
            val number1 = binding.editTextText2.text.toString().toDoubleOrNull()
            val number2 = binding.editTextText3.text.toString().toDoubleOrNull()

            if (number1 != null && number2 != null){

                binding.textView.text = (number1 + number2).toString()
            }else{
                binding.textView.text = "Enter number!"
            }
        }else{
            binding.textView.text = "Must not empty!"
        }
    }

    fun carp(view : View){
        if (binding.editTextText2.text.isNotEmpty()  && binding.editTextText3.text.isNotEmpty() ){
            val number1 = binding.editTextText2.text.toString().toDoubleOrNull()
            val number2 = binding.editTextText3.text.toString().toDoubleOrNull()

            if (number1 != null && number2 != null){
                binding.textView.text = (number1 * number2).toString()
            }else{
                binding.textView.text = "Enter number!"
            }
        }else{
            binding.textView.text = "Must not empty!"
        }
    }
    fun cikar(view : View){
        if (binding.editTextText2.text.isNotEmpty()  && binding.editTextText3.text.isNotEmpty() ){
            val number1 = binding.editTextText2.text.toString().toDoubleOrNull()
            val number2 = binding.editTextText3.text.toString().toDoubleOrNull()

            if (number1 != null && number2 != null){
                binding.textView.text = (number1 - number2).toString()
            }else{
                binding.textView.text = "Enter number!"
            }
        }else{
            binding.textView.text = "Must not empty!"
        }
    }
    fun bol(view : View){
        if (binding.editTextText2.text.isNotEmpty() && binding.editTextText3.text.isNotEmpty() ){
            val number1 = binding.editTextText2.text.toString().toDoubleOrNull()
            val number2 = binding.editTextText3.text.toString().toDoubleOrNull()



            if (number1 != null && number2 != null){
                binding.textView.text = (number1 / number2).toString()
            }else{
                binding.textView.text = "Enter number!"
            }
        }else{
            binding.textView.text = "Must not empty!"
        }
    }

}