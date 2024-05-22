package com.qualcomm.qti.gaiaclient.ui.settings.statistics.categories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bB\u000f\b\u0016\u0012\u0006\u0010\t\u001a\u00020\u0000\u00a2\u0006\u0002\u0010\nJ\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0001H\u0016J\u0010\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0001H\u0016R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\rR\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0019"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/settings/statistics/categories/CategoryViewData;", "Lcom/qualcomm/qti/gaiaclient/ui/common/ListAdapterItemData;", "title", "", "isRecording", "", "categoryInfo", "Lcom/qualcomm/qti/gaiaclient/ui/settings/statistics/definitions/StatisticsCategories;", "(Ljava/lang/String;ZLcom/qualcomm/qti/gaiaclient/ui/settings/statistics/definitions/StatisticsCategories;)V", "data", "(Lcom/qualcomm/qti/gaiaclient/ui/settings/statistics/categories/CategoryViewData;)V", "getCategoryInfo", "()Lcom/qualcomm/qti/gaiaclient/ui/settings/statistics/definitions/StatisticsCategories;", "()Z", "label", "getLabel", "()Ljava/lang/String;", "equals", "other", "", "hashCode", "", "isSameContent", "itemData", "isSameItem", "app_debug"})
public final class CategoryViewData implements com.qualcomm.qti.gaiaclient.ui.common.ListAdapterItemData {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String label = null;
    private final boolean isRecording = false;
    @org.jetbrains.annotations.NotNull
    private final com.qualcomm.qti.gaiaclient.ui.settings.statistics.definitions.StatisticsCategories categoryInfo = null;
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLabel() {
        return null;
    }
    
    public final boolean isRecording() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.qualcomm.qti.gaiaclient.ui.settings.statistics.definitions.StatisticsCategories getCategoryInfo() {
        return null;
    }
    
    public CategoryViewData(@org.jetbrains.annotations.NotNull
    java.lang.String title, boolean isRecording, @org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.ui.settings.statistics.definitions.StatisticsCategories categoryInfo) {
        super();
    }
    
    public CategoryViewData(@org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.ui.settings.statistics.categories.CategoryViewData data) {
        super();
    }
    
    @java.lang.Override
    public boolean isSameContent(@org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.ui.common.ListAdapterItemData itemData) {
        return false;
    }
    
    @java.lang.Override
    public boolean isSameItem(@org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.ui.common.ListAdapterItemData itemData) {
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