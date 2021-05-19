package com.aldhykohar.academy.di

import android.content.Context
import com.aldhykohar.academy.data.source.AcademyRepository
import com.aldhykohar.academy.data.source.remote.RemoteDataSource
import com.aldhykohar.academy.utils.JsonHelper


/**
 * Created by aldhykohar on 5/19/2021.
 */
object Injection {
    fun provideRepository(context: Context): AcademyRepository {

        val remoteDataSource = RemoteDataSource.getInstance(JsonHelper(context))

        return AcademyRepository.getInstance(remoteDataSource)
    }
}