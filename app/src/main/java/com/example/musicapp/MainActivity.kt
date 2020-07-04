package com.example.musicapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.musicapp.adapter.SongsGridAdapter
import com.example.musicapp.adapter.SongsListAdapter
import com.example.musicapp.data.Song
import com.example.musicapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var topSongsAdapter: SongsListAdapter
    private lateinit var popularSongsAdapter: SongsGridAdapter

    private lateinit var topSongLayoutManager: RecyclerView.LayoutManager
    private lateinit var popularSongLayoutManager: LinearLayoutManager

    private lateinit var activityMainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        initPopularSong()
        initTopSong()
    }

    fun initTopSong() {
        topSongsAdapter = SongsListAdapter(Song.getSongs())
        topSongLayoutManager = LinearLayoutManager(this)
        activityMainBinding.rvTopSongs.adapter = topSongsAdapter
        activityMainBinding.rvTopSongs.layoutManager = topSongLayoutManager


    }

    fun initPopularSong() {
        popularSongsAdapter = SongsGridAdapter(Song.getSongs())
        popularSongLayoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        activityMainBinding.rvPopularSong.adapter = popularSongsAdapter;
        activityMainBinding.rvPopularSong.layoutManager = popularSongLayoutManager;

    }

}

