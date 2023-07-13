package com.dawinder.btnjc.ui.composables

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.dawinder.btnjc.nav.NavItem
import com.dawinder.btnjc.ui.composables.tabs.HomeScreen
import com.dawinder.btnjc.ui.composables.tabs.ListScreen
import com.dawinder.btnjc.ui.composables.tabs.ProfileScreen
import com.dawinder.btnjc.ui.composables.tabs.SearchScreen

@Composable
fun NavigationScreens(navController: NavHostController) {
    NavHost(navController, startDestination = NavItem.Home.path) {
        composable(NavItem.Home.path) { HomeScreen() }
        composable(NavItem.Search.path) { SearchScreen() }
        composable(NavItem.List.path) { ListScreen() }
        composable(NavItem.Profile.path) { ProfileScreen() }
    }
}