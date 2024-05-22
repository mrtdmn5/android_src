package com.qualcomm.qti.gaiaclient.repository.statistics.refresh;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J \u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0002J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002\u00a8\u0006\u0013"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/repository/statistics/refresh/StatisticsRefreshImpl;", "Lcom/qualcomm/qti/gaiaclient/repository/statistics/refresh/StatisticsRefreshData;", "()V", "adjustRefreshRate", "", "refreshRateMS", "", "category", "Lcom/qualcomm/qti/gaiaclient/core/gaia/qtil/data/CategoryID;", "repository", "Lcom/qualcomm/qti/gaiaclient/repository/statistics/StatisticsRepository;", "pause", "refreshRate", "setUpTimedTask", "rate", "startRefreshing", "stopRefreshing", "leavePaused", "", "app_debug"})
public final class StatisticsRefreshImpl extends com.qualcomm.qti.gaiaclient.repository.statistics.refresh.StatisticsRefreshData {
    
    public StatisticsRefreshImpl() {
        super();
    }
    
    @java.lang.Override
    public void startRefreshing(@org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.CategoryID category, @org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.repository.statistics.StatisticsRepository repository) {
    }
    
    @java.lang.Override
    public void stopRefreshing(@org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.CategoryID category) {
    }
    
    @java.lang.Override
    public void pause(@org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.CategoryID category) {
    }
    
    private final void stopRefreshing(com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.CategoryID category, boolean leavePaused) {
    }
    
    @java.lang.Override
    public long refreshRate(@org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.CategoryID category) {
        return 0L;
    }
    
    @java.lang.Override
    public void adjustRefreshRate(long refreshRateMS, @org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.CategoryID category, @org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.repository.statistics.StatisticsRepository repository) {
    }
    
    private final void setUpTimedTask(com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.CategoryID category, long rate, com.qualcomm.qti.gaiaclient.repository.statistics.StatisticsRepository repository) {
    }
}