package com.example.task12

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.task12.databinding.ActivitySecondBinding

class Second : AppCompatActivity() {

    private var bind2 : ActivitySecondBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        title = "Second Activity"

        bind2 = DataBindingUtil.setContentView(this,R.layout.activity_second)

        bind2?.button21?.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }
        bind2?.button23?.setOnClickListener {
            startActivity(Intent(this,Third::class.java))
        }

        bind2?.button24?.setOnClickListener {
            startActivity(Intent(this,Fourth::class.java))
        }
        bind2?.button25?.setOnClickListener {
            startActivity(Intent(this,Fifth::class.java))
        }
        bind2?.button26?.setOnClickListener {
            startActivity(Intent(this,Sixth::class.java))
        }



    }
}