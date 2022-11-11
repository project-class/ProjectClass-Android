package com.st17.workclass.ui.elements.backgrpond

import android.graphics.Matrix
import android.graphics.RectF
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp
import androidx.core.graphics.PathParser

@Composable
fun redCorner(sizeFactor: Float = 1f, rotateVal : Float = 0f) {
    Canvas(
        modifier = Modifier
            .width((355.0114440917969 * sizeFactor).dp)
            .height((239.5 * (sizeFactor*2)).dp)
            .rotate(rotateVal)

        //.fillMaxWidth()
        //.aspectRatio(1f)

    ) {
        val fillPath = PathParser.createPathFromPathData("M 2.2737367544323206e-13 229 C 15.166666984558333 227.5 42 215.5 59.5 156 C 77 96.5 166.40496444702148 59.80012893676758 222.5 56.5 C 295.0912170410156 52.22938346862793 347.30000001192093 42.400001525878906 346.5 0 L 2.2737367544323206e-13 0 L 2.2737367544323206e-13 229 Z M 59.5 156 C 42 215.5 15.166666984558333 227.5 2.2737367544323206e-13 229 L 0 239.5 C 15.166666984558105 238 51.23288059234619 225.19862747192383 66.5 165 C 82.15455055236816 103.27372360229492 172.06893920898438 67.87837362289429 228.5 65 C 301.4245376586914 61.28034520149231 355.9182326197624 44.1973876953125 355 0 L 346.5 0 C 347.30000001192093 42.400001525878906 295.0912170410156 52.22938346862793 222.5 56.5 C 166.40496444702148 59.80012893676758 77 96.5 59.5 156 Z ")
        //fillPath.fillType = Path.FillType.EVEN_ODD
        val rectF = RectF()
        fillPath.computeBounds(rectF, true)
        val matrix = Matrix()
        val scale = minOf( size.width / rectF.width(), size.height / rectF.height() )
        matrix.setScale(scale, scale)
        fillPath.transform(matrix)
        val composePathFill = fillPath.asComposePath()

        val colorList: List<Color> =
            listOf(
                Color(red = 255, green = 149, blue = 107, alpha = 138),
                Color(red = 163, green = 54, blue = 23, alpha = 230)
            )

        val brush = Brush.horizontalGradient(
            colors = colorList,
            startX = 0f,
            endX = 355.0114440917969.dp.toPx(),
            tileMode = TileMode.Clamp,

            )

        drawPath(path = composePathFill, brush, style = Fill)
        drawPath(path = composePathFill, color = Color.Transparent, style = Stroke(width = 3f, miter = 4f, join = StrokeJoin.Round))
    }
}

@Composable
fun greenCorner(sizeFactor: Float = 1f, rotateVal : Float = 180f) {
    Canvas(
        modifier = Modifier
            .width((355.0114440917969 * sizeFactor).dp)
            .height((239.5 * (sizeFactor * 2)).dp)
            .rotate(rotateVal)

        //.fillMaxWidth()
        //.aspectRatio(1f)

    ) {
        val fillPath =
            PathParser.createPathFromPathData("M 2.2737367544323206e-13 229 C 15.166666984558333 227.5 42 215.5 59.5 156 C 77 96.5 166.40496444702148 59.80012893676758 222.5 56.5 C 295.0912170410156 52.22938346862793 347.30000001192093 42.400001525878906 346.5 0 L 2.2737367544323206e-13 0 L 2.2737367544323206e-13 229 Z M 59.5 156 C 42 215.5 15.166666984558333 227.5 2.2737367544323206e-13 229 L 0 239.5 C 15.166666984558105 238 51.23288059234619 225.19862747192383 66.5 165 C 82.15455055236816 103.27372360229492 172.06893920898438 67.87837362289429 228.5 65 C 301.4245376586914 61.28034520149231 355.9182326197624 44.1973876953125 355 0 L 346.5 0 C 347.30000001192093 42.400001525878906 295.0912170410156 52.22938346862793 222.5 56.5 C 166.40496444702148 59.80012893676758 77 96.5 59.5 156 Z ")
        //fillPath.fillType = Path.FillType.EVEN_ODD
        val rectF = RectF()
        fillPath.computeBounds(rectF, true)
        val matrix = Matrix()
        val scale = minOf(size.width / rectF.width(), size.height / rectF.height())
        matrix.setScale(scale, scale)
        fillPath.transform(matrix)
        val composePathFill = fillPath.asComposePath()

        val colorList: List<Color> =
            listOf(
                Color(red = 56, green = 144, blue = 122, alpha = 250),
                Color(red = 96, green = 179, blue = 159, alpha = 77)
            )

        val brush = Brush.horizontalGradient(
            colors = colorList,
            startX = 0f,
            endX = 355.0114440917969.dp.toPx(),
            tileMode = TileMode.Clamp,
        )

        drawPath(path = composePathFill, brush, style = Fill)
        drawPath(
            path = composePathFill,
            color = Color.Transparent,
            style = Stroke(width = 3f, miter = 4f, join = StrokeJoin.Round)
        )
    }
}