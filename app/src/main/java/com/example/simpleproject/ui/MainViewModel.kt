package com.example.simpleproject.ui

import androidx.lifecycle.ViewModel
import com.example.simpleproject.repository.PersonDataSource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    val personDataSource: PersonDataSource
):ViewModel() {



//    lateinit var personDataSource: PersonDataSource
//    init {
//        personDataSource = PersonDataSourceImplementation()
//    }


    fun getPersonList() = personDataSource.getPersonList()

}