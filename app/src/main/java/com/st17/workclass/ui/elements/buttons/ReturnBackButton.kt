package com.st17.workclass.ui.elements.buttons

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.st17.workclass.R

@Composable
fun returnBackArrowButtonBlack(onClick: ()-> Unit){
    Box(
        modifier = Modifier
            .wrapContentSize()
            .clickable {
                onClick()
            },
        contentAlignment = Alignment.Center
    ) {
        val vector = ImageVector.vectorResource(id = R.drawable.button_arrow_black)

        Image(
            vector,
            "top",
            modifier = Modifier
                .width(16.dp)
                .aspectRatio(vector.viewportWidth/vector.viewportHeight)
        )
    }
}

@Composable
fun returnBackArrowButtonWhite(onClick: ()-> Unit){
    Box(
        modifier = Modifier
            .wrapContentSize()
            .clickable {
                onClick()
            },
        contentAlignment = Alignment.Center
    ) {
        val vector = ImageVector.vectorResource(id = R.drawable.button_arrow_white)

        Image(
            vector,
            "top",
            modifier = Modifier
                .width(16.dp)
                .aspectRatio(vector.viewportWidth/vector.viewportHeight)
        )
    }
}
