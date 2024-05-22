package com.qualcomm.qti.gaiaclient.repository.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0005\u0006\u0007B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u0082\u0001\u0003\b\t\n\u00a8\u0006\u000b"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceError;", "", "()V", "toString", "", "Internal", "RequestError", "ResponseError", "Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceError$Internal;", "Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceError$RequestError;", "Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceError$ResponseError;", "app_debug"})
public abstract class ServiceError {
    
    private ServiceError() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0005\u0006\u0007\b\tB\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u0082\u0001\u0005\n\u000b\f\r\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceError$Internal;", "Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceError;", "()V", "toString", "", "CallFailed", "FileError", "NotInitialised", "UnexpectedStatus", "UriError", "Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceError$Internal$FileError;", "Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceError$Internal$UriError;", "Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceError$Internal$NotInitialised;", "Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceError$Internal$CallFailed;", "Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceError$Internal$UnexpectedStatus;", "app_debug"})
    public static abstract class Internal extends com.qualcomm.qti.gaiaclient.repository.service.ServiceError {
        
        private Internal() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceError$Internal$FileError;", "Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceError$Internal;", "()V", "app_debug"})
        public static final class FileError extends com.qualcomm.qti.gaiaclient.repository.service.ServiceError.Internal {
            @org.jetbrains.annotations.NotNull
            public static final com.qualcomm.qti.gaiaclient.repository.service.ServiceError.Internal.FileError INSTANCE = null;
            
            private FileError() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceError$Internal$UriError;", "Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceError$Internal;", "()V", "app_debug"})
        public static final class UriError extends com.qualcomm.qti.gaiaclient.repository.service.ServiceError.Internal {
            @org.jetbrains.annotations.NotNull
            public static final com.qualcomm.qti.gaiaclient.repository.service.ServiceError.Internal.UriError INSTANCE = null;
            
            private UriError() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceError$Internal$NotInitialised;", "Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceError$Internal;", "()V", "app_debug"})
        public static final class NotInitialised extends com.qualcomm.qti.gaiaclient.repository.service.ServiceError.Internal {
            @org.jetbrains.annotations.NotNull
            public static final com.qualcomm.qti.gaiaclient.repository.service.ServiceError.Internal.NotInitialised INSTANCE = null;
            
            private NotInitialised() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceError$Internal$CallFailed;", "Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceError$Internal;", "()V", "app_debug"})
        public static final class CallFailed extends com.qualcomm.qti.gaiaclient.repository.service.ServiceError.Internal {
            @org.jetbrains.annotations.NotNull
            public static final com.qualcomm.qti.gaiaclient.repository.service.ServiceError.Internal.CallFailed INSTANCE = null;
            
            private CallFailed() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceError$Internal$UnexpectedStatus;", "Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceError$Internal;", "status", "", "(I)V", "getStatus", "()I", "toString", "", "app_debug"})
        public static final class UnexpectedStatus extends com.qualcomm.qti.gaiaclient.repository.service.ServiceError.Internal {
            private final int status = 0;
            
            public UnexpectedStatus(int status) {
                super();
            }
            
            public final int getStatus() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00052\u00020\u0001:\u0004\u0005\u0006\u0007\bB\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u0082\u0001\u0003\t\n\u000b\u00a8\u0006\f"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceError$RequestError;", "Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceError;", "()V", "toString", "", "Companion", "Exception", "Timeout", "UnknownHost", "Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceError$RequestError$UnknownHost;", "Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceError$RequestError$Timeout;", "Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceError$RequestError$Exception;", "app_debug"})
    public static abstract class RequestError extends com.qualcomm.qti.gaiaclient.repository.service.ServiceError {
        @org.jetbrains.annotations.NotNull
        public static final com.qualcomm.qti.gaiaclient.repository.service.ServiceError.RequestError.Companion Companion = null;
        
        private RequestError() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceError$RequestError$UnknownHost;", "Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceError$RequestError;", "()V", "app_debug"})
        public static final class UnknownHost extends com.qualcomm.qti.gaiaclient.repository.service.ServiceError.RequestError {
            @org.jetbrains.annotations.NotNull
            public static final com.qualcomm.qti.gaiaclient.repository.service.ServiceError.RequestError.UnknownHost INSTANCE = null;
            
