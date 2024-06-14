package com.atiurin.sampleapp.pages

import android.view.View
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withContentDescription
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.atiurin.sampleapp.R
import org.hamcrest.Matcher
import org.hamcrest.Matchers
import java.util.EnumSet.allOf
import java.util.regex.Pattern.matches

object DashboardPage {

    val drawerLayout: Matcher<View> by lazy { (withId(R.id.drawer_layout)) }
    val recyclerFriends: Matcher<View> by lazy { (withId(R.id.recycler_friends)) }
    val menuIcon: Matcher<View> by lazy { (withContentDescription("Open navigation drawer")) }

    fun friendWithName(name: String): Matcher<View> {
        return Matchers.allOf(withId(R.id.tv_name), withText(name))
    }
}