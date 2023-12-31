package com.singularity_code.core.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.singularity_code.core.ui.util.material3.BaseComposeTheme

@Composable
fun ContentThemeWrapper(
    modifier: Modifier = Modifier,
    forceDark: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    BaseComposeTheme(
        darkTheme = forceDark
    ) {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = modifier,
            color = MaterialTheme.colorScheme.background,
            content = content
        )
    }
}