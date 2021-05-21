package com.aldhykohar.academy.ui.academy

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.aldhykohar.academy.data.CourseEntity
import com.aldhykohar.academy.data.source.AcademyRepository
import com.aldhykohar.academy.utils.DataDummy


/**
 * Created by aldhykohar on 5/2/2021.
 */
class AcademyViewModel(private val academyRepository: AcademyRepository) : ViewModel() {

    fun getCourses(): LiveData<List<CourseEntity>> = academyRepository.getAllCourses()
}