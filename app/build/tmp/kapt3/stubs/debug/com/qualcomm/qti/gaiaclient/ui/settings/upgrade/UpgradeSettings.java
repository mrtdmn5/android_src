package com.qualcomm.qti.gaiaclient.ui.settings.upgrade;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\u0001\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0017B\u001f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\bR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\tR\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\tR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016\u00a8\u0006\u0018"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/settings/upgrade/UpgradeSettings;", "", "Lcom/qualcomm/qti/gaiaclient/ui/settings/common/PersistentSettings;", "resourceId", "", "isPersistent", "", "isTransfer", "(Ljava/lang/String;IIZZ)V", "()Z", "getResourceId", "()I", "APPLICATION_VERSION", "APPLICATION_BUILD_ID", "SELECT_FILE", "CHECK_FOR_UPDATES", "DEVELOPER_OPTIONS", "GAIA_AND_PROTOCOL_VERSIONS", "CHUNK_SIZE", "PERSISTENT_USE_DEFAULT", "PERSISTENT_IS_UPLOAD_FLUSHED", "PERSISTENT_IS_UPLOAD_ACKNOWLEDGED", "PERSISTENT_IS_LOGGED", "Companion", "app_debug"})
public enum UpgradeSettings implements com.qualcomm.qti.gaiaclient.ui.settings.common.PersistentSettings {
    /*public static final*/ APPLICATION_VERSION /* = new APPLICATION_VERSION(0, false, false) */,
    /*public static final*/ APPLICATION_BUILD_ID /* = new APPLICATION_BUILD_ID(0, false, false) */,
    /*public static final*/ SELECT_FILE /* = new SELECT_FILE(0, false, false) */,
    /*public static final*/ CHECK_FOR_UPDATES /* = new CHECK_FOR_UPDATES(0, false, false) */,
    /*public static final*/ DEVELOPER_OPTIONS /* = new DEVELOPER_OPTIONS(0, false, false) */,
    /*public static final*/ GAIA_AND_PROTOCOL_VERSIONS /* = new GAIA_AND_PROTOCOL_VERSIONS(0, false, false) */,
    /*public static final*/ CHUNK_SIZE /* = new CHUNK_SIZE(0, false, false) */,
    /*public static final*/ PERSISTENT_USE_DEFAULT /* = new PERSISTENT_USE_DEFAULT(0, false, false) */,
    /*public static final*/ PERSISTENT_IS_UPLOAD_FLUSHED /* = new PERSISTENT_IS_UPLOAD_FLUSHED(0, false, false) */,
    /*public static final*/ PERSISTENT_IS_UPLOAD_ACKNOWLEDGED /* = new PERSISTENT_IS_UPLOAD_ACKNOWLEDGED(0, false, false) */,
    /*public static final*/ PERSISTENT_IS_LOGGED /* = new PERSISTENT_IS_LOGGED(0, false, false) */;
    private final int resourceId = 0;
    private final boolean isPersistent = false;
    private final boolean isTransfer = false;
    @org.jetbrains.annotations.NotNull
    public static final com.qualcomm.qti.gaiaclient.ui.settings.upgrade.UpgradeSettings.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    @kotlin.jvm.JvmField
    public static final com.qualcomm.qti.gaiaclient.ui.settings.upgrade.UpgradeSettings[] PERSISTENT = null;
    @org.jetbrains.annotations.NotNull
    @kotlin.jvm.JvmField
    public static final com.qualcomm.qti.gaiaclient.ui.settings.upgrade.UpgradeSettings[] NON_PERSISTENT = null;
    @org.jetbrains.annotations.NotNull
    @kotlin.jvm.JvmField
    public static final com.qualcomm.qti.gaiaclient.ui.settings.upgrade.UpgradeSettings[] TRANSFER_SETTINGS = null;
    
    UpgradeSettings(int resourceId, boolean isPersistent, boolean isTransfer) {
    }
    
    @java.lang.Override
    public int getResourceId() {
        return 0;
    }
    
    @java.lang.Override
    public boolean isPersistent() {
        return false;
    }
    
    public final boolean isTransfer() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getId(@org.jetbrains.annotations.Nullable
    android.content.Context context) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0006R\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/settings/upgrade/UpgradeSettings$Companion;", "", "()V", "NON_PERSISTENT", "", "Lcom/qualcomm/qti/gaiaclient/ui/settings/upgrade/UpgradeSettings;", "[Lcom/qualcomm/qti/gaiaclient/ui/settings/upgrade/UpgradeSettings;", "PERSISTENT", "TRANSFER_SETTINGS", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}