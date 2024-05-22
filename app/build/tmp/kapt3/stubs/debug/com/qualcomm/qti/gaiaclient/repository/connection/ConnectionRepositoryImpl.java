package com.qualcomm.qti.gaiaclient.repository.connection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J@\u0010\u0007\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u000b\u001a\u00020\f2\u0018\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n0\u000f0\u000eH\u0002J,\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n0\u000f0\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J4\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0018\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n0\u000f0\u000eH\u0002J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/repository/connection/ConnectionRepositoryImpl;", "Lcom/qualcomm/qti/gaiaclient/repository/connection/ConnectionRepositoryData;", "()V", "connectionSubscriber", "Lcom/qualcomm/qti/gaiaclient/core/publications/qtil/subscribers/ConnectionSubscriber;", "handler", "Landroid/os/Handler;", "buildRequestListener", "Lcom/qualcomm/qti/gaiaclient/core/requests/core/RequestListener;", "Ljava/lang/Void;", "Lcom/qualcomm/qti/gaiaclient/core/bluetooth/data/BluetoothStatus;", "device", "Lcom/qualcomm/qti/gaiaclient/repository/connection/Device;", "deviceData", "Lcom/qualcomm/qti/gaiaclient/ui/common/StickyLiveData;", "Lcom/qualcomm/qti/gaiaclient/repository/Result;", "connect", "Landroidx/lifecycle/LiveData;", "context", "Landroid/content/Context;", "disconnect", "", "executeConnection", "result", "initMonitoring", "reconnect", "app_debug"})
@javax.inject.Singleton
public final class ConnectionRepositoryImpl extends com.qualcomm.qti.gaiaclient.repository.connection.ConnectionRepositoryData {
    private final android.os.Handler handler = null;
    private final com.qualcomm.qti.gaiaclient.core.publications.qtil.subscribers.ConnectionSubscriber connectionSubscriber = null;
    
    @javax.inject.Inject
    public ConnectionRepositoryImpl() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public androidx.lifecycle.LiveData<com.qualcomm.qti.gaiaclient.repository.Result<com.qualcomm.qti.gaiaclient.repository.connection.Device, com.qualcomm.qti.gaiaclient.core.bluetooth.data.BluetoothStatus>> connect(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    com.qualcomm.qti.gaiaclient.repository.connection.Device device) {
        return null;
    }
    
    @java.lang.Override
    public void disconnect(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
    
    @java.lang.Override
    public void reconnect(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
    
    private final void initMonitoring(com.qualcomm.qti.gaiaclient.repository.connection.Device device) {
    }
    
    private final void executeConnection(android.content.Context context, com.qualcomm.qti.gaiaclient.repository.connection.Device device, com.qualcomm.qti.gaiaclient.ui.common.StickyLiveData<com.qualcomm.qti.gaiaclient.repository.Result<com.qualcomm.qti.gaiaclient.repository.connection.Device, com.qualcomm.qti.gaiaclient.core.bluetooth.data.BluetoothStatus>> result) {
    }
    
    private final com.qualcomm.qti.gaiaclient.core.requests.core.RequestListener<java.lang.Void, java.lang.Void, com.qualcomm.qti.gaiaclient.core.bluetooth.data.BluetoothStatus> buildRequestListener(com.qualcomm.qti.gaiaclient.repository.connection.Device device, com.qualcomm.qti.gaiaclient.ui.common.StickyLiveData<com.qualcomm.qti.gaiaclient.repository.Result<com.qualcomm.qti.gaiaclient.repository.connection.Device, com.qualcomm.qti.gaiaclient.core.bluetooth.data.BluetoothStatus>> deviceData) {
        return null;
    }
}