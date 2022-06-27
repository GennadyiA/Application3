package com.example.test

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var button : Button
    lateinit var text : TextView
    val newText = "HI"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text = findViewById(R.id.text)
        button = findViewById(R.id.button)
        button.setOnClickListener(listener)

    }
    val listener= View.OnClickListener { view ->
        when (view.getId()) {
            R.id.button -> {
                text.setText(newText)
            }
        }
    }
}