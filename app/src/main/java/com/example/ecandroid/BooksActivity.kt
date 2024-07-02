package com.example.ecandroid

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class BooksActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var bookAdapter: BookAdapter
    private lateinit var bookList: List<Book>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_books)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        bookList = listOf(
            Book("Principles of Anatomy and Physiology", "An introductory textbook on anatomy and physiology.", "01/01/2019"),
            Book("Pathophysiology of Heart Disease", "A collaborative project of medical students and cardiologists.", "15/03/2018"),
            Book("Clinical Neuroanatomy", "An introduction to clinical neuroanatomy.", "22/05/2020"),
            Book("Robbins Basic Pathology", "Comprehensive review of pathology.", "13/09/2021"),
            Book("Harrison's Principles of Internal Medicine", "Comprehensive book on internal medicine.", "04/07/2017"),
            Book("The Washington Manual of Medical Therapeutics", "A manual for therapeutic approaches.", "08/11/2016"),
            Book("Textbook of Medical Physiology", "An extensive review of medical physiology.", "18/12/2019"),
            Book("Essentials of Clinical Infectious Diseases", "A review of infectious diseases and treatments.", "23/08/2020"),
            Book("Medical Microbiology", "Introduction to microbiology and its medical relevance.", "11/10/2018"),
            Book("Atlas of Human Anatomy", "Detailed human anatomy atlas.", "06/01/2017"),
            //Book("Guyton and Hall Textbook of Medical Physiology", "An authoritative book on physiology.", "25/04/2021"),
            //Book("Fundamentals of Pathology", "A medical school resource for pathology.", "02/03/2020"),
            //Book("Textbook of Family Medicine", "Comprehensive guide to family medicine.", "19/06/2019"),
            //Book("Pocket Medicine", "Concise clinical companion for medical practice.", "31/07/2018"),
            //Book("First Aid for the USMLE Step 1", "Study guide for USMLE Step 1.", "14/02/2021"),
            //Book("Basic and Clinical Pharmacology", "Introduction to pharmacology.", "30/09/2017"),
            //Book("Principles of Medical Biochemistry", "Review of medical biochemistry.", "05/05/2018"),
            //Book("Bates' Guide to Physical Examination and History Taking", "Guide to physical examination and history taking.", "20/12/2016")
        )

        bookAdapter = BookAdapter(bookList)
        recyclerView.adapter = bookAdapter
    }
}
