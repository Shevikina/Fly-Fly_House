package com.fly_fly.fly_flyhouse.ui.screens.home.views.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.fly_fly.fly_flyhouse.data.local.Database
import com.fly_fly.fly_flyhouse.data.local.ui.models.SpecialOfferInfo
import com.fly_fly.fly_flyhouse.ui.theme.FlyFlyHouseTheme
import com.fly_fly.fly_flyhouse.ui.theme.JetFlyFlyHouseTheme
import com.fly_fly.fly_flyhouse.utils.DottedDivider
import com.fly_fly.fly_flyhouse.utils.advancedShadow

private fun Int.getFormatted(): String {
    var res = ""
    var tmp = this
    while (tmp > 0) {
        val toAdd = if (tmp % 1000 == 0) "000" else "${tmp % 1000}"
        res = "$toAdd $res"
        tmp /= 1000
    }
    return res.trim()
}

@Composable
fun SpecialOfferCard(
    info: SpecialOfferInfo,
    modifier: Modifier = Modifier,
    onClick: (() -> Unit)? = null
) {
    Column(
        modifier = modifier
            .advancedShadow(
                cornersRadius = 8.dp,
                offsetY = 5.dp,
                shadowBlurRadius = 4.dp,
                color = Color.Black,
                alpha = 0.02f
            )
            .background(
                JetFlyFlyHouseTheme.colorScheme.secondary,
                JetFlyFlyHouseTheme.shapes.small
            )
            .let {
                if (onClick != null) it
                    .clip(JetFlyFlyHouseTheme.shapes.small)
                    .clickable(onClick = onClick) else it
            }

    ) {
        AsyncImage(
            model = info.imagePath,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .heightIn(max = 156.dp)
                .clip(RoundedCornerShape(8.dp, 8.dp))
                .background(Color.Gray)
        )
        Column(
            modifier = Modifier.padding(20.dp, 16.dp, 80.dp)
        ) {
            Text(
                text = info.title,
                style = JetFlyFlyHouseTheme.typography.bodyLarge.copy(
                    color = JetFlyFlyHouseTheme.colorScheme.primary,
                    fontWeight = FontWeight.Medium,
                    lineHeight = 1.em,
                    letterSpacing = 0.em
                )
            )
            DottedDivider(
                color = JetFlyFlyHouseTheme.colorScheme.onSecondary.copy(0.24f),
                thickness = 2.dp,
                dashWidth = 4.dp,
                gapWidth = 4.dp,
                modifier = Modifier.padding(vertical = 3.dp)
            )
            Text(
                text = info.description,
                overflow = TextOverflow.Ellipsis,
                maxLines = 2,
                style = JetFlyFlyHouseTheme.typography.bodyLarge.copy(
                    color = JetFlyFlyHouseTheme.colorScheme.onSecondary,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Medium,
                    lineHeight = 1.em,
                    letterSpacing = 0.em
                )
            )
        }
        Text(
            text = "${info.price.getFormatted()} Kr",
            style = JetFlyFlyHouseTheme.typography.bodyLarge.copy(
                color = JetFlyFlyHouseTheme.colorScheme.primary,
                fontSize = 12.sp,
                fontWeight = FontWeight.Medium,
                lineHeight = 14.06.sp
            ),
            modifier = Modifier
                .align(Alignment.End)
                .padding(top = 11.dp, end = 12.dp, bottom = 16.dp)
        )
    }
}

@Preview
@Composable
private fun SpecialOfferCardPreview() {
    FlyFlyHouseTheme {
        Box(
            modifier = Modifier
                .background(JetFlyFlyHouseTheme.colorScheme.background)
                .padding(32.dp)
        ) {
            SpecialOfferCard(
                Database.offerList.first { it.id == 0 },
                Modifier,
                onClick = {}
            )
        }
    }
}