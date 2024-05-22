package com.qualcomm.qti.gaiaclient.repository.statistics.recording;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001:\u0001\u0017B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u0005H\u0004J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u0005H\u0002J\u0018\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u0005H\u0002J\u0017\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\n\u001a\u00020\u0005H\u0004\u00a2\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\tH\u0004J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u0005H\u0004J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u0016H\u0016R \u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/repository/statistics/recording/StatisticsRecordingData;", "Lcom/qualcomm/qti/gaiaclient/repository/statistics/recording/StatisticsRecording;", "()V", "openFiles", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/qualcomm/qti/gaiaclient/core/gaia/qtil/data/CategoryID;", "Lcom/qualcomm/qti/gaiaclient/ui/common/StickyLiveData;", "Lcom/qualcomm/qti/gaiaclient/repository/statistics/recording/StatisticsRecordingData$FileInfo;", "fileForCategory", "Ljava/io/File;", "category", "getFile", "getFileData", "incrementLineCount", "", "(Lcom/qualcomm/qti/gaiaclient/core/gaia/qtil/data/CategoryID;)Ljava/lang/Integer;", "isRecording", "", "newFileEntry", "file", "removeFileEntry", "stopAllRecording", "", "FileInfo", "app_debug"})
public abstract class StatisticsRecordingData implements com.qualcomm.qti.gaiaclient.repository.statistics.recording.StatisticsRecording {
    private java.util.concurrent.ConcurrentHashMap<com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.CategoryID, com.qualcomm.qti.gaiaclient.ui.common.StickyLiveData<com.qualcomm.qti.gaiaclient.repository.statistics.recording.StatisticsRecordingData.FileInfo>> openFiles;
    
    public StatisticsRecordingData() {
        super();
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
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.util.List<java.io.File> stopAllRecording() {
        return null;
    }
    
    protected final boolean removeFileEntry(@org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.CategoryID category) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable
    protected final java.io.File fileForCategory(@org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.CategoryID category) {
        return null;
    }
    
    protected final boolean newFileEntry(@org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.CategoryID category, @org.jetbrains.annotations.NotNull
    java.io.File file) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable
    protected final java.lang.Integer incrementLineCount(@org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.CategoryID category) {
        return null;
    }
    
    private final com.qualcomm.qti.gaiaclient.ui.common.StickyLiveData<com.qualcomm.qti.gaiaclient.repository.statistics.recording.StatisticsRecordingData.FileInfo> getFileData(com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.CategoryID category) {
        return null;
    }
    
    private final java.io.File getFile(com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.CategoryID category) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\r"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/repository/statistics/recording/StatisticsRecordingData$FileInfo;", "", "fileHandle", "Ljava/io/File;", "(Ljava/io/File;)V", "getFileHandle", "()Ljava/io/File;", "lines", "", "getLines", "()I", "setLines", "(I)V", "app_debug"})
    public static final class FileInfo {
        @org.jetbrains.annotations.NotNull
        private final java.io.File fileHandle = null;
        private int lines = 0;
        
        public FileInfo(@org.jetbrains.annotations.NotNull
        java.io.File fileHandle) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.io.File getFileHandle() {
            return null;
        }
        
        public final int getLines() {
            return 0;
        }
        
        public final void setLines(int p0) {
        }
    }
}