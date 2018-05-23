package com.example.fandyrahmatsaputra.smackchat.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.fandyrahmatsaputra.smackchat.R

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun signUpClicked(view:View) {
        val signUpIntent = Intent(this, CreateUserActivity::class.java)
        startActivity(signUpIntent)
    }

    fun loginClicked(view: View) {

    }

}
