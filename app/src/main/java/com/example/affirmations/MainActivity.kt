package com.example.affirmations

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.affirmations.adapters.MovieAdapter
import com.example.affirmations.dataSources.DataSource
import com.example.affirmations.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val movies=DataSource().loadMovies()
        val adapter=MovieAdapter(
            this,
            movies,
            R.layout.simple_row_layout
        )
        binding.movieList.layoutManager=LinearLayoutManager(this)
        binding.movieList.adapter=adapter
    }
}