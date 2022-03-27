package com.artemissoftware.repositories

import com.artemissoftware.data.database.dao.PinDao
import com.artemissoftware.data.mappers.toPin
import com.artemissoftware.data.mappers.toPinEntity
import com.artemissoftware.domain.models.Pin
import com.artemissoftware.domain.repositories.PinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class PinRepositoryImpl(
    private val dao: PinDao
): PinRepository {

    override suspend fun insertPin(pin: Pin) {
        dao.insertPin(pin.toPinEntity())
    }

    override suspend fun deletePins() {
        dao.deletePins()
    }

    override fun getPins(): Flow<List<Pin>> {
        return dao.getParkingSpots().map { spots ->
            spots.map { it.toPin() }
        }
    }
}