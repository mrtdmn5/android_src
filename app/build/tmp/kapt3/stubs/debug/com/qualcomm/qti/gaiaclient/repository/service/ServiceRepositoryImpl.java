package com.qualcomm.qti.gaiaclient.repository.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 #2\u00020\u0001:\u0002#$B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\rH\u0016J@\u0010\u000e\u001a\u00020\r2\u001e\u0010\u000f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00110\u00102\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0013H\u0016J6\u0010\u001a\u001a\u00020\r2$\u0010\u000f\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b\u0012\u0004\u0012\u00020\u00140\u00110\u00102\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J0\u0010\u001f\u001a\u00020\r2\u001e\u0010\u000f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00140\u00110\u00102\u0006\u0010\u001d\u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\rH\u0016R\u0016\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\t8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u00a8\u0006%"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceRepositoryImpl;", "Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceRepositoryData;", "()V", "downloadRequest", "Ljava/util/concurrent/atomic/AtomicReference;", "Lcom/qualcomm/qti/gaiaclient/repository/service/Request;", "retrofitService", "Lcom/qualcomm/qti/gaiaclient/repository/service/Service;", "taskManager", "Lcom/qualcomm/qti/gaiaclient/core/tasks/TaskManager;", "getTaskManager", "()Lcom/qualcomm/qti/gaiaclient/core/tasks/TaskManager;", "cancelDownload", "", "executeDownloadFile", "liveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/qualcomm/qti/gaiaclient/repository/service/Result;", "Lcom/qualcomm/qti/gaiaclient/repository/service/download/DownloadProgress;", "Landroid/net/Uri;", "Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceError;", "downloadId", "", "file", "Ljava/io/File;", "uri", "executeGetFiles", "", "Lcom/qualcomm/qti/gaiaclient/repository/service/getfiles/FileData;", "parameters", "Lcom/qualcomm/qti/gaiaclient/repository/service/getfiles/GetFilesParameters;", "executeSendFeedback", "Lcom/qualcomm/qti/gaiaclient/repository/service/feedback/Issue;", "Lcom/qualcomm/qti/gaiaclient/repository/service/feedback/FeedbackParameters;", "init", "Companion", "Server", "app_debug"})
@javax.inject.Singleton
public final class ServiceRepositoryImpl extends com.qualcomm.qti.gaiaclient.repository.service.ServiceRepositoryData {
    private com.qualcomm.qti.gaiaclient.repository.service.Service retrofitService;
    private final java.util.concurrent.atomic.AtomicReference<com.qualcomm.qti.gaiaclient.repository.service.Request> downloadRequest = null;
    @org.jetbrains.annotations.NotNull
    public static final com.qualcomm.qti.gaiaclient.repository.service.ServiceRepositoryImpl.Companion Companion = null;
    private static final long SERVER_TIME_OUT_DEFAULT = 60L;
    
    @javax.inject.Inject
    public ServiceRepositoryImpl() {
        super();
    }
    
    private final com.qualcomm.qti.gaiaclient.core.tasks.TaskManager getTaskManager() {
        return null;
    }
    
    @java.lang.Override
    public void init() {
    }
    
    @java.lang.Override
    public void executeSendFeedback(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<com.qualcomm.qti.gaiaclient.repository.service.Result<kotlin.Unit, com.qualcomm.qti.gaiaclient.repository.service.feedback.Issue, com.qualcomm.qti.gaiaclient.repository.service.ServiceError>> liveData, @org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.repository.service.feedback.FeedbackParameters parameters) {
    }
    
    @java.lang.Override
    public void executeGetFiles(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<com.qualcomm.qti.gaiaclient.repository.service.Result<kotlin.Unit, java.util.List<com.qualcomm.qti.gaiaclient.repository.service.getfiles.FileData>, com.qualcomm.qti.gaiaclient.repository.service.ServiceError>> liveData, @org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.repository.service.getfiles.GetFilesParameters parameters) {
    }
    
    @java.lang.Override
    public void executeDownloadFile(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<com.qualcomm.qti.gaiaclient.repository.service.Result<com.qualcomm.qti.gaiaclient.repository.service.download.DownloadProgress, android.net.Uri, com.qualcomm.qti.gaiaclient.repository.service.ServiceError>> liveData, @org.jetbrains.annotations.NotNull
    java.lang.String downloadId, @org.jetbrains.annotations.NotNull
    java.io.File file, @org.jetbrains.annotations.NotNull
    android.net.Uri uri) {
    }
    
    @java.lang.Override
    public void cancelDownload() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u00c2\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceRepositoryImpl$Server;", "", "()V", "client", "Lokhttp3/OkHttpClient;", "getClient", "()Lokhttp3/OkHttpClient;", "interceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "getInterceptor", "()Lokhttp3/logging/HttpLoggingInterceptor;", "retrofit", "Lretrofit2/Retrofit;", "getRetrofit", "()Lretrofit2/Retrofit;", "setRetrofit", "(Lretrofit2/Retrofit;)V", "token", "", "app_debug"})
    static final class Server {
        @org.jetbrains.annotations.NotNull
        public static final com.qualcomm.qti.gaiaclient.repository.service.ServiceRepositoryImpl.Server INSTANCE = null;
        @org.jetbrains.annotations.NotNull
        public static final java.lang.String token = "the_token";
        @org.jetbrains.annotations.NotNull
        private static final okhttp3.logging.HttpLoggingInterceptor interceptor = null;
        @org.jetbrains.annotations.NotNull
        private static final okhttp3.OkHttpClient client = null;
        public static retrofit2.Retrofit retrofit;
        
        private Server() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final okhttp3.logging.HttpLoggingInterceptor getInterceptor() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final okhttp3.OkHttpClient getClient() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final retrofit2.Retrofit getRetrofit() {
            return null;
        }
        
        public final void setRetrofit(@org.jetbrains.annotations.NotNull
        retrofit2.Retrofit p0) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceRepositoryImpl$Companion;", "", "()V", "SERVER_TIME_OUT_DEFAULT", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}