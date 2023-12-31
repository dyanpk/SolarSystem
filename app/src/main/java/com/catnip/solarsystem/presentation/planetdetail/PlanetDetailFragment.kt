package com.catnip.solarsystem.presentation.planetdetail

import android.app.SearchManager
import android.content.Intent
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import coil.load
import com.catnip.solarsystem.R
import com.catnip.solarsystem.databinding.FragmentPlanetDetailBinding
import com.catnip.solarsystem.model.Planet


class PlanetDetailFragment : Fragment() {

    private lateinit var binding: FragmentPlanetDetailBinding

    private val planet : Planet? by lazy {
        PlanetDetailFragmentArgs.fromBundle(arguments as Bundle).planet
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentPlanetDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}