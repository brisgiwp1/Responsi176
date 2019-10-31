package com.example.responsi176

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        intent = Intent(this, Akun_Activity::class.java)
        intent.putExtra("nama", nama.text)
        intent.putExtra("asal", asal.text)
        intent.putExtra("umur", umur.text)

        register.setOnClickListener{

            Toast.makeText(getApplicationContext(), "Anda Telah memasukan Data", Toast.LENGTH_LONG).show()
            intent = Intent(this, Login_Activity::class.java)

            startActivity(intent)

        }
    }
}
