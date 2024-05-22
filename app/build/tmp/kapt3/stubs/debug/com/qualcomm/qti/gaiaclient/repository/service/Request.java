package com.qualcomm.qti.gaiaclient.repository.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u0006\u0010\b\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\u0004J\b\u0010\n\u001a\u00020\u0004H$J\b\u0010\u000b\u001a\u00020\u0004H$J,\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/repository/service/Request;", "", "onComplete", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)V", "cancelled", "Ljava/util/concurrent/atomic/AtomicBoolean;", "cancel", "execute", "executeRequest", "onCancelled", "parseResponseError", "Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceError;", "code", "", "errorBody", "Lokhttp3/ResponseBody;", "parseErrorId", "Lkotlin/Function1;", "Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceErrorResponse;", "Lcom/qualcomm/qti/gaiaclient/repository/service/ApiErrorType;", "app_debug"})
public abstract class Request {
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onComplete = null;
    private final java.util.concurrent.atomic.AtomicBoolean cancelled = null;
    
    public Request(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onComplete) {
        super();
    }
    
    public final void execute() {
    }
    
    protected abstract void executeRequest();
    
    public final void cancel() {
    }
    
    protected abstract void onCancelled();
    
    @org.jetbrains.annotations.NotNull
    public final com.qualcomm.qti.gaiaclient.repository.service.ServiceError parseResponseError(int code, @org.jetbrains.annotations.Nullable
    okhttp3.ResponseBody errorBody, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.qualcomm.qti.gaiaclient.repository.service.ServiceErrorResponse, ? extends com.qualcomm.qti.gaiaclient.repository.service.ApiErrorType> parseErrorId) {
        return null;
    }
}