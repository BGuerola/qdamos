package com.justaproject.qdamos.ui.crear

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.justaproject.qdamos.databinding.FragmentCrearBinding

class CrearFragment : Fragment() {

    private var _binding: FragmentCrearBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val crearViewModel =
            ViewModelProvider(this).get(CrearViewModel::class.java)

        _binding = FragmentCrearBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textCrear
        crearViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}