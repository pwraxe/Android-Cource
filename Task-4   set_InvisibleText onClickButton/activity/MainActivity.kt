package com.example.task4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var btn_gm : Button? = null
    private var btn_ga : Button? = null
    private var btn_ge : Button? = null
    private var btn_gn : Button? = null

    private var txt_greeting : TextView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_gm = findViewById(R.id.id_btn_gm)
        btn_ga = findViewById(R.id.id_btn_ga)
        btn_ge = findViewById(R.id.id_btn_ge)
        btn_gn = findViewById(R.id.id_btn_gn)

        btn_ga?.isEnabled = false
        btn_ge?.isEnabled = false
        btn_gn?.isEnabled = false

        txt_greeting = findViewById(R.id.id_text)

        btn_gm?.setOnClickListener {
            txt_greeting?.text = btn_gm?.text.toString()
            txt_greeting?.visibility = View.VISIBLE
            if(txt_greeting?.text!!.contains(btn_gm?.text.toString())){
                btn_ga?.isEnabled = true
                btn_gm?.isEnabled = false
            }else{
                showToast("GM Sounds Different")
            }
        }

        btn_ga?.setOnClickListener {
            txt_greeting?.text = btn_ga?.text.toString()
            txt_greeting?.visibility = View.VISIBLE
            if(txt_greeting?.text!!.contains(btn_ga?.text.toString())){
                btn_ga?.isEnabled = false
                btn_ge?.isEnabled = true
            }else{
                showToast("GA sounds different")
            }
        }

        btn_ge?.setOnClickListener {
            txt_greeting?.text = btn_ge?.text.toString()
            txt_greeting?.visibility = View.VISIBLE
            if(txt_greeting?.text!!.contains(btn_ge?.text.toString())){
                btn_ge?.isEnabled = false
                btn_gn?.isEnabled = true
            }else{
                showToast("GE sounds different")
            }
        }

        btn_gn?.setOnClickListener {

            txt_greeting?.text = btn_gn?.text.toString()
            txt_greeting?.visibility = View.VISIBLE
            if(txt_greeting?.text!!.contains(btn_gn?.text.toString())){
                btn_gn?.isEnabled = false
                btn_gm?.isEnabled =true
            }else{
                showToast("GN sounds different")
            }

        }



    }

    private fun showToast(msg : String) {
        Toast.makeText(this,msg,Toast.LENGTH_LONG).show()
    }
}
