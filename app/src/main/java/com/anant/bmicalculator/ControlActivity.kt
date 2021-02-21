package com.anant.bmicalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ControlActivity : AppCompatActivity() {

    lateinit var btnBmi:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_control)

        btnBmi=findViewById(R.id.btn_bmi)
        btnBmi.setOnClickListener {
            startActivity(
                Intent(this,
                    MainActivity::class.java)
            )

        }









    }
}