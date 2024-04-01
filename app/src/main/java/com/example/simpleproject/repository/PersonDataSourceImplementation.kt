package com.example.simpleproject.repository

import com.example.simpleproject.R
import com.example.simpleproject.model.Person


class PersonDataSourceImplementation: PersonDataSource{
    override fun getPersonList(): List<Person> {
        val personList= mutableListOf<Person>()
        personList.add(Person("Ahmed","Developer", R.drawable.photo))
        personList.add(Person("Mohamed","Designer", R.drawable.photo))
        personList.add(Person("Ali","Manager", R.drawable.photo))
        personList.add(Person("Sara","HR", R.drawable.image))
        personList.add(Person("Nada","Accountant", R.drawable.image))
        personList.add(Person("Ahmed","Developer", R.drawable.photo))
        personList.add(Person("Mohamed","Designer", R.drawable.photo))
        personList.add(Person("Ali","Manager", R.drawable.photo))
        personList.add(Person("Sara","HR", R.drawable.image))
        personList.add(Person("Nada","Accountant", R.drawable.image))
        personList.add(Person("Ahmed","Developer", R.drawable.photo))
        personList.add(Person("Mohamed","Designer", R.drawable.photo))
        personList.add(Person("Ali","Manager", R.drawable.photo))
        personList.add(Person("Sara","HR", R.drawable.image))
        personList.add(Person("Nada","Accountant", R.drawable.image))
        return personList
    }

}