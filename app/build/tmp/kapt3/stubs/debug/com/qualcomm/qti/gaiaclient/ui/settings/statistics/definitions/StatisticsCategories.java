package com.qualcomm.qti.gaiaclient.ui.settings.statistics.definitions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0001\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0013B%\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000j\u0002\b\u0011j\u0002\b\u0012\u00a8\u0006\u0014"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/settings/statistics/definitions/StatisticsCategories;", "", "identifier", "", "allStatistics", "", "Lcom/qualcomm/qti/gaiaclient/ui/settings/statistics/definitions/CategoryStatisticSettings;", "labelId", "(Ljava/lang/String;IILjava/util/List;I)V", "getAllStatistics", "()Ljava/util/List;", "getIdentifier", "()I", "getTitle", "", "context", "Landroid/content/Context;", "STREAMING", "SPATIAL_AUDIO", "Companion", "app_debug"})
public enum StatisticsCategories {
    /*public static final*/ STREAMING /* = new STREAMING(0, null, 0) */,
    /*public static final*/ SPATIAL_AUDIO /* = new SPATIAL_AUDIO(0, null, 0) */;
    private final int identifier = 0;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.qualcomm.qti.gaiaclient.ui.settings.statistics.definitions.CategoryStatisticSettings> allStatistics = null;
    private final int labelId = 0;
    @org.jetbrains.annotations.NotNull
    public static final com.qualcomm.qti.gaiaclient.ui.settings.statistics.definitions.StatisticsCategories.Companion Companion = null;
    
    StatisticsCategories(int identifier, java.util.List<? extends com.qualcomm.qti.gaiaclient.ui.settings.statistics.definitions.CategoryStatisticSettings> allStatistics, int labelId) {
    }
    
    public final int getIdentifier() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.qualcomm.qti.gaiaclient.ui.settings.statistics.definitions.CategoryStatisticSettings> getAllStatistics() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTitle(@org.jetbrains.annotations.Nullable
    android.content.Context context) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/settings/statistics/definitions/StatisticsCategories$Companion;", "", "()V", "fromIdentifier", "Lcom/qualcomm/qti/gaiaclient/ui/settings/statistics/definitions/StatisticsCategories;", "identifier", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.qualcomm.qti.gaiaclient.ui.settings.statistics.definitions.StatisticsCategories fromIdentifier(int identifier) {
            return null;
        }
    }
}