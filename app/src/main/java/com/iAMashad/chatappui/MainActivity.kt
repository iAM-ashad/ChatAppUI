package com.iAMashad.chatappui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.iAMashad.chatappui.navigation.ChatNavigation
import com.iAMashad.chatappui.ui.theme.ChatAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ChatAppTheme {
                ChatNavigation()
            }
        }
    }
}
