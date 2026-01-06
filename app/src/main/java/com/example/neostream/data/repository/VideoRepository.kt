package com.example.neostream.data.repository

import androidx.compose.ui.graphics.Color
import com.example.neostream.data.model.VideoItem

class VideoRepository {
    fun getVideos():List<VideoItem> =listOf(
        VideoItem(1, "Midnight City Lights", "@neon_driver", "https://videos.pexels.com/video-files/2519660/2519660-sd_640_360_24fps.mp4", Color(0xFF00FBFF)),
        VideoItem(2, "Cyberpunk Hustle", "@future_vibes", "https://videos.pexels.com/video-files/2023708/2023708-sd_360_640_30fps.mp4", Color(0xFFFF00E5)),
        VideoItem(3, "Retro Wave Motion", "@synth_master", "https://videos.pexels.com/video-files/3629511/3629511-sd_360_450_24fps.mp4", Color(0xFF00FBFF)),
        VideoItem(4, "Digital Rain 4K", "@matrix_runner", "https://videos.pexels.com/video-files/2519660/2519660-sd_640_360_24fps.mp4", Color(0xFFFF00E5)),
        VideoItem(5, "Synthway Highway", "@retro_loop", "https://videos.pexels.com/video-files/2023708/2023708-sd_360_640_30fps.mp4", Color(0xFF00FBFF)),
    )
}