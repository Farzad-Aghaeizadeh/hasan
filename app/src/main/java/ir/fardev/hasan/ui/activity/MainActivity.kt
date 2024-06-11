package ir.fardev.hasan.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import ir.fardev.hasan.R
import ir.fardev.hasan.ui.fragments.FragmentA
import ir.fardev.hasan.ui.fragments.FragmentB

class MainActivity() : BaseActivity() {
    init {
        Log.i(TAG, ": init")
    }
    val fragmentA by lazy { FragmentA() }
    private var fragmentB : FragmentB = FragmentB()

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i(TAG, "onCreate: ")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showFragment(fragmentA)
        showFragment(fragmentB)
//        showFragment(fragmentA)

    }

    fun showFragment(fragment :Fragment)
    {
        Log.i(TAG, "showFragment: ")
        Log.i(TAG, "showFragment: => back stack count => ${supportFragmentManager.backStackEntryCount}")

        supportFragmentManager.beginTransaction().add(R.id.fragmentContainer,fragment).addToBackStack(fragment::class.java.simpleName).commit()
        supportFragmentManager.executePendingTransactions()
        for (i in 0 until supportFragmentManager.backStackEntryCount) {
            val backStackEntry = supportFragmentManager.getBackStackEntryAt(i)
            val fragmentName = backStackEntry.name // Name of the fragment
            Log.i(TAG, "showFragment: backstack => $fragmentName")
            // You can also get other information like the fragment's tag, id, etc.
        }
    }
}