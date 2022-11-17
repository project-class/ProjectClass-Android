package com.st17.workclass.ui.elements.texts

import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.st17.workclass.ui.theme.Black

@Composable
fun confirmButtonText(string: String = "text", color: Color = Black){
    Text(string, fontSize = 20.sp, fontWeight = FontWeight(500), color = color, modifier = Modifier.wrapContentSize())
}