package com.example.task11

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.RadioGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {


    private var radioGroup : RadioGroup? = null
    private var container : LinearLayout? = null

    private var gender : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        radioGroup = findViewById(R.id.id_radioGroup)
        container = findViewById(R.id.id_container)
        radioGroup?.setOnCheckedChangeListener { group, checkedId ->

            if(checkedId == R.id.id_male){
                gender = 1
                Toast.makeText(this,"Gender : Male | $gender" ,Toast.LENGTH_LONG).show()
                container?.setBackgroundColor(Color.GREEN)
            }else{
                gender = 0
                container?.setBackgroundColor(Color.RED)
                Toast.makeText(this,"Gender : Female | $gender" ,Toast.LENGTH_LONG).show()
            }

        }

    }
}
