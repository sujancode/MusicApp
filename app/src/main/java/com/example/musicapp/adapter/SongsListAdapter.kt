package com.example.musicapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.musicapp.R
import com.example.musicapp.data.Song
import com.example.musicapp.databinding.TopSongsListItemBinding

class SongsListAdapter(
    private var topSongs: ArrayList<Song>
) :
    RecyclerView.Adapter<SongsListViewHolder>() {


    fun setTopSongs(songs: ArrayList<Song>) {
        topSongs = songs
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SongsListViewHolder {
        return SongsListViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.top_songs_list_item,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return topSongs.size
    }

    override fun onBindViewHolder(holder: SongsListViewHolder, position: Int) {
        val current_song = topSongs.get(position)
        holder.bind(current_song)
    }

}

class SongsListViewHolder(private val binding: TopSongsListItemBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(song: Song) {
        binding.song = song
    }
}