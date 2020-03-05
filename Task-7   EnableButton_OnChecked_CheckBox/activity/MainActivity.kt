package com.example.task7


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox

class MainActivity : AppCompatActivity() {

    private var chk_box : CheckBox? = null
    private var btn_check : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        chk_box = findViewById(R.id.id_checkbox)
        btn_check = findViewById(R.id.id_btn_check)

        chk_box?.setOnCheckedChangeListener { buttonView, isChecked ->

            btn_check ?.isEnabled = isChecked
        }

        btn_check?.setOnClickListener {
            chk_box?.text = "Checked"
        }

    }
}