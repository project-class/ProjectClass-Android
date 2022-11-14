package com.st17.workclass.ui.elements.backgrpond

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import com.st17.workclass.R

@Composable
fun waveCornerTopLeft() {
    val vector = ImageVector.vectorResource(id = R.drawable.background_wave_corner_top_left)

    Image(
        vector,
        "top",
        modifier = Modifier
    )
}

@Composable
fun waveCornerBottomRight() {
    val vector = ImageVector.vectorResource(id = R.drawable.background_wave_corner_bottom_right)

    Image(
        vector,
        "top",
        modifier = Modifier
    )
}