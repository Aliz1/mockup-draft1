package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.RadioButton
import java.lang.reflect.Type
import java.security.acl.Group

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonClick = findViewById<ImageButton>(R.id.imageButton4)
        buttonClick.setOnClickListener {
            val intent = Intent(this, NewActivity::class.java)
            startActivity(intent)
        }
        val radioButtonClick = findViewById<RadioButton>(R.id.Sit)
        radioButtonClick.setOnClickListener{
            val group = findViewById<View>(R.id.group)
            val group2 = findViewById<View>(R.id.group2)
            group.visibility = View.INVISIBLE;
            group2.visibility = View.VISIBLE;

        }

        val radioButtonClickChange = findViewById<RadioButton>(R.id.stigAv)
        radioButtonClickChange.setOnClickListener{
            val group = findViewById<View>(R.id.group)
            val group2 = findViewById<View>(R.id.group2)
            group.visibility = View.VISIBLE;
            group2.visibility = View.INVISIBLE;

        }
    }
}