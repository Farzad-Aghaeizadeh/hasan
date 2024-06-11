package ir.fardev.hasan.ui.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import ir.fardev.hasan.R

class PrimaryActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_primary)
        Log.i(TAG, "onCreate: ")
        startActivity(Intent(this,MainActivity::class.java))

    }
}