package com.example.musicapp.data

data class Song(
    val title: String,
    val artist: String,
    val imageUrl: String,
    val number_of_plays: Int,
    val number_of_downloads: Int,
    val number_of_likes: Int,
    val total_played: Int
) {
    companion object {

        fun getSongs(): ArrayList<Song> {

            val songs = ArrayList<Song>()

            songs.addAll(
                listOf<Song>(
                    Song(
                        "ROXANNE",
                        "Arizona Zervas",
                        "https://images.unsplash.com/photo-1555448248-2571daf6344b?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=634&q=80",
                        250,
                        1000,
                        500,
                        10000
                    ),
                    Song(
                        "Ric Flair Drip x Dubai Drip",
                        "Offset",
                        "https://images.unsplash.com/photo-1567095761054-7a02e69e5c43?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=634&q=80",
                        250,
                        1000,
                        500,
                        10000
                    ),
                    Song(
                        "Till I Collapse",
                        "Eminem",
                        "https://images.unsplash.com/photo-1556139954-ec19cce61d61?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=634&q=80",
                        250,
                        1000,
                        500,
                        10000
                    ),
                    Song(
                        "Ashes ",
                        "Céline Dion",
                        "https://images.unsplash.com/photo-1556139930-c23fa4a4f934?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1350&q=80",
                        250,
                        1000,
                        500,
                        10000
                    ),
                    Song(
                        "Broken People",
                        "Logic & Rag'n'Bone Man",
                        "https://images.unsplash.com/photo-1500462918059-b1a0cb512f1d?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=634&q=80",
                        250,
                        1000,
                        500,
                        10000
                    )

                )
            )
            return songs
        }

    }


    fun getPlayedStr(): String {
        return "$total_played Played"
    }

    fun toString(item: Any): String {
        return item.toString()
    }


}

