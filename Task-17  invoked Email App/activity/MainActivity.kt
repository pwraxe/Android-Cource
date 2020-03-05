package com.example.task17

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.Patterns
import androidx.databinding.DataBindingUtil
import com.example.task17.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var binding  : ActivityMainBinding? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)


        binding?.idSendEmailButton?.setOnClickListener {
            val email = binding?.idEmailID?.text?.toString()?.trim()
            val sub = binding?.idEmailSub?.text.toString().trim()
            val message = binding?.idEmailMessage?.text.toString().trim()

            if(TextUtils.isEmpty(email)){
                binding?.idEmailID?.error = "Please Enter Email Id"
                binding?.idEmailID?.requestFocus()
                return@setOnClickListener
            }
            if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                binding?.idEmailID?.error = "Invalid Email ID "
                binding?.idEmailID?.requestFocus()
                return@setOnClickListener
            }

            if(TextUtils.isEmpty(sub)){
                binding?.idEmailSub?.error = "Please Enter Email Subject"
                binding?.idEmailSub?.requestFocus()
                return@setOnClickListener
            }
            if(TextUtils.isEmpty(message)){
                binding?.idEmailMessage?.error = "Please Enter Email Subject"
                binding?.idEmailMessage?.requestFocus()
                return@setOnClickListener
            }


            val intent = Intent(Intent.ACTION_SEND)
            intent.putExtra(Intent.EXTRA_EMAIL,email)
            intent.putExtra(Intent.EXTRA_SUBJECT,sub)
            intent.putExtra(Intent.EXTRA_TEXT,message)
            intent.type = "message/rfc822"

            startActivity(Intent.createChooser(intent,"Send Mail To : "))

        }

    }
}
