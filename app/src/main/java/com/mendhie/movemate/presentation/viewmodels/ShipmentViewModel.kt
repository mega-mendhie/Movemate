package com.mendhie.movemate.presentation.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.mendhie.movemate.data.database.ShipmentDao
import com.mendhie.movemate.data.models.SearchResult
import com.mendhie.movemate.data.models.Shipment
import com.mendhie.movemate.domain.repositories.SearchRepo
import com.mendhie.movemate.domain.repositories.ShipmentRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ShipmentViewModel @Inject constructor(private val shipmentRepo: ShipmentRepo): ViewModel() {

    suspend fun insertShipments(shipments: List<Shipment>) {
        shipmentRepo.insertShipments(shipments)
    }

    val shipments = shipmentRepo.getShipments()
}