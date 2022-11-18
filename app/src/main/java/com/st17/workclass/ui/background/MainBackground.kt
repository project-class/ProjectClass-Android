package com.st17.workclass.ui.background

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.st17.workclass.ui.theme.GreenD

@Preview
@Composable
fun mainBackground(){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(GreenD)
    )
}