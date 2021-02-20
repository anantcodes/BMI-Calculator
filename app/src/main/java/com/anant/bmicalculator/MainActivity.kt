package com.anant.bmicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var etHeight:EditText
    lateinit var etWeight:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etHeight=findViewById(R.id.et_height)
        etWeight=findViewById(R.id.et_weight)


    }
}