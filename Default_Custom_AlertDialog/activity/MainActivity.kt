package com.example.mdialogs

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    private var defaultButton : Button? = null
    private var customButton : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        defaultButton = findViewById(R.id.id_defButton)
        customButton = findViewById(R.id.id_customButton)

        defaultButton?.setOnClickListener {

            val dialog = AlertDialog.Builder(this)
            dialog.setTitle("Title")
            dialog.setMessage("Message")
            dialog.setPositiveButton("Yes"){d,w ->
                Toast.makeText(this,"Yes Clicked",Toast.LENGTH_LONG).show()
                d.dismiss()
            }
            dialog.setNegativeButton("No"){d,w ->
                Toast.makeText(this,"No Clicked",Toast.LENGTH_LONG).show()
                d.dismiss()
            }
            dialog.setNeutralButton("OK"){d,w ->
                Toast.makeText(this,"OK Clicked",Toast.LENGTH_LONG).show()
                d.dismiss()
            }
            dialog.show()
        }

        customButton?.setOnClickListener {
            val mDialog = Dialog(this)
            val view = layoutInflater.inflate(R.layout.custom_dialog,null,false)
            mDialog.setContentView(view)

            val button1 = view.findViewById<Button>(R.id.id_CustomButton1)
            val button2 = view.findViewById<Button>(R.id.id_customButton2)

            button1?.setOnClickListener {
                Toast.makeText(this,"Custom Yes Clicked",Toast.LENGTH_LONG).show()
                mDialog.dismiss()
            }
            button2?.setOnClickListener {
                Toast.makeText(this,"Custom No Clicked",Toast.LENGTH_LONG).show()
                mDialog.dismiss()
            }


            mDialog.show()

        }

    }
}
