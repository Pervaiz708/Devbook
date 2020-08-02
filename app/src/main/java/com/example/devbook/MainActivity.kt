package com.example.devbook

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.github.barteksc.pdfviewer.PDFView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bt1 = findViewById<Button>(R.id.bt_book1)
        val bt2 = findViewById<Button>(R.id.bt_book2)
        val bt3 = findViewById<Button>(R.id.bt_book3)
        val bt4 = findViewById<Button>(R.id.bt_book4)
        val bt5 = findViewById<Button>(R.id.bt_book5)
        val bt6 = findViewById<Button>(R.id.bt_book6)
        val bt7 = findViewById<Button>(R.id.bt_book7)
        val bt8 = findViewById<Button>(R.id.bt_book8)
        val bt9 = findViewById<Button>(R.id.bt_book9)

        bt1.setOnClickListener {
//            val i1 = Intent(this@MainActivity, Book_1::class.java)
//            startActivity(i1)
            setContentView(R.layout.activity_book_1)
            val book1 = findViewById<PDFView>(R.id.Book1)
            book1.fromAsset("Head-First-Android-Development-2015.pdf").load()

        }
        bt2.setOnClickListener {
            val i2 = Intent(this@MainActivity, Book_2::class.java)
            startActivity(i2)
        }
        bt3.setOnClickListener {
            val i3 = Intent(this@MainActivity, Book_3::class.java)
            startActivity(i3)
        }
        bt4.setOnClickListener {
            val i4 = Intent(this@MainActivity, Book_4::class.java)
            startActivity(i4)
        }
        bt5.setOnClickListener {
            val i5 = Intent(this@MainActivity, Book_5::class.java)
            startActivity(i5)
        }
        bt6.setOnClickListener {
            val i6 = Intent(this@MainActivity, Book_6::class.java)
            startActivity(i6)
        }
        bt7.setOnClickListener {
            val i7 = Intent(this@MainActivity, Book_7::class.java)
            startActivity(i7)
        }
        bt8.setOnClickListener {
            val i8 = Intent(this@MainActivity, Book_8::class.java)
            startActivity(i8)
        }
        bt9.setOnClickListener {
            val i9 = Intent(this@MainActivity, Book_9::class.java)
            startActivity(i9)
        }
    }
}