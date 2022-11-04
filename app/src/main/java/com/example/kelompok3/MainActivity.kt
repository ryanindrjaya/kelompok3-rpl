package com.example.kelompok3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        clickListener();
    }

    public fun clickListener() {
        var ryan = findViewById<ImageView>(R.id.ryan)
        var fauzi = findViewById<ImageView>(R.id.fauzi)
        var naufal = findViewById<ImageView>(R.id.naufal)
        var shafwan = findViewById<ImageView>(R.id.shafwan)
        var tegar = findViewById<ImageView>(R.id.tegar)

        ryan.setOnClickListener { openRyanActivity() }
        naufal.setOnClickListener { openNaufalActivity()}
    }

    public fun openRyanActivity() {
        startActivity(Intent(this@MainActivity, RyanActivity::class.java))
    }

    public fun openNaufalActivity() {
        startActivity(Intent(this@MainActivity, NaufalActivity::class.java))
    }
}