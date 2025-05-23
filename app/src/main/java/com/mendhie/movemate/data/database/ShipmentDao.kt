package com.mendhie.movemate.data.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.Companion.REPLACE
import androidx.room.Query
import com.mendhie.movemate.data.models.SearchResult
import com.mendhie.movemate.data.models.Shipment

/**
 * DAO for accessing [Shipment] data.
 *
 * Supports inserting and retrieving all shipments.
 */
@Dao
interface ShipmentDao {

    @Insert(onConflict = REPLACE)
    suspend fun insertShipments(shipments: List<Shipment>)

    @Query("SELECT * FROM shipment_table")
    fun getShipments(): LiveData<List<Shipment>>
}