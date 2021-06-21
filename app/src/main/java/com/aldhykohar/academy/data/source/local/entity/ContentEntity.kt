package com.aldhykohar.academy.data.source.local.entity

import androidx.room.ColumnInfo


/**
 * Created by aldhykohar on 6/20/2021.
 */
data class ContentEntity(
    @ColumnInfo(name = "content")
    var content: String?
)