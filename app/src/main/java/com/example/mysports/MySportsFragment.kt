package com.example.mysports

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import androidx.fragment.app.Fragment

class MySportsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_my_sports, container, false)

        val btnFootball = view.findViewById<Button>(R.id.btn_football)
        val btnBasketball = view.findViewById<Button>(R.id.btn_basketball)
        val btnVolleyball = view.findViewById<Button>(R.id.btn_volleyball)
        val btnTennis = view.findViewById<Button>(R.id.btn_tennis)

        btnFootball?.setOnClickListener { openSportDetails("Football") }
        btnBasketball?.setOnClickListener { openSportDetails("Basketball") }
        btnVolleyball?.setOnClickListener { openSportDetails("Volleyball") }
        btnTennis?.setOnClickListener { openSportDetails("Tennis") }

        val containerLayout = view.findViewById<LinearLayout>(R.id.sports_container)
        val extraSports = listOf("Badminton", "Baseball", "Swimming", "Boxing")
        containerLayout?.let { parent ->
            for (sport in extraSports) {
                val button = Button(requireContext()).apply {
                    text = sport
                    setOnClickListener { openSportDetails(sport) }
                }
                parent.addView(button)
            }
        }

        return view
    }

    private fun openSportDetails(sportName: String) {
        (activity as? MainActivity)?.openSportDetails(sportName)
    }
}
