package com.example.appconsultas

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login2)
    }


    fun iniciar(view: View) {
        val i = Intent(this@LoginActivity, RegistrarseActivity::class.java)
        startActivity(i)
    }
}