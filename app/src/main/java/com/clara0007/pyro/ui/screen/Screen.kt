package com.clara0007.pyro.ui.screen

sealed class Screen(val route: String) {
    object PilihRole : Screen("pilih_role")
    object RegisterDamkar : Screen("register_damkar")
    object DashboardDamkar : Screen("dashboard_damkar")
}