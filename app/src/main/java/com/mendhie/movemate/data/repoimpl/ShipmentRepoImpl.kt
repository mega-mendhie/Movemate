package com.mendhie.movemate.data.repoimpl

import androidx.lifecycle.LiveData
import com.mendhie.movemate.data.database.ShipmentDao
import com.mendhie.movemate.data.models.Shipment
import com.mendhie.movemate.domain.repositories.ShipmentRepo
import kotlinx.coroutines.CoroutineScope
import javax.inject.Inject

class ShipmentRepoImpl @Inject constructor(private val shipmentDao: ShipmentDao): ShipmentRepo {

    override suspend fun insertShipments(shipments: List<Shipment>) {
        shipmentDao.insertShipments(shipments)
    }

    override fun getShipments(): LiveData<List<Shipment>> {
        return shipmentDao.getShipments()
    }

}