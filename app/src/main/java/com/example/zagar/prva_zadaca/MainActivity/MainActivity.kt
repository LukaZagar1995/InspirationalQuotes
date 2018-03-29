package com.example.zagar.prva_zadaca.MainActivity

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.zagar.prva_zadaca.Classes.InspiringPerson
import com.example.zagar.prva_zadaca.PersonConstants.SteveJobsConstants.*
import com.example.zagar.prva_zadaca.PersonConstants.AlanTouringConstants.*
import com.example.zagar.prva_zadaca.PersonConstants.BillGatesConstants.*


import com.example.zagar.prva_zadaca.R
import kotlinx.android.synthetic.main.activity_main.*
import android.text.method.ScrollingMovementMethod
import android.widget.Toast
import java.util.*


class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "Zadaca1"

        val steveJobs = InspiringPerson(STEVE_JOBS_FULL_NAME, STEVE_JOBS_BIRTH_DATE, STEVE_JOBS_DEATH_DATE, STEVE_JOBS_BIOGRAPHY)
        val billGates = InspiringPerson(BILL_GATES_FULL_NAME, BILL_GATES_BIRTH_DATE, BILL_GATES_DEATH_DATE, BILL_GATES_BIOGRAPHY)
        val alanTuring = InspiringPerson(ALAN_TOURING_FULL_NAME, ALAN_TOURING_BIRTH_DATE, ALAN_TOURING_DEATH_DATE, ALAN_TOURING_BIOGRAPHY)

        tvSteveJobs.text = steveJobs.fullName+"\n"+steveJobs.dateOfBirth +"-"+steveJobs.dateOfDeath+"\n"+steveJobs.biography
        tvBillGates.text = billGates.fullName+"\n"+billGates.dateOfBirth +"-"+billGates.dateOfDeath+"\n"+billGates.biography
        tvAlanTuring.text = alanTuring.fullName+"\n"+alanTuring.dateOfBirth +"-"+alanTuring.dateOfDeath+"\n"+alanTuring.biography

        tvSteveJobs.movementMethod = ScrollingMovementMethod()
        tvBillGates.movementMethod = ScrollingMovementMethod()
        tvAlanTuring.movementMethod = ScrollingMovementMethod()

        ivSteveJobs.setOnClickListener {

            val rand = Random()
            val n = rand.nextInt(5) + 1
            when (n)
            {
                1 -> Toast.makeText(this, STEVE_JOBS_QUOTE_1, Toast.LENGTH_LONG).show()
                2 -> Toast.makeText(this, STEVE_JOBS_QUOTE_2, Toast.LENGTH_LONG).show()
                3 -> Toast.makeText(this, STEVE_JOBS_QUOTE_3, Toast.LENGTH_LONG).show()
                4 -> Toast.makeText(this, STEVE_JOBS_QUOTE_4, Toast.LENGTH_LONG).show()
                5 -> Toast.makeText(this, STEVE_JOBS_QUOTE_5, Toast.LENGTH_LONG).show()
            }

        }

        ivBillGates.setOnClickListener {

            val rand = Random()
            val n = rand.nextInt(5) + 1
            when (n)
            {
                1 -> Toast.makeText(this, BILL_GATES_QUOTE_1, Toast.LENGTH_LONG).show()
                2 -> Toast.makeText(this, BILL_GATES_QUOTE_2, Toast.LENGTH_LONG).show()
                3 -> Toast.makeText(this, BILL_GATES_QUOTE_3, Toast.LENGTH_LONG).show()
                4 -> Toast.makeText(this, BILL_GATES_QUOTE_4, Toast.LENGTH_LONG).show()
                5 -> Toast.makeText(this, BILL_GATES_QUOTE_5, Toast.LENGTH_LONG).show()
            }

        }

        ivAlanTuring.setOnClickListener {

            val rand = Random()
            val n = rand.nextInt(5) + 1
            when (n)
            {
                1 -> Toast.makeText(this, ALAN_TOURING_QUOTE_1, Toast.LENGTH_LONG).show()
                2 -> Toast.makeText(this, ALAN_TOURING_QUOTE_2, Toast.LENGTH_LONG).show()
                3 -> Toast.makeText(this, ALAN_TOURING_QUOTE_3, Toast.LENGTH_LONG).show()
                4 -> Toast.makeText(this, ALAN_TOURING_QUOTE_4, Toast.LENGTH_LONG).show()
                5 -> Toast.makeText(this, ALAN_TOURING_QUOTE_5, Toast.LENGTH_LONG).show()
            }

        }

    }
}
