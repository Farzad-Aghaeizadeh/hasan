package ir.fardev.hasan.ui.activity

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {
    protected val TAG :String get() = "MyCustomLogs " + this::class.java.simpleName
    val BASE_TAG = "MyCustomLogs " +BaseActivity::class.java.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i(BASE_TAG, "onCreate: before super class ")
        super.onCreate(savedInstanceState)
        Log.i(BASE_TAG, "onCreate: after super class")
    }
}