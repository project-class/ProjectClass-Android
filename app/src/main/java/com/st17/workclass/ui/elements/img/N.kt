package com.st17.workclass.ui.elements.img

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import com.st17.workclass.R

@Composable
fun notOnLessonN(width: Int){
    val vector = ImageVector.vectorResource(id = R.drawable.ic_n)

    Image(
        vector,
        "top",
        modifier = Modifier
            .width(width.dp)
            .aspectRatio(vector.viewportWidth/vector.viewportHeight)
    )
}

@Composable
fun notOnLessonY(width: Int){
    val vector = ImageVector.vectorResource(id = R.drawable.ic_not_on_lesson)

    Image(
        vector,
        "top",
        modifier = Modifier
            .width(width.dp)
            .aspectRatio(vector.viewportWidth/vector.viewportHeight)
    )
}