package com.example.broze.test

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.button).setOnClickListener {


            BookLog()

            val sharedPref = this.getSharedPreferences("com.example.broze.test", Context.MODE_PRIVATE)
           // sharedPref.edit().putString("StoreBookLog", book_log.text.toString()).apply()
            val storedbooklog = sharedPref.getString("StoreBookLog", "")
            oldLog.text = storedbooklog



        }
        findViewById<Button>(R.id.button2).setOnClickListener {
            change_act()
        }
    }

    private fun BookLog() {
        val title = findViewById<TextView>(R.id.book_title).text
        val author = findViewById<TextView>(R.id.book_author).text
        val pages = findViewById<TextView>(R.id.pages_read).text.toString()
        val pagesInt = pages.toLongOrNull()
        val book = BookLog(
            title = title.toString(),
            author = author.toString(),
            pages = pagesInt
        )

        if (book.pages == null) {
            book_log.text = "Book: " + book.title + " Author: " + book.author.toString() + " No pages read."
        } else {
            book_log.text = "Book: " + book.title + " Author: " + book.author.toString() + " Pages read: " +
                    book.pages.toString()
        }

    }
    fun change_act () {
        val inent = Intent (applicationContext,Main2Activity::class.java)
        inent.putExtra("book_log_history", book_log.text)
        startActivity(inent)

    }

}


private operator fun BookLog.get(title: CharSequence?) {

}
