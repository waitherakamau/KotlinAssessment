package dev.effence.calcuapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var btnAdd:Button
    lateinit var btnSubtract:Button
    lateinit var btnMultiply:Button
    lateinit var btnModulus:Button
    lateinit var tilNum1:TextInputLayout
    lateinit var tilNum2:TextInputLayout
    lateinit var etnum1:TextInputEditText
    lateinit var etnum2:TextInputEditText
    lateinit var tvResults:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnAdd=findViewById(R.id.btnAdd)
        btnSubtract=findViewById(R.id.btnSubtract)
        btnMultiply=findViewById(R.id.btnMultiply)
        btnModulus=findViewById(R.id.btnModulus)
        tilNum1=findViewById(R.id.tilnum1)
        etnum2=findViewById(R.id.etNum1)
        tilNum2=findViewById(R.id.tilnum2)
        etnum2=findViewById(R.id.etNum2)
        tvResults=findViewById(R.id.tvResults)

        btnAdd.setOnClickListener {
            var num1=etnum1.text.toString().toInt()
            var num2=etnum2.text.toString().toInt()
            addition(num1, num2)
//            startActivity(intent)
//            validatetext()
        }
        btnSubtract.setOnClickListener {
            var num1=etnum1.text.toString().toInt()
            var num2=etnum2.text.toString().toInt()
            subtraction( num1,num2)
        }
        btnMultiply.setOnClickListener {
            var num1=etnum1.text.toString().toInt()
            var num2=etnum2.text.toString().toInt()
            multiplication(num1, num2)
        }
        btnModulus.setOnClickListener {
            var num1=etnum1.text.toString().toInt()
            var num2=etnum2.text.toString().toInt()
            modulus(num1, num2)
        }

    }
    fun addition(num1:Int,num2:Int){
        var add=num1+num2
        tvResults.text=add.toString()
    }

    fun subtraction(num1: Int,num2: Int){
        var subtract=num1-num2
        tvResults.text=subtract.toString()
    }
    fun multiplication(num1: Int,num2: Int){
        var multiply=num1*num2
        tvResults.text=multiply.toString()
    }
    fun modulus(num1: Int,num2: Int){
        var modulus=num1%num2
        tvResults.text=modulus.toString()
    }
    fun validatetext(){
       var num1=etnum1.text.toString()
        var num2=etnum2.text.toString()

        if (num1 .isBlank()){
            etnum1.error="num1 required"
        }
        if (num2.isBlank()){
            etnum2.error="num2 required"
        }
    }

}