package com.aldhykohar.academy.ui.bookmark

import com.aldhykohar.academy.data.source.local.entity.CourseEntity

interface BookmarkFragmentCallback {
    fun onShareClick(course: CourseEntity)
}
