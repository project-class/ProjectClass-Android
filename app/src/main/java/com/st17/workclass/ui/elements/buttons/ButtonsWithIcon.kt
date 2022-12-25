package com.st17.workclass.ui.elements.buttons

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.st17.workclass.R
import com.st17.workclass.ui.elements.shadow.extendedShadow
import com.st17.workclass.ui.elements.texts.addictionalText
import com.st17.workclass.ui.theme.Black
import com.st17.workclass.ui.theme.GreyN
import com.st17.workclass.ui.theme.White

@Composable
fun buttonIconText(text : String = "text", textColor: Color = Black,
                   icon: Int = R.drawable.button_arrow_black, backgroundColor: Color = White,
                   onClick: ()-> Unit){

    Row(modifier = Modifier
        .height(36.dp)
        .extendedShadow(
            borderRadius = 14.dp,
            blurRadius = 15.dp,
            color = GreyN
        )

        .background(color = backgroundColor, RoundedCornerShape(14.dp))
        .clickable { onClick }) {

        val vector = ImageVector.vectorResource(icon)
        Image(
            vector,
            "top",
            modifier = Modifier
                .padding(start = 10.dp, end = 6.dp, top = 4.dp, bottom = 4.dp)
                .aspectRatio(vector.viewportWidth/vector.viewportHeight)

        )

        Column(modifier = Modifier
            .height(36.dp)
            .padding(end = 12.dp),
            verticalArrangement = Arrangement.SpaceAround) {
            addictionalText(text = text, color = textColor, textSize = 14.sp, fontWeight = 500)
        }


    }
}

@Composable
fun buttonTextIcon(text : String = "text", textColor: Color = Black,
                   icon: Int = R.drawable.button_arrow_black, backgroundColor: Color = White,
                   onClick: ()-> Unit){

    Row(modifier = Modifier
        .height(36.dp)
        .extendedShadow(
            borderRadius = 14.dp,
            blurRadius = 15.dp,
            color = GreyN
        )

        .background(color = backgroundColor, RoundedCornerShape(14.dp))
        .clickable { onClick }) {

        Column(modifier = Modifier
            .height(36.dp)
            .padding(start = 12.dp),
            verticalArrangement = Arrangement.SpaceAround) {
            addictionalText(text = text, color = textColor, textSize = 14.sp, fontWeight = 500)
        }

        val vector = ImageVector.vectorResource(icon)
        Image(
            vector,
            "top",
            modifier = Modifier
                .padding(start = 10.dp, end = 6.dp, top = 4.dp, bottom = 4.dp)
                .aspectRatio(vector.viewportWidth/vector.viewportHeight)

        )
    }

}