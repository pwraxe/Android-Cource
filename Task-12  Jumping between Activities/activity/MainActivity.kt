package com.example.task12

import android.content.Intent
import android.database.DatabaseUtils
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.task12.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private var bind1 : ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title = "First Activity"

        bind1 = DataBindingUtil.setContentView(this,R.layout.activity_main)

        bind1?.button12?.setOnClickListener {
            startActivity(Intent(this,Second::class.java))
        }
        bind1?.button13?.setOnClickListener {
            startActivity(Intent(this,Third::class.java))
        }

        bind1?.button14?.setOnClickListener {
            startActivity(Intent(this,Fourth::class.java))
        }
        bind1?.button15?.setOnClickListener {
            startActivity(Intent(this,Fifth::class.java))
        }
        bind1?.button16?.setOnClickListener {
            startActivity(Intent(this,Sixth::class.java))
        }


    }
}