package com.aldhykohar.academy.data.source.remote.response

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


/**
 * Created by aldhykohar on 5/19/2021.
 */
@Parcelize
data class ModuleResponse(
    var moduleId: String,
    var courseId: String,
    var title: String,
    var position: Int
) : Parcelable