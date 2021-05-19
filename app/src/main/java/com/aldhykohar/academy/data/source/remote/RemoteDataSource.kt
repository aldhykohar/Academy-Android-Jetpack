package com.aldhykohar.academy.data.source.remote

import com.aldhykohar.academy.data.source.remote.response.ContentResponse
import com.aldhykohar.academy.data.source.remote.response.CourseResponse
import com.aldhykohar.academy.data.source.remote.response.ModuleResponse
import com.aldhykohar.academy.utils.JsonHelper


/**
 * Created by aldhykohar on 5/19/2021.
 */
class RemoteDataSource private constructor(private val jsonHelper: JsonHelper) {

    companion object {
        @Volatile
        private var instance: RemoteDataSource? = null

        fun getInstance(helper: JsonHelper): RemoteDataSource =
            instance ?: synchronized(this) {
                instance ?: RemoteDataSource(helper).apply { instance = this }
            }
    }

    fun getAllCourses(): List<CourseResponse> = jsonHelper.loadCourses()

    fun getModules(courseId: String): List<ModuleResponse> = jsonHelper.loadModule(courseId)

    fun getContent(moduleId: String): ContentResponse = jsonHelper.loadContent(moduleId)

}