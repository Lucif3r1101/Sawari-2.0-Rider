package com.app.sawaririder.Callback;

import com.app.sawaririder.Model.DriverGeoModel;

public interface IFirebaseDriverInfoListener {
    void onDriverInfoLocalSuccess(DriverGeoModel driverGeoModel);
}
