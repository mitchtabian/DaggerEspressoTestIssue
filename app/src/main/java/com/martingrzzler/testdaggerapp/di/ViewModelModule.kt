package com.martingrzzler.testdaggerapp.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.codingwithmitch.daggermultifeature.feature1.di.keys.MainViewModelKey
import com.codingwithmitch.espressodaggerexamples.viewmodels.MainViewModelFactory
import com.martingrzzler.testdaggerapp.MainViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.InternalCoroutinesApi


@Module
abstract class ViewModelModule {


    @Binds
    abstract fun bindViewModelFactory(vmFactory: MainViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @MainViewModelKey(MainViewModel::class)
    abstract fun bindMainViewModel(viewModel: MainViewModel): ViewModel

}














