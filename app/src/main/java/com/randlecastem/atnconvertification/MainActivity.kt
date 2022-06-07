package com.randlecastem.atnconvertification

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        butWithBut.setOnClickListener {
            val intent = Intent(this, ConverterJardM::class.java)
            startActivity(intent)
        }

        butWithoutBut.setOnClickListener {
            val intent = Intent(this, ConverterFuntG::class.java)
            startActivity(intent)
        }

    }
}