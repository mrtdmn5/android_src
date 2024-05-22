package com.qualcomm.qti.gaiaclient.ui.settings.download;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001 B\u001f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H\u0014J\b\u0010\u0012\u001a\u00020\u000eH\u0014J\u0012\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\u0018\u0010\u0016\u001a\u00020\u000e2\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018H\u0002J\u0012\u0010\u001a\u001a\u00020\u000e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002J\u0010\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00060\fR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/settings/download/DownloadSettingsViewModel;", "Lcom/qualcomm/qti/gaiaclient/ui/settings/common/SettingsViewModel;", "Lcom/qualcomm/qti/gaiaclient/ui/settings/download/DownloadSettings;", "Lcom/qualcomm/qti/gaiaclient/ui/settings/download/DownloadSettingsViewData;", "application", "Landroid/app/Application;", "connectionRepository", "Lcom/qualcomm/qti/gaiaclient/repository/connection/ConnectionRepository;", "deviceInfoRepository", "Lcom/qualcomm/qti/gaiaclient/repository/deviceinfo/DeviceInformationRepository;", "(Landroid/app/Application;Lcom/qualcomm/qti/gaiaclient/repository/connection/ConnectionRepository;Lcom/qualcomm/qti/gaiaclient/repository/deviceinfo/DeviceInformationRepository;)V", "observers", "Lcom/qualcomm/qti/gaiaclient/ui/settings/download/DownloadSettingsViewModel$DataObservers;", "fetchDeviceInformation", "", "initViewData", "context", "Landroid/content/Context;", "onCleared", "onConnectionStateUpdated", "state", "Lcom/qualcomm/qti/gaiaclient/core/bluetooth/data/ConnectionState;", "onSystemInformation", "infos", "", "Lcom/qualcomm/qti/gaiaclient/core/gaia/qtil/data/basic/SystemInformation;", "onVersions", "versions", "Lcom/qualcomm/qti/gaiaclient/repository/deviceinfo/Versions;", "updateApplicationBuildId", "id", "Lcom/qualcomm/qti/gaiaclient/core/gaia/qtil/data/basic/SystemInformation$ApplicationBuildId;", "DataObservers", "app_debug"})
public final class DownloadSettingsViewModel extends com.qualcomm.qti.gaiaclient.ui.settings.common.SettingsViewModel<com.qualcomm.qti.gaiaclient.ui.settings.download.DownloadSettings, com.qualcomm.qti.gaiaclient.ui.settings.download.DownloadSettingsViewData> {
    private final com.qualcomm.qti.gaiaclient.repository.deviceinfo.DeviceInformationRepository deviceInfoRepository = null;
    private final com.qualcomm.qti.gaiaclient.ui.settings.download.DownloadSettingsViewModel.DataObservers observers = null;
    
    @javax.inject.Inject
    public DownloadSettingsViewModel(@org.jetbrains.annotations.NotNull
    android.app.Application application, @org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.repository.connection.ConnectionRepository connectionRepository, @org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.repository.deviceinfo.DeviceInformationRepository deviceInfoRepository) {
        super(null, null);
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    protected com.qualcomm.qti.gaiaclient.ui.settings.download.DownloadSettingsViewData initViewData(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
    
    @java.lang.Override
    protected void onConnectionStateUpdated(@org.jetbrains.annotations.Nullable
    com.qualcomm.qti.gaiaclient.core.bluetooth.data.ConnectionState state) {
    }
    
    private final void fetchDeviceInformation() {
    }
    
    private final void onVersions(com.qualcomm.qti.gaiaclient.repository.deviceinfo.Versions versions) {
    }
    
    private final void onSystemInformation(java.util.List<? extends com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.basic.SystemInformation> infos) {
    }
    
    private final void updateApplicationBuildId(com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.basic.SystemInformation.ApplicationBuildId id) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\nH\u0014J\b\u0010\u000f\u001a\u00020\nH\u0014R1\u0010\u0003\u001a%\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\u000b\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\f\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\n0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/settings/download/DownloadSettingsViewModel$DataObservers;", "Lcom/qualcomm/qti/gaiaclient/ui/common/Observers;", "(Lcom/qualcomm/qti/gaiaclient/ui/settings/download/DownloadSettingsViewModel;)V", "systemInformationObserver", "Lkotlin/reflect/KFunction1;", "", "Lcom/qualcomm/qti/gaiaclient/core/gaia/qtil/data/basic/SystemInformation;", "Lkotlin/ParameterName;", "name", "infos", "", "versionsObserver", "Lcom/qualcomm/qti/gaiaclient/repository/deviceinfo/Versions;", "versions", "registerObservers", "unregisterObservers", "app_debug"})
    final class DataObservers extends com.qualcomm.qti.gaiaclient.ui.common.Observers {
        private final kotlin.reflect.KFunction<kotlin.Unit> versionsObserver = null;
        private final kotlin.reflect.KFunction<kotlin.Unit> systemInformationObserver = null;
        
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