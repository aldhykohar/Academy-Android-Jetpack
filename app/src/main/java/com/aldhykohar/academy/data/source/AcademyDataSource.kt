package com.aldhykohar.academy.data.source

import androidx.lifecycle.LiveData
import com.aldhykohar.academy.data.source.local.entity.CourseEntity
import com.aldhykohar.academy.data.source.local.entity.CourseWithModule
import com.aldhykohar.academy.data.source.local.entity.ModuleEntity
import com.aldhykohar.academy.vo.Resource


/**
 * Created by aldhykohar on 5/19/2021.
 */
interface AcademyDataSource {
    fun getAllCourses(): LiveData<Resource<List<CourseEntity>>>

    fun getCourseWithModules(courseId: String): LiveData<Resource<CourseWithModule>>

    fun getAllModulesByCourse(courseId: String): LiveData<Resource<List<ModuleEntity>>>

    fun getContent(moduleId: String): LiveData<Resource<ModuleEntity>>

    fun getBookmarkedCourses(): LiveData<List<CourseEntity>>

    fun setCourseBookmark(course: CourseEntity, state: Boolean)
    fun setReadModule(module: ModuleEntity)
}