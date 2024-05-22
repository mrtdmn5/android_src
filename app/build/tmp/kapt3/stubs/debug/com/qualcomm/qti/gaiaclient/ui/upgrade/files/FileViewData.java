package com.qualcomm.qti.gaiaclient.ui.upgrade.files;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0012\u0010\u001c\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u0016J\u0012\u0010\u001d\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u0016J\u000e\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\f\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u001f"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/upgrade/files/FileViewData;", "Lcom/qualcomm/qti/gaiaclient/ui/common/ListAdapterItemData;", "file", "Lcom/qualcomm/qti/gaiaclient/repository/service/getfiles/FileData;", "(Lcom/qualcomm/qti/gaiaclient/repository/service/getfiles/FileData;)V", "createdOn", "", "getCreatedOn", "()Ljava/lang/String;", "getFile", "()Lcom/qualcomm/qti/gaiaclient/repository/service/getfiles/FileData;", "tags", "", "getTags", "()[Ljava/lang/String;", "[Ljava/lang/String;", "tagsAdapter", "Lcom/qualcomm/qti/gaiaclient/ui/upgrade/tags/TagsAdapter;", "getTagsAdapter", "()Lcom/qualcomm/qti/gaiaclient/ui/upgrade/tags/TagsAdapter;", "description", "defaultValue", "equals", "", "other", "", "hashCode", "", "isSameContent", "isSameItem", "title", "app_debug"})
public final class FileViewData implements com.qualcomm.qti.gaiaclient.ui.common.ListAdapterItemData {
    @org.jetbrains.annotations.NotNull
    private final com.qualcomm.qti.gaiaclient.repository.service.getfiles.FileData file = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String createdOn = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String[] tags = null;
    @org.jetbrains.annotations.NotNull
    private final com.qualcomm.qti.gaiaclient.ui.upgrade.tags.TagsAdapter tagsAdapter = null;
    
    public FileViewData(@org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.repository.service.getfiles.FileData file) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.qualcomm.qti.gaiaclient.repository.service.getfiles.FileData getFile() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCreatedOn() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String[] getTags() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.qualcomm.qti.gaiaclient.ui.upgrade.tags.TagsAdapter getTagsAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String title(@org.jetbrains.annotations.NotNull
    java.lang.String defaultValue) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String description(@org.jetbrains.annotations.NotNull
    java.lang.String defaultValue) {
        return null;
    }
    
    @java.lang.Override
    public boolean isSameContent(@org.jetbrains.annotations.Nullable
    com.qualcomm.qti.gaiaclient.ui.common.ListAdapterItemData other) {
        return false;
    }
    
    @java.lang.Override
    public boolean isSameItem(@org.jetbrains.annotations.Nullable
    com.qualcomm.qti.gaiaclient.ui.common.ListAdapterItemData other) {
        return false;
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
}