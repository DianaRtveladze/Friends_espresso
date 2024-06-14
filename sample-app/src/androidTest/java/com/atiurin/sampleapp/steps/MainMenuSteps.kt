package com.atiurin.sampleapp.steps

import com.atiurin.sampleapp.pages.MainMenuPage
import com.atiurin.ultron.extensions.tap

object MainMenuSteps {
    fun clickOnMenuItem(itemName: String) {
        MainMenuPage.menuItem(itemName).tap()
    }
}
