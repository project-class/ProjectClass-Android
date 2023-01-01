package com.st17.workclass.ui.screens.student.mainscreen

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.st17.workclass.data.Lesson
import com.st17.workclass.data.LessonStatus
import com.st17.workclass.model.datetime.Date
import com.st17.workclass.model.datetime.Time
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject


class StudentMainViewModel @Inject constructor(private val time: Time) : ViewModel() {

    var lesson: Lesson = Lesson(place = 0)


    private val _currentName = MutableStateFlow("")
    var currentNote = _currentName.asStateFlow()


    fun updateNote(input: String) {
        viewModelScope.launch {
            _currentName.value = input
        }
    }


    private val _lessons = MutableStateFlow(mutableListOf<Lesson>(
        Lesson(name = "Math", homework = "p2, ex 1-5", place = 1, status = LessonStatus.PAST, office = "10", theme = "Теория вероятностей и Математическая статистика"),
        Lesson(name = "Math", place = 2, status = LessonStatus.CURRENT, office = "10", theme = "Теория вероятностей и Математическая статистика", note = "Подготовится к контрольной"),
        Lesson(name = "Russian language", place = 3, status = LessonStatus.NEXT, office = "32", theme = "Причастные и деепричастные обороты"),
        Lesson(name = "Russian language", place = 4, status = LessonStatus.NEXT, office = "32", theme = "Причастные и деепричастные обороты"),
        Lesson(name = "Sociology", homework = "1)Read p1\n2)answer the questions in the\n3)of paragraph ", place = 5, status = LessonStatus.NEXT, office = "13", theme = "Гражданское общество"),
        Lesson(name = "Sociology", homework = "1)Read p1\n2)answer the questions in the\n3)of paragraph ", place = 6, status = LessonStatus.NEXT, office = "13", theme = "Гражданское общество"),
        Lesson(name = "Economy", homework = "1)Read p1\n2)answer the questions in the\n3)of paragraph ", place = 7, status = LessonStatus.NEXT, office = "24", theme = "Типы экономик (плановая, смешаная, рыночная)"),
        Lesson(name = "Economy", homework = "1)Read p1\n2)answer the questions in the\n3)of paragraph ", place = 8, status = LessonStatus.NEXT, office = "24", theme = "Типы экономик (плановая, смешаная, рыночная)")
    ))
    var lessons = _lessons.asStateFlow()

    fun updateLesson(input: String) {
        viewModelScope.launch {
            _lessons.value[lesson.place-1].note = input
        }
    }



    @RequiresApi(Build.VERSION_CODES.O)
    var date = time.getCurrentDate()

    @RequiresApi(Build.VERSION_CODES.O)
    fun getWeek(date : Date): MutableList<Date>{
        return time.getWeekByDate(date)
    }
}
