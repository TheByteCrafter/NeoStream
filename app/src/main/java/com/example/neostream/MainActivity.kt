package com.example.neostream

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.neostream.ui.theme.NeoStreamTheme
import com.example.neostream.ui.theme.screens.MainScreen
import com.example.neostream.viewModel.VideoViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NeoStreamTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                   NeoStreamApp(modifier=Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun NeoStreamApp(viewModel: VideoViewModel = viewModel(),
                 modifier: Modifier=Modifier){
    MainScreen(viewModel=viewModel)

}