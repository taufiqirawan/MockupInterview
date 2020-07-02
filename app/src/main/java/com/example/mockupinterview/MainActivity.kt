package com.example.mockupinterview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainView {
    companion object{
        var result = 0
    }


    private lateinit var mainPresenter: MainPresenter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainPresenter = MainPresenter()
        mainPresenter.setView(this)

        val nama = intent.getStringExtra("nama")
        tv_nama.text = nama

        btn_roll.setOnClickListener {
            val dadu = mutableListOf(1,2,3,4,5,6)
            val random = dadu.random()
            mainPresenter.diceScore(random)
        }

    }

    override fun addScore(score: Int) {
        result += score
        tv_score.text = result.toString()
    }
}