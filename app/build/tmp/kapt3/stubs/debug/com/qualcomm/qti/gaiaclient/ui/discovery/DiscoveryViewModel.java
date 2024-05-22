package com.qualcomm.qti.gaiaclient.ui.discovery;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 :2\u00020\u0001:\u0002:;B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J*\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u001a\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\f\u0018\u00010\u0011H\u0002J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00130\f2\u0006\u0010\u001f\u001a\u00020\u0012H\u0002J&\u0010 \u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u001f\u001a\u00020\u00122\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"H\u0002J\u001a\u0010$\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\t2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0002J\u0018\u0010(\u001a\u00020)2\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010*\u001a\u00020+H\u0002J\u0018\u0010,\u001a\u00020)2\u0006\u0010-\u001a\u00020+2\u0006\u0010*\u001a\u00020+H\u0002J\u0010\u0010.\u001a\u00020)2\u0006\u0010-\u001a\u00020+H\u0002J\b\u0010/\u001a\u000200H\u0014J\u0016\u00101\u001a\u0002002\u0006\u00102\u001a\u0002032\u0006\u0010\u001f\u001a\u00020\u0012J,\u00104\u001a\u0002002\u0006\u0010\u001f\u001a\u00020\u00122\u001a\u00105\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"\u0012\u0004\u0012\u000207\u0018\u000106H\u0002J,\u00108\u001a\b\u0012\u0004\u0012\u00020\u00130\f2\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u00130\f2\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"H\u0002R\u001c\u0010\u0007\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\f0\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0016R\u001d\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0012\u0010\u001b\u001a\u00060\u001cR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006<"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/discovery/DiscoveryViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "discoveryRepository", "Lcom/qualcomm/qti/gaiaclient/repository/discovery/DiscoveryRepository;", "(Landroid/app/Application;Lcom/qualcomm/qti/gaiaclient/repository/discovery/DiscoveryRepository;)V", "_isRefreshing", "Lcom/qualcomm/qti/gaiaclient/ui/common/StickyLiveData;", "", "kotlin.jvm.PlatformType", "_itemsList", "", "Lcom/qualcomm/qti/gaiaclient/ui/discovery/viewdata/ItemViewData;", "_message", "Lcom/qualcomm/qti/gaiaclient/ui/common/MessageData;", "devices", "Landroidx/collection/ArrayMap;", "Lcom/qualcomm/qti/gaiaclient/core/bluetooth/data/DiscoveryType;", "Lcom/qualcomm/qti/gaiaclient/ui/discovery/viewdata/DeviceViewData;", "isRefreshing", "Landroidx/lifecycle/LiveData;", "()Landroidx/lifecycle/LiveData;", "itemsList", "getItemsList", "message", "getMessage", "observers", "Lcom/qualcomm/qti/gaiaclient/ui/discovery/DiscoveryViewModel$DataObservers;", "generateList", "getDeviceDataList", "type", "getDeviceItems", "found", "", "Lcom/qualcomm/qti/gaiaclient/core/bluetooth/data/DiscoveredDevice;", "getEmptyListMessage", "isListEmpty", "status", "Lcom/qualcomm/qti/gaiaclient/repository/ResultStatus;", "getListTitle", "", "count", "", "getQuantityString", "resourceId", "getString", "onCleared", "", "refreshDevices", "context", "Landroid/content/Context;", "updateData", "result", "Lcom/qualcomm/qti/gaiaclient/repository/Result;", "Lcom/qualcomm/qti/gaiaclient/repository/connection/BluetoothReason;", "updateDevices", "source", "Companion", "DataObservers", "app_debug"})
public final class DiscoveryViewModel extends androidx.lifecycle.AndroidViewModel {
    private final com.qualcomm.qti.gaiaclient.repository.discovery.DiscoveryRepository discoveryRepository = null;
    private final androidx.collection.ArrayMap<com.qualcomm.qti.gaiaclient.core.bluetooth.data.DiscoveryType, java.util.List<com.qualcomm.qti.gaiaclient.ui.discovery.viewdata.DeviceViewData>> devices = null;
    private final com.qualcomm.qti.gaiaclient.ui.common.StickyLiveData<java.util.List<com.qualcomm.qti.gaiaclient.ui.discovery.viewdata.ItemViewData>> _itemsList = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<com.qualcomm.qti.gaiaclient.ui.discovery.viewdata.ItemViewData>> itemsList = null;
    private final com.qualcomm.qti.gaiaclient.ui.common.StickyLiveData<com.qualcomm.qti.gaiaclient.ui.common.MessageData> _message = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.qualcomm.qti.gaiaclient.ui.common.MessageData> message = null;
    private final com.qualcomm.qti.gaiaclient.ui.common.StickyLiveData<java.lang.Boolean> _isRefreshing = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.lang.Boolean> isRefreshing = null;
    private final com.qualcomm.qti.gaiaclient.ui.discovery.DiscoveryViewModel.DataObservers observers = null;
    @org.jetbrains.annotations.NotNull
    public static final com.qualcomm.qti.gaiaclient.ui.discovery.DiscoveryViewModel.Companion Companion = null;
    private static final com.qualcomm.qti.gaiaclient.core.bluetooth.data.DiscoveryType[] ORDERED_DEVICE_TYPES = {com.qualcomm.qti.gaiaclient.core.bluetooth.data.DiscoveryType.CONNECTED, com.qualcomm.qti.gaiaclient.core.bluetooth.data.DiscoveryType.PAIRED, com.qualcomm.qti.gaiaclient.core.bluetooth.data.DiscoveryType.DISCOVERED};
    
