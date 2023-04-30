package com.example.btumidtermam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var textName = findViewById<EditText>(R.id.editText).text.toString()
        var textNameView1 = findViewById<TextView>(R.id.textView)
        var okaybutton = findViewById<TextView>(R.id.textView2)
        var nextbutton = findViewById<TextView>(R.id.textView3)
        okaybutton.setOnClickListener {
            textNameView1.text = textName.toString()
        }
        nextbutton.setOnClickListener {
            var intent = Intent(this, NewActivity::class.java)
            startActivity(intent)
        }
    }
}