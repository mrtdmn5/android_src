package com.qualcomm.qti.gaiaclient.repository.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J0\u0010\u0004\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00060\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&J.\u0010\u000e\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u000f\u0012\u0004\u0012\u00020\t0\u00060\u00052\u0006\u0010\u0010\u001a\u00020\u0011H&J\b\u0010\u0012\u001a\u00020\u0003H\u0016J\b\u0010\u0013\u001a\u00020\u0003H\u0016J(\u0010\u0014\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\t0\u00060\u00052\u0006\u0010\u0010\u001a\u00020\u0016H&\u00a8\u0006\u0017"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceRepository;", "", "cancelDownload", "", "downloadFile", "Landroidx/lifecycle/LiveData;", "Lcom/qualcomm/qti/gaiaclient/repository/service/Result;", "Lcom/qualcomm/qti/gaiaclient/repository/service/download/DownloadProgress;", "Landroid/net/Uri;", "Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceError;", "context", "Landroid/content/Context;", "fileData", "Lcom/qualcomm/qti/gaiaclient/repository/service/getfiles/FileData;", "getFiles", "", "parameters", "Lcom/qualcomm/qti/gaiaclient/repository/service/getfiles/GetFilesParameters;", "init", "reset", "sendFeedback", "Lcom/qualcomm/qti/gaiaclient/repository/service/feedback/Issue;", "Lcom/qualcomm/qti/gaiaclient/repository/service/feedback/FeedbackParameters;", "app_debug"})
public abstract interface ServiceRepository {
    
    public abstract void init();
    
    public abstract void reset();
    
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<com.qualcomm.qti.gaiaclient.repository.service.Result<kotlin.Unit, com.qualcomm.qti.gaiaclient.repository.service.feedback.Issue, com.qualcomm.qti.gaiaclient.repository.service.ServiceError>> sendFeedback(@org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.repository.service.feedback.FeedbackParameters parameters);
    
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<com.qualcomm.qti.gaiaclient.repository.service.Result<kotlin.Unit, java.util.List<com.qualcomm.qti.gaiaclient.repository.service.getfiles.FileData>, com.qualcomm.qti.gaiaclient.repository.service.ServiceError>> getFiles(@org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.repository.service.getfiles.GetFilesParameters parameters);
    
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<com.qualcomm.qti.gaiaclient.repository.service.Result<com.qualcomm.qti.gaiaclient.repository.service.download.DownloadProgress, android.net.Uri, com.qualcomm.qti.gaiaclient.repository.service.ServiceError>> downloadFile(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.repository.service.getfiles.FileData fileData);
    
    public abstract void cancelDownload();
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
        
        public static void init(@org.jetbrains.annotations.NotNull
        com.qualcomm.qti.gaiaclient.repository.service.ServiceRepository $thıs) {
        }
        
        public static void reset(@org.jetbrains.annotations.NotNull
        com.qualcomm.qti.gaiaclient.repository.service.ServiceRepository $thıs) {
        }
    }
}