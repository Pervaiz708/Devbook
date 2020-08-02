package com.example.devbook

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.github.barteksc.pdfviewer.PDFView


class Book_7 : AppCompatActivity() {
    var book7: PDFView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_7)
        book7 = findViewById<View>(R.id.Book7) as PDFView
        book7!!.fromAsset("Algorithms, 4th edition - Robert Sedgewick and Kevin Wayne.pdf").load()
    }
}