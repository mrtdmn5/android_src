package com.qualcomm.qti.gaiaclient.repository.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\'J&\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u000bH\'J&\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u000eH\'\u00a8\u0006\u000f"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/repository/service/Service;", "", "downloadFile", "Lretrofit2/Call;", "Lokhttp3/ResponseBody;", "token", "", "id", "getFiles", "Lcom/qualcomm/qti/gaiaclient/repository/service/getfiles/GetFilesResponse;", "parameters", "Lcom/qualcomm/qti/gaiaclient/repository/service/getfiles/GetFilesParameters;", "sendFeedback", "Lcom/qualcomm/qti/gaiaclient/repository/service/feedback/FeedbackResponse;", "Lcom/qualcomm/qti/gaiaclient/repository/service/feedback/FeedbackParameters;", "app_debug"})
public abstract interface Service {
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.HTTP(method = "POST", path = "builds", hasBody = true)
    @retrofit2.http.Headers(value = {"Content-Type: application/json", "Accept: application/json"})
    public abstract retrofit2.Call<com.qualcomm.qti.gaiaclient.repository.service.getfiles.GetFilesResponse> getFiles(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "token")
    java.lang.String token, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    com.qualcomm.qti.gaiaclient.repository.service.getfiles.GetFilesParameters parameters);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "download")
    @retrofit2.http.Streaming
    public abstract retrofit2.Call<okhttp3.ResponseBody> downloadFile(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "token")
    java.lang.String token, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "id")
    java.lang.String id);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.HTTP(method = "POST", path = "feedback", hasBody = true)
    @retrofit2.http.Headers(value = {"Content-Type: application/json", "Accept: application/json"})
    public abstract retrofit2.Call<com.qualcomm.qti.gaiaclient.repository.service.feedback.FeedbackResponse> sendFeedback(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "token")
    java.lang.String token, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    com.qualcomm.qti.gaiaclient.repository.service.feedback.FeedbackParameters parameters);
}