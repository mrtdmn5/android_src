package com.qualcomm.qti.gaiaclient.repository.statistics;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001:\u0001AB\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u000bH\u0016J\u0010\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\"\u0010!\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\n0\u000f2\u0006\u0010\u001e\u001a\u00020\u000bH\u0016J\u0012\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020%H\u0016J\"\u0010&\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\n0\u00062\u0006\u0010\u001e\u001a\u00020\u000bH\u0002J\u0010\u0010\'\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010(\u001a\u00020)H\u0016J\u0010\u0010(\u001a\u00020)2\u0006\u0010\u001e\u001a\u00020\u000bH\u0016J\u0010\u0010*\u001a\u00020)2\u0006\u0010\u001e\u001a\u00020\u000bH\u0016J\u0018\u0010+\u001a\u00020)2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u000bH\u0002J\u001e\u0010,\u001a\u00020\u001b2\u0014\u0010-\u001a\u0010\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u000200\u0018\u00010.H\u0002J\u0010\u00101\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u000bH\u0016J\u0010\u00102\u001a\u00020\u001b2\u0006\u00103\u001a\u00020)H\u0016J\u0018\u00104\u001a\u00020)2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u000bH\u0016J\u0010\u00105\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u000bH\u0016J\u000e\u00106\u001a\b\u0012\u0004\u0012\u0002070\u0007H\u0016J\b\u00108\u001a\u00020\u001bH\u0016J\u0012\u00109\u001a\u0004\u0018\u0001072\u0006\u0010\u001e\u001a\u00020\u000bH\u0016J\u0010\u0010:\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u000bH\u0016J\u0016\u0010;\u001a\u00020\u001b2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007H\u0004J\b\u0010=\u001a\u00020\u001bH\u0002J\"\u0010>\u001a\u00020\u001b2\u0018\u0010?\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u00070@H\u0004R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R,\u0010\t\u001a \u0012\u0004\u0012\u00020\u000b\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\n0\u00060\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u000fX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0014\u001a\u00060\u0015R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006B"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/repository/statistics/StatisticsRepositoryData;", "Lcom/qualcomm/qti/gaiaclient/repository/statistics/StatisticsRepository;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "_categoriesLiveData", "Lcom/qualcomm/qti/gaiaclient/ui/common/StickyLiveData;", "", "Lcom/qualcomm/qti/gaiaclient/repository/statistics/StatisticsCategoriesCategoryInfo;", "_statisticsValuesLiveData", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/qualcomm/qti/gaiaclient/core/gaia/qtil/data/CategoryID;", "Lcom/qualcomm/qti/gaiaclient/core/gaia/qtil/data/StatisticID;", "", "categoriesLiveData", "Landroidx/lifecycle/LiveData;", "getCategoriesLiveData", "()Landroidx/lifecycle/LiveData;", "featuresRepository", "Lcom/qualcomm/qti/gaiaclient/repository/features/FeaturesRepository;", "observer", "Lcom/qualcomm/qti/gaiaclient/repository/statistics/StatisticsRepositoryData$DataObservers;", "recorder", "Lcom/qualcomm/qti/gaiaclient/repository/statistics/recording/StatisticsRecording;", "refresher", "Lcom/qualcomm/qti/gaiaclient/repository/statistics/refresh/StatisticsRefresh;", "adjustRefreshRate", "", "refreshRateMS", "", "category", "eraseAllExpired", "getCategoriesInfo", "getCategoryLiveData", "getStatisticValue", "Lcom/qualcomm/qti/gaiaclient/core/gaia/qtil/data/StatisticValue;", "descriptor", "Lcom/qualcomm/qti/gaiaclient/core/gaia/qtil/data/StatisticDescriptor;", "getStatsValuesLiveData", "init", "isRecording", "", "isRefreshing", "logRow", "onFeatures", "features", "Landroidx/collection/ArrayMap;", "Lcom/qualcomm/qti/gaiaclient/core/gaia/qtil/data/QTILFeature;", "", "refreshRate", "reset", "hardReset", "startRecording", "startRefreshing", "stopAllRecording", "Ljava/io/File;", "stopAllRefreshing", "stopRecording", "stopRefreshing", "updateCategories", "categories", "updateCategoriesWithRecording", "updateStatistics", "statistics", "", "DataObservers", "app_debug"})
public abstract class StatisticsRepositoryData implements com.qualcomm.qti.gaiaclient.repository.statistics.StatisticsRepository {
    private final android.content.Context context = null;
    private com.qualcomm.qti.gaiaclient.repository.statistics.recording.StatisticsRecording recorder;
    private com.qualcomm.qti.gaiaclient.repository.statistics.refresh.StatisticsRefresh refresher;
    private final com.qualcomm.qti.gaiaclient.ui.common.StickyLiveData<java.util.List<com.qualcomm.qti.gaiaclient.repository.statistics.StatisticsCategoriesCategoryInfo>> _categoriesLiveData = null;
    private final java.util.concurrent.ConcurrentHashMap<com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.CategoryID, com.qualcomm.qti.gaiaclient.ui.common.StickyLiveData<java.util.concurrent.ConcurrentHashMap<com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.StatisticID, byte[]>>> _statisticsValuesLiveData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<com.qualcomm.qti.gaiaclient.repository.statistics.StatisticsCategoriesCategoryInfo>> categoriesLiveData = null;
    private com.qualcomm.qti.gaiaclient.repository.features.FeaturesRepository featuresRepository;
    private final com.qualcomm.qti.gaiaclient.repository.statistics.StatisticsRepositoryData.DataObservers observer = null;
    
