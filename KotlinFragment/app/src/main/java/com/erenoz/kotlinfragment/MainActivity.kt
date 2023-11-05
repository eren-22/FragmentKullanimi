package com.erenoz.kotlinfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun firstFragment(view : View) {

        val supportFragmentManager = supportFragmentManager
        val fragmentTransaction = supportFragmentManager.beginTransaction()

        val firstFragment = BlankFragment()
        fragmentTransaction.replace(R.id.frameLayout,firstFragment).commit()
    }

    fun secondFragment(view : View) {

        val supportFragmentManager = supportFragmentManager
        val fragmentTransaction = supportFragmentManager.beginTransaction()

        val secondFragment = BlankFragment2()
        fragmentTransaction.replace(R.id.frameLayout,secondFragment).commit()
    }
}