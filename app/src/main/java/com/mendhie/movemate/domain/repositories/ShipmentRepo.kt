package com.mendhie.movemate.domain.repositories

import androidx.lifecycle.LiveData
import com.mendhie.movemate.data.models.Shipment

interface ShipmentRepo {

    suspend fun insertShipments(shipments: List<Shipment>)

    fun getShipments(): LiveData<List<Shipment>>
}