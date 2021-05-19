package com.aldhykohar.academy.ui.detail

import androidx.lifecycle.ViewModel
import com.aldhykohar.academy.data.CourseEntity
import com.aldhykohar.academy.data.ModuleEntity
import com.aldhykohar.academy.utils.DataDummy


/**
 * Created by aldhykohar on 5/2/2021.
 */
class DetailCourseViewModel : ViewModel() {
    private lateinit var courseId: String

    fun setSelectedCourse(courseId: String) {
        this.courseId = courseId
    }

    fun getCourse(): CourseEntity {
        lateinit var course: CourseEntity
        val coursesEntities = DataDummy.generateDummyCourses()
        for (courseEntity in coursesEntities) {
            if (courseEntity.courseId == courseId) {
                course = courseEntity
            }
        }
        return course
    }

    fun getModules(): List<ModuleEntity> = DataDummy.generateDummyModules(courseId)
}