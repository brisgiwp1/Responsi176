package com.example.responsi176

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login_.*

class Login_Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_)
        log.setOnClickListener {
            if (username.text.toString() == "brizwp" || pass1.text.toString() == "12345") {
                intent = Intent(this, Home_Activity::class.java)
            } else {
                Toast.makeText(getApplicationContext(), "User anda salah", Toast.LENGTH_LONG)
                    .show()
            }
            startActivity(intent)
        }
    }
}