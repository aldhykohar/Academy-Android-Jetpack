package com.aldhykohar.academy.ui.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.aldhykohar.academy.data.source.AcademyRepository
import com.aldhykohar.academy.data.source.local.entity.CourseEntity
import com.aldhykohar.academy.data.source.local.entity.CourseWithModule
import com.aldhykohar.academy.data.source.local.entity.ModuleEntity
import com.aldhykohar.academy.vo.Resource


/**
 * Created by aldhykohar on 5/2/2021.
 */
class DetailCourseViewModel(private val academyRepository: AcademyRepository) : ViewModel() {
    val courseId = MutableLiveData<String>()

    fun setSelectedCourse(courseId: String) {
        this.courseId.value = courseId
    }

    var courseModule: LiveData<Resource<CourseWithModule>> = Transformations.switchMap(courseId) { mCourseId ->
        academyRepository.getCourseWithModules(mCourseId)
    }

    fun setBookmark() {
        val moduleResource = courseModule.value
        if (moduleResource != null) {
            val courseWithModule = moduleResource.data
            if (courseWithModule != null) {
                val courseEntity = courseWithModule.mCourse
                val newState = !courseEntity.bookmarked
                academyRepository.setCourseBookmark(courseEntity, newState)
            }
        }
    }
}