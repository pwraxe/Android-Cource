package com.example.task8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox

class MainActivity : AppCompatActivity() {

    private var chk_box1 : CheckBox? = null
    private var chk_box2 : CheckBox? = null
    private var btn_checkBoth : Button? = null

    private var isFirstcheck = false
    private var isSecondcheck = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        chk_box1 = findViewById(R.id.id_checkbox1)
        chk_box2 = findViewById(R.id.id_checkbox2)
        btn_checkBoth = findViewById(R.id.id_btn_check)

        chk_box1?.setOnCheckedChangeListener { buttonView, isChecked ->
            isFirstcheck = isChecked
            goForEnableButton()
        }
        chk_box2?.setOnCheckedChangeListener { buttonView, isChecked ->
            isSecondcheck = isChecked
            goForEnableButton()
        }

        btn_checkBoth?.setOnClickListener {

            chk_box1?.text = "First Checked"
            chk_box2?.text = "Second Checked"

        }





    }
    private fun goForEnableButton(){
        btn_checkBoth?.isEnabled = isFirstcheck && isSecondcheck

    }
}
