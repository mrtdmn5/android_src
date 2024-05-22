package com.qualcomm.qti.gaiaclient.repository.statistics.refresh;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\f\u001a\u00020\u0003H&J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\u0010\u001a\u00020\u0003H&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\u0012"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/repository/statistics/refresh/StatisticsRefresh;", "", "adjustRefreshRate", "", "refreshRateMS", "", "category", "Lcom/qualcomm/qti/gaiaclient/core/gaia/qtil/data/CategoryID;", "repository", "Lcom/qualcomm/qti/gaiaclient/repository/statistics/StatisticsRepository;", "isRefreshing", "", "pauseAllRefreshing", "refreshRate", "resumePaused", "startRefreshing", "stopAllRefreshing", "stopRefreshing", "app_debug"})
public abstract interface StatisticsRefresh {
    
    public abstract void startRefreshing(@org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.CategoryID category, @org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.repository.statistics.StatisticsRepository repository);
    
    public abstract void stopRefreshing(@org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.CategoryID category);
    
    public abstract void stopAllRefreshing();
    
    public abstract void pauseAllRefreshing();
    
    public abstract void resumePaused(@org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.repository.statistics.StatisticsRepository repository);
    
    public abstract boolean isRefreshing(@org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.CategoryID category);
    
    public abstract long refreshRate(@org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.CategoryID category);
    
    public abstract void adjustRefreshRate(long refreshRateMS, @org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.CategoryID category, @org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.repository.statistics.StatisticsRepository repository);
}