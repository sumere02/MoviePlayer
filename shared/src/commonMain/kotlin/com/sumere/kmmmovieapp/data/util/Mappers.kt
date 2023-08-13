package com.sumere.kmmmovieapp.data.util

import com.sumere.kmmmovieapp.data.remote.MovieRemote
import com.sumere.kmmmovieapp.domain.model.Movie

internal fun MovieRemote.toMovie(): Movie{
    return Movie(
        id = id,
        title = title,
        description = overview,
        imageUrl = getImageUrl(posterImage),
        releaseDate = releaseDate
    )
}

private fun getImageUrl(posterImage: String) = "https://image.tmdb.org/t/p/w500/$posterImage"