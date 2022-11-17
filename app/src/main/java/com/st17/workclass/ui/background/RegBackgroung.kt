package com.st17.workclass.ui.background

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.st17.workclass.ui.elements.backgrpond.waveTop
import com.st17.workclass.ui.elements.texts.titleText

@Preview
@Composable
fun regBackground(){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.White),
        contentAlignment = Alignment.TopCenter
    ){
        waveTop()
        Column(modifier = Modifier
            .padding(top = 72.dp, start = 16.dp)
            .fillMaxWidth()){
                titleText("Регистрация")
        }
    }

}