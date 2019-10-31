package com.example.responsi176

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.ListView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_home_.*

class Home_Activity : AppCompatActivity() {
    lateinit var listView : ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_)
        listView = findViewById(R.id.listView)
        var list = mutableListOf<model>()
        Akun.setOnClickListener {
            intent = Intent(this, Akun_Activity::class.java)
            startActivity(intent)
        }

        list.add(model("BUKU", "Alat tulis yang digunakan untuk menulis", R.drawable.buku))
        list.add(model("CLIP", "Alat tulis yang digunakan untuk menjepit kertas", R.drawable.clip))
        list.add(model("PENGAHAPUS", "Alat tulis yang digunakan untuk menghapus tulisan", R.drawable.hapus))
        list.add(model("KERTAS", "Alat tulis yang dijadikan tempat menulis", R.drawable.kerts))
        list.add(model("PENSIL", "Alat tulis yang digunakan untuk menulis", R.drawable.pen))
        list.add(model("PENGGARIS", "Alat tulis yang digunakan untuk menggaris", R.drawable.penggaris))
        list.add(model("SELOTIP", "Alat tulis yang digunakan untuk menyelotip", R.drawable.selotip))
        list.add(model("TAS", "Alat tulis yang digunakan untuk menyimpan alat tulis", R.drawable.tas))
        list.add(model("TEMPAT PENSIL", "Alat tulis yang digunakan untuk menyimpan pensil", R.drawable.tmp_pen))
        list.add(model("BOLPEN", "Alat tulis yang digunakan untuk menulis", R.drawable.bolpen))

        listView.adapter = adapter(this,R.layout.cihuy,list)

        listView.setOnItemClickListener{parent, view, position, id ->

            if (position==0){
                Toast.makeText(this@Home_Activity, "ini buku",   Toast.LENGTH_LONG).show()
            }
            if (position==1){
                Toast.makeText(this@Home_Activity, "Ini clip",   Toast.LENGTH_LONG).show()
            }
            if (position==2){
                Toast.makeText(this@Home_Activity, "Penghapus", Toast.LENGTH_LONG).show()
            }
            if (position==3){
                Toast.makeText(this@Home_Activity, "Ini kertas",  Toast.LENGTH_LONG).show()
            }
            if (position==4){
                Toast.makeText(this@Home_Activity, "Ini pensil",  Toast.LENGTH_LONG).show()
            }
            if (position==5){
                Toast.makeText(this@Home_Activity, "Ini penggaris",  Toast.LENGTH_LONG).show()
            }
            if (position==6){
                Toast.makeText(this@Home_Activity, "Ini selotip",  Toast.LENGTH_LONG).show()
            }
            if (position==7){
                Toast.makeText(this@Home_Activity, "Ini tas",  Toast.LENGTH_LONG).show()
            }
            if (position==8){
                Toast.makeText(this@Home_Activity, "Ini tempat pensil",  Toast.LENGTH_LONG).show()
            }
            if (position==9){
                Toast.makeText(this@Home_Activity, "Ini bolpen",  Toast.LENGTH_LONG).show()

            }
        }

    }
}
