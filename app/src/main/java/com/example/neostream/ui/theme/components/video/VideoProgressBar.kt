package com.example.neostream.ui.theme.components.video

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun VideoProgressBar(
    progress:Float,
    modifier: Modifier = Modifier)
{
    Box(
        modifier=modifier.fillMaxWidth().height(2.dp).background(Color.White.copy(alpha=0.2f))
    ){
        Box(
            modifier=Modifier.fillMaxWidth()
                .fillMaxHeight()
                .background(
                    Brush.horizontalGradient(
                        listOf(Color(0xFF00FBFF),Color(0xFFFF00E5))
                    )

                )
        )

    }

}