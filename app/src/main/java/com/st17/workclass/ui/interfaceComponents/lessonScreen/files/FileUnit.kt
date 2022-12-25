package com.st17.workclass.ui.interfaceComponents.lessonScreen.files

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.st17.workclass.R
import com.st17.workclass.data.File
import com.st17.workclass.ui.elements.texts.addictionalText
import com.st17.workclass.ui.theme.Black
import com.st17.workclass.ui.theme.White

@Composable
fun fileUnit(file: File = File(), textColor: Color = Black,
             textSizeColor: Color = Black, backgroundColor: Color = White,
             onClick: ()-> Unit){
    Row(modifier = Modifier
        .height(70.dp)
        .fillMaxWidth()
        .padding(0.dp, 8.dp)
        .clickable {
            onClick()
        },
        horizontalArrangement = Arrangement.SpaceBetween){

        val fileIcon = ImageVector.vectorResource(file.fileIcon)

        Row {
            Image(
                fileIcon,
                "file_icon",
                modifier = Modifier
                    .aspectRatio(fileIcon.viewportWidth/fileIcon.viewportHeight)
            )

            Column(modifier = Modifier
                .height(40.dp)
                .padding(9.dp, 6.dp),
                verticalArrangement = Arrangement.SpaceAround) {

                addictionalText(text = file.name, color = textColor, textSize = 14.sp, fontWeight = 500)

                addictionalText(text = file.size, color = textSizeColor, fontWeight = 500)
            }
        }


        Image(
            ImageVector.vectorResource(R.drawable.ic_arrow_download),
            "file_icon",
            modifier = Modifier
                .padding(0.dp, 15.dp)
                .aspectRatio(fileIcon.viewportWidth/fileIcon.viewportHeight)

        )

    }
}