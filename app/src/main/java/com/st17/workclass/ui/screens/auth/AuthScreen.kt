package com.st17.workclass.ui.screens.auth

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.st17.workclass.ui.background.authBackground

@Preview
@Composable
fun authScreen(){
    Box(modifier = Modifier
        .fillMaxSize()){
        authBackground()
    }
}
