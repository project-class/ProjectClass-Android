package com.st17.workclass.ui.elements.texts

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.st17.workclass.ui.theme.Black
import com.st17.workclass.ui.theme.WorkClassTheme

@Composable
fun addictionalText(text: String = "text", color: Color = Black,
                    textSize : TextUnit = 12.sp, fontWeight: Int = 400){
    Text(text,
        fontSize = textSize,
        color = color,
        fontWeight = FontWeight(fontWeight),
        modifier = Modifier.wrapContentSize())
}

