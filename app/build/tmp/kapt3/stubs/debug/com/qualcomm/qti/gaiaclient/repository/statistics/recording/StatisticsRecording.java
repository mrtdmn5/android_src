package com.qualcomm.qti.gaiaclient.repository.statistics.recording;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J<\u0010\n\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\"\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fj\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e`\u000fH&J\u0018\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H&J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\b\u001a\u00020\tH&\u00a8\u0006\u0015"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/repository/statistics/recording/StatisticsRecording;", "", "eraseAllExpired", "", "context", "Landroid/content/Context;", "isRecording", "", "category", "Lcom/qualcomm/qti/gaiaclient/core/gaia/qtil/data/CategoryID;", "logRow", "statisticsValues", "Ljava/util/HashMap;", "Lcom/qualcomm/qti/gaiaclient/core/gaia/qtil/data/StatisticID;", "", "Lkotlin/collections/HashMap;", "startRecording", "stopAllRecording", "", "Ljava/io/File;", "stopRecording", "app_debug"})
public abstract interface StatisticsRecording {
    
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
    
    public abstract boolean logRow(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.CategoryID category, @org.jetbrains.annotations.NotNull
    java.util.HashMap<com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.StatisticID, byte[]> statisticsValues);
}