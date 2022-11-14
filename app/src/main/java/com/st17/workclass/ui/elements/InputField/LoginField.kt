package com.st17.workclass.ui.elements.InputField

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.st17.workclass.ui.theme.Black
import com.st17.workclass.ui.theme.BrownL
import com.st17.workclass.ui.theme.White

@Preview(showBackground = true)
@Composable
fun testLoginField(){
    Box(modifier = Modifier
        .fillMaxSize(),
    contentAlignment = Alignment.Center){
        loginField()
    }
}

@Composable
fun loginField(text: String = "text", color: Color = Black, width: Int = 320, height: Int = 56){
    var text by remember { mutableStateOf("") }

    val textStyle = TextStyle(fontSize = 16.sp, color = Black)


    BasicTextField(
        value = text,
        onValueChange = { text = it },
        maxLines = 1,
        textStyle = textStyle,
        modifier = Modifier
            .width(width.dp)
            .height(height.dp)
            .clip(RoundedCornerShape(topStart = 8.dp, topEnd = 8.dp, bottomStart = 8.dp, bottomEnd = 8.dp))
            .background(BrownL)
            .padding(start = 20.dp, top = 24.dp, end = 20.dp, bottom = 10.dp),
        decorationBox = { innerTextField ->
            Row(
                Modifier
                    .background(Color.LightGray, RoundedCornerShape(percent = 30))
                    .padding(16.dp)
            ) {

                if (text.isEmpty()) {
                    Text("example@mail.dom")
                }
                innerTextField()  //<-- Add this
            }
        })
}


