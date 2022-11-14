package com.st17.workclass.ui.background

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.st17.workclass.ui.elements.backgrpond.*

@Preview
@Composable
fun authBackground(){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.White),
        contentAlignment = Alignment.TopStart
    ){
        waveCornerTopLeft()
    }

    Box(modifier = Modifier
        .fillMaxSize(),
        contentAlignment = Alignment.BottomEnd
    ){
        waveCornerBottomRight()
    }
}
