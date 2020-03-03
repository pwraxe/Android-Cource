package com.example.validations

import android.os.Bundle
import android.text.TextUtils
import android.util.Patterns
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.validations.databinding.ActivityMainBinding
import java.util.regex.Matcher
import java.util.regex.Pattern

class MainActivity : AppCompatActivity(){


    private var binding : ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding?.idValidateButton?.setOnClickListener {

            if(TextUtils.isEmpty(binding?.idFullName?.text.toString())){
                binding?.idFullName?.error = "Name cannot be EmT"
                binding?.idFullName?.requestFocus()
                return@setOnClickListener
            }

            if(binding?.idFullName?.length()!! < 8){
                binding?.idFullName?.error = "We need Full name"
                binding?.idFullName?.requestFocus()
                return@setOnClickListener
            }

            if(TextUtils.isEmpty(binding?.idEmail?.text.toString())) {
                binding?.idEmail?.error = "Email ID Required"
                binding?.idEmail?.requestFocus()
                return@setOnClickListener
            }


            if(!Patterns.EMAIL_ADDRESS.matcher(binding?.idEmail?.text.toString()).matches()){
                binding?.idEmail?.error = "Invalid Email ID"
                binding?.idEmail?.requestFocus()
                return@setOnClickListener
            }

            if(TextUtils.isEmpty(binding?.idMobile?.text.toString())) {
                binding?.idMobile?.error = "Mobile No Required"
                binding?.idMobile?.requestFocus()
                return@setOnClickListener
            }

            if(binding?.idMobile?.text.toString().length != 10){
                binding?.idMobile?.error = "Mobile No Should be 10 digit"
                binding?.idMobile?.requestFocus()
                return@setOnClickListener
            }
            if(TextUtils.isEmpty(binding?.idPassword?.text.toString())){
                binding?.idPassword?.error = "Password Required"
                binding?.idPassword?.requestFocus()
                return@setOnClickListener
            }
            if(!isValidPassword(binding?.idPassword?.text.toString())) {
                binding?.idPassword?.error = "Password should 1 upper case, Lower case , digit and special symbol"
                binding?.idPassword?.requestFocus()
                return@setOnClickListener
            }
            if(binding?.idPassword?.text.toString().length < 8){
                binding?.idPassword?.error = "Password should be minimum 8 character long"
                binding?.idPassword?.requestFocus()
                return@setOnClickListener
            }

            if(TextUtils.isEmpty(binding?.idState?.text.toString())) {
                binding?.idState?.error = "State Required"
                binding?.idState?.requestFocus()
                return@setOnClickListener
            }
            if(binding?.idState?.text.toString().length < 4){
                binding?.idState?.error = "Please specify Proper State"
                binding?.idState?.requestFocus()
                return@setOnClickListener
            }

            if(TextUtils.isEmpty(binding?.idPin?.text.toString())){
                binding?.idPin?.error = "Pincode Required"
                binding?.idPin?.requestFocus()
                return@setOnClickListener
            }
            if(binding?.idPin?.text.toString().length != 6){
                binding?.idPin?.error = "Pincode should be 6 digit"
                binding?.idPin?.requestFocus()
                return@setOnClickListener
            }

            Toast.makeText(this,"Full Name : ${binding?.idFullName?.text.toString()} \nEmail : ${binding?.idEmail?.text.toString()} \n" +
                    "Mobile No : ${binding?.idMobile?.text.toString()} \nPassword : ${binding?.idPassword?.text.toString()} \nState : ${binding?.idState?.text.toString()}" +
                    "\nPincode : ${binding?.idPin?.text.toString()}",Toast.LENGTH_LONG).show()

        }

    }

    private fun isValidPassword(password : String) : Boolean{
        val matcher : Matcher = Pattern.compile("((?=.*[a-z])(?=.*\\d)(?=.*[A-Z])(?=.*[@#$%!]).{4,20})").matcher(password)
        return matcher.matches()
    }

}
//----------------------------------------------------------------------------------------------------|| OR ||----------------------------------------------------------------------------------------


import android.os.Bundle
import android.text.TextUtils
import android.util.Patterns
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.validations.databinding.ActivityMainBinding
import java.util.regex.Matcher
import java.util.regex.Pattern

class MainActivity : AppCompatActivity(){

    private var binding : ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding?.idValidateButton?.setOnClickListener {

            val fullName = binding?.idFullName?.text.toString().trim()
            val emailId = binding?.idEmail?.text.toString().trim()
            val mobileNo = binding?.idMobile?.text.toString()
            val password = binding?.idPassword?.text.toString().trim()
            val state = binding?.idState?.text.toString()
            val pin = binding?.idPin?.text.toString()

            if(TextUtils.isEmpty(fullName)){
                binding?.idFullName?.error = "Full Name required"
                binding?.idFullName?.requestFocus()
                return@setOnClickListener
            }

            if(fullName.length < 8){
                binding?.idFullName?.error = "We need Full name"
                binding?.idFullName?.requestFocus()
                return@setOnClickListener
            }

            if(TextUtils.isEmpty(emailId)){
                binding?.idEmail?.error = "Email ID Required"
                binding?.idEmail?.requestFocus()
                return@setOnClickListener
            }

            if(! Patterns.EMAIL_ADDRESS.matcher(emailId).matches()){
                binding?.idEmail?.error = "Invalid Email ID"
                binding?.idEmail?.requestFocus()
                return@setOnClickListener
            }

            if(TextUtils.isEmpty(mobileNo)) {
                binding?.idMobile?.error = "Mobile No Required"
                binding?.idMobile?.requestFocus()
                return@setOnClickListener
            }

            if(mobileNo.length != 10){
                binding?.idMobile?.error = "Mobile No Should be 10 digit"
                binding?.idMobile?.requestFocus()
                return@setOnClickListener
            }

            if(TextUtils.isEmpty(password)){
                binding?.idPassword?.error = "Password Required"
                binding?.idPassword?.requestFocus()
                return@setOnClickListener
            }

            if(!isValidPassword(password)) {
                binding?.idPassword?.error = "Password should 1 upper case, Lower case , digit and special symbol"
                binding?.idPassword?.requestFocus()
                return@setOnClickListener
            }

            if(password.length < 8){
                binding?.idPassword?.error = "Password should be minimum 8 character long"
                binding?.idPassword?.requestFocus()
                return@setOnClickListener
            }

            if(TextUtils.isEmpty(state)) {
                binding?.idState?.error = "State Required"
                binding?.idState?.requestFocus()
                return@setOnClickListener
            }

            if(state.length < 4){
                binding?.idState?.error = "Please specify Proper State"
                binding?.idState?.requestFocus()
                return@setOnClickListener
            }

            if(TextUtils.isEmpty(pin)){
                binding?.idPin?.error = "Pincode Required"
                binding?.idPin?.requestFocus()
                return@setOnClickListener
            }

            if(pin.length != 6){
                binding?.idPin?.error = "Pincode should be 6 digit"
                binding?.idPin?.requestFocus()
                return@setOnClickListener
            }

            Toast.makeText(this,"Full Name : $fullName \nEmail : $emailId \n" +
                    "Mobile No : $mobileNo \nPassword : $password \nState : $state" +
                    "\nPincode : $pin",Toast.LENGTH_LONG).show()

            

        }

    }

    private fun isValidPassword(password : String) : Boolean{
        val matcher : Matcher = Pattern.compile("((?=.*[a-z])(?=.*\\d)(?=.*[A-Z])(?=.*[@#$%!]).{4,20})").matcher(password)
        return matcher.matches()
    }

}






