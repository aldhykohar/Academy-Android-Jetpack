package com.aldhykohar.academy.ui.bookmark

import com.aldhykohar.academy.data.CourseEntity

interface BookmarkFragmentCallback {
    fun onShareClick(course: CourseEntity)
}
