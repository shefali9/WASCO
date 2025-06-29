package com.shefali.wascoapp

sealed class Screen(val route: String) {
    data object Login : Screen("login")
    data object Home : Screen("home")
    data object ResetPassword : Screen("resetPassword")
    data object ForgotPassword : Screen("forgotPassword")
    data object Registration : Screen("registration")
}
