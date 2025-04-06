package com.clara0007.pyro.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.clara0007.pyro.ui.screen.RegistrasiDamkarScreen
import com.clara0007.pyro.ui.screen.Screen

@Composable
fun AppNavHost(
    navController: NavHostController,
    startDestination: String = Screen.PilihRole.route
) {
    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        composable(route = Screen.RegisterDamkar.route) {
            RegistrasiDamkarScreen(
                onRegister = {
                    nip, username, email, phoneNumber, password ->
                    // Aksi setelah registrasi Damkar, misal: navController.navigate("beranda")
                }
            )
        }
    }
}
