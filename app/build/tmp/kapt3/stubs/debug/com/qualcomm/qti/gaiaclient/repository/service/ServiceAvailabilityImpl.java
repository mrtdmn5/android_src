package com.qualcomm.qti.gaiaclient.repository.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\n"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceAvailabilityImpl;", "Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceAvailability;", "()V", "exists", "", "getExists", "()Z", "isAvailable", "context", "Landroid/content/Context;", "app_debug"})
public final class ServiceAvailabilityImpl implements com.qualcomm.qti.gaiaclient.repository.service.ServiceAvailability {
    @org.jetbrains.annotations.NotNull
    public static final com.qualcomm.qti.gaiaclient.repository.service.ServiceAvailabilityImpl INSTANCE = null;
    private static final boolean exists = false;
    
    private ServiceAvailabilityImpl() {
        super();
    }
    
    @java.lang.Override
    public boolean getExists() {
        return false;
    }
    
    @java.lang.Override
    public boolean isAvailable(@org.jetbrains.annotations.Nullable
    android.content.Context context) {
        return false;
    }
}