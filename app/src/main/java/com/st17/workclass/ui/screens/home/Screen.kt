package com.st17.workclass.ui.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.st17.workclass.ui.theme.GreenD

@Composable
fun homeScreen(){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(GreenD))
}