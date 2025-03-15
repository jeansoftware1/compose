package com.example.myapplication.constants

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import com.example.myapplication.R

enum class MenuItemEnum(
) {
    BONUS, SETTINGS, HELP, ABOUT, NEW;

    companion object {
        @Composable
        fun MenuItemEnum.getTitle(): String = when (this) {
            BONUS -> "Bônus EXTRA"
            SETTINGS -> "Configurações"
            HELP -> "Ajuda"
            ABOUT -> "Sobre"
            NEW -> "NOVO"
        }

        @Composable
        fun MenuItemEnum.getIcon(): ImageVector = when (this) {
            BONUS -> ImageVector.vectorResource(R.drawable.ic_menu)
            SETTINGS -> ImageVector.vectorResource(R.drawable.ic_menu)
            HELP -> ImageVector.vectorResource(R.drawable.ic_menu)
            ABOUT -> ImageVector.vectorResource(R.drawable.ic_menu)
            NEW -> ImageVector.vectorResource(R.drawable.ic_menu)
        }

        @Composable
        fun MenuItemEnum.getColor(): Color = when (this) {
            BONUS -> Color.Red
            SETTINGS -> Color.Black
            HELP -> Color.Magenta
            ABOUT -> Color.Blue
            NEW -> Color.Gray
        }
    }
}