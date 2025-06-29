package com.shefali.wascoapp

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ResetPasswordViewModel @Inject constructor() : ViewModel() {
    var newPassword by mutableStateOf("")
    var confirmPassword by mutableStateOf("")
    var selectedQuestion by mutableStateOf("")
    var selectedAnswer by mutableStateOf("")
    fun onLoginClick() {
        // Handle login logic
    }


}