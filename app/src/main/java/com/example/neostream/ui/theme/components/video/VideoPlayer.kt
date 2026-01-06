package com.example.neostream.ui.theme.components.video

import android.net.Uri
import android.widget.VideoView
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView

@Composable
fun VideoPlayer(
    url:String,
    modifier: Modifier = Modifier,
    isPlaying:Boolean,
    onPrepared:() -> Unit,
    onVideoViewCreated:(VideoView?) -> Unit={})
{
    AndroidView(
        modifier=modifier,
        factory = { context ->
            VideoView(context).apply {
                setVideoURI(Uri.parse(url))
                setOnPreparedListener { mp ->
                    mp.isLooping = true
                    onPrepared()

                }
                onVideoViewCreated(this)
            }
        },
        update = { view ->
            if(isPlaying) view.start() else view.pause()
        }
    )

}