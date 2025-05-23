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

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Singleton
    @Provides
    fun providesDatabase(app: Application, callback: MovemateDb.DbCallback): MovemateDb {
        return Room.databaseBuilder(app, MovemateDb::class.java, "movemate.db")
            .addCallback(callback)
            .fallbackToDestructiveMigration()
            .build()
    }

    @Singleton
    @Provides
    fun providesShipmentDao(db: MovemateDb): ShipmentDao {
        return db.shipmentDao()
    }

    @Singleton
    @Provides
    fun providesSearchDao(db: MovemateDb): SearchDao {
        return db.searchDao()
    }

}