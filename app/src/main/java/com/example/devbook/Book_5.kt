package com.example.devbook

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.github.barteksc.pdfviewer.PDFView


class Book_5 : AppCompatActivity() {
    var book5: PDFView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_5)
        book5 = findViewById<View>(R.id.Book5) as PDFView
        book5!!.fromAsset("Java All-in-One For Dummies (4th Edition) - Doug Lowe.pdf").load()
    }
}