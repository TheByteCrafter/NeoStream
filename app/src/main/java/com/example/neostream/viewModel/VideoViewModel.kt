package com.example.neostream.viewModel

import androidx.lifecycle.ViewModel
import com.example.neostream.data.model.VideoItem
import com.example.neostream.data.repository.VideoRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class VideoViewModel (
    private val repository: VideoRepository= VideoRepository()
): ViewModel()
{
  private val _videos=MutableStateFlow(repository.getVideos())

    val videos: StateFlow<List<VideoItem>> =_videos.asStateFlow()
    
}