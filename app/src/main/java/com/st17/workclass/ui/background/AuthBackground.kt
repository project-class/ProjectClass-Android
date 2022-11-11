package com.st17.workclass.ui.background

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.st17.workclass.ui.elements.backgrpond.*


@Composable
fun authBackground(){
    Box(modifier = Modifier
        .fillMaxHeight()
        .fillMaxWidth(),
        contentAlignment = Alignment.TopStart
    ){
        redCorner()
        redCorner(sizeFactor = 0.96f)
    }

    Box(modifier = Modifier
        .fillMaxHeight()
        .fillMaxWidth(),
        contentAlignment = Alignment.BottomEnd
    ){
        greenCorner()
        greenCorner(sizeFactor = 0.94f)
    }
}

