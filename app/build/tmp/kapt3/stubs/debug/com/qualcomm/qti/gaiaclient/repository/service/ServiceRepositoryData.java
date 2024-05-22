package com.qualcomm.qti.gaiaclient.repository.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002J.\u0010\u0005\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00070\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ@\u0010\u000f\u001a\u00020\u00102\u001e\u0010\u0011\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00070\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\tH&J6\u0010\u0018\u001a\u00020\u00102$\u0010\u0011\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0019\u0012\u0004\u0012\u00020\n0\u00070\u00122\u0006\u0010\u001a\u001a\u00020\u001bH&J0\u0010\u001c\u001a\u00020\u00102\u001e\u0010\u0011\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\n0\u00070\u00122\u0006\u0010\u001a\u001a\u00020\u001eH&J,\u0010\u001f\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0019\u0012\u0004\u0012\u00020\n0\u00070\u00062\u0006\u0010\u001a\u001a\u00020\u001bJ&\u0010 \u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\n0\u00070\u00062\u0006\u0010\u001a\u001a\u00020\u001eJ8\u0010!\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u001e\u0010\u0011\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00070\u0012H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceRepositoryData;", "Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceRepository;", "()V", "handler", "Landroid/os/Handler;", "downloadFile", "Landroidx/lifecycle/LiveData;", "Lcom/qualcomm/qti/gaiaclient/repository/service/Result;", "Lcom/qualcomm/qti/gaiaclient/repository/service/download/DownloadProgress;", "Landroid/net/Uri;", "Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceError;", "context", "Landroid/content/Context;", "fileData", "Lcom/qualcomm/qti/gaiaclient/repository/service/getfiles/FileData;", "executeDownloadFile", "", "liveData", "Landroidx/lifecycle/MutableLiveData;", "downloadId", "", "file", "Ljava/io/File;", "uri", "executeGetFiles", "", "parameters", "Lcom/qualcomm/qti/gaiaclient/repository/service/getfiles/GetFilesParameters;", "executeSendFeedback", "Lcom/qualcomm/qti/gaiaclient/repository/service/feedback/Issue;", "Lcom/qualcomm/qti/gaiaclient/repository/service/feedback/FeedbackParameters;", "getFiles", "sendFeedback", "startDownloadFile", "Companion", "app_debug"})
public abstract class ServiceRepositoryData implements com.qualcomm.qti.gaiaclient.repository.service.ServiceRepository {
    private final android.os.Handler handler = null;
    @org.jetbrains.annotations.NotNull
    public static final com.qualcomm.qti.gaiaclient.repository.service.ServiceRepositoryData.Companion Companion = null;
    private static final java.lang.String FILES_PATH = "upgrade_files";
    private static final java.lang.String FILE_NAME = "upgrade_file.bin";
    
    protected ServiceRepositoryData() {
        super();
    }
    
    public abstract void executeSendFeedback(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<com.qualcomm.qti.gaiaclient.repository.service.Result<kotlin.Unit, com.qualcomm.qti.gaiaclient.repository.service.feedback.Issue, com.qualcomm.qti.gaiaclient.repository.service.ServiceError>> liveData, @org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.repository.service.feedback.FeedbackParameters parameters);
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public final androidx.lifecycle.LiveData<com.qualcomm.qti.gaiaclient.repository.service.Result<kotlin.Unit, com.qualcomm.qti.gaiaclient.repository.service.feedback.Issue, com.qualcomm.qti.gaiaclient.repository.service.ServiceError>> sendFeedback(@org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.repository.service.feedback.FeedbackParameters parameters) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public final androidx.lifecycle.LiveData<com.qualcomm.qti.gaiaclient.repository.service.Result<kotlin.Unit, java.util.List<com.qualcomm.qti.gaiaclient.repository.service.getfiles.FileData>, com.qualcomm.qti.gaiaclient.repository.service.ServiceError>> getFiles(@org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.repository.service.getfiles.GetFilesParameters parameters) {
        return null;
    }
    
    public abstract void executeGetFiles(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<com.qualcomm.qti.gaiaclient.repository.service.Result<kotlin.Unit, java.util.List<com.qualcomm.qti.gaiaclient.repository.service.getfiles.FileData>, com.qualcomm.qti.gaiaclient.repository.service.ServiceError>> liveData, @org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.repository.service.getfiles.GetFilesParameters parameters);
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public final androidx.lifecycle.LiveData<com.qualcomm.qti.gaiaclient.repository.service.Result<com.qualcomm.qti.gaiaclient.repository.service.download.DownloadProgress, android.net.Uri, com.qualcomm.qti.gaiaclient.repository.service.ServiceError>> downloadFile(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.repository.service.getfiles.FileData fileData) {
        return null;
    }
    
    public abstract void executeDownloadFile(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<com.qualcomm.qti.gaiaclient.repository.service.Result<com.qualcomm.qti.gaiaclient.repository.service.download.DownloadProgress, android.net.Uri, com.qualcomm.qti.gaiaclient.repository.service.ServiceError>> liveData, @org.jetbrains.annotations.NotNull
    java.lang.String downloadId, @org.jetbrains.annotations.NotNull
    java.io.File file, @org.jetbrains.annotations.NotNull
    android.net.Uri uri);
    
    private final void startDownloadFile(android.content.Context context, com.qualcomm.qti.gaiaclient.repository.service.getfiles.FileData fileData, androidx.lifecycle.MutableLiveData<com.qualcomm.qti.gaiaclient.repository.service.Result<com.qualcomm.qti.gaiaclient.repository.service.download.DownloadProgress, android.net.Uri, com.qualcomm.qti.gaiaclient.repository.service.ServiceError>> liveData) {
    }
    
    public void init() {
    }
    
    public void reset() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceRepositoryData$Companion;", "", "()V", "FILES_PATH", "", "FILE_NAME", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}