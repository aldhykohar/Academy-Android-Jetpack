package com.aldhykohar.academy.data.source.local.entity

import androidx.room.Embedded
import androidx.room.Relation


/**
 * Created by aldhykohar on 6/20/2021.
 */
data class CourseWithModule (
    @Embedded
    var mCourse: CourseEntity,
    @Relation(parentColumn = "courseId", entityColumn = "courseId")
    var mModules: List<ModuleEntity>
)
