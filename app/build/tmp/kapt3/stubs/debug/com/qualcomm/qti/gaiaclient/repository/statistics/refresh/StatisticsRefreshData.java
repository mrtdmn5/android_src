package com.qualcomm.qti.gaiaclient.repository.statistics.refresh;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0001\u0018B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0007H\u0004J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u0007H\u0004J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u0007H&J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0010H\u0016J\u0018\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\tH\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R \u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/repository/statistics/refresh/StatisticsRefreshData;", "Lcom/qualcomm/qti/gaiaclient/repository/statistics/refresh/StatisticsRefresh;", "()V", "DEFAULT_RATE_IN_MS", "", "categoryInfo", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/qualcomm/qti/gaiaclient/core/gaia/qtil/data/CategoryID;", "Lcom/qualcomm/qti/gaiaclient/ui/common/StickyLiveData;", "Lcom/qualcomm/qti/gaiaclient/repository/statistics/refresh/StatisticsRefreshData$RefreshInfo;", "getEntry", "category", "isPaused", "", "isRefreshing", "pause", "", "pauseAllRefreshing", "resumePaused", "repository", "Lcom/qualcomm/qti/gaiaclient/repository/statistics/StatisticsRepository;", "stopAllRefreshing", "updateEntry", "entry", "RefreshInfo", "app_debug"})
public abstract class StatisticsRefreshData implements com.qualcomm.qti.gaiaclient.repository.statistics.refresh.StatisticsRefresh {
    private java.util.concurrent.ConcurrentHashMap<com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.CategoryID, com.qualcomm.qti.gaiaclient.ui.common.StickyLiveData<com.qualcomm.qti.gaiaclient.repository.statistics.refresh.StatisticsRefreshData.RefreshInfo>> categoryInfo;
    private final long DEFAULT_RATE_IN_MS = 5000L;
    
    public StatisticsRefreshData() {
        super();
    }
    
    @java.lang.Override
    public boolean isRefreshing(@org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.CategoryID category) {
        return false;
    }
    
    protected final boolean isPaused(@org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.CategoryID category) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    protected final com.qualcomm.qti.gaiaclient.repository.statistics.refresh.StatisticsRefreshData.RefreshInfo getEntry(@org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.CategoryID category) {
        return null;
    }
    
    protected final void updateEntry(@org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.CategoryID category, @org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.repository.statistics.refresh.StatisticsRefreshData.RefreshInfo entry) {
    }
    
    @java.lang.Override
    public void stopAllRefreshing() {
    }
    
    public abstract void pause(@org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.CategoryID category);
    
    @java.lang.Override
    public void pauseAllRefreshing() {
    }
    
    @java.lang.Override
    public void resumePaused(@org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.repository.statistics.StatisticsRepository repository) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r\u00a8\u0006\u000f"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/repository/statistics/refresh/StatisticsRefreshData$RefreshInfo;", "", "rate", "", "timerRef", "paused", "", "(JLjava/lang/Long;Z)V", "getPaused", "()Z", "getRate", "()J", "getTimerRef", "()Ljava/lang/Long;", "Ljava/lang/Long;", "app_debug"})
    public static final class RefreshInfo {
        private final long rate = 0L;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Long timerRef = null;
        private final boolean paused = false;
        
        public RefreshInfo(long rate, @org.jetbrains.annotations.Nullable
        java.lang.Long timerRef, boolean paused) {
            super();
        }
        
        public final long getRate() {
            return 0L;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Long getTimerRef() {
            return null;
        }
        
        public final boolean getPaused() {
            return false;
        }
    }
}