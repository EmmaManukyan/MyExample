package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Homework3 : AppCompatActivity(), View.OnClickListener {
    lateinit var edtFirstNum: EditText
    lateinit var edtSecondNum: EditText
    lateinit var result: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homework3)
        val btnPlus = findViewById<Button>(R.id.btn_plus)
        val btnMinus = findViewById<Button>(R.id.btn_minus)
        val btnMultiply = findViewById<Button>(R.id.btn_multiply)
        val btnDivide = findViewById<Button>(R.id.btn_divide)
        edtFirstNum = findViewById<EditText>(R.id.edt_1)
        edtSecondNum = findViewById<EditText>(R.id.edt_2)
        result = findViewById<TextView>(R.id.tv_result_number)
        btnPlus.setOnClickListener(this)
        btnMinus.setOnClickListener(this)
        btnMultiply.setOnClickListener(this)
        btnDivide.setOnClickListener(this)

    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.btn_plus -> {
                result.setText(func("plus"))
            }
            R.id.btn_minus -> {
                result.setText(func("minus"))
            }
            R.id.btn_multiply -> {
                result.setText(func("multiply"))
            }
            R.id.btn_divide -> {
                result.setText(func("divide"))
            }
        }
    }

    fun func(text: String): String {
        if (edtFirstNum.text.isEmpty() || edtSecondNum.text.isEmpty()) {
            Toast.makeText(this, "Enter any number", Toast.LENGTH_SHORT).show()
            return ""
        } else {
            var res = 0.0f
            when (text) {
                "plus" -> {
                    res = edtFirstNum.text.toString().toFloat()+edtSecondNum.text.toString().toFloat()
                }
                "minus" -> {
                    res = edtFirstNum.text.toString().toInt()-edtSecondNum.text.toString().toFloat()
                }
                "multiply" -> {
                    res = edtFirstNum.text.toString().toFloat()*edtSecondNum.text.toString().toFloat()
                }
                "divide" -> {
                   if (edtSecondNum.text.toString().toInt()!=0){
                       res = edtFirstNum.text.toString().toFloat()/edtSecondNum.text.toString().toFloat()
                   }else{
                       Toast.makeText(this, "You can't divide by zero", Toast.LENGTH_SHORT).show()
                       return ""
                   }
                }
            }
            return res.toString()
        }
    }
}