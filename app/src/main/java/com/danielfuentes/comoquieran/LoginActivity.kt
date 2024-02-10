package com.danielfuentes.comoquieran

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class LoginActivity : AppCompatActivity() {

    lateinit var txt_Cuatro: TextView
    lateinit var txt_Cinco: TextView
    var counter = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_main)
        txt_Cuatro = findViewById(R.id.tv_cuatro)
        txt_Cinco = findViewById(R.id.tv_cinco)

        val clickListener = View.OnClickListener { view ->
            when (counter) {
                1 -> {
                    val passwordTextView = findViewById<TextView>(R.id.pwd1)
                    passwordTextView.text = (view as TextView).text
                }
                2 -> {
                    val passwordTextView = findViewById<TextView>(R.id.pwd2)
                    passwordTextView.text = (view as TextView).text
                }
                3 -> {
                    val passwordTextView = findViewById<TextView>(R.id.pwd3)
                    passwordTextView.text = (view as TextView).text
                }
                4 -> {
                    val passwordTextView = findViewById<TextView>(R.id.pwd4)
                    passwordTextView.text = (view as TextView).text
                }
            }
            counter++
        }
        txt_Cuatro.setOnClickListener(clickListener)
        txt_Cinco.setOnClickListener(clickListener)
    }
}