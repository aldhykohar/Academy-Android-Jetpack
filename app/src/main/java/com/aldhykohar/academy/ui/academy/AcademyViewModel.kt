package com.aldhykohar.academy.ui.academy

import androidx.lifecycle.ViewModel
import com.aldhykohar.academy.data.CourseEntity
import com.aldhykohar.academy.utils.DataDummy


/**
 * Created by aldhykohar on 5/2/2021.
 */
class AcademyViewModel : ViewModel() {

    fun getCourses(): List<CourseEntity> = DataDummy.generateDummyCourses()
}