package com.st17.workclass.ui.screens.student

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.st17.workclass.ui.background.mainBackground
import com.st17.workclass.ui.interfaceUnits.calendar.calendar
import com.st17.workclass.ui.theme.White

@Preview
@Composable
fun mainStudentScreen(navController: NavHostController = rememberNavController()){
    mainBackground()

    Column(modifier = Modifier
            .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally) {

        Box(modifier = Modifier
            .fillMaxHeight(160/800f)
            .fillMaxWidth()){
            calendar()
        }

        Box(modifier = Modifier
            .fillMaxSize()
            .shadow(
                elevation = 32.dp,
                shape = RoundedCornerShape(topStart = 32.dp, topEnd = 32.dp),
                clip = true)

            .padding(top = 16.dp)
            .clip(RoundedCornerShape(topStart = 32.dp, topEnd = 32.dp))
            .background(White)){

        }
    }
}