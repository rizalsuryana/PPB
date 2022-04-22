package com.tubes.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class konten1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.content_1)
        val next1 = findViewById<ImageButton>(R.id.next)
        next1.setOnClickListener {
            val intent = Intent( this,code_a::class.java)
            startActivity(intent)
        }
        val previous1 = findViewById<ImageButton>(R.id.previous)
        previous1.setOnClickListener {
            val intent = Intent( this,konten1::class.java)
            startActivity(intent)
        }

    }


}
