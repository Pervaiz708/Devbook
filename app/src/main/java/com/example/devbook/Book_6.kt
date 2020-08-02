package com.example.devbook

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.github.barteksc.pdfviewer.PDFView


class Book_6 : AppCompatActivity() {
    var book6: PDFView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_6)
        book6 = findViewById<View>(R.id.Book6) as PDFView
        book6!!.fromAsset("competitive programming handbook.pdf").load()
    }
}