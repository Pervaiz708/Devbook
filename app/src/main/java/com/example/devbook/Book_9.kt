package com.example.devbook

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.github.barteksc.pdfviewer.PDFView


class Book_9 : AppCompatActivity() {
    var book9: PDFView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_9)
        book9 = findViewById<View>(R.id.Book9) as PDFView
        book9!!.fromAsset("Inside JVM by Bill Venners.pdf").load()
    }
}