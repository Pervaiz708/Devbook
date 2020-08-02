package com.example.devbook

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.github.barteksc.pdfviewer.PDFView


class Book_8 : AppCompatActivity() {
    var book8: PDFView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_8)
        book8 = findViewById<View>(R.id.Book8) as PDFView
        book8!!.fromAsset("Java errors.pdf").load()
    }
}