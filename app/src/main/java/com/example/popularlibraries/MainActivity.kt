package com.example.popularlibraries

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.popularlibraries.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), MainView {

    private var vb: ActivityMainBinding? = null
    private val presenter = MainPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        vb = ActivityMainBinding.inflate(layoutInflater)
        setContentView(vb?.root)

        vb?.apply {
            btnCounter1.setOnClickListener { presenter.counterClick(0) }
            btnCounter2.setOnClickListener { presenter.counterClick(1) }
            btnCounter3.setOnClickListener { presenter.counterClick(2) }
        }
    }

    override fun setButtonText(idButton: Int, text: Int) {
        when (idButton) {
            0 -> vb?.btnCounter1?.text = "$text"
            1 -> vb?.btnCounter2?.text = "$text"
            2 -> vb?.btnCounter3?.text = "$text"
        }
    }
}