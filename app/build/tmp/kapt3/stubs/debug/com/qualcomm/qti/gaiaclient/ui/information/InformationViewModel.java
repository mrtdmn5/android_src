package com.qualcomm.qti.gaiaclient.ui.information;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00a4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001@B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0018\u0010\u0018\u001a\u00020\u00192\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bH\u0002J\b\u0010\u001d\u001a\u00020\u0019H\u0002J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u0010#\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001cH\u0002J\u0010\u0010$\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020\"H\u0002J\b\u0010&\u001a\u00020\u0019H\u0002J\b\u0010\'\u001a\u00020\u0019H\u0014J\u001e\u0010(\u001a\u00020\u00192\u0014\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\"\u0018\u00010*H\u0002J\u001e\u0010+\u001a\u00020\u00192\u0014\u0010,\u001a\u0010\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020/\u0018\u00010-H\u0002J\u0012\u00100\u001a\u00020\u00192\b\u00101\u001a\u0004\u0018\u00010\u0011H\u0002J\u0012\u00102\u001a\u00020\u00192\b\u00103\u001a\u0004\u0018\u000104H\u0002J\u001e\u00105\u001a\u00020\u00192\u0014\u00106\u001a\u0010\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\"\u0018\u000107H\u0002J\u0018\u00109\u001a\u00020\u00192\u000e\u0010:\u001a\n\u0012\u0004\u0012\u00020<\u0018\u00010;H\u0002J\u0012\u0010=\u001a\u00020\u00192\b\u0010>\u001a\u0004\u0018\u00010?H\u0002R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0012\u0010\u0016\u001a\u00060\u0017R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006A"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/information/InformationViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "connectionRepository", "Lcom/qualcomm/qti/gaiaclient/repository/connection/ConnectionRepository;", "featuresRepository", "Lcom/qualcomm/qti/gaiaclient/repository/features/FeaturesRepository;", "deviceInfoRepository", "Lcom/qualcomm/qti/gaiaclient/repository/deviceinfo/DeviceInformationRepository;", "batteryRepository", "Lcom/qualcomm/qti/gaiaclient/repository/battery/BatteryRepository;", "(Landroid/app/Application;Lcom/qualcomm/qti/gaiaclient/repository/connection/ConnectionRepository;Lcom/qualcomm/qti/gaiaclient/repository/features/FeaturesRepository;Lcom/qualcomm/qti/gaiaclient/repository/deviceinfo/DeviceInformationRepository;Lcom/qualcomm/qti/gaiaclient/repository/battery/BatteryRepository;)V", "_viewData", "Lcom/qualcomm/qti/gaiaclient/ui/information/InformationViewData;", "crossUpdateVersion", "Lcom/qualcomm/qti/gaiaclient/ui/common/StickyLiveData;", "Lcom/qualcomm/qti/gaiaclient/core/gaia/qtil/data/basic/CrossUpdateVersion;", "getCrossUpdateVersion", "()Lcom/qualcomm/qti/gaiaclient/ui/common/StickyLiveData;", "informationViewData", "getInformationViewData", "observers", "Lcom/qualcomm/qti/gaiaclient/ui/information/InformationViewModel$DataObservers;", "fetchBatteryLevels", "", "supported", "", "Lcom/qualcomm/qti/gaiaclient/core/gaia/qtil/data/battery/Battery;", "fetchData", "formatBatteryLevel", "", "battery", "level", "", "getBatteryLabel", "getString", "resourceId", "notifyDataObserver", "onCleared", "updateBatteryLevels", "levels", "", "updateConnectedDevice", "resource", "Lcom/qualcomm/qti/gaiaclient/repository/Resource;", "Lcom/qualcomm/qti/gaiaclient/repository/connection/Device;", "Lcom/qualcomm/qti/gaiaclient/core/bluetooth/data/BluetoothStatus;", "updateCrossUpdateVersion", "version", "updateDeviceInformation", "information", "Lcom/qualcomm/qti/gaiaclient/repository/deviceinfo/DeviceInformation;", "updateFeaturesInformation", "supportedFeatures", "Landroidx/collection/ArrayMap;", "Lcom/qualcomm/qti/gaiaclient/core/gaia/qtil/data/QTILFeature;", "updateSystemInformation", "infos", "", "Lcom/qualcomm/qti/gaiaclient/core/gaia/qtil/data/basic/SystemInformation;", "updateVersions", "versions", "Lcom/qualcomm/qti/gaiaclient/repository/deviceinfo/Versions;", "DataObservers", "app_debug"})
public final class InformationViewModel extends androidx.lifecycle.AndroidViewModel {
    private final com.qualcomm.qti.gaiaclient.repository.connection.ConnectionRepository connectionRepository = null;
    private final com.qualcomm.qti.gaiaclient.repository.features.FeaturesRepository featuresRepository = null;
    private final com.qualcomm.qti.gaiaclient.repository.deviceinfo.DeviceInformationRepository deviceInfoRepository = null;
    private final com.qualcomm.qti.gaiaclient.repository.battery.BatteryRepository batteryRepository = null;
    @org.jetbrains.annotations.NotNull
    private final com.qualcomm.qti.gaiaclient.ui.common.StickyLiveData<com.qualcomm.qti.gaiaclient.ui.information.InformationViewData> informationViewData = null;
    @org.jetbrains.annotations.NotNull
    private final com.qualcomm.qti.gaiaclient.ui.common.StickyLiveData<com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.basic.CrossUpdateVersion> crossUpdateVersion = null;
    private final com.qualcomm.qti.gaiaclient.ui.information.InformationViewData _viewData = null;
    private final com.qualcomm.qti.gaiaclient.ui.information.InformationViewModel.DataObservers observers = null;
    
