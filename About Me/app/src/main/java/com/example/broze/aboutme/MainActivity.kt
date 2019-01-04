package com.example.broze.aboutme

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputBinding
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.done_button).setOnClickListener {
            addNickname(it)
        }
        val przycisk: Button = findViewById(R.id.ron_button)
        przycisk.setOnClickListener {
            change()
        }
    }
    private fun addNickname (view: View){
        val editText = findViewById<EditText>(R.id.nickname_Edit)
        val nicknameTextView = findViewById<TextView>(R.id.nickname_text)

        nicknameTextView.text = editText.text
        editText.visibility = View.GONE
        view.visibility = View.GONE
        nicknameTextView.visibility = View.VISIBLE
        //Hide the keyboard
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)


    }
    private fun change (){
        val obraz: ImageView = findViewById(R.id.star_image)
        obraz.setImageResource(R.drawable.smallron)
    }
}
