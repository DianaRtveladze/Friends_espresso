package com.atiurin.sampleapp.steps

import com.atiurin.sampleapp.helper.isViewDisplayed
import com.atiurin.sampleapp.pages.DashboardPage
import com.atiurin.ultron.extensions.tap
import org.junit.Assert

object DashboardSteps {
    fun assertDashboardIsLoaded() {
        with(DashboardPage) { Assert.assertTrue(drawerLayout.isViewDisplayed() &&
                        recyclerFriends.isViewDisplayed()
            )
        }
    }
    fun openMainMenu() {
        DashboardPage.menuIcon.tap()
    }
    fun openChatWithFriend(name: String) {
        DashboardPage.friendWithName(name).tap()
    }

}