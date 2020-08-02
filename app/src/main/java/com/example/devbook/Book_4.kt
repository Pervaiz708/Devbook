package com.example.devbook

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.github.barteksc.pdfviewer.PDFView


class Book_4 : AppCompatActivity() {
    var book4: PDFView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_4)
        book4 = findViewById<View>(R.id.Book4) as PDFView
        book4!!.fromAsset("Head-First-Java-2nd-edition.pdf").load()
    }
}