package com.example.popularlibraries

class MainPresenter(private val view: MainView) {
    private val model = CountersModel()

    fun counterClick(idButton: Int) = with(view) {
        setButtonText(idButton, idButton.let(model::next))
    }
}