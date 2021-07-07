package com.dynnamicdevz.mymoviescollectionapp.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.dynnamicdevz.mymoviescollectionapp.databinding.DisplayMoviesFragmentBinding
import com.dynnamicdevz.mymoviescollectionapp.view.adapter.MoviesAdapter

class DisplayMoviesFragment:Fragment() {
    private lateinit var binding: DisplayMoviesFragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DisplayMoviesFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }
    private val adapter = MoviesAdapter()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.movieRecyclerview.adapter = adapter
    }

//    fun updateTeams(list: List<Team>){
//        adapter.list = list
//    }
}