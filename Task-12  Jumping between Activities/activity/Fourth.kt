package com.example.task12

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.task12.databinding.ActivityFourthBinding

class Fourth : AppCompatActivity() {

    private var bind4 : ActivityFourthBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)
        title = "Fourth Activity"

        bind4 = DataBindingUtil.setContentView(this,R.layout.activity_fourth)

        bind4?.button41?.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }
        bind4?.button42?.setOnClickListener {
            startActivity(Intent(this,Second::class.java))
        }

        bind4?.button43?.setOnClickListener {
            startActivity(Intent(this,Third::class.java))
        }
        bind4?.button45?.setOnClickListener {
            startActivity(Intent(this,Fifth::class.java))
        }
        bind4?.button46?.setOnClickListener {
            startActivity(Intent(this,Sixth::class.java))
        }


    }
}