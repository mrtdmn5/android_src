package com.qualcomm.qti.gaiaclient.ui.settings.statistics.definitions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\b\u0086\u0001\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0014B\u0017\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u001c\u0010\r\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000j\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013\u00a8\u0006\u0015"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/settings/statistics/definitions/SpatialAudioStatistics;", "", "Lcom/qualcomm/qti/gaiaclient/ui/settings/statistics/definitions/CategoryStatisticSettings;", "identifier", "", "titleStringId", "(Ljava/lang/String;III)V", "getIdentifier", "()I", "getTitle", "", "context", "Landroid/content/Context;", "getValue", "data", "", "QUATERNION_W", "QUATERNION_X", "QUATERNION_Y", "QUATERNION_Z", "Companion", "app_debug"})
public enum SpatialAudioStatistics implements com.qualcomm.qti.gaiaclient.ui.settings.statistics.definitions.CategoryStatisticSettings {
    /*public static final*/ QUATERNION_W /* = new QUATERNION_W(0, 0) */,
    /*public static final*/ QUATERNION_X /* = new QUATERNION_X(0, 0) */,
    /*public static final*/ QUATERNION_Y /* = new QUATERNION_Y(0, 0) */,
    /*public static final*/ QUATERNION_Z /* = new QUATERNION_Z(0, 0) */;
    private final int identifier = 0;
    private final int titleStringId = 0;
    @org.jetbrains.annotations.NotNull
    public static final com.qualcomm.qti.gaiaclient.ui.settings.statistics.definitions.SpatialAudioStatistics.Companion Companion = null;
    
    SpatialAudioStatistics(int identifier, int titleStringId) {
    }
    
    @java.lang.Override
    public int getIdentifier() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getTitle(@org.jetbrains.annotations.Nullable
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.String getValue(@org.jetbrains.annotations.Nullable
    android.content.Context context, @org.jetbrains.annotations.NotNull
    byte[] data) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/settings/statistics/definitions/SpatialAudioStatistics$Companion;", "", "()V", "fromIdentifier", "Lcom/qualcomm/qti/gaiaclient/ui/settings/statistics/definitions/SpatialAudioStatistics;", "identifier", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.qualcomm.qti.gaiaclient.ui.settings.statistics.definitions.SpatialAudioStatistics fromIdentifier(int identifier) {
            return null;
        }
    }
}