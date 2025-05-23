package com.mendhie.movemate.presentation.fragments

import android.animation.ValueAnimator
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.mendhie.movemate.databinding.FragmentCalculatorBinding


/**
 * Fragment that displays an animated count-up of an amount and a home button.
 *
 * Handles navigation back and animates the amount value on view creation.
 */
class CalculatorFragment : Fragment() {
    private lateinit var binding: FragmentCalculatorBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentCalculatorBinding.inflate(inflater)

        binding.btnHome.setOnClickListener {
            findNavController().navigateUp()
        }
        startCountAnimation()
        return binding.root
    }

    /**
     * Animates the displayed amount from 1000 to 1460 USD over 2 seconds.
     */

    private fun startCountAnimation() {
        val animator = ValueAnimator.ofInt(1000, 1460) //0 is min number, 600 is max number
        animator.setDuration(2000) //Duration is in milliseconds
        animator.addUpdateListener { animation -> binding.txtAmount.text = buildString {
            append(animation.animatedValue)
            append(" USD")
        } }
        animator.start()
    }

}