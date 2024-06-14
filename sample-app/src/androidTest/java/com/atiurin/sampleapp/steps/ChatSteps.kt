package com.atiurin.sampleapp.steps

import com.atiurin.sampleapp.helper.isViewDisplayed
import com.atiurin.sampleapp.pages.ChatPage
import com.atiurin.ultron.custom.espresso.action.getText
import com.atiurin.ultron.extensions.tap
import com.atiurin.ultron.extensions.typeText
import org.junit.Assert

object ChatSteps {

    fun writeMessage(text: String) {
        ChatPage.inputMessageText.typeText(text)
    }
    fun sendMessage() {
        ChatPage.sendMessageBtn.tap()
    }
    fun checkTheRightAddress(name: String) {
        Assert.assertEquals(name, ChatPage.friendsName.getText())
    }
    fun checkMessage(text: String) {
        Assert.assertTrue(ChatPage.sentMessage(text).isViewDisplayed())
    }
}