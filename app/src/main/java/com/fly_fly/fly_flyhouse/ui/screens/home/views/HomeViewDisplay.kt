package com.fly_fly.fly_flyhouse.ui.screens.home.views

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fly_fly.fly_flyhouse.R
import com.fly_fly.fly_flyhouse.ui.navigation.NavScreen
import com.fly_fly.fly_flyhouse.ui.screens.home.models.HomeEvent
import com.fly_fly.fly_flyhouse.ui.screens.home.views.components.HomeTopBar
import com.fly_fly.fly_flyhouse.ui.screens.home.views.components.ServicesWidget
import com.fly_fly.fly_flyhouse.ui.screens.home.views.components.SpecialOffersWidget
import com.fly_fly.fly_flyhouse.ui.theme.FlyFlyHouseTheme
import com.fly_fly.fly_flyhouse.ui.theme.JetFlyFlyHouseTheme
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
        HomeTopBar(
            onPersonClick = { dispatcher.invoke(HomeEvent.OpenScreen(NavScreen.UserProfile)) },
            onQrClick = { println("Clicked on qr") }
        )
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