package com.st17.workclass.ui.screens.auth

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.st17.workclass.ui.background.authBackground
import com.st17.workclass.ui.elements.InputField.loginField
import com.st17.workclass.ui.elements.InputField.passField
import com.st17.workclass.ui.elements.buttons.standartButton
import com.st17.workclass.ui.elements.texts.titleText
import com.st17.workclass.ui.theme.BrownN
import com.st17.workclass.ui.theme.GreenD
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@Preview
@Composable
fun authScreen(){
    Box(modifier = Modifier
        .fillMaxSize(),
    contentAlignment = Alignment.Center
    ){
        authBackground()

        Column(
            modifier = Modifier
                .padding(bottom = 120.dp),
            verticalArrangement = Arrangement.spacedBy(29.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            titleText("Вход")
            Column(
                modifier = Modifier,
                verticalArrangement = Arrangement.spacedBy(20.dp)) {
                loginField()
                passField()
                Row(modifier = Modifier
                    .padding(top = 6.dp, start = 6.dp, end = 6.dp),
                    horizontalArrangement = Arrangement.spacedBy(22.dp),
                ) {
                    standartButton(text = "Регистрация", color = BrownN)
                    standartButton(text = "Вход", color = GreenD)
                }
            }
        }
    }
}
