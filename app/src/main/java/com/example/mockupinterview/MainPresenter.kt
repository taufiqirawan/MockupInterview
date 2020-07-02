package com.example.mockupinterview

class MainPresenter {
    private lateinit var view : MainView
    private var finalResult : Int = 0

    fun setView(view: MainView){
        this.view = view
    }

    fun diceScore ( number : Int) {
        when (number) {
            1 -> {
                view.addScore(5)
            }
            3 -> {
                view.addScore(5)
            }
            5 -> {
                view.addScore(5)
            }
            2 -> {
                view.addScore(-3)
            }
            4 -> {
                view.addScore(-3)
            }
            6 -> {
                view.addScore(-3)
            }
        }
    }

}