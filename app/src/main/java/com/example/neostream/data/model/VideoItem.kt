package com.example.neostream.data.model

data class VideoItem(
    val id: Int,
    val name: String,
    val author: String,
    val url: String,
    val color: androidx.compose.ui.graphics.Color
)