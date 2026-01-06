package com.example.neostream.ui.theme.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.VerticalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.neostream.ui.theme.components.actions.ActionIcon
import com.example.neostream.ui.theme.components.video.VideoPlayerItem
import com.example.neostream.viewModel.VideoViewModel

@Composable
fun MainScreen(
    viewModel: VideoViewModel,
    modifier: Modifier = Modifier)
{
    val videos=viewModel.videos.collectAsState().value
    val pagerState= rememberPagerState(pageCount = {videos.size})
    Box(modifier=Modifier.fillMaxSize().background(Color.Black)){
        VerticalPager(
            state=pagerState,
            modifier=Modifier.fillMaxSize(),
            beyondViewportPageCount = 1
        ){ page ->
            VideoPlayerItem(
                video=videos[page],
                isVisible = pagerState.currentPage == page,
                modifier=Modifier.fillMaxSize()
            )

        }

        Column(
            modifier=Modifier.align(Alignment.BottomEnd).padding(bottom = 80.dp,end=16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            ActionIcon(Icons.Default.Favorite,"1.2K")
            Spacer(modifier=Modifier.height(20.dp))
            ActionIcon(Icons.Default.Email,"45")
            Spacer(modifier=Modifier.height(20.dp))
            ActionIcon(Icons.Default.Share,"Share")
        }

        Text("NeoStream",modifier=Modifier.align(Alignment.TopCenter).padding(top=16.dp),
            color=Color.White.copy(alpha=0.7f),
            fontWeight = FontWeight.Black)
    }




}




