package com.qualcomm.qti.gaiaclient.repository.statistics;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0011\u001a\u00020\tH&J\u0010\u0010\u0012\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH&J\u0016\u0010\u0012\u001a\u00020\t2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0004H&J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&J\"\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00170\u00032\u0006\u0010\f\u001a\u00020\rH&J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u0014H&J\u0010\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001fH&J\b\u0010 \u001a\u00020!H&J\u0010\u0010 \u001a\u00020!2\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\"\u001a\u00020!2\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010#\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010$\u001a\u00020\t2\u0006\u0010%\u001a\u00020!H&J\u0018\u0010&\u001a\u00020!2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\'\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH&J\u000e\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u0004H&J\b\u0010*\u001a\u00020\tH&J\u0012\u0010+\u001a\u0004\u0018\u00010)2\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010,\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH&R\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006-"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/repository/statistics/StatisticsRepository;", "", "categoriesLiveData", "Landroidx/lifecycle/LiveData;", "", "Lcom/qualcomm/qti/gaiaclient/repository/statistics/StatisticsCategoriesCategoryInfo;", "getCategoriesLiveData", "()Landroidx/lifecycle/LiveData;", "adjustRefreshRate", "", "refreshRateMS", "", "category", "Lcom/qualcomm/qti/gaiaclient/core/gaia/qtil/data/CategoryID;", "eraseAllExpired", "context", "Landroid/content/Context;", "fetchCategories", "fetchStatistics", "descriptors", "Lcom/qualcomm/qti/gaiaclient/core/gaia/qtil/data/StatisticDescriptor;", "getCategoriesInfo", "getCategoryLiveData", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/qualcomm/qti/gaiaclient/core/gaia/qtil/data/StatisticID;", "", "getStatisticValue", "Lcom/qualcomm/qti/gaiaclient/core/gaia/qtil/data/StatisticValue;", "descriptor", "init", "featuresRepository", "Lcom/qualcomm/qti/gaiaclient/repository/features/FeaturesRepository;", "isRecording", "", "isRefreshing", "refreshRate", "reset", "hardReset", "startRecording", "startRefreshing", "stopAllRecording", "Ljava/io/File;", "stopAllRefreshing", "stopRecording", "stopRefreshing", "app_debug"})
public abstract interface StatisticsRepository {
    
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<java.util.List<com.qualcomm.qti.gaiaclient.repository.statistics.StatisticsCategoriesCategoryInfo>> getCategoriesLiveData();
    
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<java.util.concurrent.ConcurrentHashMap<com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.StatisticID, byte[]>> getCategoryLiveData(@org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.CategoryID category);
    
    public abstract void init(@org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.repository.features.FeaturesRepository featuresRepository);
    
    public abstract void reset(boolean hardReset);
    
    public abstract void fetchCategories();
    
    public abstract void fetchStatistics(@org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.CategoryID category);
    
    public abstract void fetchStatistics(@org.jetbrains.annotations.NotNull
    java.util.List<com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.StatisticDescriptor> descriptors);
    
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<com.qualcomm.qti.gaiaclient.repository.statistics.StatisticsCategoriesCategoryInfo> getCategoriesInfo();
    
    @org.jetbrains.annotations.Nullable
    public abstract com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.StatisticValue getStatisticValue(@org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.StatisticDescriptor descriptor);
    
    public abstract boolean isRecording();
    
    public abstract boolean isRecording(@org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.CategoryID category);
    
    public abstract boolean startRecording(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.CategoryID category);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.io.File stopRecording(@org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.CategoryID category);
    
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<java.io.File> stopAllRecording();
    
    public abstract void eraseAllExpired(@org.jetbrains.annotations.NotNull
    android.content.Context context);
    
    public abstract void startRefreshing(@org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.CategoryID category);
    
    public abstract void stopRefreshing(@org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.CategoryID category);
    
    public abstract void stopAllRefreshing();
    
    public abstract boolean isRefreshing(@org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.CategoryID category);
    
    public abstract long refreshRate(@org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.CategoryID category);
    
    public abstract void adjustRefreshRate(long refreshRateMS, @org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.CategoryID category);
}