package com.example.lab_week_04

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

private const val ARG_TITLE_RES = "title_res"
private const val ARG_DESC_RES = "desc_res"

class CafeDetailFragment : Fragment() {

    private var titleRes: Int = 0
    private var descRes: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            titleRes = it.getInt(ARG_TITLE_RES)
            descRes = it.getInt(ARG_DESC_RES)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_cafe_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<TextView>(R.id.cafe_title)?.text = getString(titleRes)
        view.findViewById<TextView>(R.id.cafe_desc)?.text = getString(descRes)
    }

    companion object {
        @JvmStatic
        fun newInstance(titleRes: Int, descRes: Int) =
            CafeDetailFragment().apply {
                arguments = Bundle().apply {
                    putInt(ARG_TITLE_RES, titleRes)
                    putInt(ARG_DESC_RES, descRes)
                }
            }
    }
}
