package com.atiurin.sampleapp.steps

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers.isChecked
import com.atiurin.sampleapp.helper.isViewDisplayed
import com.atiurin.sampleapp.pages.CustomClicksPage
import com.atiurin.sampleapp.pages.CustomClicksPage.circles
import com.atiurin.ultron.extensions.isChecked
import com.atiurin.ultron.extensions.tap
import org.hamcrest.Matcher
import org.junit.Assert

object CustomClicksSteps {

    fun checkIfPageIsLoaded() {
        with(CustomClicksPage) {
            Assert.assertTrue(
                circlesPage.isViewDisplayed() && image.isViewDisplayed()
            )
        }
    }
    fun clickOnCircle(circle: Matcher<View>) {
        circle.tap()
    }

    fun clickAllCircles() {
        for (circle in circles) {
            circle.tap()
        }
    }

    fun validatingIfCircleIsChecked(circle: Matcher<View>) {
        Assert.assertTrue(circle.matches(isChecked()))
    }
    fun validateAllCirclesAreChecked() {
        for (circle in circles) {
            circle.isChecked()
        }
    }
}
