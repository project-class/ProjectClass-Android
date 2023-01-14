package com.st17.workclass.ui.screens.teacher.mainscreen.marks

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.st17.workclass.ui.elements.texts.addictionalText

@Composable
fun studentUnit(i: Int, text: String, mark: String, onClick: () -> Unit){
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(vertical = 5.dp)
        .clickable {
            onClick()
        }){
        addictionalText(text = "$i", fontWeight = 500, textSize = 14.sp)

        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween){

            addictionalText(text = text, fontWeight = 500, textSize = 16.sp)

            addictionalText(text = mark, fontWeight = 500, textSize = 20.sp)
        }

    }
}
