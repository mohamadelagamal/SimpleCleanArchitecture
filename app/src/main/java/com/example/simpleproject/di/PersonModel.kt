package com.example.simpleproject.di

import com.example.simpleproject.repository.PersonDataSource
import com.example.simpleproject.repository.PersonDataSourceImplementation
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object PersonModel {

    @Provides
    @Singleton
    fun providePerson(): PersonDataSource {
        return PersonDataSourceImplementation()
    }

}