package com.xiadev.horoscapp.ui.palmistry

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.xiadev.horoscapp.R
import com.xiadev.horoscapp.databinding.FragmentLuckBinding

class PalmistryFragment : Fragment() {
    //BINDING
    //cuando queremos definir variables privadas le ponemos el barra baja
    private var _binding: FragmentLuckBinding? = null
    //cuando alguien quiera acceder al binding se va a acceder a este valor fijo que no se puede romper
    //lo que por detras hace es llamar al var _binding que se puede modificar y romper
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        //BINDING
        _binding = FragmentLuckBinding.inflate(layoutInflater, container, false)
        return binding.root
    }


}