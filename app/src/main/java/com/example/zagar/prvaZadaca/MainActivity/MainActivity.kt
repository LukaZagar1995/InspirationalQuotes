package com.example.zagar.prvaZadaca.MainActivity

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.zagar.prvaZadaca.Classes.InspiringPerson
import com.example.zagar.prvaZadaca.PersonConstants.SteveJobsConstants.*
import com.example.zagar.prvaZadaca.PersonConstants.AlanTouringConstants.*
import com.example.zagar.prvaZadaca.PersonConstants.BillGatesConstants.*


import com.example.zagar.prvaZadaca.R
import kotlinx.android.synthetic.main.activity_main.*
import android.text.method.ScrollingMovementMethod
import android.widget.Toast
import java.util.*
import android.view.View.OnTouchListener






class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Mijenja se naslov aplikacije
        title = "Zadaca1"

        //Stvaranje objekata klase InspiringPerson
        //val je nepromjenjiva vrijednost
        val steveJobs = InspiringPerson(STEVE_JOBS_FULL_NAME, STEVE_JOBS_BIRTH_DATE, STEVE_JOBS_DEATH_DATE, STEVE_JOBS_BIOGRAPHY)
        val billGates = InspiringPerson(BILL_GATES_FULL_NAME, BILL_GATES_BIRTH_DATE, BILL_GATES_DEATH_DATE, BILL_GATES_BIOGRAPHY)
        val alanTuring = InspiringPerson(ALAN_TOURING_FULL_NAME, ALAN_TOURING_BIRTH_DATE, ALAN_TOURING_DEATH_DATE, ALAN_TOURING_BIOGRAPHY)

        //Svakom TextView-u se dodaje tekst koji mu pripada
        tvSteveJobs.text = steveJobs.fullName+"\n"+steveJobs.dateOfBirth +"-"+steveJobs.dateOfDeath+"\n"+steveJobs.biography
        tvBillGates.text = billGates.fullName+"\n"+billGates.dateOfBirth +"-"+billGates.dateOfDeath+"\n"+billGates.biography
        tvAlanTuring.text = alanTuring.fullName+"\n"+alanTuring.dateOfBirth +"-"+alanTuring.dateOfDeath+"\n"+alanTuring.biography

        //Svakom TextView-u se dodaje metoda s kojom se može pregledavati sadržaj koji se nevidi
        tvSteveJobs.movementMethod = ScrollingMovementMethod()
        tvBillGates.movementMethod = ScrollingMovementMethod()
        tvAlanTuring.movementMethod = ScrollingMovementMethod()

        scrollView.setOnTouchListener({ _, _ ->
            tvSteveJobs.parent.requestDisallowInterceptTouchEvent(false)
            tvBillGates.parent.requestDisallowInterceptTouchEvent(false)
            tvAlanTuring.parent.requestDisallowInterceptTouchEvent(false)
            false
        })

        tvSteveJobs.setOnTouchListener( { _, _ -> tvSteveJobs.parent.requestDisallowInterceptTouchEvent(true)
            false
        })

        tvBillGates.setOnTouchListener( { _, _ -> tvBillGates.parent.requestDisallowInterceptTouchEvent(true)
            false })

        tvAlanTuring.setOnTouchListener( { _, _ -> tvAlanTuring.parent.requestDisallowInterceptTouchEvent(true)
            false
        })

        //Svakoj slici pridužujem metodu OnClickListener koja pritiskom na sliku vraća neki citat osobe
        ivSteveJobs.setOnClickListener {

            val rand = Random()
            val n = rand.nextInt(5) + 1

            //Kotlin ne koristi switch()case nego when() naredbu
            //Ovisno od nasumičnom broju koji je u granicama od 1 do 5 (broj citata) ispisuje se citat na ekran u obliku Toast poruke
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
