package com.aldhykohar.academy.ui.bookmark

import androidx.lifecycle.ViewModel
import com.aldhykohar.academy.data.CourseEntity
import com.aldhykohar.academy.utils.DataDummy


/**
 * Created by aldhykohar on 5/2/2021.
 */
class BookmarkViewModel : ViewModel() {

    fun getBookmarks(): List<CourseEntity> = DataDummy.generateDummyCourses()
}