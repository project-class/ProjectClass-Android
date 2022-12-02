package com.st17.workclass.ui.interfaceComponents.calendar

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.st17.workclass.data.CalendarNames.daysOfWeekName
import com.st17.workclass.data.CalendarNames.daysOfWeekShortName
import com.st17.workclass.data.CalendarNames.monthsName
import com.st17.workclass.model.datetime.CurrentTime
import com.st17.workclass.model.datetime.Date
import com.st17.workclass.ui.background.mainBackground
import com.st17.workclass.ui.elements.buttons.circleButton
import com.st17.workclass.ui.elements.texts.addictionalText
import com.st17.workclass.ui.elements.texts.titleText
import com.st17.workclass.ui.screens.student.StudentMainViewModel
import com.st17.workclass.ui.theme.GreenD
import com.st17.workclass.ui.theme.White


@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun calendar(date: Date, viewModel: StudentMainViewModel = StudentMainViewModel()){
    val currentDay = remember { mutableStateOf(viewModel.date) }
    val currentWeek = viewModel.getWeek(date)

    Column(modifier = Modifier
            .padding(start = 16.dp, end = 16.dp, top = 35.dp, bottom = 16.dp)
            .fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(0.dp)) {

        Row(modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight(),
            horizontalArrangement = Arrangement.SpaceBetween) {
            Column {
                titleText(text = daysOfWeekName[date.dayOfWeek], color = White, textSize = 29.sp)
                addictionalText(text = monthsName[date.month], color = White)
            }

            Row(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                circleButton()
                circleButton(rotateDegrees = 180f)
            }
        }


        Row(modifier = Modifier
            .wrapContentHeight()
            .fillMaxWidth()
            .padding(top = 20.dp),
            horizontalArrangement = Arrangement.SpaceBetween) {

            daysOfWeekShortName.forEachIndexed() { index, day->
                if (index == currentDay.value.dayOfWeek){
                    dateUnit(date = day, numDate = currentWeek[index].day, circleColor = White, textColor = GreenD){
                    }
                }
                else{
                    dateUnit(date = day, numDate = currentWeek[index].day){
                        currentDay.value = currentWeek[index]
                        viewModel.date = currentWeek[index]
                    }
                }
            }
        }
    }
}


@RequiresApi(Build.VERSION_CODES.O)
@Preview
@Composable
fun calendarPreview(navController: NavHostController = rememberNavController()){
    val time = CurrentTime()

    mainBackground()

    Column(modifier = Modifier
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally) {

        Box(modifier = Modifier
            .fillMaxHeight(190/800f)
            .fillMaxWidth()){
            calendar(time.getCurrentDate())
        }

        Box(modifier = Modifier
            .fillMaxSize()
            .padding(top = 16.dp)
            .clip(RoundedCornerShape(topStart = 32.dp, topEnd = 32.dp))
            .background(White)){

        }
    }
}