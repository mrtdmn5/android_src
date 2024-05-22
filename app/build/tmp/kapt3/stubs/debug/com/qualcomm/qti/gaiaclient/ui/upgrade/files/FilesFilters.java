package com.qualcomm.qti.gaiaclient.ui.upgrade.files;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 (2\u00020\u0001:\u0001(B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B9\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u000bJ\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006J\t\u0010\u0017\u001a\u00020\u0006H\u00c6\u0003J\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0010J\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0010J\t\u0010\u001a\u001a\u00020\u0006H\u00c6\u0003JB\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\b\b\u0002\u0010\n\u001a\u00020\u0006H\u00c6\u0001\u00a2\u0006\u0002\u0010\u001cJ\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0096\u0002J\b\u0010#\u001a\u00020\u001eH\u0016J\b\u0010$\u001a\u00020\u0006H\u0016J\u0018\u0010%\u001a\u00020&2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\'\u001a\u00020\u001eH\u0016R\u0011\u0010\n\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0019\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u00a2\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u00a2\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010\u00a8\u0006)"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/upgrade/files/FilesFilters;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "hardwareVersion", "", "withTags", "", "withoutTags", "createdAfter", "(Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)V", "getCreatedAfter", "()Ljava/lang/String;", "getHardwareVersion", "getWithTags", "()[Ljava/lang/String;", "[Ljava/lang/String;", "getWithoutTags", "buildGetFilesParameters", "Lcom/qualcomm/qti/gaiaclient/repository/service/getfiles/GetFilesParameters;", "applicationBuildId", "applicationVersion", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Lcom/qualcomm/qti/gaiaclient/ui/upgrade/files/FilesFilters;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "flags", "CREATOR", "app_debug"})
public final class FilesFilters implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String hardwareVersion = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String[] withTags = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String[] withoutTags = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String createdAfter = null;
    @org.jetbrains.annotations.NotNull
    public static final com.qualcomm.qti.gaiaclient.ui.upgrade.files.FilesFilters.CREATOR CREATOR = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.qualcomm.qti.gaiaclient.ui.upgrade.files.FilesFilters copy(@org.jetbrains.annotations.NotNull
    java.lang.String hardwareVersion, @org.jetbrains.annotations.NotNull
    java.lang.String[] withTags, @org.jetbrains.annotations.NotNull
    java.lang.String[] withoutTags, @org.jetbrains.annotations.NotNull
    java.lang.String createdAfter) {
        return null;
    }
    
    public FilesFilters() {
        super();
    }
    
    public FilesFilters(@org.jetbrains.annotations.NotNull
    java.lang.String hardwareVersion, @org.jetbrains.annotations.NotNull
    java.lang.String[] withTags, @org.jetbrains.annotations.NotNull
    java.lang.String[] withoutTags, @org.jetbrains.annotations.NotNull
    java.lang.String createdAfter) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getHardwareVersion() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String[] component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String[] getWithTags() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String[] component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String[] getWithoutTags() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCreatedAfter() {
        return null;
    }
    
    public FilesFilters(@org.jetbrains.annotations.NotNull
    android.os.Parcel parcel) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.qualcomm.qti.gaiaclient.repository.service.getfiles.GetFilesParameters buildGetFilesParameters(@org.jetbrains.annotations.NotNull
    java.lang.String applicationBuildId, @org.jetbrains.annotations.NotNull
    java.lang.String applicationVersion) {
        return null;
    }
    
    @java.lang.Override
    public void writeToParcel(@org.jetbrains.annotations.NotNull
    android.os.Parcel parcel, int flags) {
    }
    
    @java.lang.Override
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/upgrade/files/FilesFilters$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/qualcomm/qti/gaiaclient/ui/upgrade/files/FilesFilters;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/qualcomm/qti/gaiaclient/ui/upgrade/files/FilesFilters;", "app_debug"})
    public static final class CREATOR implements android.os.Parcelable.Creator<com.qualcomm.qti.gaiaclient.ui.upgrade.files.FilesFilters> {
        
        private CREATOR() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public com.qualcomm.qti.gaiaclient.ui.upgrade.files.FilesFilters createFromParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel parcel) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public com.qualcomm.qti.gaiaclient.ui.upgrade.files.FilesFilters[] newArray(int size) {
            return null;
        }
    }
}