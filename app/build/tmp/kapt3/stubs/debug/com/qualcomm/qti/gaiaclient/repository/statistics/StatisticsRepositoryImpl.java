package com.qualcomm.qti.gaiaclient.repository.statistics;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0016\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/repository/statistics/StatisticsRepositoryImpl;", "Lcom/qualcomm/qti/gaiaclient/repository/statistics/StatisticsRepositoryData;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mSubscriber", "Lcom/qualcomm/qti/gaiaclient/core/publications/qtil/subscribers/StatisticsSubscriber;", "fetchCategories", "", "fetchStatistics", "category", "Lcom/qualcomm/qti/gaiaclient/core/gaia/qtil/data/CategoryID;", "descriptors", "", "Lcom/qualcomm/qti/gaiaclient/core/gaia/qtil/data/StatisticDescriptor;", "init", "featuresRepository", "Lcom/qualcomm/qti/gaiaclient/repository/features/FeaturesRepository;", "app_debug"})
@javax.inject.Singleton
public final class StatisticsRepositoryImpl extends com.qualcomm.qti.gaiaclient.repository.statistics.StatisticsRepositoryData {
    private final android.content.Context context = null;
    private final com.qualcomm.qti.gaiaclient.core.publications.qtil.subscribers.StatisticsSubscriber mSubscriber = null;
    
    @javax.inject.Inject
    public StatisticsRepositoryImpl(@org.jetbrains.annotations.NotNull
    @dagger.hilt.android.qualifiers.ApplicationContext
    android.content.Context context) {
        super(null);
    }
    
    @java.lang.Override
    public void init(@org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.repository.features.FeaturesRepository featuresRepository) {
    }
    
    @java.lang.Override
    public void fetchCategories() {
    }
    
    @java.lang.Override
    public void fetchStatistics(@org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.CategoryID category) {
    }
    
    @java.lang.Override
    public void fetchStatistics(@org.jetbrains.annotations.NotNull
    java.util.List<com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.StatisticDescriptor> descriptors) {
    }
}