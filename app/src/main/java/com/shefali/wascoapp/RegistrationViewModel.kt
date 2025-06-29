package com.shefali.wascoapp

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class RegistrationViewModel @Inject constructor() : ViewModel() {

    var username by mutableStateOf("")
    var email by mutableStateOf("")
    var firstName by mutableStateOf("")
    var lastName by mutableStateOf("")
    var password by mutableStateOf("")
    var confirmPassword by mutableStateOf("")
    var rememberMe by mutableStateOf(false)

    val securityQuestions = listOf("Your pet's name", "Your birth city", "Favorite color")
    var selectedQuestion by mutableStateOf("")

    val securityAnswers = listOf("Answer 1", "Answer 2", "Answer 3")
    var selectedAnswer by mutableStateOf("")

    fun onRegisterClick() {
        // handle logic
    }
    fun onLoginClick() {
        // Handle login logic
    }


}