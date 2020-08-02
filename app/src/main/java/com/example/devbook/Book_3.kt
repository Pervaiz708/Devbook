package com.example.devbook

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.github.barteksc.pdfviewer.PDFView


class Book_3 : AppCompatActivity() {
    var book3: PDFView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_3)
        book3 = findViewById<View>(R.id.Book3) as PDFView
        book3!!.fromAsset("Data Structures & Algorithms in Java - Robert Lafore.pdf").load()
    }
}