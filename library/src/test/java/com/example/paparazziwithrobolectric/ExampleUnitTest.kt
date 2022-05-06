package com.example.paparazziwithrobolectric

import androidx.test.ext.junit.runners.AndroidJUnit4
import app.cash.paparazzi.Paparazzi
import org.junit.Test

import org.junit.Assert.*
import org.junit.Rule
import org.junit.runner.RunWith

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */

@RunWith(AndroidJUnit4::class)
class ExampleUnitTest {
    @get:Rule
    val paparazzi = Paparazzi()

    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
}