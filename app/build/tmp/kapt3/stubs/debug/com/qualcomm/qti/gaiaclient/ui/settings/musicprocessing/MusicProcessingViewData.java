package com.qualcomm.qti.gaiaclient.ui.settings.musicprocessing;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002B;\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\u0002\u0010\rR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u00078F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006\u0019"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/settings/musicprocessing/MusicProcessingViewData;", "", "()V", "deviceConnected", "", "eqEnabled", "presets", "", "Lcom/qualcomm/qti/gaiaclient/core/gaia/qtil/data/PreSet;", "selectedPreset", "userBands", "", "Lcom/qualcomm/qti/gaiaclient/core/gaia/qtil/data/BandInfo;", "(ZZLjava/util/List;Lcom/qualcomm/qti/gaiaclient/core/gaia/qtil/data/PreSet;Ljava/util/Set;)V", "getDeviceConnected", "()Z", "getEqEnabled", "orderedUserBands", "getOrderedUserBands", "()Ljava/util/List;", "getPresets", "getSelectedPreset", "()Lcom/qualcomm/qti/gaiaclient/core/gaia/qtil/data/PreSet;", "getUserBands", "()Ljava/util/Set;", "app_debug"})
public final class MusicProcessingViewData {
    private final boolean deviceConnected = false;
    private final boolean eqEnabled = false;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.PreSet> presets = null;
    @org.jetbrains.annotations.Nullable
    private final com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.PreSet selectedPreset = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.Set<com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.BandInfo> userBands = null;
    
    public MusicProcessingViewData(boolean deviceConnected, boolean eqEnabled, @org.jetbrains.annotations.NotNull
    java.util.List<? extends com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.PreSet> presets, @org.jetbrains.annotations.Nullable
    com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.PreSet selectedPreset, @org.jetbrains.annotations.NotNull
    java.util.Set<? extends com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.BandInfo> userBands) {
        super();
    }
    
    public final boolean getDeviceConnected() {
        return false;
    }
    
    public final boolean getEqEnabled() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.PreSet> getPresets() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.PreSet getSelectedPreset() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Set<com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.BandInfo> getUserBands() {
        return null;
    }
    
    public MusicProcessingViewData() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.BandInfo> getOrderedUserBands() {
        return null;
    }
}