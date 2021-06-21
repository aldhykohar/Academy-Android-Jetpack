package com.aldhykohar.academy.di

import android.content.Context
import com.aldhykohar.academy.data.source.AcademyRepository
import com.aldhykohar.academy.data.source.local.LocalDataSource
import com.aldhykohar.academy.data.source.local.room.AcademyDatabase
import com.aldhykohar.academy.data.source.remote.RemoteDataSource
import com.aldhykohar.academy.utils.AppExecutors
import com.aldhykohar.academy.utils.JsonHelper


/**
 * Created by aldhykohar on 5/19/2021.
 */
object Injection {
    fun provideRepository(context: Context): AcademyRepository {

        val database = AcademyDatabase.getInstance(context)

        val remoteDataSource = RemoteDataSource.getInstance(JsonHelper(context))
        val localDataSource = LocalDataSource.getInstance(database.academyDao())
        val appExecutors = AppExecutors()

        return AcademyRepository.getInstance(remoteDataSource, localDataSource, appExecutors)
    }
}