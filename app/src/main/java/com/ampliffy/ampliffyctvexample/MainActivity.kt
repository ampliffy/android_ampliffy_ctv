package com.ampliffy.ampliffyctvexample

import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity

// Importing AmpliffyCTVPlayer Library
import com.ampliffy.ampliffyctv.AmpliffyCTVPlayer

class MainActivity : ComponentActivity() {

    private lateinit var btn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        btn = findViewById(R.id.buttonView)
        btn.setOnClickListener {
            AmpliffyCTVPlayer().blink(btn)
        }
    }
}

