package com.example.lab10_api_retrofit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Surface
import androidx.compose.material3.MaterialTheme
import com.example.lab10_api_retrofit.ui.theme.Lab10_API_RetrofitTheme
import com.example.lab10_api_retrofit.view.SeriesApp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            Lab10_API_RetrofitTheme {
                Surface(
                    color = MaterialTheme.colorScheme.background
                ) {
                    SeriesApp()
                }
            }
        }
    }
}
