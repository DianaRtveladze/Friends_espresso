package com.atiurin.sampleapp.pages

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.atiurin.sampleapp.R
import org.hamcrest.Matcher

object CustomClicksPage {
    private val circle1: Matcher<View> by lazy { (withId(R.id.rB_top_left)) }
    private val circle2: Matcher<View> by lazy { (withId(R.id.rB_top_center)) }
    private val circle3: Matcher<View> by lazy { (withId(R.id.rB_top_right)) }
    private val circle4: Matcher<View> by lazy { (withId(R.id.rB_center_left)) }
    private val circle5: Matcher<View> by lazy { (withId(R.id.rB_center_right)) }
    private val circle6: Matcher<View> by lazy { (withId(R.id.rB_bottom_left)) }
    private val circle7: Matcher<View> by lazy { (withId(R.id.rB_bottom_center)) }
    private val circle8: Matcher<View> by lazy { (withId(R.id.rB_bottom_right)) }

    val circles: List<Matcher<View>> by lazy {
        listOf(
            circle1,
            circle2,
            circle3,
            circle4,
            circle5,
            circle6,
            circle7,
            circle8
        )
    }

    val circlesPage: Matcher<View> by lazy { (withId(R.id.frameLayout)) }
    val image: Matcher<View> by lazy { (withId(R.id.imageView)) }
}
