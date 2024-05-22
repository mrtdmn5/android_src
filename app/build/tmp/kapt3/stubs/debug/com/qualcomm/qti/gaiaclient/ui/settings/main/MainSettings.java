package com.qualcomm.qti.gaiaclient.ui.settings.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0017\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a\u00a8\u0006\u001b"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/settings/main/MainSettings;", "", "Lcom/qualcomm/qti/gaiaclient/ui/settings/common/Settings;", "resourceId", "", "requireConnected", "", "(Ljava/lang/String;IIZ)V", "getRequireConnected", "()Z", "getResourceId", "()I", "ANC", "AUDIO_CURATION", "VOICE_UI", "UPGRADE", "MUSIC_PROCESSING", "LOGS", "EARBUD_FIT", "HANDSET_SERVICE", "VOICE_PROCESSING", "GESTURES", "STATISTICS", "CHANGE_DEVICE", "GAIA_CLIENT_VERSION", "DEVICE_FEATURES", "FEEDBACK", "app_debug"})
public enum MainSettings implements com.qualcomm.qti.gaiaclient.ui.settings.common.Settings {
    /*public static final*/ ANC /* = new ANC(0, false) */,
    /*public static final*/ AUDIO_CURATION /* = new AUDIO_CURATION(0, false) */,
    /*public static final*/ VOICE_UI /* = new VOICE_UI(0, false) */,
    /*public static final*/ UPGRADE /* = new UPGRADE(0, false) */,
    /*public static final*/ MUSIC_PROCESSING /* = new MUSIC_PROCESSING(0, false) */,
    /*public static final*/ LOGS /* = new LOGS(0, false) */,
    /*public static final*/ EARBUD_FIT /* = new EARBUD_FIT(0, false) */,
    /*public static final*/ HANDSET_SERVICE /* = new HANDSET_SERVICE(0, false) */,
    /*public static final*/ VOICE_PROCESSING /* = new VOICE_PROCESSING(0, false) */,
    /*public static final*/ GESTURES /* = new GESTURES(0, false) */,
    /*public static final*/ STATISTICS /* = new STATISTICS(0, false) */,
    /*public static final*/ CHANGE_DEVICE /* = new CHANGE_DEVICE(0, false) */,
    /*public static final*/ GAIA_CLIENT_VERSION /* = new GAIA_CLIENT_VERSION(0, false) */,
    /*public static final*/ DEVICE_FEATURES /* = new DEVICE_FEATURES(0, false) */,
    /*public static final*/ FEEDBACK /* = new FEEDBACK(0, false) */;
    private final int resourceId = 0;
    private final boolean requireConnected = false;
    
    MainSettings(int resourceId, boolean requireConnected) {
    }
    
    @java.lang.Override
    public int getResourceId() {
        return 0;
    }
    
    public final boolean getRequireConnected() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public java.lang.String getId(@org.jetbrains.annotations.Nullable
    android.content.Context context) {
        return null;
    }
}