package com.artemissoftware.atlaslocations.screens

import android.location.Location
import com.artemissoftware.domain.models.Pin

sealed class MapEvent {
    object ToggleMapStyle: MapEvent()
    data class UpdateLocation(val pin: Pin): MapEvent()
//    data class OnMapLongClick(val latLng: LatLng): MapEvent()
//    data class OnInfoWindowLongClick(val spot: ParkingSpot): MapEvent()
}