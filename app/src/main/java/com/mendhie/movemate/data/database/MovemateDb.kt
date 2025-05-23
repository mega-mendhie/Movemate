package com.mendhie.movemate.data.database

import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.mendhie.movemate.data.models.SearchResult
import com.mendhie.movemate.data.models.Shipment
import com.mendhie.movemate.data.models.Utils.searchResults
import com.mendhie.movemate.data.models.Utils.shipments
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import javax.inject.Inject
import javax.inject.Provider

/**
 * Room database for the Movemate app.
 *
 * Stores [Shipment] and [SearchResult] entities, and provides DAOs to access them.
 * Includes a [DbCallback] to prepopulate data on first creation.
 */
@androidx.room.Database(
    entities = [Shipment::class, SearchResult::class],
    version = 1,
    exportSchema = false
)
abstract class MovemateDb: RoomDatabase() {

    abstract fun shipmentDao(): ShipmentDao
    abstract fun searchDao(): SearchDao

    class DbCallback @Inject constructor(
        private val movemateDb: Provider<MovemateDb>,
        private val scope: CoroutineScope
    ): Callback(){

        override fun onCreate(db: SupportSQLiteDatabase) {
            super.onCreate(db)

            scope.launch {
                movemateDb.get().shipmentDao().insertShipments(shipments = shipments)
                movemateDb.get().searchDao().insertSearchResults(results = searchResults)
            }

        }
    }
}