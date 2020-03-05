package com.example.task13

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.task13.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var bind : ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bind = DataBindingUtil.setContentView(this,R.layout.activity_main)

        bind?.idMoveButton?.setOnClickListener {

            val fname = bind?.idEtName?.text.toString().trim()
            val mobile = bind?.idEtMobile?.text.toString().trim()
            val age = bind?.idEtAge?.text.toString()
            val isSwitch = bind?.idBtnSwitch?.isChecked
            
            if(TextUtils.isEmpty(fname)) {
                bind?.idEtName?.error = "Please Enter First Name"
                return@setOnClickListener
            }
            if(TextUtils.isEmpty(mobile.toString())){
                bind?.idEtMobile?.error = "Please Enter Mobile No"
                return@setOnClickListener
            }
            if(mobile.length != 10){
                bind?.idEtMobile?.error = "Mobile No Should be 10 Digit"
                return@setOnClickListener
            }
            if(TextUtils.isEmpty(age)){
                bind?.idEtAge?.error = "Age Should Not be Empty"
                return@setOnClickListener
            }
            if(age.length != 2){
                bind?.idEtAge?.error = "Age should above 10"
                return@setOnClickListener
            }

            val intent = Intent(this,Second::class.java)
            intent.putExtra("Name",fname)
            intent.putExtra("Mobile",mobile)
            intent.putExtra("Age",age)
            intent.putExtra("isChecked",isSwitch)
            startActivity(intent)

        }
    }
    override fun onResume() {
        super.onResume()
        Toast.makeText(this,"Welcome to Home Activity", Toast.LENGTH_LONG).show()
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this,"Welcome back to First Activity", Toast.LENGTH_LONG).show()
    }

}
