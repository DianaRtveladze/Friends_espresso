package com.atiurin.sampleapp.pages

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.atiurin.sampleapp.R
import com.atiurin.ultron.core.espresso.recyclerview.withRecyclerView
import org.hamcrest.Matcher
import org.hamcrest.Matchers

object ChatPage {

    val friendsName: Matcher<View> by lazy { withId(R.id.toolbar_title) }
    val clearHistoryBtn: Matcher<View> = withText("Clear history")
    val messages = withRecyclerView(R.id.messages_list)
    val inputMessageText: Matcher<View> by lazy { withId(R.id.message_input_text) }
    val sendMessageBtn: Matcher<View> by lazy { withId(R.id.send_button) }

    fun sentMessage(text: String): Matcher<View> {
        return Matchers.allOf(withRecyclerView(R.id.messages_list), withText(text))
    }
}
