package com.example.projectmanager.ViewModel

import androidx.lifecycle.ViewModel
import com.example.projectmanager.Repository.MainRepository

class MainViewModel(val repository:MainRepository): ViewModel() {
    constructor():this(MainRepository())

    fun loadData() =repository.items
}