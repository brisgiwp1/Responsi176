package com.example.responsi176

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import kotlinx.android.synthetic.main.activity_akun_.*

class Akun_Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_akun_)
        val bundle = intent.extras
        val nm = bundle?.get("nama")
        val seko = bundle?.get("asal")
        val yuswa = bundle?.get("umur")

        nam.text=nm.toString()
        asal.text=seko.toString()
        umr.text=yuswa.toString()
    }
}
