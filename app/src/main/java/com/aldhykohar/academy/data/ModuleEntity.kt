package com.aldhykohar.academy.data


/**
 * Created by aldhykohar on 5/2/2021.
 */
data class ModuleEntity(
    var moduleId: String,
    var courseId: String,
    var title: String,
    var position: Int,
    var read: Boolean = false
){
    var contentEntity: ContentEntity? = null
}
