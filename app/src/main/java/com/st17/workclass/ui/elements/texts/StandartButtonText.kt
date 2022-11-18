package com.st17.workclass.ui.elements.texts

import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import com.st17.workclass.ui.theme.Black

@Composable
fun standartButtonText(string: String = "text", color: Color = Black){
    Text(string, fontSize = 14.sp, color = color, modifier = Modifier.wrapContentSize())
}