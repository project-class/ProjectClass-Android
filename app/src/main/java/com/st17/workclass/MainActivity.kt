package com.st17.workclass

import android.graphics.Matrix
import android.graphics.Path
import android.graphics.RectF
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.*
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.asComposePath
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.graphics.PathParser
import com.st17.workclass.ui.theme.WorkClassTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WorkClassTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Column(modifier = Modifier.fillMaxHeight()) {
                        top()
                        down()
                    }

                }
            }
        }
    }
}

@Composable
fun top() {

    Canvas(
        modifier = Modifier
            .width(360.dp)
            .height(190.9195556640625.dp)
            .fillMaxWidth()
            .rotate(180f)
            .aspectRatio(1f)


    ) {
        val fillPath = PathParser.createPathFromPathData("M 0 48.91954803466797 C 17.33333396911621 29.086214065551758 65.20000076293945 -1.8204154968261719 118 32.579586029052734 C 170.79999923706055 66.97958755493164 194.125 35.07958793640137 199.125 15.079587936401367 C 203.25 -1.4204158782958984 226.79999923706055 -16.92041778564453 262 41.07958221435547 C 297.20000076293945 99.07958221435547 342 59.579586029052734 360 32.579586029052734 L 360 190.9195556640625 L 0 190.9195556640625 L 0 48.91954803466797 Z ")
        val rectF = RectF()
        fillPath.computeBounds(rectF, true)
        val matrix = Matrix()
        val scale = minOf( size.width / rectF.width(), size.height / rectF.height() )
        matrix.setScale(scale, scale)
        fillPath.transform(matrix)
        val composePathFill = fillPath.asComposePath()

        drawPath(path = composePathFill, color = Color(red = 0.8509804010391235f, green = 0.3960784375667572f, blue = 0.250980406999588f, alpha = 1f), style = Fill)
        drawPath(path = composePathFill, color = Color.Transparent, style = Stroke(width = 3f, miter = 4f, join = StrokeJoin.Round))
    }
}

@Composable
fun down() {

    Canvas(
        modifier = Modifier
            .width(360.02197265625.dp)
            .height(304.dp)
            .fillMaxSize()
            .rotate(180f)
            .aspectRatio(1f)

    ) {
        val fillPath = PathParser.createPathFromPathData("M 2.2737367544323206e-13 293.5 C 14.796396255493391 292.41680335998535 41.15476989746094 259.3199272155762 59.5 196.5 C 77.04243469238281 136.4291000366211 166.5 101.33333349227905 222.5 97 C 295 91.38988065719604 352.31147462129593 42.400001525878906 351.511474609375 0 L 0 0 L 2.2737367544323206e-13 293.5 Z M 59.5 196.5 C 41.15476989746094 259.3199272155762 14.796396255493391 292.41680335998535 2.2737367544323206e-13 293.5 L 0 304 C 15.166666984558105 302.5 51.23288059234619 265.6986274719238 66.5 205.5 C 82.15455055236816 143.77372360229492 172.06893920898438 108.37837362289429 228.5 105.5 C 301.4245376586914 101.78034520149231 360.9297072291374 44.1973876953125 360.011474609375 0 L 351.511474609375 0 C 352.31147462129593 42.400001525878906 295 91.38988065719604 222.5 97 C 166.5 101.33333349227905 77.04243469238281 136.4291000366211 59.5 196.5 Z ")
        //fillPath.fillType = Path.FillType.EVEN_ODD
        val rectF = RectF()
        fillPath.computeBounds(rectF, true)
        val matrix = Matrix()
        val scale = minOf( size.width / rectF.width(), size.height / rectF.height() )
        matrix.setScale(scale, scale)
        fillPath.transform(matrix)
        val composePathFill = fillPath.asComposePath()


        drawPath(path = composePathFill, color = Color(red = 0f, green = 1f, blue = 0f, alpha = 1f), style = Fill)
        drawPath(path = composePathFill, color = Color.Transparent, style = Stroke(width = 3f, miter = 4f, join = StrokeJoin.Round))
    }

}