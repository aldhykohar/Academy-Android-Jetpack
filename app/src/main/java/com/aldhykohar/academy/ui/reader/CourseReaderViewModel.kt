package com.aldhykohar.academy.ui.reader

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.aldhykohar.academy.data.ModuleEntity
import com.aldhykohar.academy.data.source.AcademyRepository


/**
 * Created by aldhykohar on 5/2/2021.
 */
class CourseReaderViewModel(private val academyRepository: AcademyRepository) : ViewModel() {

    private lateinit var courseId: String
    private lateinit var moduleId: String

    fun setSelectedCourse(courseId: String) {
        this.courseId = courseId
    }

    fun setSelectedModule(moduleId: String) {
        this.moduleId = moduleId
    }

    fun getModules(): LiveData<List<ModuleEntity>> =
        academyRepository.getAllModulesByCourse(courseId)

    fun getSelectedModule(): LiveData<ModuleEntity> =
        academyRepository.getContent(courseId, moduleId)
}