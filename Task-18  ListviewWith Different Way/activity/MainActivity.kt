package com.example.task18

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.task18.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private var lang = arrayOf("C","C++","Java","Kotlin","XML","HTML","SMTP","Android","PHP","Python",
        "Xamarin","GitLab","Flutter","iOS","Swift","Go","Ruby","R","Angular","JavaScript")



    private var binding : ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding?.idMethod1?.setOnClickListener {
            startActivity(Intent(this,Method1::class.java))
        }
        binding?.idMethod2?.setOnClickListener {
            startActivity(Intent(this,Method2::class.java))
        }

        binding?.idMethod3?.setOnClickListener {
            startActivity(Intent(this,Method3::class.java))
        }

        binding?.idMethod4?.setOnClickListener {
            startActivity(Intent(this,Method4::class.java))
        }


    }
}
