package com.st17.workclass.ui.interfaceComponents.calendar

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.st17.workclass.ui.background.mainBackground
import com.st17.workclass.ui.elements.texts.addictionalText
import com.st17.workclass.ui.theme.GreenD
import com.st17.workclass.ui.theme.White

@Composable
fun dateUnit(date:String = "date", numDate: Int = 0, textColor: Color = White, circleColor : Color = GreenD){

    Column(modifier = Modifier
        .width(32.dp)
        .height(54.dp),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally) {

        addictionalText(date, color = White)
        Box(modifier = Modifier
            .width(32.dp)
            .height(32.dp)
            .clip(CircleShape)
            .background(circleColor),
            contentAlignment = Alignment.Center){
            addictionalText(numDate.toString(), color = textColor, textSize = 14.sp, fontWeight = 500)
        }
    }
}

@Preview
@Composable
fun dateUnitPreview(navController: NavHostController = rememberNavController()){
    mainBackground()

    Column(modifier = Modifier
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally) {

        Box(modifier = Modifier
            .fillMaxHeight(160/800f)
            .fillMaxWidth()){
            dateUnit()
        }

        Box(modifier = Modifier
            .fillMaxSize()
            .padding(top = 16.dp)
            .clip(RoundedCornerShape(topStart = 32.dp, topEnd = 32.dp))
            .background(White)){

        }
    }
}