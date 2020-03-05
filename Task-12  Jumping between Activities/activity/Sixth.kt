package com.example.task12

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.task12.databinding.ActivitySixthBinding

class Sixth : AppCompatActivity() {

    private var bind6 : ActivitySixthBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sixth)
        title = "Sixth Activity"
        
        bind6 = DataBindingUtil.setContentView(this,R.layout.activity_sixth)

        bind6?.button61?.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }
        bind6?.button62?.setOnClickListener {
            startActivity(Intent(this,Second::class.java))
        }

        bind6?.button63?.setOnClickListener {
            startActivity(Intent(this,Third::class.java))
        }
        bind6?.button64?.setOnClickListener {
            startActivity(Intent(this,Fourth::class.java))
        }
        bind6?.button65?.setOnClickListener {
            startActivity(Intent(this,Fifth::class.java))
        }



    }
}