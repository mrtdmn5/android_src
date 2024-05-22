package com.qualcomm.qti.gaiaclient.repository.service.getfiles;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 -2\u00020\u0001:\u0001-B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004BW\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\f\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\f\u00a2\u0006\u0002\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0006H\u00c6\u0003J\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\fH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0014J\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\fH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0014J`\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\fH\u00c6\u0001\u00a2\u0006\u0002\u0010!J\b\u0010\"\u001a\u00020#H\u0016J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0096\u0002J\b\u0010(\u001a\u00020#H\u0016J\t\u0010)\u001a\u00020\u0006H\u00d6\u0001J\u0018\u0010*\u001a\u00020+2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010,\u001a\u00020#H\u0016R\u0011\u0010\n\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0019\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\f\u00a2\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0019\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\f\u00a2\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010\u00a8\u0006."}, d2 = {"Lcom/qualcomm/qti/gaiaclient/repository/service/getfiles/FileData;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "id", "", "title", "description", "createdOn", "chipFamily", "tags", "", "hardwareVersions", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)V", "getChipFamily", "()Ljava/lang/String;", "getCreatedOn", "getDescription", "getHardwareVersions", "()[Ljava/lang/String;", "[Ljava/lang/String;", "getId", "getTags", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Lcom/qualcomm/qti/gaiaclient/repository/service/getfiles/FileData;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "flags", "CREATOR", "app_debug"})
public final class FileData implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String id = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String title = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String description = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String createdOn = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String chipFamily = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String[] tags = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String[] hardwareVersions = null;
    @org.jetbrains.annotations.NotNull
    public static final com.qualcomm.qti.gaiaclient.repository.service.getfiles.FileData.CREATOR CREATOR = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.qualcomm.qti.gaiaclient.repository.service.getfiles.FileData copy(@org.jetbrains.annotations.NotNull
    java.lang.String id, @org.jetbrains.annotations.NotNull
    java.lang.String title, @org.jetbrains.annotations.NotNull
    java.lang.String description, @org.jetbrains.annotations.NotNull
    java.lang.String createdOn, @org.jetbrains.annotations.NotNull
    java.lang.String chipFamily, @org.jetbrains.annotations.NotNull
    java.lang.String[] tags, @org.jetbrains.annotations.NotNull
    java.lang.String[] hardwareVersions) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public FileData() {
        super();
    }
    
    public FileData(@org.jetbrains.annotations.NotNull
    java.lang.String id, @org.jetbrains.annotations.NotNull
    java.lang.String title, @org.jetbrains.annotations.NotNull
    java.lang.String description, @org.jetbrains.annotations.NotNull
    java.lang.String createdOn, @org.jetbrains.annotations.NotNull
    java.lang.String chipFamily, @org.jetbrains.annotations.NotNull
    java.lang.String[] tags, @org.jetbrains.annotations.NotNull
    java.lang.String[] hardwareVersions) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCreatedOn() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getChipFamily() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String[] component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String[] getTags() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String[] component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String[] getHardwareVersions() {
        return null;
    }
    
    public FileData(@org.jetbrains.annotations.NotNull
    android.os.Parcel parcel) {
        super();
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
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/repository/service/getfiles/FileData$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/qualcomm/qti/gaiaclient/repository/service/getfiles/FileData;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/qualcomm/qti/gaiaclient/repository/service/getfiles/FileData;", "app_debug"})
    public static final class CREATOR implements android.os.Parcelable.Creator<com.qualcomm.qti.gaiaclient.repository.service.getfiles.FileData> {
        
        private CREATOR() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public com.qualcomm.qti.gaiaclient.repository.service.getfiles.FileData createFromParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel parcel) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public com.qualcomm.qti.gaiaclient.repository.service.getfiles.FileData[] newArray(int size) {
            return null;
        }
    }
}