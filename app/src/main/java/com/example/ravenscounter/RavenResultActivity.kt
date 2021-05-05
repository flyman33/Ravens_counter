package com.example.ravenscounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class RavenResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_raven_result)

        val result = intent.getIntExtra("ravenCount", 0)
        val showResult: TextView = findViewById(R.id.show_result)

        showResult.setText("Congratulations!!! You have $result ravens!!!")
    }
}