package com.aldhykohar.academy.data.source

import com.aldhykohar.academy.data.CourseEntity
import com.aldhykohar.academy.data.ModuleEntity


/**
 * Created by aldhykohar on 5/19/2021.
 */
interface AcademyDataSource {
    fun getAllCourses(): List<CourseEntity>

    fun getBookmarkedCourses(): List<CourseEntity>

    fun getCourseWithModules(courseId: String): CourseEntity

    fun getAllModulesByCourse(courseId: String): List<ModuleEntity>

    fun getContent(courseId: String, moduleId: String): ModuleEntity
}