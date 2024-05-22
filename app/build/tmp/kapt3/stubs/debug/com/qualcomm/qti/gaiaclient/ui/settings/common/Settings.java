package com.qualcomm.qti.gaiaclient.ui.settings.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\n"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/settings/common/Settings;", "", "resourceId", "", "getResourceId", "()I", "getId", "", "context", "Landroid/content/Context;", "app_debug"})
public abstract interface Settings {
    
    public abstract int getResourceId();
    
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String getId(@org.jetbrains.annotations.Nullable
    android.content.Context context);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
        
        @org.jetbrains.annotations.NotNull
        public static java.lang.String getId(@org.jetbrains.annotations.NotNull
        com.qualcomm.qti.gaiaclient.ui.settings.common.Settings $thıs, @org.jetbrains.annotations.Nullable
        android.content.Context context) {
            return null;
        }
    }
}