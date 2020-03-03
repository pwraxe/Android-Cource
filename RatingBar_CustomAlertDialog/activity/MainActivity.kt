package com.example.mdialogs

import android.app.Dialog
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.mdialogs.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity(){

    var binding : ActivityMainBinding? = null
    private var feedback : String = "Thanks for Giving us 3 Stars"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding?.idCustomDialog?.setOnClickListener {

            var rate = 0

            val dialog = Dialog(this)
            val view = layoutInflater.inflate(R.layout.my_dialog,null)
            dialog.setContentView(view)

            val emojiIcon = view.findViewById<TextView>(R.id.id_emojiIcon)
            emojiIcon?.text = getEmojiIcon(0x1F642)

            val ratingBar = view.findViewById<RatingBar>(R.id.id_ratingBar)
            val cancel = view.findViewById<TextView>(R.id.id_cancelText)
            val rateUs = view.findViewById<TextView>(R.id.id_rateUsText)
            val ratingName = view.findViewById<TextView>(R.id.id_ratingName)

            ratingBar?.setOnRatingBarChangeListener { _, rating, _ ->
                
                when(rating.toInt()){
                    1 -> {
                        emojiIcon?.text = getEmojiIcon(0x1F614)
                        ratingName?.text = "Very Poor"
                        feedback = "Thanks for Feedback , we will work very hard to make it better"
                        rate = rating.toInt()

                    }
                    2 -> {
                        emojiIcon?.text = getEmojiIcon(0x1F641)
                        ratingName?.text = "Poor"
                        feedback = "Thanks for Feedback , we will work hard to make it better"
                        rate = rating.toInt()
                    }
                    3 -> {
                        emojiIcon?.text = getEmojiIcon(0x1F642)
                        ratingName?.text = "Good"
                        feedback = "Thanks for Giving us 3 Stars "
                        rate = rating.toInt()
                    }
                    4 -> {
                        emojiIcon?.text = getEmojiIcon(0x1F60A)
                        ratingName?.text = "Very Good"
                        feedback = "Thanks for Giving us 4 Stars "
                        rate = rating.toInt()
                    }
                    5 -> {
                        emojiIcon?.text = getEmojiIcon(0x1F600)
                        ratingName?.text = "Excellent"
                        feedback ="Thanks for Give us 5 Stars "
                        rate = rating.toInt()
                    }
                }
            }
            cancel?.setOnClickListener {
                Toast.makeText(this,"We will back",Toast.LENGTH_LONG).show()
                dialog.dismiss()
            }
            rateUs?.setOnClickListener {
                if(rate == 0){
                    rate = 3
                    Toast.makeText(this,feedback,Toast.LENGTH_LONG).show()
                }else{
                    Toast.makeText(this,feedback,Toast.LENGTH_LONG).show()
                }
                dialog.dismiss()
            }
            dialog.show()
        }
    }

    private fun getEmojiIcon(emojiCode : Int): String {
        return String(Character.toChars(emojiCode))
    }
}