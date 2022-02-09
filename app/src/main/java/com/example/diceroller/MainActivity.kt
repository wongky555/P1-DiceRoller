package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var count:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn : Button = findViewById(R.id.btnRoll)
        val tvCountUp : TextView = findViewById(R.id.tvCountUp)

        btn.setOnClickListener(){
            //Toast.makeText(applicationContext,"Clicked", Toast.LENGTH_LONG).show()
            generateRandomNo()

            if(count < 6)
            {
                count += 1
                tvCountUp.text = count.toString()
            }
        }
    }

    fun generateRandomNo() {
        val tvNumber : TextView = findViewById(R.id.tvNumber)
        val number = (1..6).random()

        tvNumber.text = number.toString()
    }
}