package com.fly_fly.fly_flyhouse.ui.screens.home.views.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.fly_fly.fly_flyhouse.ui.theme.FlyFlyHouseTheme
import com.fly_fly.fly_flyhouse.ui.theme.JetFlyFlyHouseTheme
import com.fly_fly.fly_flyhouse.ui.theme.components.JetIconButton
import com.microsoft.fluent.mobile.icons.R

@Composable
fun HomeTopBar(
    modifier: Modifier = Modifier,
    time: String = "13:00",
    timeLabel: String = "Шведский стол",
    onPersonClick: () -> Unit,
    onQrClick: () -> Unit
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = modifier.fillMaxWidth()
    ) {
        JetIconButton(
            vectorDrawableId = R.drawable.ic_fluent_scan_person_48_filled,
            iconColor = JetFlyFlyHouseTheme.colorScheme.primary.copy(0.35f),
            shape = JetFlyFlyHouseTheme.shapes.small,
            contentPadding = PaddingValues(10.dp),
            modifier = Modifier.size(48.dp),
            onClick = onPersonClick
        )
        Column(
            verticalArrangement = Arrangement.spacedBy(2.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = time,
                style = JetFlyFlyHouseTheme.typography.bodyLarge.copy(
                    color = JetFlyFlyHouseTheme.colorScheme.onSecondary,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Medium,
                    lineHeight = 16.41.sp
                )
            )
            Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                Icon(
                    imageVector = ImageVector.vectorResource(id = R.drawable.ic_fluent_hourglass_half_24_regular),
                    tint = JetFlyFlyHouseTheme.colorScheme.primary,
                    modifier = Modifier.size(18.dp),
                    contentDescription = null
                )
                Text(
                    text = timeLabel,
                    style = JetFlyFlyHouseTheme.typography.bodyLarge.copy(
                        color = JetFlyFlyHouseTheme.colorScheme.onBackground,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Medium,
                        lineHeight = 16.41.sp
                    )
                )
            }
        }
        JetIconButton(
            vectorDrawableId = R.drawable.ic_fluent_qr_code_24_regular,
            iconColor = JetFlyFlyHouseTheme.colorScheme.primary,
            shape = JetFlyFlyHouseTheme.shapes.small,
            contentPadding = PaddingValues(10.dp),
            modifier = Modifier.size(48.dp),
            onClick = onQrClick
        )
    }
}

@Preview(showBackground = true, backgroundColor = 0xFFFBFAFF)
@Composable
private fun HomeTopBarPreview() {
    FlyFlyHouseTheme {
        HomeTopBar(
            onPersonClick = {},
            onQrClick = {}
        )
    }
}