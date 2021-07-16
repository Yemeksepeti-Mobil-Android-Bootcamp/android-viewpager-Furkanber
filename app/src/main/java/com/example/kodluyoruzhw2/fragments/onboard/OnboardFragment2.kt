package com.example.kodluyoruzhw2.fragments.onboard

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.kodluyoruzhw2.R
import com.example.kodluyoruzhw2.base.BaseFragment

class OnboardFragment2 : BaseFragment() {

    lateinit var buttonOnboard2: Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_onboard2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //initViews(view)
    }

    /*private fun initViews(view: View) {
        buttonOnboard2 = view.findViewById(R.id.button_Onboard2)
        buttonOnboard2.setOnClickListener {
            Handler(Looper.getMainLooper()).postDelayed({
                findNavController().navigate(R.id.action_onboardFragment2_to_onboardFragment3)
            }, 50)
        }
    }*/
}