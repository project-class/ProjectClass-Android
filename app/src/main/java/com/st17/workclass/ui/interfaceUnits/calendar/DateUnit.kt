package com.st17.workclass.ui.interfaceUnits.calendar

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.st17.workclass.ui.elements.texts.addictionalText
import com.st17.workclass.ui.theme.Black
import com.st17.workclass.ui.theme.GreenD
import com.st17.workclass.ui.theme.White

@Composable
fun dateUnit(date:String = "date", numDate: Int = 0, color: Color = Black){

    Column(modifier = Modifier
        .width(32.dp)
        .height(54.dp)
        .padding(start = 16.dp, end = 16.dp, top = 36.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)) {

        addictionalText(date, color = color)
        addictionalText(numDate.toString(), color = color, textSize = 14.sp, fontWeight = 500)
    }
}

@Preview
@Composable
fun dateUnitPreview(date:String = "date", numDate: Int = 0, color: Color = Black){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(GreenD),
        contentAlignment = Alignment.Center
    ) {
        dateUnit()
    }
}