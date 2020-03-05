package com.example.task13

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.task13.databinding.ActivityThirdBinding

class Third : AppCompatActivity() {

    var bind3 : ActivityThirdBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        bind3 = DataBindingUtil.setContentView(this,R.layout.activity_third)

        val intent = intent
        val name = intent.getStringExtra("NAME")
        val mobile = intent.getStringExtra("MOBILE")
        val age = intent.getStringExtra("AGE")
        val isCheck = intent.getBooleanExtra("CHECK",false)


        bind3?.idSetNameIn3?.text = "Name  :  $name"
        bind3?.idSetMobileNoIn3?.text = "Mobile No  :  $mobile"
        bind3?.idSetAgeIn3?.text = "Age  :  $age"
        bind3?.idSwitchResultIn3?.text = "isCheck  :  $isCheck"


    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this,"Welcome to Third Activity", Toast.LENGTH_LONG).show()
    }

}
