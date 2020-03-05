package com.example.task10

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.RatingBar
import android.widget.Switch

class MainActivity : AppCompatActivity() {

    private var switch : Switch? = null
    private var container : LinearLayout?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        switch = findViewById(R.id.id_switch)
        container = findViewById(R.id.id_container)
        switch?.setOnCheckedChangeListener { buttonView, isChecked ->

            if(isChecked){
                switch?.text = "ON"
                container?.setBackgroundColor(Color.YELLOW)

            }else{
                switch?.text = "OFF"
                container?.setBackgroundColor(Color.LTGRAY)
            }

        }


    }
}
