package com.st17.workclass.ui.screens.auth

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.st17.workclass.ui.background.authBackground

@Composable
fun authScreen(){
    Box(modifier = Modifier
        .fillMaxSize()){
        authBackground()
    }
}
