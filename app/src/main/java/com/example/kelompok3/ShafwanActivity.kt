package com.example.kelompok3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ShafwanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shafwan)

        clickListener()
    }

    public fun clickListener() {
        var backBtn = findViewById<Button>(R.id.btn_back)

        backBtn.setOnClickListener { backToMainActivity() }
    }

    public fun backToMainActivity() {
        startActivity(Intent(this@ShafwanActivity, MainActivity::class.java))
    }
}