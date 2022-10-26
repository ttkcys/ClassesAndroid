package com.yusud.siniflarvefonksiyonlar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sinifCalismasi()
    }

    fun sinifCalismasi(){

        var superman = Superkahraman()
        superman.age = 42
        superman.job = "Gazeteci"
        superman.name = "Clark Kent"

        var batman = Superkahraman()
        batman.age = 30
        batman.job = "BusinessMan"
        batman.name = "Batman"

        textSonuc.text = "Job: ${superman.job}"
        textView2.text = "Job: ${batman.job}"
    }
}