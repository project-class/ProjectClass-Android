package com.st17.workclass.ui.elements.inputField

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import com.st17.workclass.ui.screens.auth.AuthViewModel
import com.st17.workclass.ui.theme.Black
import com.st17.workclass.ui.theme.BrownL
import com.st17.workclass.ui.theme.BrownM
import com.st17.workclass.ui.theme.Transparent


@Composable
fun loginField(authViewModel: AuthViewModel){

    val mainColor = BrownM
    val backgroundColor = BrownL.copy(0.35f)

    val text = authViewModel.login.collectAsState()

    Box(modifier = Modifier
        .clip(RoundedCornerShape(4.dp))) {
        TextField(
            value = text.value,
            onValueChange = authViewModel::setLogin ,
            modifier = Modifier
                .defaultMinSize(minWidth = 328.dp,minHeight = 56.dp),
            label = { Text(text = "Login") },
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
fun passField(authViewModel: AuthViewModel){

    val mainColor = BrownM
    val backgroundColor = BrownL.copy(0.35f)

    val text = authViewModel.password.collectAsState()

    Box(modifier = Modifier
        .clip(RoundedCornerShape(4.dp))) {
        TextField(
            value = text.value,
            onValueChange = authViewModel::setPassword,
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
fun classField(authViewModel: AuthViewModel){

    val mainColor = BrownM
    val backgroundColor = BrownL.copy(0.35f)

    val text = authViewModel.eduClass.collectAsState()

    Box(modifier = Modifier
        .clip(RoundedCornerShape(4.dp))) {
        TextField(
            value = text.value,
            onValueChange = authViewModel::setEduClass,
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
