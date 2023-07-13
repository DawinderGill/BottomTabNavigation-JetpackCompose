package com.dawinder.btnjc.ui.composables

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun HomeScreen(navController: NavController) {
    Scaffold(bottomBar = {
        BottomAppBar {
            BottomNavigationBar(navController = navController)
        }
    }) { innerPadding ->
        Box(
            modifier = Modifier.padding(
                PaddingValues(
                    0.dp,
                    0.dp,
                    0.dp,
                    innerPadding.calculateBottomPadding()
                )
            )
        ) {
            NavigationScreens(navController = navController)
        }

    }
}

@Composable
fun BottomNavigationBar(navController: NavController) {

}

@Composable
fun NavigationScreens(navController: NavController) {

}

@Preview
@Composable
fun preview() {
    val navController = rememberNavController()
    HomeScreen(navController = navController)
}