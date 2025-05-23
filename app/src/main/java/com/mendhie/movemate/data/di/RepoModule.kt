package com.mendhie.movemate.data.di

import com.mendhie.movemate.data.repoimpl.SearchRepoImpl
import com.mendhie.movemate.data.repoimpl.ShipmentRepoImpl
import com.mendhie.movemate.domain.repositories.SearchRepo
import com.mendhie.movemate.domain.repositories.ShipmentRepo
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

/**
 * Binds repository implementations to their interfaces for dependency injection.
 */
@Module
@InstallIn(SingletonComponent::class)
abstract class RepoModule {

    /**
     * Binds [ShipmentRepoImpl] as the implementation for [ShipmentRepo].
     */
    @Binds
    abstract fun bindShipmentRepo(
        shipmentRepoImpl: ShipmentRepoImpl
    ): ShipmentRepo


    /**
     * Binds [SearchRepoImpl] as the implementation for [SearchRepo].
     */
    @Binds
    abstract fun bindSearchRepo(
        searchRepoImpl: SearchRepoImpl
    ): SearchRepo
}