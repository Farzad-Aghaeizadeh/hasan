package ir.fardev.hasan.ui.fragments

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.addCallback
import androidx.fragment.app.Fragment

open class BaseFragment : Fragment() {
    open val TAG = "MyCustomLogs " + this::class.java.simpleName
    open val BASE_TAG = "MyCustomLogs " + BaseFragment::class.java.simpleName
    val parentActivity by lazy { requireActivity() }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i(BASE_TAG, "onCreate: before super class")
        super.onCreate(savedInstanceState)
        Log.i(BASE_TAG, "onCreate: after super class")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i(BASE_TAG, "onViewCreated: ")

        parentActivity.onBackPressedDispatcher.addCallback(viewLifecycleOwner) {
            Log.i(BASE_TAG, "onViewCreated: onBackPressedDispatcher")
            parentActivity.supportFragmentManager.popBackStack()
            parentActivity.supportFragmentManager.addOnBackStackChangedListener {
                Log.i(BASE_TAG, "onViewCreated: onBackPressedDispatcher => onBackStackChanged ${parentActivity.supportFragmentManager.backStackEntryCount }")
                if (parentActivity.supportFragmentManager.backStackEntryCount == 0) {
                    Log.i(BASE_TAG, "onViewCreated: onBackPressedDispatcher => onBackStackChanged => zero")
//                    parentActivity.finish()
                }
            }
        }
    }
}


