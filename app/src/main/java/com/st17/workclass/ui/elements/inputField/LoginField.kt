package com.st17.workclass.ui.elements.inputField

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.st17.workclass.ui.theme.Black
import com.st17.workclass.ui.theme.BrownL
import com.st17.workclass.ui.theme.BrownM
import com.st17.workclass.ui.theme.Transparent

@Preview(showBackground = true)
@Composable
fun testLoginField(){
    Box(modifier = Modifier
        .fillMaxSize(),
    contentAlignment = Alignment.Center){
        Column(
            modifier = Modifier
                .height(120.dp),
            verticalArrangement = Arrangement.SpaceBetween) {
            loginField()
            passField()
        }
    }
}

@Composable
fun loginField(text: String = "text"){
    var textMail by remember { mutableStateOf("") }

    val mainColor = BrownM
    val backgroundColor = BrownL.copy(0.35f)


    Box(modifier = Modifier
        .clip(RoundedCornerShape(4.dp))) {
        TextField(
            value = textMail,
            onValueChange = { textMail = it },
            modifier = Modifier
                .defaultMinSize(minWidth = 328.dp,minHeight = 56.dp),
            label = { Text(text = "Email") },
            singleLine = true,
            colors = TextFieldDefaults.textFieldColors(
                cursorColor = mainColor,
                focusedLabelColor = mainColor.copy(alpha = 0.54f),
                unfocusedLabelColor = Black.copy(alpha = 0.54f),
                textColor = Black,
                backgroundColor = backgroundColor,
                focusedIndicatorColor = mainColor,
                unfocusedIndicatorColor = Transparent
            )
        )
    }
}

@Composable
fun passField(text: String = "text"){
    var textPass by remember { mutableStateOf("") }

    val mainColor = BrownM
    val backgroundColor = BrownL.copy(0.35f)



    Box(modifier = Modifier
        .clip(RoundedCornerShape(4.dp))) {
        TextField(
            value = textPass,
            onValueChange = { textPass = it },
            modifier = Modifier
                .defaultMinSize(minWidth = 328.dp,minHeight = 56.dp),
            label = { Text(text = "Пароль") },
            visualTransformation = PasswordVisualTransformation(),
            colors = TextFieldDefaults.textFieldColors(
                cursorColor = mainColor,
                focusedLabelColor = mainColor.copy(alpha = 0.54f),
                unfocusedLabelColor = Black.copy(alpha = 0.54f),
                textColor = Black,
                backgroundColor = backgroundColor,
                focusedIndicatorColor = mainColor,
                unfocusedIndicatorColor = Transparent
            )
        )
    }
}

@Composable
fun classField(text: String = "text"){
    var textMail by remember { mutableStateOf("") }

    val mainColor = BrownM
    val backgroundColor = BrownL.copy(0.35f)


    Box(modifier = Modifier
        .clip(RoundedCornerShape(4.dp))) {
        TextField(
            value = textMail,
            onValueChange = { textMail = it },
            modifier = Modifier
                .defaultMinSize(minWidth = 328.dp,minHeight = 56.dp),
            label = { Text(text = "Класс") },
            singleLine = true,
            colors = TextFieldDefaults.textFieldColors(
                cursorColor = mainColor,
                focusedLabelColor = mainColor.copy(alpha = 0.54f),
                unfocusedLabelColor = Black.copy(alpha = 0.54f),
                textColor = Black,
                backgroundColor = backgroundColor,
                focusedIndicatorColor = mainColor,
                unfocusedIndicatorColor = Transparent
            )
        )
    }
}
