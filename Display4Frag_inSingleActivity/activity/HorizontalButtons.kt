package com.example.task19


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.task19.databinding.FragmentHorizontalButtonsBinding


class HorizontalButtons : Fragment() {

    private var binding : FragmentHorizontalButtonsBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        binding = DataBindingUtil.inflate(layoutInflater,R.layout.fragment_horizontal_buttons,
            null,false)




        return binding?.root
    }
}
