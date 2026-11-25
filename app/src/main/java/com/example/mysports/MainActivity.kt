
package com.example.mysports

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var bottomNavigation: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigation = findViewById(R.id.bottomNavigation)

        if (savedInstanceState == null) {
            loadFragment(SimpleFragments.newInstance("Home"))
            bottomNavigation.selectedItemId = R.id.nav_home
        }

        bottomNavigation.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> {
                    loadFragment(SimpleFragments.newInstance("Home"))
                    true
                }
                R.id.nav_account -> {
                    loadFragment(SimpleFragments.newInstance("Account"))
                    true
                }
                R.id.nav_profile -> {
                    loadFragment(SimpleFragments.newInstance("Profile"))
                    true
                }
                R.id.nav_sports -> {
                    loadFragment(MySportsFragment())
                    true
                }
                else -> false
            }
        }
    }

    fun loadFragment(fragment: Fragment, addToBackStack: Boolean = false) {
        val transaction = supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, fragment)
        if (addToBackStack) {
            transaction.addToBackStack(null)
        }
        transaction.commit()
    }

    fun openSportDetails(sportName: String) {
        loadFragment(SportDetailFragment.newInstance(sportName), addToBackStack = true)
    }
}
