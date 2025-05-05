package com.fly_fly.fly_flyhouse.ui.theme.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fly_fly.fly_flyhouse.R
import com.fly_fly.fly_flyhouse.ui.theme.FlyFlyHouseTheme
import com.fly_fly.fly_flyhouse.ui.theme.JetFlyFlyHouseTheme

@Composable
fun JetTextButton(
    text: String,
    modifier: Modifier = Modifier,
    shape: RoundedCornerShape = RoundedCornerShape(24.dp),
    contentPadding: PaddingValues = PaddingValues(horizontal = 24.dp, vertical = 18.dp),
    onClick: () -> Unit
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .background(JetFlyFlyHouseTheme.colorScheme.primary.copy(0.5f), shape)
            .clip(shape)
            .clickable(onClick = onClick)
            .padding(contentPadding)
    ) {
        Text(
            text = text,
            style = JetFlyFlyHouseTheme.typography.bodyLarge.copy(fontWeight = FontWeight.Medium),
            color = JetFlyFlyHouseTheme.colorScheme.onPrimary
        )
    }
}

@Preview(showBackground = true, backgroundColor = 0xFFFFFFFF)
@Composable
private fun JetGradientButtonPreview() {
    FlyFlyHouseTheme {
        JetTextButton(
            text = stringResource(id = R.string.send_application_button),
            modifier = Modifier.fillMaxWidth()
        ) {
            println("BE SEND")
        }
    }
}