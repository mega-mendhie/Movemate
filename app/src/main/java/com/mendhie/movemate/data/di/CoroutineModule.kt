package com.mendhie.movemate.data.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob
import javax.inject.Singleton

/**
 * Provides a singleton [CoroutineScope] with a [SupervisorJob] for app-wide coroutine management.
 */
@Module
@InstallIn(SingletonComponent::class)
object CoroutineModule {
    @Singleton
    @Provides
    fun providesCoroutineScope() = CoroutineScope(SupervisorJob())
}