package com.qualcomm.qti.gaiaclient.repository.connection;

import java.lang.System;

/**
 * This represents the data model of a Bluetooth device.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007B\u001d\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\tH\u0016J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001aH\u0016R\u0011\u0010\n\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006 "}, d2 = {"Lcom/qualcomm/qti/gaiaclient/repository/connection/Device;", "Landroid/os/Parcelable;", "device", "Lcom/qualcomm/qti/gaiaclient/core/bluetooth/data/DiscoveredDevice;", "(Lcom/qualcomm/qti/gaiaclient/core/bluetooth/data/DiscoveredDevice;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "name", "", "bluetoothAddress", "bluetoothType", "Lcom/qualcomm/qti/gaiaclient/core/bluetooth/data/BluetoothType;", "(Ljava/lang/String;Ljava/lang/String;Lcom/qualcomm/qti/gaiaclient/core/bluetooth/data/BluetoothType;)V", "getBluetoothAddress", "()Ljava/lang/String;", "getBluetoothType", "()Lcom/qualcomm/qti/gaiaclient/core/bluetooth/data/BluetoothType;", "getName", "state", "Lcom/qualcomm/qti/gaiaclient/core/bluetooth/data/ConnectionState;", "getState", "()Lcom/qualcomm/qti/gaiaclient/core/bluetooth/data/ConnectionState;", "setState", "(Lcom/qualcomm/qti/gaiaclient/core/bluetooth/data/ConnectionState;)V", "describeContents", "", "toString", "writeToParcel", "", "i", "CREATOR", "app_debug"})
public final class Device implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String bluetoothAddress = null;
    @org.jetbrains.annotations.NotNull
    private final com.qualcomm.qti.gaiaclient.core.bluetooth.data.BluetoothType bluetoothType = null;
    @org.jetbrains.annotations.NotNull
    private com.qualcomm.qti.gaiaclient.core.bluetooth.data.ConnectionState state = com.qualcomm.qti.gaiaclient.core.bluetooth.data.ConnectionState.DISCONNECTED;
    @org.jetbrains.annotations.NotNull
    public static final com.qualcomm.qti.gaiaclient.repository.connection.Device.CREATOR CREATOR = null;
    
    public Device(@org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String bluetoothAddress, @org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.core.bluetooth.data.BluetoothType bluetoothType) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getBluetoothAddress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.qualcomm.qti.gaiaclient.core.bluetooth.data.BluetoothType getBluetoothType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.qualcomm.qti.gaiaclient.core.bluetooth.data.ConnectionState getState() {
        return null;
    }
    
    public final void setState(@org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.core.bluetooth.data.ConnectionState p0) {
    }
    
    public Device(@org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.core.bluetooth.data.DiscoveredDevice device) {
        super();
    }
    
    public Device(@org.jetbrains.annotations.NotNull
    android.os.Parcel parcel) {
        super();
    }
    
    @java.lang.Override
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override
    public void writeToParcel(@org.jetbrains.annotations.NotNull
    android.os.Parcel parcel, int i) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/repository/connection/Device$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/qualcomm/qti/gaiaclient/repository/connection/Device;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/qualcomm/qti/gaiaclient/repository/connection/Device;", "app_debug"})
    public static final class CREATOR implements android.os.Parcelable.Creator<com.qualcomm.qti.gaiaclient.repository.connection.Device> {
        
        private CREATOR() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public com.qualcomm.qti.gaiaclient.repository.connection.Device createFromParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel parcel) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public com.qualcomm.qti.gaiaclient.repository.connection.Device[] newArray(int size) {
            return null;
        }
    }
}