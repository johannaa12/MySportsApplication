package com.example.mysports

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class SportDetailFragment : Fragment() {

    var sportName: String? = null
        get() = field ?: arguments?.getString("sport")

    companion object {
        fun newInstance(sportName: String): SportDetailFragment {
            val fragment = SportDetailFragment()
            fragment.sportName = sportName
            val bundle = Bundle()
            bundle.putString("sport", sportName)
            fragment.arguments = bundle
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_sport_detail, container, false)
        val sport = sportName ?: "Sport"

        val titleView = view.findViewById<TextView>(R.id.sport_title)
        val descView = view.findViewById<TextView>(R.id.sport_description)
        val backButton = view.findViewById<Button>(R.id.btn_back)

        titleView?.text = sport
        descView?.text = "Welcome to $sport!\n\nThis is the $sport section of My Sports."

        backButton?.setOnClickListener {
            val mainActivity = activity as? MainActivity
            if (mainActivity != null) {
                if (parentFragmentManager.backStackEntryCount > 0) {
                    parentFragmentManager.popBackStack()
                } else {
                    mainActivity.loadFragment(MySportsFragment())
                }
                mainActivity.findViewById<BottomNavigationView>(R.id.bottomNavigation)?.selectedItemId = R.id.nav_sports
            }
        }

        return view
    }
}
