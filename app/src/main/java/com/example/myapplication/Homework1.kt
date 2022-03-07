package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Homework1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.homework_1_3)
        val editPassword = findViewById<EditText>(R.id.edt_password)
        val editEmail = findViewById<EditText>(R.id.edt_email)
        val btnLogin = findViewById<Button>(R.id.btn_login)
        btnLogin.setOnClickListener {
            if (editPassword.text.length >= 8 && editEmail.text.length != 0) {
                var isCap = false
                var ch = '0'
                for (i in 0 until editPassword.text.length) {
                    ch = editPassword.text[i]
                    if (ch.isUpperCase()) {
                        isCap = true
                        break
                    }
                }
                if (isCap) {
                    Toast.makeText(this, "You signed in", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(this, "The password must contain a capital", Toast.LENGTH_LONG)
                        .show()
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