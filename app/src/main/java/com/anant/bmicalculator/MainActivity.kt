package com.anant.bmicalculator

import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var etHeight:EditText
    lateinit var etWeight:EditText
    lateinit var btnSubmit:Button
    lateinit var txtResult:TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etHeight=findViewById(R.id.et_height)
        etWeight=findViewById(R.id.et_weight)
        btnSubmit=findViewById(R.id.btn_Submit)
        txtResult=findViewById(R.id.txt_result)


        btnSubmit.setOnClickListener() {

            try{

                val Height: Double = (etHeight.text.toString().toDouble())
                val Weight: Double = (etWeight.text.toString().toDouble())

                val h=Height/100;

                val bmi = Weight/(h*h)

// https://www.nhlbi.nih.gov/health/educational/lose_wt/BMI/bmicalc.htm


                if(bmi < 18.5){

                    txtResult.text = (String.format("%.1f",bmi) + "(Underweight)")
                }else if(bmi >= 18.5 && bmi <= 24.9){

                    txtResult.text = (String.format("%.1f",bmi) + "(Normal weight)")
                }else if(bmi >= 25 && bmi <= 29.9){
                    txtResult.text = (String.format("%.1f",bmi) + "(Overweight)")
                }
                else if(bmi >=30)
                    txtResult.text = (String.format("%.1f",bmi) + "(Obese)")

            }catch (e: Exception){


                val toast: Toast = Toast.makeText(applicationContext, "Please enter the number", Toast.LENGTH_SHORT)
                txtResult.text=""

                toast.setGravity(Gravity.CENTER, 0,0)
                toast.show()
            }

        }


    }

}