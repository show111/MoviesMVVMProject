package com.example.moviesmvvmproject.movie.di

import dagger.Module

@Module
data class MoviesBean(
    val page: Int = 0,
    val results: List<Result> = emptyList(),
    val total_pages: Int= 0,
    val total_results: Int = 0
)

@Module
data class Result(
    val adult: Boolean,
    val backdrop_path: String,
    val genre_ids: List<Int>,
    val id: Int,
    val original_language: String,
    val original_title: String,
    val overview: String,
    val popularity: Double,
    val poster_path: String,
    val release_date: String,
    val title: String,
    val video: Boolean,
    val vote_average: Double,
    val vote_count: Int
)



