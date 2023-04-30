package com.example.btumidtermam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class NewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)
        var numberRes = findViewById<TextView>(R.id.number_text)
        var clickBut = findViewById<TextView>(R.id.click_but)
        clickBut.setOnClickListener {
            var number = findViewById<TextView>(R.id.number_text).text.toString().toInt()
            number++
            numberRes.text = number.toString()

        }
    }
}