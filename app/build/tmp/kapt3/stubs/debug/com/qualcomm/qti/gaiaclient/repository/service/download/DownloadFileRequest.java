package com.qualcomm.qti.gaiaclient.repository.service.download;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001Bc\u0012\u0010\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n0\b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u000e\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u000e\u00a2\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\nH\u0014J\b\u0010\u0012\u001a\u00020\nH\u0014J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0018\u0010\u0016\u001a\u00020\n2\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0018H\u0002J\u0018\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002R\u0018\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/repository/service/download/DownloadFileRequest;", "Lcom/qualcomm/qti/gaiaclient/repository/service/Request;", "call", "Lretrofit2/Call;", "Lokhttp3/ResponseBody;", "file", "Ljava/io/File;", "onProgress", "Lkotlin/Function1;", "", "", "onError", "Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceError;", "onSuccess", "Lkotlin/Function0;", "onComplete", "(Lretrofit2/Call;Ljava/io/File;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "executeRequest", "onCancelled", "onFailure", "t", "", "onResponse", "response", "Lretrofit2/Response;", "readDownloadFileResponse", "body", "app_debug"})
public final class DownloadFileRequest extends com.qualcomm.qti.gaiaclient.repository.service.Request {
    private final retrofit2.Call<okhttp3.ResponseBody> call = null;
    private final java.io.File file = null;
    private final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> onProgress = null;
    private final kotlin.jvm.functions.Function1<com.qualcomm.qti.gaiaclient.repository.service.ServiceError, kotlin.Unit> onError = null;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onSuccess = null;
    
    public DownloadFileRequest(@org.jetbrains.annotations.Nullable
    retrofit2.Call<okhttp3.ResponseBody> call, @org.jetbrains.annotations.NotNull
    java.io.File file, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onProgress, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.qualcomm.qti.gaiaclient.repository.service.ServiceError, kotlin.Unit> onError, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onSuccess, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onComplete) {
        super(null);
    }
    
    @java.lang.Override
    protected void executeRequest() {
    }
    
    private final void onResponse(retrofit2.Response<okhttp3.ResponseBody> response) {
    }
    
    private final void onFailure(java.lang.Throwable t) {
    }
    
    private final void readDownloadFileResponse(okhttp3.ResponseBody body, java.io.File file) {
    }
    
    @java.lang.Override
    protected void onCancelled() {
    }
}