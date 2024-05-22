package com.qualcomm.qti.gaiaclient.ui.settings.statistics.definitions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&J\u001c\u0010\n\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\fH&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\r"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/settings/statistics/definitions/CategoryStatisticSettings;", "", "identifier", "", "getIdentifier", "()I", "getTitle", "", "context", "Landroid/content/Context;", "getValue", "data", "", "app_debug"})
public abstract interface CategoryStatisticSettings {
    
    public abstract int getIdentifier();
    
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String getTitle(@org.jetbrains.annotations.Nullable
    android.content.Context context);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.String getValue(@org.jetbrains.annotations.Nullable
    android.content.Context context, @org.jetbrains.annotations.NotNull
    byte[] data);
}