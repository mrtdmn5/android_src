package com.qualcomm.qti.gaiaclient.ui.settings.statistics.category;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001.B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u001a\u001a\u00020\u000fJ\b\u0010\u001b\u001a\u00020\u001cH\u0014J&\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\r2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"\u0018\u00010 H\u0002J\u0006\u0010#\u001a\u00020\u001cJ\u0006\u0010$\u001a\u00020%J\u0006\u0010&\u001a\u00020\u001cJ\u000e\u0010\'\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020\rJ\u000e\u0010)\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020%J\u0006\u0010+\u001a\u00020\u001cJ\b\u0010,\u001a\u0004\u0018\u00010-R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00060\u0013R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017\u00a8\u0006/"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/settings/statistics/category/StatisticsStatisticsViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "statisticsRepository", "Lcom/qualcomm/qti/gaiaclient/repository/statistics/StatisticsRepository;", "(Landroid/app/Application;Lcom/qualcomm/qti/gaiaclient/repository/statistics/StatisticsRepository;)V", "_title", "Lcom/qualcomm/qti/gaiaclient/ui/common/StickyLiveData;", "", "_viewData", "Lcom/qualcomm/qti/gaiaclient/ui/settings/statistics/category/StatisticsStatisticsViewData;", "categoryID", "Lcom/qualcomm/qti/gaiaclient/core/gaia/qtil/data/CategoryID;", "<set-?>", "", "isFetched", "()Z", "observers", "Lcom/qualcomm/qti/gaiaclient/ui/settings/statistics/category/StatisticsStatisticsViewModel$DataObservers;", "title", "Landroidx/lifecycle/LiveData;", "getTitle", "()Landroidx/lifecycle/LiveData;", "viewData", "getViewData", "isRecording", "onCleared", "", "onStatistics", "category", "statistics", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/qualcomm/qti/gaiaclient/core/gaia/qtil/data/StatisticID;", "", "pause", "refreshRateMsecs", "", "resume", "setCategoryID", "update", "setRefreshRate", "mSecs", "startRecording", "stopRecording", "Ljava/io/File;", "DataObservers", "app_debug"})
public final class StatisticsStatisticsViewModel extends androidx.lifecycle.AndroidViewModel {
    private final com.qualcomm.qti.gaiaclient.repository.statistics.StatisticsRepository statisticsRepository = null;
    private com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.CategoryID categoryID;
    private final com.qualcomm.qti.gaiaclient.ui.common.StickyLiveData<com.qualcomm.qti.gaiaclient.ui.settings.statistics.category.StatisticsStatisticsViewData> _viewData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.qualcomm.qti.gaiaclient.ui.settings.statistics.category.StatisticsStatisticsViewData> viewData = null;
    private final com.qualcomm.qti.gaiaclient.ui.common.StickyLiveData<java.lang.String> _title = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.lang.String> title = null;
    private boolean isFetched = false;
    private final com.qualcomm.qti.gaiaclient.ui.settings.statistics.category.StatisticsStatisticsViewModel.DataObservers observers = null;
    
    @javax.inject.Inject
    public StatisticsStatisticsViewModel(@org.jetbrains.annotations.NotNull
    android.app.Application application, @org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.repository.statistics.StatisticsRepository statisticsRepository) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.qualcomm.qti.gaiaclient.ui.settings.statistics.category.StatisticsStatisticsViewData> getViewData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.String> getTitle() {
        return null;
    }
    
    public final boolean isFetched() {
        return false;
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
    
    public final void setCategoryID(@org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.CategoryID update) {
    }
    
    public final void resume() {
    }
    
    public final void pause() {
    }
    
    public final long refreshRateMsecs() {
        return 0L;
    }
    
    public final void setRefreshRate(long mSecs) {
    }
    
    public final boolean isRecording() {
        return false;
    }
    
    public final void startRecording() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.io.File stopRecording() {
        return null;
    }
    
    private final void onStatistics(com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.CategoryID category, java.util.concurrent.ConcurrentHashMap<com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.StatisticID, byte[]> statistics) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005J\b\u0010\r\u001a\u00020\u000bH\u0014J\b\u0010\u000e\u001a\u00020\u000bH\u0014R,\u0010\u0003\u001a \u0012\u0004\u0012\u00020\u0005\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/settings/statistics/category/StatisticsStatisticsViewModel$DataObservers;", "Lcom/qualcomm/qti/gaiaclient/ui/common/Observers;", "(Lcom/qualcomm/qti/gaiaclient/ui/settings/statistics/category/StatisticsStatisticsViewModel;)V", "categoriesObservers", "", "Lcom/qualcomm/qti/gaiaclient/core/gaia/qtil/data/CategoryID;", "Landroidx/lifecycle/Observer;", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/qualcomm/qti/gaiaclient/core/gaia/qtil/data/StatisticID;", "", "registerCategoryObserver", "", "category", "registerObservers", "unregisterObservers", "app_debug"})
    final class DataObservers extends com.qualcomm.qti.gaiaclient.ui.common.Observers {
        private final java.util.Map<com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.CategoryID, androidx.lifecycle.Observer<java.util.concurrent.ConcurrentHashMap<com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.StatisticID, byte[]>>> categoriesObservers = null;
        
        public DataObservers() {
            super();
        }
        
        @java.lang.Override
        protected void registerObservers() {
        }
        
        public final void registerCategoryObserver(@org.jetbrains.annotations.NotNull
        com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.CategoryID category) {
        }
        
        @java.lang.Override
        protected void unregisterObservers() {
        }
    }
}