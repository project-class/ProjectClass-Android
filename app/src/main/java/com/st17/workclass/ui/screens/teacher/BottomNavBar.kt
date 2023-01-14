package com.st17.workclass.ui.screens.teacher

import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.st17.workclass.R
import com.st17.workclass.ui.elements.shadow.extendedShadow
import com.st17.workclass.ui.navigation.StudentGraph
import com.st17.workclass.ui.navigation.TeacherGraph
import com.st17.workclass.ui.theme.GreyD
import com.st17.workclass.ui.theme.White

@Composable
fun bottomStudentNavigationBar(navController: NavHostController) {
    BottomNavigation(modifier = Modifier
        .padding(bottom = 45.dp)
        .extendedShadow(blurRadius = 16.dp),
        backgroundColor = White,
        contentColor = GreyD
    ) {
        val backStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = backStackEntry?.destination?.route

        BottomNavigationItem(
            selected = currentRoute == TeacherGraph.TEACHER_MAIN,
            onClick = {
                navController.navigate(TeacherGraph.TEACHER_MAIN) {
                    popUpTo(navController.graph.findStartDestination().id) {
                        saveState = true
                    }
                    launchSingleTop = true
                    restoreState = true
                }
            },

            icon = {
                Icon(imageVector = ImageVector.vectorResource(id = R.drawable.bottom_bar_schedule),
                    contentDescription = TeacherGraph.TEACHER_MAIN)
            },
            label = {
                Text(text = "Расписание")
            }
        )

        BottomNavigationItem(
            selected = currentRoute == TeacherGraph.TEACHER_SETTING,
            onClick = {
                navController.navigate(TeacherGraph.TEACHER_SETTING) {
                    popUpTo(navController.graph.findStartDestination().id) {
                        saveState = true
                    }
                    launchSingleTop = true
                    restoreState = true
                }
            },

            icon = {
                Icon(imageVector = ImageVector.vectorResource(id = R.drawable.bottom_bar_menu),
                    contentDescription = TeacherGraph.TEACHER_SETTING)
            },
            label = {
                Text(text = "Меню")
            }
        )
    }
}