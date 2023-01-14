package com.st17.workclass.ui.screens.teacher.mainscreen

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.lifecycle.ViewModel
import com.st17.workclass.data.consts.lesson.Lesson
import com.st17.workclass.data.consts.lesson.LessonStatus
import com.st17.workclass.model.dateTime.Date
import com.st17.workclass.model.dateTime.Time
import com.st17.workclass.ui.screens.teacher.mainscreen.marks.StudentData
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject


class TeacherMainViewModel @Inject constructor(private val time: Time) : ViewModel() {

    //поля ввода
    private val _note = MutableStateFlow("")
    val note = _note.asStateFlow()
    fun setNote(note: String) {
        _note.value = note
    }

    private val _homework = MutableStateFlow("")
    val homework = _homework.asStateFlow()
    fun setHomeWork(homework: String) {
        _homework.value = homework
    }


    //lessons
    private val _lesson = MutableStateFlow(Lesson(place = 0))
    var lesson = _lesson.asStateFlow()

    fun setLesson(lesson: Lesson){
        _lesson.value = lesson
    }

    private val _lessons = MutableStateFlow(mutableListOf<Lesson>(
        Lesson(name = "Math", homework = "p2, ex 1-5", place = 1, status = LessonStatus.PAST, office = "10", theme = "Теория вероятностей и Математическая статистика"),
        Lesson(name = "Math", place = 2, status = LessonStatus.CURRENT, office = "10", theme = "Теория вероятностей и Математическая статистика", note = "Не забыть варианты для контрольной"),
        Lesson(name = "Russian language", place = 3, status = LessonStatus.NEXT, office = "32", theme = "Причастные и деепричастные обороты"),
        Lesson(name = "Russian language", place = 4, status = LessonStatus.NEXT, office = "32", theme = "Причастные и деепричастные обороты"),
        Lesson(name = "Sociology", homework = "1)Read p1\n2)answer the questions in the end of paragraph ", place = 5, status = LessonStatus.NEXT, office = "13", theme = "Гражданское общество"),
        Lesson(name = "Sociology", homework = "1)Read p1\n2)answer the questions in the end of paragraph ", place = 6, status = LessonStatus.NEXT, office = "13", theme = "Гражданское общество"),
        Lesson(name = "Economy", homework = "1)Read p1\n2)answer the questions in the end of paragraph ", place = 7, status = LessonStatus.NEXT, office = "24", theme = "Типы экономик (плановая, смешаная, рыночная)"),
        Lesson(name = "Economy", homework = "1)Read p1\n2)answer the questions in the end of paragraph ", place = 8, status = LessonStatus.NEXT, office = "24", theme = "Типы экономик (плановая, смешаная, рыночная)")
    ))
    var lessons = _lessons.asStateFlow()

    fun updateLesson(lesson: Lesson) {
        _lessons.value[lesson.place-1] = lesson
    }



    //user
    private val _comment = MutableStateFlow("")
    val comment = _comment.asStateFlow()
    fun setComment(comment: String) {
        _comment.value = comment
    }

    private val _mark = MutableStateFlow("")
    val mark = _mark.asStateFlow()
    fun setMark(mark: String) {
        _mark.value = mark
    }

    private val _studentData = MutableStateFlow(StudentData("","","", 0))
    var studentData = _studentData.asStateFlow()

    fun setStudentData(lesson1: StudentData){
        _studentData.value = lesson1
    }


    private val _studentDataList = MutableStateFlow(mutableListOf<StudentData>(
        StudentData("Борис Годунов"),
        StudentData("Константин Колчанов"),
        StudentData("Борис Ельцин"),
        StudentData("Иисус Христос"),
        StudentData("Будда Шакьямуни"),
        StudentData("Апостол Павел"),
        StudentData("Цай Лунь"),
        StudentData("Иоганн Гутенберг"),
        StudentData("Альберт Эйнштейн"),
        StudentData("Галилео Галилей"),
        StudentData("Чарльз Дарвин"),
        StudentData("Цинь Шихуанди"),
        StudentData("Октавиан Август"),
        StudentData("Николай Коперник"),
        StudentData("Майкл Фарадей"),
        StudentData("Мартин Лютер"),
        StudentData("Карл Маркс"),
        StudentData("Наполеон I"),
        StudentData("Людвиг ван Бетховен"),
        StudentData("Иосиф Сталин"),
        StudentData("Юлий Цезарь"),
        StudentData("Владимир Ленин"),
        StudentData("Пётр I"),
        StudentData("Гомер"),
        StudentData("Гуччио Гуччи"),
    ))
    var studentDataList = _studentDataList.asStateFlow()

    fun updateStudentDataList(studentData: StudentData) {
        _studentDataList.value[studentData.place-1] = studentData
    }





    @RequiresApi(Build.VERSION_CODES.O)
    var date = time.getCurrentDate()

    @RequiresApi(Build.VERSION_CODES.O)
    fun getWeek(date : Date): MutableList<Date>{
        return time.getWeekByDate(date)
    }
}
