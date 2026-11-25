
package com.example.mysports

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class SimpleFragments : Fragment() {

    var pageName: String? = null
        get() = field ?: arguments?.getString("page")

    companion object {
        fun newInstance(page: String): SimpleFragments {
            val fragment = SimpleFragments()
            fragment.pageName = page
            val bundle = Bundle()
            bundle.putString("page", page)
            fragment.arguments = bundle
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_simple, container, false)
        val page = pageName ?: "Home"
        val textView = view.findViewById<TextView>(R.id.fragment_label)
        textView.text = "$page Fragment"
        return view
    }
}
