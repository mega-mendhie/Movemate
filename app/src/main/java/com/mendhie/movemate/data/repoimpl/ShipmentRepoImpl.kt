package com.mendhie.movemate.data.repoimpl

import androidx.lifecycle.LiveData
import com.mendhie.movemate.data.database.ShipmentDao
import com.mendhie.movemate.data.models.Shipment
import com.mendhie.movemate.domain.repositories.ShipmentRepo
import kotlinx.coroutines.CoroutineScope
import javax.inject.Inject

/**
 * Implementation of [ShipmentRepo] that delegates calls to [ShipmentDao].
 *
 * @param shipmentDao DAO for accessing shipment data.
 */
class ShipmentRepoImpl @Inject constructor(private val shipmentDao: ShipmentDao): ShipmentRepo {

    /**
     * Inserts a list of shipments into the database.
     */
    override suspend fun insertShipments(shipments: List<Shipment>) {
        shipmentDao.insertShipments(shipments)
    }

    /**
     * Retrieves all shipments.
     */
    override fun getShipments(): LiveData<List<Shipment>> {
        return shipmentDao.getShipments()
    }

}