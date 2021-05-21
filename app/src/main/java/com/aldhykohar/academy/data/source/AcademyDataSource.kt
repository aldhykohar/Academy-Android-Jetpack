package com.aldhykohar.academy.data.source

import androidx.lifecycle.LiveData
import com.aldhykohar.academy.data.CourseEntity
import com.aldhykohar.academy.data.ModuleEntity


/**
 * Created by aldhykohar on 5/19/2021.
 */
interface AcademyDataSource {
    fun getAllCourses(): LiveData<List<CourseEntity>>

    fun getBookmarkedCourses(): LiveData<List<CourseEntity>>

    fun getCourseWithModules(courseId: String): LiveData<CourseEntity>

    fun getAllModulesByCourse(courseId: String): LiveData<List<ModuleEntity>>

    fun getContent(courseId: String, moduleId: String): LiveData<ModuleEntity>
}