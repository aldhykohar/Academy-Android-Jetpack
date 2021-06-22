package com.aldhykohar.academy.ui.academy

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.paging.PagedList
import com.aldhykohar.academy.data.source.AcademyRepository
import com.aldhykohar.academy.data.source.local.entity.CourseEntity
import com.aldhykohar.academy.utils.DataDummy
import com.aldhykohar.academy.vo.Resource


/**
 * Created by aldhykohar on 5/2/2021.
 */
class AcademyViewModel(private val academyRepository: AcademyRepository) : ViewModel() {

    fun getCourses(): LiveData<Resource<PagedList<CourseEntity>>> = academyRepository.getAllCourses()
}