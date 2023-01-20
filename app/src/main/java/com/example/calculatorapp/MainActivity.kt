package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnPlus.setOnClickListener {
            val input1= eTInput1.text.toString().toInt()
            val input2= eTInput2.text.toString().toInt()

            tVResult.text= (input1+input2).toString()
        }
    }
}