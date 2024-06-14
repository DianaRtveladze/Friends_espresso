package com.atiurin.sampleapp.tests.espresso

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.atiurin.sampleapp.activity.MainActivity
import com.atiurin.sampleapp.data.Common
import com.atiurin.sampleapp.steps.ChatSteps
import com.atiurin.sampleapp.steps.CustomClicksSteps
import com.atiurin.sampleapp.steps.DashboardSteps
import com.atiurin.sampleapp.steps.MainMenuSteps
import com.atiurin.sampleapp.tests.BaseTest
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class ChattingTests : BaseTest() {

    @get:Rule
    val activityTestRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun chatWithFriendTest() {
        with(DashboardSteps) {
            assertDashboardIsLoaded()
            openChatWithFriend(Common.friendsName)
        }
        with(ChatSteps) {
            checkTheRightAddress(Common.friendsName)
            writeMessage(Common.messageText)
            sendMessage()
            checkMessage(Common.messageText)
        }
    }

    @Test
    fun clickOnCirclesTest() {
        with(DashboardSteps) {
            assertDashboardIsLoaded()
            openMainMenu()
        }
        MainMenuSteps.clickOnMenuItem(Common.customClicksMenuItem)

        with(CustomClicksSteps) {
            checkIfPageIsLoaded()
            clickAllCircles()
            validateAllCirclesAreChecked()
        }
    }
}
