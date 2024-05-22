package com.qualcomm.qti.gaiaclient.repository.statistics.recording;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0002J\b\u0010\u000b\u001a\u00020\u0004H\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J<\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\"\u0010\u0014\u001a\u001e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015j\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017`\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/repository/statistics/recording/StatisticsRecordingImpl;", "Lcom/qualcomm/qti/gaiaclient/repository/statistics/recording/StatisticsRecordingData;", "()V", "FILES_PATH", "", "MAX_FILE_AGE_MSECS", "", "MAX_LINES_IN_FILE", "", "convertToValidFileName", "filename", "currentTimestamp", "eraseAllExpired", "", "context", "Landroid/content/Context;", "category", "Lcom/qualcomm/qti/gaiaclient/core/gaia/qtil/data/CategoryID;", "logRow", "", "statisticsValues", "Ljava/util/HashMap;", "Lcom/qualcomm/qti/gaiaclient/core/gaia/qtil/data/StatisticID;", "", "Lkotlin/collections/HashMap;", "startRecording", "stopRecording", "Ljava/io/File;", "app_debug"})
public final class StatisticsRecordingImpl extends com.qualcomm.qti.gaiaclient.repository.statistics.recording.StatisticsRecordingData {
    private final double MAX_FILE_AGE_MSECS = 200000.0;
    private final int MAX_LINES_IN_FILE = 1000;
    private final java.lang.String FILES_PATH = "statistics_recordings";
    
    public StatisticsRecordingImpl() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.io.File stopRecording(@org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.CategoryID category) {
        return null;
    }
    
    @java.lang.Override
    public boolean startRecording(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.CategoryID category) {
        return false;
    }
    
    @java.lang.Override
    public void eraseAllExpired(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
    
    @java.lang.Override
    public boolean logRow(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.CategoryID category, @org.jetbrains.annotations.NotNull
    java.util.HashMap<com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.StatisticID, byte[]> statisticsValues) {
        return false;
    }
    
    private final java.lang.String convertToValidFileName(java.lang.String filename) {
        return null;
    }
    
    private final java.lang.String filename(com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.CategoryID category) {
        return null;
    }
    
    private final java.lang.String currentTimestamp() {
        return null;
    }
}