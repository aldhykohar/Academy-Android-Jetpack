package com.aldhykohar.academy.ui.bookmark

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.aldhykohar.academy.data.source.AcademyRepository
import com.aldhykohar.academy.data.source.local.entity.CourseEntity


/**
 * Created by aldhykohar on 5/2/2021.
 */
class BookmarkViewModel(private val academyRepository: AcademyRepository) : ViewModel() {

    fun getBookmarks(): LiveData<List<CourseEntity>> = academyRepository.getBookmarkedCourses()
}