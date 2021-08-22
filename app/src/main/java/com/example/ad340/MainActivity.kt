package com.example.ad340

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var zipcodeEditText : EditText = findViewById(R.id.zipcode_edit_text)
        val submitButton : Button = findViewById(R.id.submit_button)
        submitButton.setOnClickListener {
            var zipcode = zipcodeEditText.text.toString()
            if (zipcode.length !=5) {
                Toast.makeText(this, "eror",Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, zipcode, Toast.LENGTH_SHORT).show()
            }
        }


    }




}