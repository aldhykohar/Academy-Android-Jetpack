package com.aldhykohar.academy.data.source.remote.response

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


/**
 * Created by aldhykohar on 5/19/2021.
 */
@Parcelize
data class CourseResponse(
    var id: String,
    var title: String,
    var description: String,
    var date: String,
    var imagePath: String
) : Parcelable