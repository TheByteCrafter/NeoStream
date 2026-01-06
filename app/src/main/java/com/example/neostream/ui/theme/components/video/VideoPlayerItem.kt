package com.example.neostream.ui.theme.components.video

import android.widget.VideoView
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.neostream.data.model.VideoItem
import com.example.neostream.ui.theme.components.common.BufferingIndicator

@Composable
fun VideoPlayerItem(
    video: VideoItem,
    isVisible:Boolean,
    modifier: Modifier = Modifier)

{

    //variable states
    var isPlaying by remember { mutableStateOf(false) }
    var isReady by remember { mutableStateOf(false) }
    var progress by remember { mutableStateOf(0f) }
    var videoView: VideoView? by remember { mutableStateOf(null) }

    //track video visibility
    LaunchedEffect(isVisible)
    {
        if(!isVisible){
            isPlaying=false
            videoView?.pause()
        }else{
            isPlaying=true
            videoView?.start()

        }
    }

    //UI
    Box(
        modifier=modifier.fillMaxSize()

    ){
        VideoPlayer(
            url = video.url,
            modifier=Modifier.fillMaxSize(),
            isPlaying=isPlaying,
            onPrepared = { isReady=true },
            onVideoViewCreated = { view -> videoView=view}
        )


        if(!isReady){
            BufferingIndicator()
        }

        Box(
            modifier=Modifier.fillMaxSize().clickable(onClick = {isPlaying=!isPlaying}

            ),contentAlignment = Alignment.Center
        ){
            if(isPlaying){
                Icon(imageVector = Icons.Default.PlayArrow,
                    contentDescription = null,
                    tint=Color.White.copy(alpha=0.5f),
                    modifier=Modifier.size(80.dp)
                )


            }

            Column(
                modifier=Modifier.align(Alignment.BottomCenter)
                    .padding(16.dp)
            ){
                Text(video.name,color=Color.White)
                Text(video.author,color=Color.White.copy(alpha=0.7f))

            }
        }
    }




}