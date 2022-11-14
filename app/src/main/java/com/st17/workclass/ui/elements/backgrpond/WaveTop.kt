package com.st17.workclass.ui.elements.backgrpond

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import com.st17.workclass.R


@Preview
@Composable
fun screeen(){
    Box {
        waveTop()
    }
}

@Composable
fun waveTop() {
    val vector = ImageVector.vectorResource(id = R.drawable.background_wavetop)

    Image(
        vector,
        "top",
        modifier = Modifier
            .fillMaxWidth()
            .aspectRatio(1.8f)
    )
}


