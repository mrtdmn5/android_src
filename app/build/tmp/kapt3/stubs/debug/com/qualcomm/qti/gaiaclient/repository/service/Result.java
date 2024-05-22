package com.qualcomm.qti.gaiaclient.repository.service;

import java.lang.System;

/**
 * A class to encapsulate data for tasks that provide progress during execution.
 *
 * @param P type for the in progress data
 * @param D type for the result data
 * @param E type for the result error data
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u00020\u0004:\u0003\t\n\u000bB\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\b\u0082\u0001\u0003\f\r\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/repository/service/Result;", "P", "D", "E", "", "()V", "isComplete", "", "()Z", "Error", "Progress", "Success", "Lcom/qualcomm/qti/gaiaclient/repository/service/Result$Progress;", "Lcom/qualcomm/qti/gaiaclient/repository/service/Result$Success;", "Lcom/qualcomm/qti/gaiaclient/repository/service/Result$Error;", "app_debug"})
public abstract class Result<P extends java.lang.Object, D extends java.lang.Object, E extends java.lang.Object> {
    
    private Result() {
        super();
    }
    
    public final boolean isComplete() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0003\u0010\u0001*\u0004\b\u0004\u0010\u0002*\u0004\b\u0005\u0010\u00032\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00028\u0003\u00a2\u0006\u0002\u0010\u0006R\u0013\u0010\u0005\u001a\u00028\u0003\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\n"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/repository/service/Result$Progress;", "P", "D", "E", "Lcom/qualcomm/qti/gaiaclient/repository/service/Result;", "progress", "(Ljava/lang/Object;)V", "getProgress", "()Ljava/lang/Object;", "Ljava/lang/Object;", "app_debug"})
    public static final class Progress<P extends java.lang.Object, D extends java.lang.Object, E extends java.lang.Object> extends com.qualcomm.qti.gaiaclient.repository.service.Result<P, D, E> {
        private final P progress = null;
        
        public Progress(P progress) {
            super();
        }
        
        public final P getProgress() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0003\u0010\u0001*\u0004\b\u0004\u0010\u0002*\u0004\b\u0005\u0010\u00032\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00028\u0004\u00a2\u0006\u0002\u0010\u0006R\u0013\u0010\u0005\u001a\u00028\u0004\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\n"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/repository/service/Result$Success;", "P", "D", "E", "Lcom/qualcomm/qti/gaiaclient/repository/service/Result;", "data", "(Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "app_debug"})
    public static final class Success<P extends java.lang.Object, D extends java.lang.Object, E extends java.lang.Object> extends com.qualcomm.qti.gaiaclient.repository.service.Result<P, D, E> {
        private final D data = null;
        
        public Success(D data) {
            super();
        }
        
        public final D getData() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0003\u0010\u0001*\u0004\b\u0004\u0010\u0002*\u0004\b\u0005\u0010\u00032\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00028\u0005\u00a2\u0006\u0002\u0010\u0006R\u0013\u0010\u0005\u001a\u00028\u0005\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\n"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/repository/service/Result$Error;", "P", "D", "E", "Lcom/qualcomm/qti/gaiaclient/repository/service/Result;", "error", "(Ljava/lang/Object;)V", "getError", "()Ljava/lang/Object;", "Ljava/lang/Object;", "app_debug"})
    public static final class Error<P extends java.lang.Object, D extends java.lang.Object, E extends java.lang.Object> extends com.qualcomm.qti.gaiaclient.repository.service.Result<P, D, E> {
        private final E error = null;
        
        public Error(E error) {
            super();
        }
        
        public final E getError() {
            return null;
        }
    }
}