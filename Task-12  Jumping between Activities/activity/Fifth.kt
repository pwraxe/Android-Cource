package com.example.task12

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.task12.databinding.ActivityFifthBinding

class Fifth : AppCompatActivity() {

    private var bind5 : ActivityFifthBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fifth)
        title = "Fifth Activity"


        bind5 = DataBindingUtil.setContentView(this,R.layout.activity_fifth)

        bind5?.button51?.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }
        bind5?.button52?.setOnClickListener {
            startActivity(Intent(this,Second::class.java))
        }

        bind5?.button53?.setOnClickListener {
            startActivity(Intent(this,Third::class.java))
        }
        bind5?.button54?.setOnClickListener {
            startActivity(Intent(this,Fourth::class.java))
        }
        bind5?.button56?.setOnClickListener {
            startActivity(Intent(this,Sixth::class.java))
        }



    }
}