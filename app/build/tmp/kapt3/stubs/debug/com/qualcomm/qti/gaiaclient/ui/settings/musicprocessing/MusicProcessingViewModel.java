package com.qualcomm.qti.gaiaclient.ui.settings.musicprocessing;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001-B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\u000e\u001a\u00020\u000fJ&\u0010\u0010\u001a\u00020\u000f2\u001c\u0010\u0011\u001a\u0018\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0012H\u0002J\b\u0010\u0016\u001a\u00020\u000fH\u0014J\"\u0010\u0017\u001a\u00020\u000f2\u0018\u0010\u0011\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0018\u00010\u0012H\u0002J\"\u0010\u001a\u001a\u00020\u000f2\u0018\u0010\u0011\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u0012H\u0002J\"\u0010\u001b\u001a\u00020\u000f2\u0018\u0010\u0011\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u0012H\u0002J(\u0010\u001d\u001a\u00020\u000f2\u001e\u0010\u0011\u001a\u001a\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u0012H\u0002J\u000e\u0010 \u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\"J\u000e\u0010#\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020%J\u0016\u0010&\u001a\u00020\u000f2\u0006\u0010\'\u001a\u00020\"2\u0006\u0010$\u001a\u00020%J\u001c\u0010(\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020*2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000b0,R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00060\rR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006."}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/settings/musicprocessing/MusicProcessingViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "connectionRepository", "Lcom/qualcomm/qti/gaiaclient/repository/connection/ConnectionRepository;", "musicProcessingRepository", "Lcom/qualcomm/qti/gaiaclient/repository/musicprocessing/MusicProcessingRepository;", "(Landroid/app/Application;Lcom/qualcomm/qti/gaiaclient/repository/connection/ConnectionRepository;Lcom/qualcomm/qti/gaiaclient/repository/musicprocessing/MusicProcessingRepository;)V", "mViewData", "Lcom/qualcomm/qti/gaiaclient/ui/common/StickyLiveData;", "Lcom/qualcomm/qti/gaiaclient/ui/settings/musicprocessing/MusicProcessingViewData;", "observers", "Lcom/qualcomm/qti/gaiaclient/ui/settings/musicprocessing/MusicProcessingViewModel$DataObservers;", "fetchData", "", "onAvailablePreSets", "resource", "Lcom/qualcomm/qti/gaiaclient/repository/Resource;", "", "Lcom/qualcomm/qti/gaiaclient/core/gaia/qtil/data/PreSet;", "Lcom/qualcomm/qti/gaiaclient/core/data/Reason;", "onCleared", "onConnectionStateUpdated", "Lcom/qualcomm/qti/gaiaclient/repository/connection/Device;", "Lcom/qualcomm/qti/gaiaclient/core/bluetooth/data/BluetoothStatus;", "onSelectedSet", "onState", "Lcom/qualcomm/qti/gaiaclient/core/gaia/qtil/data/EQState;", "onUserSetConfiguration", "", "Lcom/qualcomm/qti/gaiaclient/core/gaia/qtil/data/BandInfo;", "selectPresetAtIndex", "index", "", "setAllGains", "gain", "", "setBandGain", "band", "setObservers", "owner", "Landroidx/lifecycle/LifecycleOwner;", "dataObserver", "Landroidx/lifecycle/Observer;", "DataObservers", "app_debug"})
public final class MusicProcessingViewModel extends androidx.lifecycle.AndroidViewModel {
    private final com.qualcomm.qti.gaiaclient.repository.connection.ConnectionRepository connectionRepository = null;
    private final com.qualcomm.qti.gaiaclient.repository.musicprocessing.MusicProcessingRepository musicProcessingRepository = null;
    private com.qualcomm.qti.gaiaclient.ui.common.StickyLiveData<com.qualcomm.qti.gaiaclient.ui.settings.musicprocessing.MusicProcessingViewData> mViewData;
    private final com.qualcomm.qti.gaiaclient.ui.settings.musicprocessing.MusicProcessingViewModel.DataObservers observers = null;
    
