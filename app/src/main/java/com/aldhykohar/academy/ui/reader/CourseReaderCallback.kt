package com.aldhykohar.academy.ui.reader


/**
 * Created by aldhykohar on 5/2/2021.
 */
interface CourseReaderCallback {
    fun moveTo(position: Int, moduleId: String)
}