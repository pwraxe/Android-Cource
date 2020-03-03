package com.example.simplelistview

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private var button : Button? = null

    private var myDialog : AlertDialog? = null

    private var mTitle : TextView? = null
    private var mMessage : TextView? = null
    private var mYesButton : Button? = null
    private var mNoButton : Button? = null





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showAlertDialog("On Create Title","On Create Message")
        button = findViewById(R.id.id_button)

        button?.setOnClickListener {
            showAlertDialog("on Click Title","On Click Message")
        }
    }
    private fun showAlertDialog(title : String,message : String) {

        val builder = AlertDialog.Builder(this)

        val view = layoutInflater.inflate(R.layout.layout_custom_dialog,null)
        builder.setView(view)

        mTitle = view.findViewById(R.id.id_my_title)
        mMessage = view.findViewById(R.id.id_my_msg)
        mYesButton = view.findViewById(R.id.id_yesButton)
        mNoButton = view.findViewById(R.id.id_noButton)

        mTitle?.text = title
        mMessage?.text = message

        myDialog = builder.create()
        myDialog?.show()

        builder.setPositiveButton("OK"){ d,w ->             // d = dialog , w = which
            myDialog = d as AlertDialog?
        }


        mYesButton?.setOnClickListener {

            showToast("Yes Button Clicked!")
            myDialog?.dismiss()

        }

        mNoButton?.setOnClickListener {
            showToast("No Button Clicked!")
            myDialog?.dismiss()
        }

    }

    private fun showToast(msg: String) {
        Toast.makeText(this,msg,Toast.LENGTH_LONG).show()

    }
}