    @javax.inject.Inject
    public MusicProcessingViewModel(@org.jetbrains.annotations.NotNull
    android.app.Application application, @org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.repository.connection.ConnectionRepository connectionRepository, @org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.repository.musicprocessing.MusicProcessingRepository musicProcessingRepository) {
        super(null);
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
    
    public final void setObservers(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.LifecycleOwner owner, @org.jetbrains.annotations.NotNull
    androidx.lifecycle.Observer<com.qualcomm.qti.gaiaclient.ui.settings.musicprocessing.MusicProcessingViewData> dataObserver) {
    }
    
    public final void fetchData() {
    }
    
    public final void selectPresetAtIndex(int index) {
    }
    
    public final void setBandGain(int band, double gain) {
    }
    
    public final void setAllGains(double gain) {
    }
    
    private final void onConnectionStateUpdated(com.qualcomm.qti.gaiaclient.repository.Resource<com.qualcomm.qti.gaiaclient.repository.connection.Device, com.qualcomm.qti.gaiaclient.core.bluetooth.data.BluetoothStatus> resource) {
    }
    
    private final void onState(com.qualcomm.qti.gaiaclient.repository.Resource<com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.EQState, com.qualcomm.qti.gaiaclient.core.data.Reason> resource) {
    }
    
    private final void onAvailablePreSets(com.qualcomm.qti.gaiaclient.repository.Resource<java.util.List<com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.PreSet>, com.qualcomm.qti.gaiaclient.core.data.Reason> resource) {
    }
    
    private final void onSelectedSet(com.qualcomm.qti.gaiaclient.repository.Resource<com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.PreSet, com.qualcomm.qti.gaiaclient.core.data.Reason> resource) {
    }
    
    private final void onUserSetConfiguration(com.qualcomm.qti.gaiaclient.repository.Resource<java.util.Set<com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.BandInfo>, com.qualcomm.qti.gaiaclient.core.data.Reason> resource) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0016\u001a\u00020\u000bH\u0014J\b\u0010\u0017\u001a\u00020\u000bH\u0014R;\u0010\u0003\u001a/\u0012%\u0012#\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0005\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R;\u0010\f\u001a/\u0012%\u0012#\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\u0005\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R?\u0010\u000f\u001a3\u0012)\u0012\'\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0005\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R;\u0010\u0012\u001a/\u0012%\u0012#\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\u0005\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000RA\u0010\u0013\u001a5\u0012+\u0012)\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\u0005\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/settings/musicprocessing/MusicProcessingViewModel$DataObservers;", "Lcom/qualcomm/qti/gaiaclient/ui/common/Observers;", "(Lcom/qualcomm/qti/gaiaclient/ui/settings/musicprocessing/MusicProcessingViewModel;)V", "connectedDeviceObserver", "Lkotlin/reflect/KFunction1;", "Lcom/qualcomm/qti/gaiaclient/repository/Resource;", "Lcom/qualcomm/qti/gaiaclient/repository/connection/Device;", "Lcom/qualcomm/qti/gaiaclient/core/bluetooth/data/BluetoothStatus;", "Lkotlin/ParameterName;", "name", "resource", "", "eqStateObserver", "Lcom/qualcomm/qti/gaiaclient/core/gaia/qtil/data/EQState;", "Lcom/qualcomm/qti/gaiaclient/core/data/Reason;", "preSetsObserver", "", "Lcom/qualcomm/qti/gaiaclient/core/gaia/qtil/data/PreSet;", "selectedSetObserver", "userSetConfigurationObserver", "", "Lcom/qualcomm/qti/gaiaclient/core/gaia/qtil/data/BandInfo;", "registerObservers", "unregisterObservers", "app_debug"})
    final class DataObservers extends com.qualcomm.qti.gaiaclient.ui.common.Observers {
        private final kotlin.reflect.KFunction<kotlin.Unit> connectedDeviceObserver = null;
        private final kotlin.reflect.KFunction<kotlin.Unit> eqStateObserver = null;
        private final kotlin.reflect.KFunction<kotlin.Unit> preSetsObserver = null;
        private final kotlin.reflect.KFunction<kotlin.Unit> selectedSetObserver = null;
        private final kotlin.reflect.KFunction<kotlin.Unit> userSetConfigurationObserver = null;
        
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