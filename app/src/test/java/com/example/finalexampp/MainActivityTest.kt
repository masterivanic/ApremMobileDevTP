package com.example.finalexampp

import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith
import androidx.test.espresso.Espresso.onView

@RunWith(AndroidJUnit4::class)
class MainActivityTest {
    @Test
    fun button_isDisplayed() {
        onView(withId(R.id.myButton)).check(matches(isDisplayed()))
    }

}