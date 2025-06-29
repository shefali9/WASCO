package com.shefali.wascoapp

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun AppNavHost(navController: NavHostController) {
    NavHost(navController, startDestination = "login") {
        composable("login") {
            LoginScreen(
                onResetPasswordClick = { navController.navigate(Screen.ResetPassword.route) },
                onForgotPasswordClick = { navController.navigate(Screen.ForgotPassword.route) },
                onRegistrationClick = { navController.navigate(Screen.Registration.route) })
        }
        composable("resetPassword") {
            ResetPassword(navController = navController)
        }
        composable("forgotPassword") {
            ForgotPassword(navController = navController)
        }
        composable ("registration") {
            Registration(navController = navController)
        }
    }
}