package com.xiadev.horoscapp.ui.horoscope

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.xiadev.horoscapp.R
import com.xiadev.horoscapp.databinding.FragmentHoroscopeBinding

class HoroscopeFragment : Fragment() {

    //BINDING
    //cuando queremos definir variables privadas le ponemos el barra baja
    private var _binding: FragmentHoroscopeBinding? = null
    //cuando alguien quiera acceder al binding se va a acceder a este valor fijo que no se puede romper
    //lo que por detras hace es llamar al var _binding que se puede modificar y romper
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //BINDING
        _binding = FragmentHoroscopeBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

}