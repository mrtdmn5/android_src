package com.qualcomm.qti.gaiaclient.ui.settings.statistics.categories;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001dB\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0014\u001a\u00020\u0015J\u0018\u0010\u0016\u001a\u00020\u00152\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018H\u0002J\b\u0010\u001a\u001a\u00020\u0015H\u0014J\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0018R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00060\u000fR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u001e"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/settings/statistics/categories/StatisticsCategoriesViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "statisticsRepository", "Lcom/qualcomm/qti/gaiaclient/repository/statistics/StatisticsRepository;", "(Landroid/app/Application;Lcom/qualcomm/qti/gaiaclient/repository/statistics/StatisticsRepository;)V", "_viewData", "Lcom/qualcomm/qti/gaiaclient/ui/common/StickyLiveData;", "Lcom/qualcomm/qti/gaiaclient/ui/settings/statistics/categories/StatisticsCategoriesViewData;", "<set-?>", "", "isFetched", "()Z", "observers", "Lcom/qualcomm/qti/gaiaclient/ui/settings/statistics/categories/StatisticsCategoriesViewModel$DataObservers;", "viewData", "Landroidx/lifecycle/LiveData;", "getViewData", "()Landroidx/lifecycle/LiveData;", "fetchData", "", "onCategories", "categoryInfo", "", "Lcom/qualcomm/qti/gaiaclient/repository/statistics/StatisticsCategoriesCategoryInfo;", "onCleared", "stopAllRecording", "Ljava/io/File;", "DataObservers", "app_debug"})
public final class StatisticsCategoriesViewModel extends androidx.lifecycle.AndroidViewModel {
    private final com.qualcomm.qti.gaiaclient.repository.statistics.StatisticsRepository statisticsRepository = null;
    private final com.qualcomm.qti.gaiaclient.ui.common.StickyLiveData<com.qualcomm.qti.gaiaclient.ui.settings.statistics.categories.StatisticsCategoriesViewData> _viewData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.qualcomm.qti.gaiaclient.ui.settings.statistics.categories.StatisticsCategoriesViewData> viewData = null;
    private boolean isFetched = false;
    private final com.qualcomm.qti.gaiaclient.ui.settings.statistics.categories.StatisticsCategoriesViewModel.DataObservers observers = null;
    
    @javax.inject.Inject
    public StatisticsCategoriesViewModel(@org.jetbrains.annotations.NotNull
    android.app.Application application, @org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.repository.statistics.StatisticsRepository statisticsRepository) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.qualcomm.qti.gaiaclient.ui.settings.statistics.categories.StatisticsCategoriesViewData> getViewData() {
        return null;
    }
    
    public final boolean isFetched() {
        return false;
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
    
    public final void fetchData() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.io.File> stopAllRecording() {
        return null;
    }
    
    private final void onCategories(java.util.List<com.qualcomm.qti.gaiaclient.repository.statistics.StatisticsCategoriesCategoryInfo> categoryInfo) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\nH\u0014J\b\u0010\f\u001a\u00020\nH\u0014R1\u0010\u0003\u001a%\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/settings/statistics/categories/StatisticsCategoriesViewModel$DataObservers;", "Lcom/qualcomm/qti/gaiaclient/ui/common/Observers;", "(Lcom/qualcomm/qti/gaiaclient/ui/settings/statistics/categories/StatisticsCategoriesViewModel;)V", "categoriesObserver", "Lkotlin/reflect/KFunction1;", "", "Lcom/qualcomm/qti/gaiaclient/repository/statistics/StatisticsCategoriesCategoryInfo;", "Lkotlin/ParameterName;", "name", "categoryInfo", "", "registerObservers", "unregisterObservers", "app_debug"})
    final class DataObservers extends com.qualcomm.qti.gaiaclient.ui.common.Observers {
        private final kotlin.reflect.KFunction<kotlin.Unit> categoriesObserver = null;
        
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