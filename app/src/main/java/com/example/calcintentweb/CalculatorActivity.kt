package com.example.calcintentweb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class CalculatorActivity : AppCompatActivity() {
    lateinit var TextAnswer:TextView
    lateinit var Firstnumber:EditText
    lateinit var Secondnumber:EditText
    lateinit var buttonadd:Button
    lateinit var buttonmin:Button
    lateinit var buttontim:Button
    lateinit var buttondiv:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        buttonadd=findViewById(R.id.button3)
        buttonmin=findViewById(R.id.button2)
        buttontim=findViewById(R.id.button4)
        buttondiv=findViewById(R.id.button5)
        TextAnswer=findViewById(R.id.textView2)
        Firstnumber=findViewById(R.id.Edt_snum)
        Secondnumber=findViewById(R.id.editTextNumber2)
        buttonadd.setOnClickListener {
            var myfirstnumber=Firstnumber.text.toString()
             var mysecondnumber=Secondnumber.text.toString()

            if (myfirstnumber.isEmpty()or mysecondnumber.isEmpty()){
                TextAnswer.text="please fill in all inputs"
            }else{
                 var myanswer=myfirstnumber.toDouble()+mysecondnumber.toDouble()
                TextAnswer.text=myanswer.toString()

            }
        }
        buttonmin.setOnClickListener {
            var myfirstnumber=Firstnumber.text.toString()
            var mysecondnumber=Secondnumber.text.toString()

            if (myfirstnumber.isEmpty()or mysecondnumber.isEmpty()){
                TextAnswer.text="please fill in all inputs"
            }else{
                var myanswer=myfirstnumber.toDouble()-mysecondnumber.toDouble()
                TextAnswer.text=myanswer.toString()


            }
        }
        buttontim.setOnClickListener {
            var myfirstnumber=Firstnumber.text.toString()
            var mysecondnumber=Secondnumber.text.toString()

            if (myfirstnumber.isEmpty()or mysecondnumber.isEmpty()){
                TextAnswer.text="please fill in all inputs"

            }else{
                var myanswer=myfirstnumber.toDouble()*mysecondnumber.toDouble()
                TextAnswer.text=myanswer.toString()
            }
        }
        buttondiv.setOnClickListener {
            var myfirstnumber = Firstnumber.text.toString()
            var mysecondnumber = Secondnumber.text.toString()

            if (myfirstnumber.isEmpty() or mysecondnumber.isEmpty()) {
                TextAnswer.text = "please fill in all inputs"
            } else {
                var myanswer = myfirstnumber.toDouble() / mysecondnumber.toDouble()
                TextAnswer.text = myanswer.toString()

            }
        }
    }
}