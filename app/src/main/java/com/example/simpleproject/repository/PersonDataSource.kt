package com.example.simpleproject.repository

import com.example.simpleproject.model.Person


interface PersonDataSource {

    fun getPersonList():List<Person>

}