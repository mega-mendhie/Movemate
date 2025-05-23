package com.mendhie.movemate.data.di

import android.app.Application
import androidx.room.Room
import com.mendhie.movemate.data.database.MovemateDb
import com.mendhie.movemate.data.database.SearchDao
import com.mendhie.movemate.data.database.ShipmentDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * Provides the Room database and DAOs as singletons for dependency injection.
 */
@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    /**
     * Builds and provides the singleton instance of [MovemateDb].
     */
    @Singleton
    @Provides
    fun providesDatabase(app: Application, callback: MovemateDb.DbCallback): MovemateDb {
        return Room.databaseBuilder(app, MovemateDb::class.java, "movemate.db")
            .addCallback(callback)
            .fallbackToDestructiveMigration()
            .build()
    }

    /**
     * Provides the singleton instance of [ShipmentDao].
     */
    @Singleton
    @Provides
    fun providesShipmentDao(db: MovemateDb): ShipmentDao {
        return db.shipmentDao()
    }

    /**
     * Provides the singleton instance of [SearchDao].
     */
    @Singleton
    @Provides
    fun providesSearchDao(db: MovemateDb): SearchDao {
        return db.searchDao()
    }

}