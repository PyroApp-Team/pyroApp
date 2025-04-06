package com.clara0007.pyro.ui.screen

sealed class Screen(val route: String) {
    object PilihRole : Screen("pilih_role")
    object RegisterDamkar : Screen("register_damkar")
    object RegisterMasyarakat : Screen("register_masyarakat")
    // tambah Home kalau perlu
}