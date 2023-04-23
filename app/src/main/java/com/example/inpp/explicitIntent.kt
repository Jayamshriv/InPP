package com.example.inpp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_explicit_intent.*
import kotlinx.android.synthetic.main.activity_main.*

class explicitIntent : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explicit_intent)

        val nameExp = intent.getStringExtra(KEY_1)
        val intExp = intent.getIntExtra(KEY_ID,0)

        tV2.text = "$nameExp \n $intExp"


    }
}



