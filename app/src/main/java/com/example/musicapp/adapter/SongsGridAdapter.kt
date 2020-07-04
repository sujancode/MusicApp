package com.example.musicapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.musicapp.R
import com.example.musicapp.data.Song
import com.example.musicapp.databinding.PopularSongsCardViewBinding

class SongsGridAdapter(
    private val popularSongs: ArrayList<Song>
) :
    RecyclerView.Adapter<SongsGridViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SongsGridViewHolder {
        return SongsGridViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.popular_songs_card_view,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return popularSongs.size

    }

    override fun onBindViewHolder(holder: SongsGridViewHolder, position: Int) {
        holder.bind(popularSongs.get(position))
    }


}

class SongsGridViewHolder(private val binding: PopularSongsCardViewBinding) :
    RecyclerView.ViewHolder(binding.root) {


    fun bind(current_song: Song) {
        binding.song = current_song
    }
}