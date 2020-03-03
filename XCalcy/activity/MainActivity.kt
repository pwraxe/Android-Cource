package com.example.xcalcy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlin.math.abs
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {

    private var input_num : TextView? = null
    private var ansText : TextView? = null
    private var mc : Button? = null
    private var mr : Button? = null
    private var mPlus : Button? = null
    private var mMinus : Button? = null
    private var leftArr : Button? = null
    private var clear : Button? = null
    private var plusMinus : Button? = null
    private var root : Button? = null
    private var one : Button? = null
    private var two : Button? = null
    private var three : Button? = null
    private var four : Button? = null
    private var five : Button? = null
    private var six : Button? = null
    private var seven : Button? = null
    private var eight : Button? = null
    private var nine : Button? = null
    private var zero : Button? = null
    private var percent : Button? = null
    private var star : Button? = null
    private var slash : Button? = null
    private var equalTo : Button? = null
    private var plus : Button? = null
    private var minus : Button? = null

    private var tempValue : String = ""
    private var buffer = StringBuffer()
    private var savedValue = 0

    private var tempId = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        input_num = findViewById(R.id.id_num_input)
        ansText = findViewById(R.id.id_txt_ansText)
        mc = findViewById(R.id.id_btn_mc)
        mr = findViewById(R.id.id_btn_mr)
        mPlus = findViewById(R.id.id_btn_mplus)
        mMinus = findViewById(R.id.id_btn_mminus)
        leftArr = findViewById(R.id.id_btn_toLeftArrow)
        clear = findViewById(R.id.id_btn_c)
        plusMinus = findViewById(R.id.id_btn_plusMinus)
        root = findViewById(R.id.id_btn_root)
        one = findViewById(R.id.id_btn_one)
        two = findViewById(R.id.id_btn_two)
        three = findViewById(R.id.id_btn_three)
        four = findViewById(R.id.id_btn_four)
        five = findViewById(R.id.id_btn_five)
        six = findViewById(R.id.id_btn_six)
        seven = findViewById(R.id.id_btn_seven)
        eight = findViewById(R.id.id_btn_eight)
        nine = findViewById(R.id.id_btn_nine)
        zero = findViewById(R.id.id_btn_zero)
        percent = findViewById(R.id.id_btn_percentage)
        star = findViewById(R.id.id_btn_star)
        slash = findViewById(R.id.id_btn_slash)
        equalTo = findViewById(R.id.id_btn_equalTo)
        plus = findViewById(R.id.id_btn_plus)
        minus = findViewById(R.id.id_btn_minus)


        showAlertDialog()

        mc?.setOnClickListener {
            showToast("Memory Clear")
        }
        mr?.setOnClickListener {
            showToast("Memory Recall")
        }
        mPlus?.setOnClickListener {
            showToast("Result Stored in Memory ")
        }
        mMinus?.setOnClickListener {
            showToast("Result Removed from Memory")
        }

        leftArr?.setOnClickListener {

            try {

                tempValue = input_num?.text.toString()
                val nums = tempValue.toMutableList()
                val element = nums.indexOf(nums.last())
                nums.removeAt(element)
                buffer.replace(0,buffer.length,"")
                for (x in nums.indices){
                    tempValue = ""+nums.elementAt(x)
                    Log.e("AXE","$tempValue")
                    buffer.append("${nums.elementAt(x)}")
                }
                tempValue = buffer.toString()
                input_num?.text = tempValue
            }catch (ex : Exception){}
        }
    }


    fun mathOperation(view : View){

        when(view.id){

            R.id.id_btn_c -> {
                input_num?.text = ""
                tempValue = ""
                ansText?.text = ""
            }
            R.id.id_btn_plusMinus -> {
                try{
                    tempValue = input_num?.text.toString()
                    val value = tempValue.toInt()
                    if(value > 0){
                        input_num?.text = "-$tempValue"
                    }else{
                        tempValue = input_num?.text.toString()
                        val samVal = tempValue.toInt()

                        input_num?.text = "${abs(samVal)}"
                    }
                }catch (ex : Exception){
                    Toast.makeText(this,"Please Enter Value First",Toast.LENGTH_LONG).show()
                }
            }
            R.id.id_btn_root -> {
                try{
                    tempValue = input_num?.text.toString()
                    val root = tempValue.toInt()
                    input_num?.text = "${sqrt(root.toFloat())}"

                }catch (ex : Exception){
                    Toast.makeText(this,"Please Enter Value First",Toast.LENGTH_LONG).show()
                }
            }
            R.id.id_btn_percentage -> {
                tempValue = input_num?.text.toString()
                ansText?.text = tempValue
                input_num?.text = ""
                tempValue = ""
                tempId = R.id.id_btn_percentage
            }
            R.id.id_btn_star -> {
                tempValue = ""
                tempValue = input_num?.text.toString()
                ansText?.text = tempValue
                tempValue = ""
                input_num?.text = ""
                tempId = R.id.id_btn_star

            }
            R.id.id_btn_slash -> {
                tempValue = ""
                tempValue = input_num?.text.toString()
                ansText?.text = tempValue
                tempValue = ""
                input_num?.text = ""
                tempId = R.id.id_btn_slash

            }


            R.id.id_btn_plus -> {
                tempValue = ""
                tempValue = input_num?.text.toString()
                ansText?.text = tempValue
                tempValue = ""
                input_num?.text = ""
                tempId = R.id.id_btn_plus
            }

            R.id.id_btn_minus -> {
                tempValue = ""
                tempValue = input_num?.text.toString()
                ansText?.text = tempValue
                tempValue = ""
                input_num?.text = ""
                tempId = R.id.id_btn_minus


            }


            R.id.id_btn_one -> {
                setThisValue("1".trim())
            }
            R.id.id_btn_two -> {
                setThisValue("2".trim())
            }
            R.id.id_btn_three -> {
                setThisValue("3".trim())
            }
            R.id.id_btn_four -> {
                setThisValue("4".trim())
            }
            R.id.id_btn_five -> {
                setThisValue("5".trim())
            }
            R.id.id_btn_six -> {
                setThisValue("6".trim())
            }
            R.id.id_btn_seven -> {
                setThisValue("7".trim())
            }
            R.id.id_btn_eight -> {
                setThisValue("8".trim())
            }
            R.id.id_btn_nine -> {
                setThisValue("9".trim())
            }
            R.id.id_btn_zero ->{
                setThisValue("0".trim())
            }

        }
    }

    fun operationInEqual(view : View){
        when(view.id) {

            R.id.id_btn_equalTo ->{

                try{
                    if(tempId == R.id.id_btn_percentage){
                        tempValue = ""
                        tempValue = input_num?.text.toString()
                        input_num?.text = ""
                        savedValue = ansText?.text.toString().toInt()
                        val perc : Double = ((tempValue.toDouble()/100)*savedValue.toDouble())     //((tempValue.toInt() * 100) / savedValue).toDouble()
                        ansText ?. text = "$perc"
                    }
                    if (tempId == R.id.id_btn_star){
                        tempValue = ""
                        tempValue = input_num?.text.toString()
                        savedValue = ansText?.text.toString().toInt()
                        val mult = savedValue.times(tempValue.toInt())
                        ansText?.text = mult.toString()
                    }
                    if(tempId == R.id.id_btn_slash){
                        tempValue = ""
                        tempValue = input_num?.text.toString()
                        input_num?.text = ""
                        savedValue = ansText?.text.toString().toInt()

                        val div = savedValue.toDouble() / tempValue.toDouble()
                        ansText?.text = div.toString()

                    }
                    if(tempId == R.id.id_btn_plus){
                        tempValue = ""
                        tempValue = input_num?.text.toString()
                        savedValue = ansText?.text.toString().toInt()
                        input_num?.text = ""
                        val summation = tempValue.toInt() + savedValue
                        Log.e("AXE","$tempValue + $savedValue = $summation ")
                        ansText?.text = summation.toString()

                    }
                    if(tempId == R.id.id_btn_minus){
                        tempValue = ""
                        tempValue = input_num?.text.toString()
                        input_num?.text = ""
                        savedValue = ansText?.text.toString().toInt()
                        val sub =  savedValue - tempValue.toInt()
                        ansText?.text = sub.toString()
                    }
                }catch (ex : Exception){

                }
            }

        }
    }

    private fun showAlertDialog(){

        val builder = AlertDialog.Builder(this)
        builder.setTitle("Guideline...")
        builder.setMessage("Ex . Type \'25\' then \'+\' then \'25\' then \'=\' \n You will get answer ")
        builder.setPositiveButton("Ok, I Understand"){ d,_ ->
            d.dismiss()
        }
        builder.show()

    }

    private fun setThisValue(num : String){
        tempValue = "$tempValue"+num
        input_num?.text = tempValue
    }
    private fun showToast(msg : String){
        Toast.makeText(this,msg,Toast.LENGTH_LONG).show()
    }



}

