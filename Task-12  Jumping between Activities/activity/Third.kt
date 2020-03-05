package com.example.task12

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.task12.databinding.ActivityThirdBinding

class Third : AppCompatActivity() {

    private var bind3 : ActivityThirdBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        title = "Third Activity"

        bind3 = DataBindingUtil.setContentView(this,R.layout.activity_third)

        bind3?.button31?.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }
        bind3?.button32?.setOnClickListener {
            startActivity(Intent(this,Second::class.java))
        }

        bind3?.button34?.setOnClickListener {
            startActivity(Intent(this,Fourth::class.java))
        }
        bind3?.button35?.setOnClickListener {
            startActivity(Intent(this,Fifth::class.java))
        }
        bind3?.button36?.setOnClickListener {
            startActivity(Intent(this,Sixth::class.java))
        }

    }
}