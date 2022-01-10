package com.example.ui.user

import androidx.lifecycle.ViewModel
import com.example.base.BaseViewModel
import com.example.data.repositoty.UserRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class UserViewModel @Inject constructor(
    private val userRepository: UserRepository
) : BaseViewModel() {
}