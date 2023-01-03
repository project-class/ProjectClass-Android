package com.st17.workclass.ui.elements.buttons

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.st17.workclass.ui.elements.texts.standartButtonText
import com.st17.workclass.ui.theme.*

@Composable
fun standartButton(text: String = "text", color: Color = Black,
                   width: Int = 146, height: Int = 36,
                   onClick: ()-> Unit){
    Box(
        modifier = Modifier
            .width(width.dp)
            .height(height.dp)
            .shadow(
                elevation = 5.dp,
                shape = RoundedCornerShape(8.dp),
                clip = true)
            .clip(RoundedCornerShape(8.dp))
            .background(Color.White)
            .clickable {
                onClick()
            },

        contentAlignment = Alignment.Center
    ) {
        standartButtonText(text, color)
    }
}