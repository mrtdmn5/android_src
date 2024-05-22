package com.qualcomm.qti.gaiaclient.ui.settings.download;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0012B\u0017\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011\u00a8\u0006\u0013"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/settings/download/DownloadSettings;", "", "Lcom/qualcomm/qti/gaiaclient/ui/settings/common/PersistentSettings;", "resourceId", "", "isPersistent", "", "(Ljava/lang/String;IIZ)V", "()Z", "getResourceId", "()I", "APPLICATION_VERSION", "APPLICATION_BUILD_ID", "HARDWARE_VERSION", "INCLUDE_TAGS", "EXCLUDE_TAGS", "CREATED_AFTER", "CONTINUE", "Companion", "app_debug"})
public enum DownloadSettings implements com.qualcomm.qti.gaiaclient.ui.settings.common.PersistentSettings {
    /*public static final*/ APPLICATION_VERSION /* = new APPLICATION_VERSION(0, false) */,
    /*public static final*/ APPLICATION_BUILD_ID /* = new APPLICATION_BUILD_ID(0, false) */,
    /*public static final*/ HARDWARE_VERSION /* = new HARDWARE_VERSION(0, false) */,
    /*public static final*/ INCLUDE_TAGS /* = new INCLUDE_TAGS(0, false) */,
    /*public static final*/ EXCLUDE_TAGS /* = new EXCLUDE_TAGS(0, false) */,
    /*public static final*/ CREATED_AFTER /* = new CREATED_AFTER(0, false) */,
    /*public static final*/ CONTINUE /* = new CONTINUE(0, false) */;
    private final int resourceId = 0;
    private final boolean isPersistent = false;
    @org.jetbrains.annotations.NotNull
    public static final com.qualcomm.qti.gaiaclient.ui.settings.download.DownloadSettings.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    private static final com.qualcomm.qti.gaiaclient.ui.settings.download.DownloadSettings[] PERSISTENT = null;
    @org.jetbrains.annotations.NotNull
    private static final com.qualcomm.qti.gaiaclient.ui.settings.download.DownloadSettings[] NON_PERSISTENT = null;
    
    DownloadSettings(int resourceId, boolean isPersistent) {
    }
    
    @java.lang.Override
    public int getResourceId() {
        return 0;
    }
    
    @java.lang.Override
    public boolean isPersistent() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final com.qualcomm.qti.gaiaclient.ui.settings.download.DownloadSettings[] getPERSISTENT() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final com.qualcomm.qti.gaiaclient.ui.settings.download.DownloadSettings[] getNON_PERSISTENT() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getId(@org.jetbrains.annotations.Nullable
    android.content.Context context) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R$\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010\t\u0012\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\bR$\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010\t\u0012\u0004\b\u000b\u0010\u0002\u001a\u0004\b\f\u0010\b\u00a8\u0006\r"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/settings/download/DownloadSettings$Companion;", "", "()V", "NON_PERSISTENT", "", "Lcom/qualcomm/qti/gaiaclient/ui/settings/download/DownloadSettings;", "getNON_PERSISTENT$annotations", "getNON_PERSISTENT", "()[Lcom/qualcomm/qti/gaiaclient/ui/settings/download/DownloadSettings;", "[Lcom/qualcomm/qti/gaiaclient/ui/settings/download/DownloadSettings;", "PERSISTENT", "getPERSISTENT$annotations", "getPERSISTENT", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.qualcomm.qti.gaiaclient.ui.settings.download.DownloadSettings[] getPERSISTENT() {
            return null;
        }
        
        @kotlin.jvm.JvmStatic
        @java.lang.Deprecated
        public static void getPERSISTENT$annotations() {
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.qualcomm.qti.gaiaclient.ui.settings.download.DownloadSettings[] getNON_PERSISTENT() {
            return null;
        }
        
        @kotlin.jvm.JvmStatic
        @java.lang.Deprecated
        public static void getNON_PERSISTENT$annotations() {
        }
    }
}