    @javax.inject.Inject
    public DiscoveryViewModel(@org.jetbrains.annotations.NotNull
    android.app.Application application, @org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.repository.discovery.DiscoveryRepository discoveryRepository) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.qualcomm.qti.gaiaclient.ui.discovery.viewdata.ItemViewData>> getItemsList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.qualcomm.qti.gaiaclient.ui.common.MessageData> getMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isRefreshing() {
        return null;
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
    
    public final void refreshDevices(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.core.bluetooth.data.DiscoveryType type) {
    }
    
    private final void updateData(com.qualcomm.qti.gaiaclient.core.bluetooth.data.DiscoveryType type, com.qualcomm.qti.gaiaclient.repository.Result<java.util.List<com.qualcomm.qti.gaiaclient.core.bluetooth.data.DiscoveredDevice>, com.qualcomm.qti.gaiaclient.repository.connection.BluetoothReason> result) {
    }
    
    private final java.util.List<com.qualcomm.qti.gaiaclient.ui.discovery.viewdata.ItemViewData> getDeviceItems(com.qualcomm.qti.gaiaclient.core.bluetooth.data.DiscoveryType type, java.util.List<com.qualcomm.qti.gaiaclient.core.bluetooth.data.DiscoveredDevice> found) {
        return null;
    }
    
    private final java.util.List<com.qualcomm.qti.gaiaclient.ui.discovery.viewdata.DeviceViewData> updateDevices(java.util.List<com.qualcomm.qti.gaiaclient.ui.discovery.viewdata.DeviceViewData> source, java.util.List<com.qualcomm.qti.gaiaclient.core.bluetooth.data.DiscoveredDevice> found) {
        return null;
    }
    
    private final java.util.List<com.qualcomm.qti.gaiaclient.ui.discovery.viewdata.ItemViewData> generateList(androidx.collection.ArrayMap<com.qualcomm.qti.gaiaclient.core.bluetooth.data.DiscoveryType, java.util.List<com.qualcomm.qti.gaiaclient.ui.discovery.viewdata.DeviceViewData>> devices) {
        return null;
    }
    
    private final java.util.List<com.qualcomm.qti.gaiaclient.ui.discovery.viewdata.DeviceViewData> getDeviceDataList(com.qualcomm.qti.gaiaclient.core.bluetooth.data.DiscoveryType type) {
        return null;
    }
    
    private final java.lang.String getListTitle(com.qualcomm.qti.gaiaclient.core.bluetooth.data.DiscoveryType type, int count) {
        return null;
    }
    
    private final com.qualcomm.qti.gaiaclient.ui.common.MessageData getEmptyListMessage(boolean isListEmpty, com.qualcomm.qti.gaiaclient.repository.ResultStatus status) {
        return null;
    }
    
    private final java.lang.String getQuantityString(int resourceId, int count) {
        return null;
    }
    
    private final java.lang.String getString(int resourceId) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0014J\b\u0010\r\u001a\u00020\fH\u0014R2\u0010\u0003\u001a&\u0012\u0004\u0012\u00020\u0005\u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\n0\u00070\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/discovery/DiscoveryViewModel$DataObservers;", "Lcom/qualcomm/qti/gaiaclient/ui/common/Observers;", "(Lcom/qualcomm/qti/gaiaclient/ui/discovery/DiscoveryViewModel;)V", "devicesObservers", "", "Lcom/qualcomm/qti/gaiaclient/core/bluetooth/data/DiscoveryType;", "Landroidx/lifecycle/Observer;", "Lcom/qualcomm/qti/gaiaclient/repository/Result;", "", "Lcom/qualcomm/qti/gaiaclient/core/bluetooth/data/DiscoveredDevice;", "Lcom/qualcomm/qti/gaiaclient/repository/connection/BluetoothReason;", "registerObservers", "", "unregisterObservers", "app_debug"})
    final class DataObservers extends com.qualcomm.qti.gaiaclient.ui.common.Observers {
        private final java.util.Map<com.qualcomm.qti.gaiaclient.core.bluetooth.data.DiscoveryType, androidx.lifecycle.Observer<com.qualcomm.qti.gaiaclient.repository.Result<java.util.List<com.qualcomm.qti.gaiaclient.core.bluetooth.data.DiscoveredDevice>, com.qualcomm.qti.gaiaclient.repository.connection.BluetoothReason>>> devicesObservers = null;
        
        public DataObservers() {
            super();
        }
        
        @java.lang.Override
        protected void registerObservers() {
        }
        
        @java.lang.Override
        protected void unregisterObservers() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/discovery/DiscoveryViewModel$Companion;", "", "()V", "ORDERED_DEVICE_TYPES", "", "Lcom/qualcomm/qti/gaiaclient/core/bluetooth/data/DiscoveryType;", "[Lcom/qualcomm/qti/gaiaclient/core/bluetooth/data/DiscoveryType;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}