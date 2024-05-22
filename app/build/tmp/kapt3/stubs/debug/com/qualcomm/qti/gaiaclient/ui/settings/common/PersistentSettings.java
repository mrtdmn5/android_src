package com.qualcomm.qti.gaiaclient.ui.settings.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/settings/common/PersistentSettings;", "Lcom/qualcomm/qti/gaiaclient/ui/settings/common/Settings;", "isPersistent", "", "()Z", "app_debug"})
public abstract interface PersistentSettings extends com.qualcomm.qti.gaiaclient.ui.settings.common.Settings {
    
    public abstract boolean isPersistent();
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public static java.lang.String getId(@org.jetbrains.annotations.NotNull
        com.qualcomm.qti.gaiaclient.ui.settings.common.PersistentSettings $thıs, @org.jetbrains.annotations.Nullable
        android.content.Context context) {
            return null;
        }
    }
}