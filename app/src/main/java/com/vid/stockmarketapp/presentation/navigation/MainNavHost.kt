package com.vid.stockmarketapp.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.vid.stockmarketapp.presentation.screen.company_listings.CompanyListingsScreen


sealed class StockRoute(val route: String){
    data object CompanyListingScreen: StockRoute("company_listing_screen")
    data object CompanyInfoScreen: StockRoute("company_info_screen")
}
@Composable
fun MainNavHost(
    navController: NavHostController = rememberNavController(),
) {
    NavHost(navController = navController, startDestination = StockRoute.CompanyListingScreen.route) {
        composable(StockRoute.CompanyListingScreen.route){
            CompanyListingsScreen(navController = navController)
        }
        composable(StockRoute.CompanyInfoScreen.route){

        }

    }
}