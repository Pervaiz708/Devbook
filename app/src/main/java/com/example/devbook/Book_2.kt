package com.example.devbook

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.github.barteksc.pdfviewer.PDFView


class Book_2 : AppCompatActivity() {
    var book2: PDFView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_2)
        book2 = findViewById<View>(R.id.Book2) as PDFView
        book2!!.fromAsset("Android_Application_Development_For_Dummies.pdf").load()
    }
}