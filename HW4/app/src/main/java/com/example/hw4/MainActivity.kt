package com.example.hw4

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn1 = findViewById<Button>(R.id.btnScissors)
        val btnScissors = findViewById<Button>(R.id.btnScissors)
        val btnRock = findViewById<Button>(R.id.btnRock)
        val btnPaper = findViewById<Button>(R.id.btnPaper)
        if(Build.VERSION.SDK_INT >=21)
            btn1.setBackgroundColor(R.drawable.btn_bg_ripple)
        else
            btn1.setBackgroundColor(R.drawable.btn_bg_selector)
    }
    fun getChoiceString(choice:Choice):Int
    {
        return when (choice)
        {
            Choice.Scissors =
        }
    }
    btnRock.setOnClickListener {
        val iComPlay = Random().nextInt(3)+1
        when(iComPlay){
            1->
            {
                txtCom
            }
        }

    }
}