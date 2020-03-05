package com.example.task13

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.task13.databinding.ActivitySecondBinding

class Second : AppCompatActivity() {

    var bind2 : ActivitySecondBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind2 = DataBindingUtil.setContentView(this,R.layout.activity_second)

        val intent = intent
        val name = intent.getStringExtra("Name")
        val mobile  = intent.getStringExtra("Mobile")
        val age = intent.getStringExtra("Age")
        val isCheck = intent.getBooleanExtra("isChecked",false)

        Log.e("AXE","Name : $name")
        Log.e("AXE","Mobile : $mobile")
        Log.e("AXE","age : $age")
        Log.e("AXE","check : $isCheck")




        bind2?.idSetName?.text = "Name  :  $name"
        bind2?.idSetMobileNo?.text = "Mobile No  :  $mobile"
        bind2?.idSetAge?.text = "Age  :  $age"
        bind2?.idSwitchResult?.text = "isChecked  :  $isCheck"

        bind2?.idMoveToThirdButton?.setOnClickListener {
            val intent2 = Intent(this,Third::class.java)
            intent2.putExtra("NAME",name)
            intent2.putExtra("MOBILE",mobile)
            intent2.putExtra("AGE",age)
            intent2.putExtra("CHECK",isCheck)
            startActivity(intent2)
        }
    }
    override fun onResume() {
        super.onResume()
        Toast.makeText(this,"Welcome to Second Activity",Toast.LENGTH_LONG).show()
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this,"Welcome back to Second Activity",Toast.LENGTH_LONG).show()
    }
}
