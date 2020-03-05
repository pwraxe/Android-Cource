package com.example.task16

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import androidx.databinding.DataBindingUtil
import com.example.task16.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var binding : ActivityMainBinding? = null

    private var msg : String? = null
    private var number : String? = null

    @SuppressLint("MissingPermission")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding?.idSend?.setOnClickListener {

            msg = binding?.idMessageBox?.text.toString().trim()
            number = binding?.idNumberBox?.text.toString().trim()


            val isOk = checkInput()
            if(isOk){
                val intent = Intent(Intent.ACTION_SENDTO, Uri.parse("sms:$number"))
                intent.putExtra("UserMsg",msg)
                startActivity(intent)
            }else{
                return@setOnClickListener
            }
        }

        binding?.idShare?.setOnClickListener {
            msg = binding?.idMessageBox?.text.toString().trim()
            number = binding?.idNumberBox?.text.toString().trim()
            val isOK = checkInput()
            if(isOK) {
                val intent = Intent(Intent.ACTION_SEND)
                intent.type = "plain/text"
                intent.putExtra(Intent.EXTRA_TEXT, msg)
                val chooser = Intent.createChooser(intent,msg)
                startActivity(chooser)
            }else {
                return@setOnClickListener
            }
        }

        binding?.idCallButton?.setOnClickListener {

            val numbers = binding?.idNumberBox?.text.toString().trim()
            if(TextUtils.isEmpty(numbers)){
                binding?.idNumberBox?.error = "Only this field of Receiver's number required"
                binding?.idNumberBox?.requestFocus()
                return@setOnClickListener

            }
            if(numbers?.length != 10 ){
                binding?.idNumberBox?.error = "number should 10 digit"
                binding?.idNumberBox?.requestFocus()
                return@setOnClickListener
            }

            val intent = Intent(Intent.ACTION_CALL)
            intent.data = Uri.parse("tel:$numbers")
            startActivity(intent)
        }

    }

    private fun checkInput() :Boolean {
        if(TextUtils.isEmpty(number)){
            binding?.idNumberBox?.error = "Receiver number required"
            binding?.idNumberBox?.requestFocus()
            return false

        }
        if(number?.length != 10 ){
            binding?.idNumberBox?.error = "number should 10 digit"
            binding?.idNumberBox?.requestFocus()
            return false
        }
        if(TextUtils.isEmpty(msg)){
            binding?.idMessageBox?.error = "Please Type something"
            binding?.idMessageBox?.requestFocus()
            return false
        }

        return true
    }
}
