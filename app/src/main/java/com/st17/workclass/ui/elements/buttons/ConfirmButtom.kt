package com.st17.workclass.ui.elements.buttons

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.st17.workclass.ui.elements.texts.confirmButtonText
import com.st17.workclass.ui.theme.*

@Composable
fun confirmButton(text: String = "text", textColor: Color = Black,
                   width: Int = 264, height: Int = 56, buttonColor: Color = White,
                  onClick: ()-> Unit){
    Box(
        modifier = Modifier
            .width(width.dp)
            .height(height.dp)
            .clip(RoundedCornerShape(12.dp))
            .background(buttonColor)
            .clickable {
                onClick()
            },
        contentAlignment = Alignment.Center
    ) {
        confirmButtonText(text, textColor)
    }
}