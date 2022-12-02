package com.st17.workclass.ui.elements.buttons

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import com.st17.workclass.R
import com.st17.workclass.ui.theme.White

@Composable
fun circleButton(width: Int = 40, height: Int = 40,
                 rotateDegrees : Float = 0f, buttonColor: Color = White){

    val vector = ImageVector.vectorResource(id = R.drawable.button_trinagle_arrow)


    Box(
        modifier = Modifier
            .width(width.dp)
            .height(height.dp)
            .clip(CircleShape)
            .background(buttonColor)
            .clickable {

            },
        contentAlignment = Alignment.Center
    ) {

        Image(
            vector,
            "top",
            modifier = Modifier
                .width(12.dp)
                .rotate(rotateDegrees)
                .aspectRatio(vector.viewportWidth/vector.viewportHeight)
        )
    }
}

