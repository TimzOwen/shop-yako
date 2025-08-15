package com.timzowen.shopyako.component

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp
import com.timzowen.shopyako.shared.Gray
import com.timzowen.shopyako.shared.GrayDarker
import com.timzowen.shopyako.shared.IconSecondary
import com.timzowen.shopyako.shared.Resources
import org.jetbrains.compose.resources.DrawableResource

@Composable
fun GoogleButtonComponent(
    modifier: Modifier = Modifier,
    loading: Boolean = false,
    primaryText: String = "Sign in with Google",
    secondaryText: String = "Please wait..",
    icon: DrawableResource = Resources.Image.GoogleLogo,
    shape: Shape = RoundedCornerShape(size = 99.dp),
    backgroundColor: Color = Gray,
    borderColor: Color = GrayDarker,
    progressIndicatorColor: Color = IconSecondary,
    onClick: () -> Unit,
){

}