    @javax.inject.Inject
    public InformationViewModel(@org.jetbrains.annotations.NotNull
    android.app.Application application, @org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.repository.connection.ConnectionRepository connectionRepository, @org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.repository.features.FeaturesRepository featuresRepository, @org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.repository.deviceinfo.DeviceInformationRepository deviceInfoRepository, @org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.repository.battery.BatteryRepository batteryRepository) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.qualcomm.qti.gaiaclient.ui.common.StickyLiveData<com.qualcomm.qti.gaiaclient.ui.information.InformationViewData> getInformationViewData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.qualcomm.qti.gaiaclient.ui.common.StickyLiveData<com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.basic.CrossUpdateVersion> getCrossUpdateVersion() {
        return null;
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
    
    private final void fetchData() {
    }
    
    private final void updateFeaturesInformation(androidx.collection.ArrayMap<com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.QTILFeature, java.lang.Integer> supportedFeatures) {
    }
    
    private final void updateConnectedDevice(com.qualcomm.qti.gaiaclient.repository.Resource<com.qualcomm.qti.gaiaclient.repository.connection.Device, com.qualcomm.qti.gaiaclient.core.bluetooth.data.BluetoothStatus> resource) {
    }
    
    private final void updateDeviceInformation(com.qualcomm.qti.gaiaclient.repository.deviceinfo.DeviceInformation information) {
    }
    
    private final void updateVersions(com.qualcomm.qti.gaiaclient.repository.deviceinfo.Versions versions) {
    }
    
    private final void fetchBatteryLevels(java.util.Set<? extends com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.battery.Battery> supported) {
    }
    
    private final void updateBatteryLevels(java.util.Map<com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.battery.Battery, java.lang.Integer> levels) {
    }
    
    private final void updateSystemInformation(java.util.List<? extends com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.basic.SystemInformation> infos) {
    }
    
    private final void updateCrossUpdateVersion(com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.basic.CrossUpdateVersion version) {
    }
    
    private final java.lang.String formatBatteryLevel(com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.battery.Battery battery, int level) {
        return null;
    }
    
    private final java.lang.String getBatteryLabel(com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.battery.Battery battery) {
        return null;
    }
    
    private final java.lang.String getString(int resourceId) {
        return null;
    }
    
    private final void notifyDataObserver() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0014J\b\u0010\u001c\u001a\u00020\u001bH\u0014R\"\u0010\u0003\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\u0010\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00110\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00140\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0015\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00160\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/information/InformationViewModel$DataObservers;", "Lcom/qualcomm/qti/gaiaclient/ui/common/Observers;", "(Lcom/qualcomm/qti/gaiaclient/ui/information/InformationViewModel;)V", "batteryLevelsObserver", "Landroidx/lifecycle/Observer;", "", "Lcom/qualcomm/qti/gaiaclient/core/gaia/qtil/data/battery/Battery;", "", "connectedDeviceObserver", "Lcom/qualcomm/qti/gaiaclient/repository/Resource;", "Lcom/qualcomm/qti/gaiaclient/repository/connection/Device;", "Lcom/qualcomm/qti/gaiaclient/core/bluetooth/data/BluetoothStatus;", "crossUpdateVersionObserver", "Lcom/qualcomm/qti/gaiaclient/core/gaia/qtil/data/basic/CrossUpdateVersion;", "deviceInformationObserver", "Lcom/qualcomm/qti/gaiaclient/repository/deviceinfo/DeviceInformation;", "featuresObserver", "Landroidx/collection/ArrayMap;", "Lcom/qualcomm/qti/gaiaclient/core/gaia/qtil/data/QTILFeature;", "supportedBatteriesObserver", "", "systemInformationObserver", "", "Lcom/qualcomm/qti/gaiaclient/core/gaia/qtil/data/basic/SystemInformation;", "versionsObserver", "Lcom/qualcomm/qti/gaiaclient/repository/deviceinfo/Versions;", "registerObservers", "", "unregisterObservers", "app_debug"})
    final class DataObservers extends com.qualcomm.qti.gaiaclient.ui.common.Observers {
        private final androidx.lifecycle.Observer<androidx.collection.ArrayMap<com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.QTILFeature, java.lang.Integer>> featuresObserver = null;
        private final androidx.lifecycle.Observer<com.qualcomm.qti.gaiaclient.repository.Resource<com.qualcomm.qti.gaiaclient.repository.connection.Device, com.qualcomm.qti.gaiaclient.core.bluetooth.data.BluetoothStatus>> connectedDeviceObserver = null;
        private final androidx.lifecycle.Observer<java.util.Set<com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.battery.Battery>> supportedBatteriesObserver = null;
        private final androidx.lifecycle.Observer<java.util.Map<com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.battery.Battery, java.lang.Integer>> batteryLevelsObserver = null;
        private final androidx.lifecycle.Observer<com.qualcomm.qti.gaiaclient.repository.deviceinfo.Versions> versionsObserver = null;
        private final androidx.lifecycle.Observer<com.qualcomm.qti.gaiaclient.repository.deviceinfo.DeviceInformation> deviceInformationObserver = null;
        private final androidx.lifecycle.Observer<java.util.List<com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.basic.SystemInformation>> systemInformationObserver = null;
        private final androidx.lifecycle.Observer<com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.basic.CrossUpdateVersion> crossUpdateVersionObserver = null;
        
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
}