            private UnknownHost() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceError$RequestError$Timeout;", "Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceError$RequestError;", "()V", "app_debug"})
        public static final class Timeout extends com.qualcomm.qti.gaiaclient.repository.service.ServiceError.RequestError {
            @org.jetbrains.annotations.NotNull
            public static final com.qualcomm.qti.gaiaclient.repository.service.ServiceError.RequestError.Timeout INSTANCE = null;
            
            private Timeout() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\b"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceError$RequestError$Exception;", "Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceError$RequestError;", "exception", "", "(Ljava/lang/String;)V", "getException", "()Ljava/lang/String;", "toString", "app_debug"})
        public static final class Exception extends com.qualcomm.qti.gaiaclient.repository.service.ServiceError.RequestError {
            @org.jetbrains.annotations.NotNull
            private final java.lang.String exception = null;
            
            public Exception(@org.jetbrains.annotations.NotNull
            java.lang.String exception) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String getException() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceError$RequestError$Companion;", "", "()V", "valueOf", "Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceError;", "t", "", "app_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.qualcomm.qti.gaiaclient.repository.service.ServiceError valueOf(@org.jetbrains.annotations.Nullable
            java.lang.Throwable t) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0005\u0006\u0007\bB\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u0082\u0001\u0004\t\n\u000b\f\u00a8\u0006\r"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceError$ResponseError;", "Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceError;", "()V", "toString", "", "ApiError", "EmptyResponse", "HtmlError", "UnexpectedFormat", "Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceError$ResponseError$EmptyResponse;", "Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceError$ResponseError$UnexpectedFormat;", "Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceError$ResponseError$HtmlError;", "Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceError$ResponseError$ApiError;", "app_debug"})
    public static abstract class ResponseError extends com.qualcomm.qti.gaiaclient.repository.service.ServiceError {
        
        private ResponseError() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceError$ResponseError$EmptyResponse;", "Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceError$ResponseError;", "()V", "app_debug"})
        public static final class EmptyResponse extends com.qualcomm.qti.gaiaclient.repository.service.ServiceError.ResponseError {
            @org.jetbrains.annotations.NotNull
            public static final com.qualcomm.qti.gaiaclient.repository.service.ServiceError.ResponseError.EmptyResponse INSTANCE = null;
            
            private EmptyResponse() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceError$ResponseError$UnexpectedFormat;", "Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceError$ResponseError;", "()V", "app_debug"})
        public static final class UnexpectedFormat extends com.qualcomm.qti.gaiaclient.repository.service.ServiceError.ResponseError {
            @org.jetbrains.annotations.NotNull
            public static final com.qualcomm.qti.gaiaclient.repository.service.ServiceError.ResponseError.UnexpectedFormat INSTANCE = null;
            
            private UnexpectedFormat() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\u0005H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\f"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceError$ResponseError$HtmlError;", "Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceError$ResponseError;", "code", "", "content", "", "(ILjava/lang/String;)V", "getCode", "()I", "getContent", "()Ljava/lang/String;", "toString", "app_debug"})
        public static final class HtmlError extends com.qualcomm.qti.gaiaclient.repository.service.ServiceError.ResponseError {
            private final int code = 0;
            @org.jetbrains.annotations.NotNull
            private final java.lang.String content = null;
            
            public HtmlError(int code, @org.jetbrains.annotations.NotNull
            java.lang.String content) {
                super();
            }
            
            public final int getCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String getContent() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceError$ResponseError$ApiError;", "Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceError$ResponseError;", "error", "Lcom/qualcomm/qti/gaiaclient/repository/service/ApiErrorType;", "(Lcom/qualcomm/qti/gaiaclient/repository/service/ApiErrorType;)V", "getError", "()Lcom/qualcomm/qti/gaiaclient/repository/service/ApiErrorType;", "toString", "", "app_debug"})
        public static final class ApiError extends com.qualcomm.qti.gaiaclient.repository.service.ServiceError.ResponseError {
            @org.jetbrains.annotations.NotNull
            private final com.qualcomm.qti.gaiaclient.repository.service.ApiErrorType error = null;
            
            public ApiError(@org.jetbrains.annotations.NotNull
            com.qualcomm.qti.gaiaclient.repository.service.ApiErrorType error) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.qualcomm.qti.gaiaclient.repository.service.ApiErrorType getError() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
        }
    }
}