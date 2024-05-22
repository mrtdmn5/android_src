package com.qualcomm.qti.gaiaclient.ui.information;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u001e\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010;\u001a\u0004\u0018\u00010\u00042\u0006\u0010<\u001a\u00020\u000eJ\u0006\u0010=\u001a\u00020$J\u0006\u0010>\u001a\u00020$J\u0006\u0010?\u001a\u00020$J\u0006\u0010@\u001a\u00020$J\u0006\u0010A\u001a\u00020$R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR&\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00040\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\bR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R \u0010#\u001a\u0004\u0018\u00010$8FX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010(\u001a\u0004\b#\u0010%\"\u0004\b&\u0010\'R\u001c\u0010)\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0006\"\u0004\b+\u0010\bR\u001c\u0010,\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0006\"\u0004\b.\u0010\bR\u001c\u0010/\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0006\"\u0004\b1\u0010\bR\u001c\u00102\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0006\"\u0004\b4\u0010\bR\u001c\u00105\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u0006\"\u0004\b7\u0010\bR\u001c\u00108\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u0006\"\u0004\b:\u0010\b\u00a8\u0006B"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/information/InformationViewData;", "", "()V", "applicationBuildId", "", "getApplicationBuildId", "()Ljava/lang/String;", "setApplicationBuildId", "(Ljava/lang/String;)V", "applicationVersion", "getApplicationVersion", "setApplicationVersion", "batteryLevels", "", "Lcom/qualcomm/qti/gaiaclient/core/gaia/qtil/data/battery/Battery;", "getBatteryLevels", "()Ljava/util/Map;", "setBatteryLevels", "(Ljava/util/Map;)V", "bluetoothAddress", "getBluetoothAddress", "setBluetoothAddress", "deviceImage", "Lcom/qualcomm/qti/gaiaclient/ui/common/ImageViewData;", "getDeviceImage", "()Lcom/qualcomm/qti/gaiaclient/ui/common/ImageViewData;", "setDeviceImage", "(Lcom/qualcomm/qti/gaiaclient/ui/common/ImageViewData;)V", "gaiaVersion", "", "getGaiaVersion", "()Ljava/lang/Integer;", "setGaiaVersion", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "isCharging", "", "()Ljava/lang/Boolean;", "setCharging", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "name", "getName", "setName", "serialNumber", "getSerialNumber", "setSerialNumber", "serialNumberLeft", "getSerialNumberLeft", "setSerialNumberLeft", "serialNumberRight", "getSerialNumberRight", "setSerialNumberRight", "state", "getState", "setState", "variantName", "getVariantName", "setVariantName", "getBatteryLevel", "battery", "hasBatteryLevels", "hasSerialNumbers", "hasStates", "hasVersions", "showSingleSerialNumber", "app_debug"})
public final class InformationViewData {
    @org.jetbrains.annotations.Nullable
    private com.qualcomm.qti.gaiaclient.ui.common.ImageViewData deviceImage;
    @org.jetbrains.annotations.Nullable
    private java.lang.String name;
    @org.jetbrains.annotations.Nullable
    private java.lang.String variantName;
    @org.jetbrains.annotations.Nullable
    private java.lang.String bluetoothAddress;
    @org.jetbrains.annotations.Nullable
    private java.lang.String state;
    @org.jetbrains.annotations.Nullable
    private java.lang.String serialNumber;
    @org.jetbrains.annotations.Nullable
    private java.lang.String serialNumberLeft;
    @org.jetbrains.annotations.Nullable
    private java.lang.String serialNumberRight;
    @org.jetbrains.annotations.Nullable
    private java.lang.String applicationVersion;
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer gaiaVersion;
    @org.jetbrains.annotations.NotNull
    private java.util.Map<com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.battery.Battery, java.lang.String> batteryLevels;
    @org.jetbrains.annotations.Nullable
    private java.lang.Boolean isCharging;
    @org.jetbrains.annotations.Nullable
    private java.lang.String applicationBuildId;
    
    public InformationViewData() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.qualcomm.qti.gaiaclient.ui.common.ImageViewData getDeviceImage() {
        return null;
    }
    
    public final void setDeviceImage(@org.jetbrains.annotations.Nullable
    com.qualcomm.qti.gaiaclient.ui.common.ImageViewData p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getVariantName() {
        return null;
    }
    
    public final void setVariantName(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getBluetoothAddress() {
        return null;
    }
    
    public final void setBluetoothAddress(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getState() {
        return null;
    }
    
    public final void setState(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getSerialNumber() {
        return null;
    }
    
    public final void setSerialNumber(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getSerialNumberLeft() {
        return null;
    }
    
    public final void setSerialNumberLeft(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getSerialNumberRight() {
        return null;
    }
    
    public final void setSerialNumberRight(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getApplicationVersion() {
        return null;
    }
    
    public final void setApplicationVersion(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getGaiaVersion() {
        return null;
    }
    
    public final void setGaiaVersion(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Map<com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.battery.Battery, java.lang.String> getBatteryLevels() {
        return null;
    }
    
    public final void setBatteryLevels(@org.jetbrains.annotations.NotNull
    java.util.Map<com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.battery.Battery, java.lang.String> p0) {
    }
    
    public final void setCharging(@org.jetbrains.annotations.Nullable
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean isCharging() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getApplicationBuildId() {
        return null;
    }
    
    public final void setApplicationBuildId(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    public final boolean hasStates() {
        return false;
    }
    
    public final boolean hasVersions() {
        return false;
    }
    
    public final boolean hasSerialNumbers() {
        return false;
    }
    
    public final boolean showSingleSerialNumber() {
        return false;
    }
    
    public final boolean hasBatteryLevels() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getBatteryLevel(@org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.battery.Battery battery) {
        return null;
    }
}