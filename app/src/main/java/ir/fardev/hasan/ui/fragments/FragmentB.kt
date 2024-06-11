package ir.fardev.hasan.ui.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ir.fardev.hasan.R

class FragmentB : BaseFragment() {
    init {
        Log.i(TAG, "init: ")
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i(TAG, "onCreate: before super class")
        super.onCreate(savedInstanceState)
        Log.i(TAG, "onCreate: after super class")
        arguments?.let {
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_b, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            FragmentB().apply {
                arguments = Bundle().apply {
                }
            }
    }
}