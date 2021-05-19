package com.aldhykohar.academy.data


/**
 * Created by aldhykohar on 5/2/2021.
 */
data class CourseEntity(
    var courseId: String,
    var title: String,
    var description: String,
    var deadline: String,
    var bookmarked: Boolean = false,
    var imagePath: String
)