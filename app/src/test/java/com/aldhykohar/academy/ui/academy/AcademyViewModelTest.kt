package com.aldhykohar.academy.ui.academy

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

/**
 * Created by aldhykohar on 5/3/2021.
 */
class AcademyViewModelTest {

    private lateinit var viewModel: AcademyViewModel
    @Before
    fun setUp() {
        viewModel = AcademyViewModel()
    }

    @Test
    fun getCourses() {
        val courseEntities = viewModel.getCourses()
        assertNotNull(courseEntities)
        assertEquals(5, courseEntities.size)
    }
}