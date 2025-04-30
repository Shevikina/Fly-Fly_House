package com.fly_fly.fly_flyhouse.ui.screens.home.views

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.fly_fly.fly_flyhouse.R
import com.fly_fly.fly_flyhouse.ui.navigation.NavScreen
import com.fly_fly.fly_flyhouse.ui.screens.home.models.HomeEvent
import com.fly_fly.fly_flyhouse.ui.screens.home.views.components.ServicesWidget
import com.fly_fly.fly_flyhouse.ui.screens.home.views.components.SpecialOffersWidget
import com.fly_fly.fly_flyhouse.ui.theme.FlyFlyHouseTheme
import com.fly_fly.fly_flyhouse.ui.theme.JetFlyFlyHouseTheme
import com.fly_fly.fly_flyhouse.ui.theme.components.JetIconButton
import com.fly_fly.fly_flyhouse.ui.theme.components.JetSearchField

@Composable
fun HomeViewDisplay(dispatcher: (HomeEvent) -> Unit) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(32.dp),
        modifier = Modifier
            .fillMaxSize()
            .background(JetFlyFlyHouseTheme.colorScheme.background)
            .padding(32.dp)
            .verticalScroll(rememberScrollState(0))
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            JetIconButton(
                vectorDrawableId = com.microsoft.fluent.mobile.icons.R.drawable.ic_fluent_scan_person_48_filled,
                iconColor = JetFlyFlyHouseTheme.colorScheme.primary.copy(0.35f),
                shape = JetFlyFlyHouseTheme.shapes.small,
                contentPadding = PaddingValues(10.dp),
                modifier = Modifier.size(48.dp)
            ) { dispatcher.invoke(HomeEvent.OpenScreen(NavScreen.UserProfile)) }
            Spacer(modifier = Modifier.weight(1f))
            Column(
                verticalArrangement = Arrangement.spacedBy(2.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "13:00",
                    style = JetFlyFlyHouseTheme.typography.bodyLarge.copy(
                        color = JetFlyFlyHouseTheme.colorScheme.onSecondary,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Medium,
                        lineHeight = 16.41.sp
                    )
                )
                Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                    Icon(
                        imageVector = ImageVector.vectorResource(id = com.microsoft.fluent.mobile.icons.R.drawable.ic_fluent_hourglass_half_24_regular),
                        tint = JetFlyFlyHouseTheme.colorScheme.primary,
                        modifier = Modifier.size(18.dp),
                        contentDescription = null
                    )
                    Text(
                        text = "Шведский стол",
                        style = JetFlyFlyHouseTheme.typography.bodyLarge.copy(
                            color = JetFlyFlyHouseTheme.colorScheme.onBackground,
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Medium,
                            lineHeight = 16.41.sp
                        )
                    )
                }
            }
            Spacer(modifier = Modifier.weight(1f))
            JetIconButton(
                vectorDrawableId = com.microsoft.fluent.mobile.icons.R.drawable.ic_fluent_qr_code_24_regular,
                iconColor = JetFlyFlyHouseTheme.colorScheme.primary,
                shape = JetFlyFlyHouseTheme.shapes.small,
                contentPadding = PaddingValues(10.dp),
                modifier = Modifier.size(48.dp)
            ) { println("Clicked on qr") }
        }
        JetSearchField(
            hint = stringResource(id = R.string.search_hint).plus(" ..."),
            modifier = Modifier
                .fillMaxWidth()
                .clickable { dispatcher.invoke(HomeEvent.OpenScreen(NavScreen.Search)) }
        )
        ServicesWidget(
            onOtherClick = {},
            onEntertainmentsClick = { dispatcher.invoke(HomeEvent.OpenScreen(NavScreen.Entertainments)) },
            onRestaurantsClick = { dispatcher.invoke(HomeEvent.OpenScreen(NavScreen.Restaurants)) },
            onMapObjectsClick = { dispatcher.invoke(HomeEvent.OpenScreen(NavScreen.MapObjects)) },
            onEventsClick = { dispatcher.invoke(HomeEvent.OpenScreen(NavScreen.Events)) }
        )
        SpecialOffersWidget(
            offerId = 0,
            onCardClicked = { dispatcher.invoke(HomeEvent.OpenScreen(NavScreen.SpecialOfferPage(it))) }
        )
    }
}

@Preview(locale = "ru")
@Composable
private fun HomeViewDisplayPreview() {
    FlyFlyHouseTheme {
        HomeViewDisplay {}
    }
}