    public StatisticsRepositoryData(@org.jetbrains.annotations.Nullable
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public androidx.lifecycle.LiveData<java.util.List<com.qualcomm.qti.gaiaclient.repository.statistics.StatisticsCategoriesCategoryInfo>> getCategoriesLiveData() {
        return null;
    }
    
    @java.lang.Override
    public void init(@org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.repository.features.FeaturesRepository featuresRepository) {
    }
    
    private final void onFeatures(androidx.collection.ArrayMap<com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.QTILFeature, java.lang.Integer> features) {
    }
    
    @java.lang.Override
    public void reset(boolean hardReset) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public androidx.lifecycle.LiveData<java.util.concurrent.ConcurrentHashMap<com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.StatisticID, byte[]>> getCategoryLiveData(@org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.CategoryID category) {
        return null;
    }
    
    protected final void updateCategories(@org.jetbrains.annotations.NotNull
    java.util.List<com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.CategoryID> categories) {
    }
    
    private final void updateCategoriesWithRecording() {
    }
    
    protected final void updateStatistics(@org.jetbrains.annotations.NotNull
    java.util.Map<com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.CategoryID, ? extends java.util.List<com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.StatisticValue>> statistics) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.util.List<com.qualcomm.qti.gaiaclient.repository.statistics.StatisticsCategoriesCategoryInfo> getCategoriesInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.StatisticValue getStatisticValue(@org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.StatisticDescriptor descriptor) {
        return null;
    }
    
    private final com.qualcomm.qti.gaiaclient.ui.common.StickyLiveData<java.util.concurrent.ConcurrentHashMap<com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.StatisticID, byte[]>> getStatsValuesLiveData(com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.CategoryID category) {
        return null;
    }
    
    @java.lang.Override
    public boolean isRecording() {
        return false;
    }
    
    @java.lang.Override
    public boolean isRecording(@org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.CategoryID category) {
        return false;
    }
    
    @java.lang.Override
    public boolean startRecording(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.CategoryID category) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.io.File stopRecording(@org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.CategoryID category) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.util.List<java.io.File> stopAllRecording() {
        return null;
    }
    
    @java.lang.Override
    public void eraseAllExpired(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
    
    private final boolean logRow(android.content.Context context, com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.CategoryID category) {
        return false;
    }
    
    @java.lang.Override
    public void startRefreshing(@org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.CategoryID category) {
    }
    
    @java.lang.Override
    public void stopRefreshing(@org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.CategoryID category) {
    }
    
    @java.lang.Override
    public void stopAllRefreshing() {
    }
    
    @java.lang.Override
    public boolean isRefreshing(@org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.CategoryID category) {
        return false;
    }
    
    @java.lang.Override
    public long refreshRate(@org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.CategoryID category) {
        return 0L;
    }
    
    @java.lang.Override
    public void adjustRefreshRate(long refreshRateMS, @org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.CategoryID category) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\u000bH\u0014J\b\u0010\r\u001a\u00020\u000bH\u0014R7\u0010\u0003\u001a+\u0012!\u0012\u001f\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/repository/statistics/StatisticsRepositoryData$DataObservers;", "Lcom/qualcomm/qti/gaiaclient/ui/common/Observers;", "(Lcom/qualcomm/qti/gaiaclient/repository/statistics/StatisticsRepositoryData;)V", "featuresObserver", "Lkotlin/reflect/KFunction1;", "Landroidx/collection/ArrayMap;", "Lcom/qualcomm/qti/gaiaclient/core/gaia/qtil/data/QTILFeature;", "", "Lkotlin/ParameterName;", "name", "features", "", "registerObservers", "unregisterObservers", "app_debug"})
    final class DataObservers extends com.qualcomm.qti.gaiaclient.ui.common.Observers {
        private final kotlin.reflect.KFunction<kotlin.Unit> featuresObserver = null;
        
        public DataObservers() {
            super();
        }
        
        @java.lang.Override
        protected void registerObservers() {
        }
        
        @java.lang.Override
        protected void unregisterObservers() {
        }
    }
}