package com.anant.bmicalculator

import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    //variables declared
    lateinit var etHeight:EditText
    lateinit var etWeight:EditText
    lateinit var btnSubmit:Button
    lateinit var txtResult:TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title="BMI Calculator"

        //variables initialised

        etHeight=findViewById(R.id.et_height)
        etWeight=findViewById(R.id.et_weight)
        btnSubmit=findViewById(R.id.btn_Submit)
        txtResult=findViewById(R.id.txt_result)

        // button click enabled
        btnSubmit.setOnClickListener() {

            try{
                val h: Double = (etHeight.text.toString().toDouble())
                val w: Double = (etWeight.text.toString().toDouble())

                val h1=h/100; //converted to metres
                val bmi = w/(h1*h1)

// https://www.nhlbi.nih.gov/health/educational/lose_wt/BMI/bmicalc.htm (source of BMI ratings)


                when {
                    bmi<18.5 -> {
                        txtResult.text = (String.format("%.1f",bmi) + "(Underweight)")
                    }
                    bmi in 18.5..24.9 -> {
                        txtResult.text = (String.format("%.1f",bmi) + "(Normal weight)")
                    }
                    bmi in 25.0..29.9 -> {
                        txtResult.text = (String.format("%.1f",bmi) + "(Overweight)")
                    }
                    bmi>=30 -> txtResult.text = (String.format("%.1f",bmi) + "(Obese)")
                }
            }catch (e: Exception){
                val toast: Toast = Toast.makeText(applicationContext, "Please enter valid data", Toast.LENGTH_SHORT)
                txtResult.text=""
                toast.setGravity(Gravity.CENTER, 0,0)
                toast.show()
            }
        }
    }
}