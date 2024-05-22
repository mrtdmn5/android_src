package com.qualcomm.qti.gaiaclient.repository.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002BS\u0012\u0010\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u0006\u00a2\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\bH\u0014J\b\u0010\u000f\u001a\u00020\bH\u0014J\u0018\u0010\u0010\u001a\u00020\b2\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0012H\u0002R\u0018\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/repository/service/SingleRequest;", "T", "Lcom/qualcomm/qti/gaiaclient/repository/service/Request;", "call", "Lretrofit2/Call;", "onError", "Lkotlin/Function1;", "Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceError;", "", "onSuccess", "parseErrorId", "Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceErrorResponse;", "Lcom/qualcomm/qti/gaiaclient/repository/service/ApiErrorType;", "(Lretrofit2/Call;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "executeRequest", "onCancelled", "parseResponse", "response", "Lretrofit2/Response;", "app_debug"})
public final class SingleRequest<T extends java.lang.Object> extends com.qualcomm.qti.gaiaclient.repository.service.Request {
    private final retrofit2.Call<T> call = null;
    private final kotlin.jvm.functions.Function1<com.qualcomm.qti.gaiaclient.repository.service.ServiceError, kotlin.Unit> onError = null;
    private final kotlin.jvm.functions.Function1<T, kotlin.Unit> onSuccess = null;
    private final kotlin.jvm.functions.Function1<com.qualcomm.qti.gaiaclient.repository.service.ServiceErrorResponse, com.qualcomm.qti.gaiaclient.repository.service.ApiErrorType> parseErrorId = null;
    
    public SingleRequest(@org.jetbrains.annotations.Nullable
    retrofit2.Call<T> call, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.qualcomm.qti.gaiaclient.repository.service.ServiceError, kotlin.Unit> onError, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> onSuccess, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.qualcomm.qti.gaiaclient.repository.service.ServiceErrorResponse, ? extends com.qualcomm.qti.gaiaclient.repository.service.ApiErrorType> parseErrorId) {
        super(null);
    }
    
    @java.lang.Override
    protected void executeRequest() {
    }
    
    @java.lang.Override
    protected void onCancelled() {
    }
    
    private final void parseResponse(retrofit2.Response<T> response) {
    }
}