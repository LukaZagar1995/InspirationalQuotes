package com.example.zagar.prva_zadaca.MainActivity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.zagar.prva_zadaca.Classes.InspiringPerson
import com.example.zagar.prva_zadaca.PersonConstants.SteveJobsConstants.*
import com.example.zagar.prva_zadaca.PersonConstants.AlanTouringConstants.*
import com.example.zagar.prva_zadaca.PersonConstants.BillGatesConstants.*


import com.example.zagar.prva_zadaca.R


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val steveJobs = InspiringPerson(STEVE_JOBS_FULL_NAME, STEVE_JOBS_BIRTH_DATE, STEVE_JOBS_DEATH_DATE, STEVE_JOBS_BIOGRAPHY)
        val billGates = InspiringPerson(BILL_GATES_FULL_NAME, BILL_GATES_BIRTH_DATE, BILL_GATES_DEATH_DATE, BILL_GATES_BIOGRAPHY)
        val alanTuring = InspiringPerson(ALAN_TOURING_FULL_NAME, ALAN_TOURING_BIRTH_DATE, ALAN_TOURING_DEATH_DATE, ALAN_TOURING_BIOGRAPHY)

    }
}
