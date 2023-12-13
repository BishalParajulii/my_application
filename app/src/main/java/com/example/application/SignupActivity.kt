package com.example.application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Switch
import com.google.firebase.database.core.view.View

class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        val userTypeSwitch: Switch = findViewById(R.id.userTypeSwitch)
        val futsalName: EditText = findViewById(R.id.futsalName)
        val futsalAddress: EditText = findViewById(R.id.futsalAddress)

        userTypeSwitch.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                // Owner side is selected
                futsalName.visibility = android.view.View.VISIBLE
                futsalAddress.visibility = android.view.View.VISIBLE
            } else {
                // Player side is selected
                futsalName.visibility = android.view.View.INVISIBLE
                futsalAddress.visibility = android.view.View.INVISIBLE
            }
        }


    }

    }
