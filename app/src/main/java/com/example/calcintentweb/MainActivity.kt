package com.example.calcintentweb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var buttoncal:Button
    lateinit var buttonintent:Button
    lateinit var buttonweb:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttoncal=findViewById(R.id.Btn_calc)
        buttonintent=findViewById(R.id.Btn_Intent)
        buttonweb=findViewById(R.id.Btn_Web)

        buttoncal.setOnClickListener {
            val calc=Intent(this,CalculatorActivity::class.java)
            startActivity(calc)
        }

        buttonintent.setOnClickListener {
            val intent=Intent(this,IntentActivity::class.java)
            startActivity(intent)
            Toast.makeText(this,"clicked me",Toast.LENGTH_SHORT).show()
        }

        buttonweb.setOnClickListener {
            val web=Intent(this,WebActivity::class.java)
            startActivity(web)

            Toast.makeText(this,"clicked me",Toast.LENGTH_SHORT).show()
        }


    }
}