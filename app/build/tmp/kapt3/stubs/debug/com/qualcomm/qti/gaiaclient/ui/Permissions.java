package com.qualcomm.qti.gaiaclient.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0019B\u001f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0012R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fj\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018\u00a8\u0006\u001a"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/Permissions;", "", "id", "", "type", "Lcom/qualcomm/qti/gaiaclient/ui/PermissionType;", "supported", "", "(Ljava/lang/String;ILjava/lang/String;Lcom/qualcomm/qti/gaiaclient/ui/PermissionType;Z)V", "getId", "()Ljava/lang/String;", "isRuntime", "()Z", "getSupported", "getType", "()Lcom/qualcomm/qti/gaiaclient/ui/PermissionType;", "isGranted", "context", "Landroid/content/Context;", "ACCESS_COARSE_LOCATION", "ACCESS_FINE_LOCATION", "BLUETOOTH", "BLUETOOTH_ADMIN", "BLUETOOTH_SCAN", "BLUETOOTH_CONNECT", "Categories", "app_debug"})
public enum Permissions {
    /*public static final*/ ACCESS_COARSE_LOCATION /* = new ACCESS_COARSE_LOCATION(null, null, false) */,
    /*public static final*/ ACCESS_FINE_LOCATION /* = new ACCESS_FINE_LOCATION(null, null, false) */,
    /*public static final*/ BLUETOOTH /* = new BLUETOOTH(null, null, false) */,
    /*public static final*/ BLUETOOTH_ADMIN /* = new BLUETOOTH_ADMIN(null, null, false) */,
    /*public static final*/ BLUETOOTH_SCAN /* = new BLUETOOTH_SCAN(null, null, false) */,
    /*public static final*/ BLUETOOTH_CONNECT /* = new BLUETOOTH_CONNECT(null, null, false) */;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String id = null;
    @org.jetbrains.annotations.NotNull
    private final com.qualcomm.qti.gaiaclient.ui.PermissionType type = null;
    private final boolean supported = false;
    private final boolean isRuntime = false;
    
    Permissions(java.lang.String id, com.qualcomm.qti.gaiaclient.ui.PermissionType type, boolean supported) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.qualcomm.qti.gaiaclient.ui.PermissionType getType() {
        return null;
    }
    
    public final boolean getSupported() {
        return false;
    }
    
    public final boolean isRuntime() {
        return false;
    }
    
    public final boolean isGranted(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0001\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001 B-\b\u0002\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\tJ\u000e\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\rJ\u000e\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001dR\u0013\u0010\b\u001a\u00020\u00068\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0003\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0013R\u0019\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0007\u001a\u00020\u00068\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000bj\u0002\b\u001ej\u0002\b\u001f\u00a8\u0006!"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/Permissions$Categories;", "", "permissions", "", "Lcom/qualcomm/qti/gaiaclient/ui/Permissions;", "requestCode", "", "rationaleMessage", "errorMessage", "(Ljava/lang/String;I[Lcom/qualcomm/qti/gaiaclient/ui/Permissions;III)V", "getErrorMessage", "()I", "ids", "", "getIds", "()[Ljava/lang/String;", "[Ljava/lang/String;", "isRuntime", "", "()Z", "getPermissions", "()[Lcom/qualcomm/qti/gaiaclient/ui/Permissions;", "[Lcom/qualcomm/qti/gaiaclient/ui/Permissions;", "getRationaleMessage", "getRequestCode", "contains", "id", "isGranted", "context", "Landroid/content/Context;", "BLUETOOTH_DISCOVERY", "BLUETOOTH", "Companion", "app_debug"})
    public static enum Categories {
        /*public static final*/ BLUETOOTH_DISCOVERY /* = new BLUETOOTH_DISCOVERY(null, 0, 0, 0) */,
        /*public static final*/ BLUETOOTH /* = new BLUETOOTH(null, 0, 0, 0) */;
        @org.jetbrains.annotations.NotNull
        private final com.qualcomm.qti.gaiaclient.ui.Permissions[] permissions = null;
        private final int requestCode = 0;
        private final int rationaleMessage = 0;
        private final int errorMessage = 0;
        private final boolean isRuntime = false;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String[] ids = null;
        @org.jetbrains.annotations.NotNull
        public static final com.qualcomm.qti.gaiaclient.ui.Permissions.Categories.Companion Companion = null;
        
        Categories(com.qualcomm.qti.gaiaclient.ui.Permissions[] permissions, int requestCode, int rationaleMessage, int errorMessage) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.qualcomm.qti.gaiaclient.ui.Permissions[] getPermissions() {
            return null;
        }
        
        public final int getRequestCode() {
            return 0;
        }
        
        @androidx.annotation.StringRes
        public final int getRationaleMessage() {
            return 0;
        }
        
        @androidx.annotation.StringRes
        public final int getErrorMessage() {
            return 0;
        }
        
        public final boolean isRuntime() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String[] getIds() {
            return null;
        }
        
        public final boolean isGranted(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            return false;
        }
        
        public final boolean contains(@org.jetbrains.annotations.NotNull
        java.lang.String id) {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable
        @kotlin.jvm.JvmStatic
        public static final com.qualcomm.qti.gaiaclient.ui.Permissions.Categories valueFrom(int requestCode) {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/Permissions$Categories$Companion;", "", "()V", "valueFrom", "Lcom/qualcomm/qti/gaiaclient/ui/Permissions$Categories;", "requestCode", "", "app_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.Nullable
            @kotlin.jvm.JvmStatic
            public final com.qualcomm.qti.gaiaclient.ui.Permissions.Categories valueFrom(int requestCode) {
                return null;
            }
        }
    }
}