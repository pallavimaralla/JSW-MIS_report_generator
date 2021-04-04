package com.example.jsw_mis_report_generator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Report : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_report)

        supportActionBar?.hide()
    }


    public override fun onStart() {
        super.onStart()
        supportFragmentManager.beginTransaction().replace(
            R.id.fragment_container,ReportFragment.newInstance()
        ).commit()
    }
}