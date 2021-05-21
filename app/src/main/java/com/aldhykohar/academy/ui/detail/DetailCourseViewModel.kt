package com.aldhykohar.academy.ui.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.aldhykohar.academy.data.CourseEntity
import com.aldhykohar.academy.data.ModuleEntity
import com.aldhykohar.academy.data.source.AcademyRepository
import com.aldhykohar.academy.utils.DataDummy


/**
 * Created by aldhykohar on 5/2/2021.
 */
class DetailCourseViewModel(private val academyRepository: AcademyRepository) : ViewModel() {
    private lateinit var courseId: String

    fun setSelectedCourse(courseId: String) {
        this.courseId = courseId
    }

    fun getCourse(): LiveData<CourseEntity> = academyRepository.getCourseWithModules(courseId)

    fun getModules(): LiveData<List<ModuleEntity>> =
        academyRepository.getAllModulesByCourse(courseId)
}