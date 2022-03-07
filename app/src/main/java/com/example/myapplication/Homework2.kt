package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Homework2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.homework_2_3)
        val editPassword = findViewById<EditText>(R.id.edt_password)
        val editEmail = findViewById<EditText>(R.id.edt_email)
        val btnLogin = findViewById<Button>(R.id.btn_login)
        btnLogin.setOnClickListener {
            if (editPassword.text.length >= 8 && editEmail.text.length != 0) {
                if (!editPassword.text.toString()
                        .equals("12345678") && !editPassword.text.toString()
                        .equals("87654321") && !editPassword.text.toString().equals("00000000")
                ) {
                    Toast.makeText(
                        this,
                        "You signed in ${editPassword.text.toString()}",
                        Toast.LENGTH_SHORT
                    ).show()
                } else {
                    Toast.makeText(this, "Change the password", Toast.LENGTH_LONG).show()
                }
            } else {
                Toast.makeText(
                    this,
                    "Password's lenght is small or there is not an email",
                    Toast.LENGTH_LONG
                ).show()
            }
        }
    }
}