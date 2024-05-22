package com.qualcomm.qti.gaiaclient.repository.deviceinfo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u0019H&J\u001a\u0010\u001a\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u001bH&J\b\u0010\u001c\u001a\u00020\u0015H&J\b\u0010\u001d\u001a\u00020\u0015H&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u0006R\u001e\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u0006R\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0006R\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0006\u00a8\u0006\u001e"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/repository/deviceinfo/DeviceInformationRepository;", "", "crossUpdateVersion", "Landroidx/lifecycle/LiveData;", "Lcom/qualcomm/qti/gaiaclient/core/gaia/qtil/data/basic/CrossUpdateVersion;", "getCrossUpdateVersion", "()Landroidx/lifecycle/LiveData;", "deviceInformation", "Lcom/qualcomm/qti/gaiaclient/repository/deviceinfo/DeviceInformation;", "getDeviceInformation", "systemInformation", "", "Lcom/qualcomm/qti/gaiaclient/core/gaia/qtil/data/basic/SystemInformation;", "getSystemInformation", "userFeatures", "Lcom/qualcomm/qti/gaiaclient/core/gaia/qtil/data/basic/userfeatures/UserFeatures;", "getUserFeatures", "versions", "Lcom/qualcomm/qti/gaiaclient/repository/deviceinfo/Versions;", "getVersions", "fetchDeviceInfo", "", "context", "Landroid/content/Context;", "info", "Lcom/qualcomm/qti/gaiaclient/core/data/DeviceInfo;", "fetchEarbudInfo", "Lcom/qualcomm/qti/gaiaclient/core/data/EarbudInfo;", "init", "reset", "app_debug"})
public abstract interface DeviceInformationRepository {
    
    public abstract void init();
    
    public abstract void reset();
    
    public abstract void fetchDeviceInfo(@org.jetbrains.annotations.Nullable
    android.content.Context context, @org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.core.data.DeviceInfo info);
    
    public abstract void fetchEarbudInfo(@org.jetbrains.annotations.Nullable
    android.content.Context context, @org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.core.data.EarbudInfo info);
    
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<com.qualcomm.qti.gaiaclient.repository.deviceinfo.Versions> getVersions();
    
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<com.qualcomm.qti.gaiaclient.repository.deviceinfo.DeviceInformation> getDeviceInformation();
    
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.basic.userfeatures.UserFeatures> getUserFeatures();
    
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<java.util.List<com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.basic.SystemInformation>> getSystemInformation();
    
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.basic.CrossUpdateVersion> getCrossUpdateVersion();
}