package com.example.real_calc

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            enableEdgeToEdge()
            setContentView(R.layout.activity_main)
            val textView: TextView = findViewById(R.id.textView)
            findViewById<Button>(R.id.button).setOnClickListener {
                displayTextOnButtonClick_plus(it)
            }
            findViewById<Button>(R.id.button2).setOnClickListener {
                displayTextOnButtonClick_minus(it)
            }
            findViewById<Button>(R.id.button3).setOnClickListener {
                displayTextOnButtonClick_pow(it)
            }
            findViewById<Button>(R.id.button4).setOnClickListener {
                displayTextOnButtonClick_div(it)
            }
            ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
                val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
                insets
            }
        }
        private fun displayTextOnButtonClick_plus(view: View) {
                 val text = findViewById<TextView>(R.id.textView)
                 val d1 = findViewById<EditText>(R.id.editTextNumber).text.toString().toInt()
                 val d2 = findViewById<EditText>(R.id.editTextNumber2).text.toString().toInt()
                (d1 + d2).toString().also { text.text = it }
         }
        private fun displayTextOnButtonClick_minus(view: View) {
                 val text = findViewById<TextView>(R.id.textView)
                 val d1 = findViewById<EditText>(R.id.editTextNumber).text.toString().toInt()
                 val d2 = findViewById<EditText>(R.id.editTextNumber2).text.toString().toInt()
                 text.text = (d1 - d2).toString()
        }
        private fun displayTextOnButtonClick_pow(view: View) {
            val text = findViewById<TextView>(R.id.textView)
            val d1 = findViewById<EditText>(R.id.editTextNumber).text.toString().toInt()
            val d2 = findViewById<EditText>(R.id.editTextNumber2).text.toString().toInt()
            text.text = (d1 * d2).toString()
        }
        private fun displayTextOnButtonClick_div(view: View) {
            val text = findViewById<TextView>(R.id.textView)
            val d1 = findViewById<EditText>(R.id.editTextNumber).text.toString().toDouble()
            val d2 = findViewById<EditText>(R.id.editTextNumber2).text.toString().toDouble()
            text.text = (d1 / d2).toString()
        }
}