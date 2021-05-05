package com.example.ravenscounter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var ravenCount = 0
    lateinit var showCount: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun increaseRaven(view: View) {
        ravenCount++

        showCount = findViewById(R.id.text_show)
        showCount.setText(ravenCount.toString())

        if(ravenCount % 10 == 0) {
            val toast = Toast.makeText(this, "Wow! You have $ravenCount ravens! Go on!", Toast.LENGTH_SHORT)
            toast.show()
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("ravenCount", ravenCount)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        ravenCount = savedInstanceState.getInt("ravenCount")
        showCount = findViewById(R.id.text_show)
        showCount.setText(ravenCount.toString())
    }

    fun showResult(view: View) {
        val intent = Intent(this, RavenResultActivity::class.java)
        intent.putExtra("ravenCount", ravenCount)
        startActivity(intent)

    }
}