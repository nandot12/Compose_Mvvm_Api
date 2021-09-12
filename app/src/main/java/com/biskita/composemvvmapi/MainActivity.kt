package com.biskita.composemvvmapi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.biskita.composemvvmapi.ui.theme.ComposeMvvmApiTheme
import com.biskita.composemvvmapi.ui.theme.itemNews

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeMvvmApiTheme {
    }
}