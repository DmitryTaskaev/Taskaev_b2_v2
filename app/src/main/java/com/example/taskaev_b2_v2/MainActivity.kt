package com.example.taskaev_b2_v2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    private lateinit var Registration: Button
    private lateinit var login: EditText
    private lateinit var password: EditText

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Registration = findViewById(R.id.Registration)
        login = findViewById(R.id.LoginInput)
        password = findViewById(R.id.PasswordInput)
        Registration.setOnClickListener {
            val userLogin = login.text.toString()
            val userPass = password.text.toString()
            val builder = AlertDialog.Builder(this)
            if(userLogin == "Taskaev" && userPass == "1234"){
                val intent = Intent(this@MainActivity, ChoiceFigure::class.java)
                startActivity(intent)
            }
        }
    }
    fun Save(){
        val userLogin = login.text.toString()
        val userPass = password.text.toString()

        val sharedPreferences = getSharedPreferences("pref", MODE_PRIVATE)
    }
}
