package com.aldhykohar.academy.vo

import com.aldhykohar.academy.data.source.remote.StatusResponse


/**
 * Created by aldhykohar on 6/20/2021.
 */
data class Resource<T>(val status: Status, val data: T?, val message: String?) {
    companion object {
        fun <T> success(data: T?): Resource<T> = Resource(Status.SUCCESS, data, null)

        fun <T> error(msg: String?, data: T?): Resource<T> = Resource(Status.ERROR, data, msg)

        fun <T> loading(data: T?): Resource<T> = Resource(Status.LOADING, data, null)
    }
}