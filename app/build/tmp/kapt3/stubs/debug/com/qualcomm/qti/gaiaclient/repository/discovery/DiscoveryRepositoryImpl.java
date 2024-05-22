package com.qualcomm.qti.gaiaclient.repository.discovery;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0014B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0014J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002R$\u0010\u0003\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u0004R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00060\u0004R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\t\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u0004R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/repository/discovery/DiscoveryRepositoryImpl;", "Lcom/qualcomm/qti/gaiaclient/repository/discovery/DiscoveryRepositoryData;", "()V", "connectedListener", "Lcom/qualcomm/qti/gaiaclient/repository/discovery/DiscoveryRepositoryImpl$DiscoveryListener;", "", "Lcom/qualcomm/qti/gaiaclient/core/bluetooth/data/DiscoveredDevice;", "Ljava/lang/Void;", "discoveredListener", "pairedListener", "fetchDevices", "", "context", "Landroid/content/Context;", "type", "Lcom/qualcomm/qti/gaiaclient/core/bluetooth/data/DiscoveryType;", "matchStatusToReason", "Lcom/qualcomm/qti/gaiaclient/repository/connection/BluetoothReason;", "status", "Lcom/qualcomm/qti/gaiaclient/core/bluetooth/data/BluetoothStatus;", "DiscoveryListener", "app_debug"})
@javax.inject.Singleton
public final class DiscoveryRepositoryImpl extends com.qualcomm.qti.gaiaclient.repository.discovery.DiscoveryRepositoryData {
    private final com.qualcomm.qti.gaiaclient.repository.discovery.DiscoveryRepositoryImpl.DiscoveryListener<java.util.List<com.qualcomm.qti.gaiaclient.core.bluetooth.data.DiscoveredDevice>, java.lang.Void> pairedListener = null;
    private final com.qualcomm.qti.gaiaclient.repository.discovery.DiscoveryRepositoryImpl.DiscoveryListener<java.lang.Void, com.qualcomm.qti.gaiaclient.core.bluetooth.data.DiscoveredDevice> discoveredListener = null;
    private final com.qualcomm.qti.gaiaclient.repository.discovery.DiscoveryRepositoryImpl.DiscoveryListener<java.util.List<com.qualcomm.qti.gaiaclient.core.bluetooth.data.DiscoveredDevice>, java.lang.Void> connectedListener = null;
    
    @javax.inject.Inject
    public DiscoveryRepositoryImpl() {
        super();
    }
    
    @java.lang.Override
    protected void fetchDevices(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.core.bluetooth.data.DiscoveryType type) {
    }
    
    private final com.qualcomm.qti.gaiaclient.repository.connection.BluetoothReason matchStatusToReason(com.qualcomm.qti.gaiaclient.core.bluetooth.data.BluetoothStatus status) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0082\u0004\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00040\u0003B9\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\t0\b\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\u0002\u0010\u000bJ\u0015\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0004H\u0016J\u0015\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00028\u0001H\u0016\u00a2\u0006\u0002\u0010\u000eR\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/repository/discovery/DiscoveryRepositoryImpl$DiscoveryListener;", "Result", "Progress", "Lcom/qualcomm/qti/gaiaclient/core/requests/core/RequestListener;", "Lcom/qualcomm/qti/gaiaclient/core/bluetooth/data/BluetoothStatus;", "discoveryType", "Lcom/qualcomm/qti/gaiaclient/core/bluetooth/data/DiscoveryType;", "progress", "Lkotlin/Function1;", "", "complete", "(Lcom/qualcomm/qti/gaiaclient/repository/discovery/DiscoveryRepositoryImpl;Lcom/qualcomm/qti/gaiaclient/core/bluetooth/data/DiscoveryType;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "onComplete", "result", "(Ljava/lang/Object;)V", "onError", "error", "onProgress", "app_debug"})
    final class DiscoveryListener<Result extends java.lang.Object, Progress extends java.lang.Object> implements com.qualcomm.qti.gaiaclient.core.requests.core.RequestListener<Result, Progress, com.qualcomm.qti.gaiaclient.core.bluetooth.data.BluetoothStatus> {
        private final com.qualcomm.qti.gaiaclient.core.bluetooth.data.DiscoveryType discoveryType = null;
        private final kotlin.jvm.functions.Function1<Progress, kotlin.Unit> progress = null;
        private final kotlin.jvm.functions.Function1<Result, kotlin.Unit> complete = null;
        
        public DiscoveryListener(@org.jetbrains.annotations.NotNull
        com.qualcomm.qti.gaiaclient.core.bluetooth.data.DiscoveryType discoveryType, @org.jetbrains.annotations.NotNull
        kotlin.jvm.functions.Function1<? super Progress, kotlin.Unit> progress, @org.jetbrains.annotations.NotNull
        kotlin.jvm.functions.Function1<? super Result, kotlin.Unit> complete) {
            super();
        }
        
        @java.lang.Override
        public void onProgress(Progress progress) {
        }
        
        @java.lang.Override
        public void onComplete(Result result) {
        }
        
        @java.lang.Override
        public void onError(@org.jetbrains.annotations.NotNull
        com.qualcomm.qti.gaiaclient.core.bluetooth.data.BluetoothStatus error) {
        }
    }
}