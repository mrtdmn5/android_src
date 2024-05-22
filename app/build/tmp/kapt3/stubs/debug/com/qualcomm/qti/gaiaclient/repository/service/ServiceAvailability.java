package com.qualcomm.qti.gaiaclient.repository.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\t"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceAvailability;", "", "exists", "", "getExists", "()Z", "isAvailable", "context", "Landroid/content/Context;", "app_debug"})
public abstract interface ServiceAvailability {
    
    public abstract boolean getExists();
    
    public abstract boolean isAvailable(@org.jetbrains.annotations.Nullable
    android.content.Context context);
}