package com.qualcomm.qti.gaiaclient.repository.service.download;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \f2\u00020\u0001:\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013B\u0017\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\u0005H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0001\u0007\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u00a8\u0006\u001b"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/repository/service/download/DownloadFileError;", "Lcom/qualcomm/qti/gaiaclient/repository/service/ApiErrorType;", "status", "", "id", "", "(ILjava/lang/String;)V", "getId", "()Ljava/lang/String;", "getStatus", "()I", "toString", "Companion", "FileNotFound", "InvalidToken", "NoId", "NoToken", "ServerError", "ServiceNotAvailable", "UnidentifiedError", "Lcom/qualcomm/qti/gaiaclient/repository/service/download/DownloadFileError$NoToken;", "Lcom/qualcomm/qti/gaiaclient/repository/service/download/DownloadFileError$NoId;", "Lcom/qualcomm/qti/gaiaclient/repository/service/download/DownloadFileError$FileNotFound;", "Lcom/qualcomm/qti/gaiaclient/repository/service/download/DownloadFileError$InvalidToken;", "Lcom/qualcomm/qti/gaiaclient/repository/service/download/DownloadFileError$ServerError;", "Lcom/qualcomm/qti/gaiaclient/repository/service/download/DownloadFileError$ServiceNotAvailable;", "Lcom/qualcomm/qti/gaiaclient/repository/service/download/DownloadFileError$UnidentifiedError;", "app_debug"})
public abstract class DownloadFileError implements com.qualcomm.qti.gaiaclient.repository.service.ApiErrorType {
    private final int status = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String id = null;
    @org.jetbrains.annotations.NotNull
    public static final com.qualcomm.qti.gaiaclient.repository.service.download.DownloadFileError.Companion Companion = null;
    
    private DownloadFileError(int status, java.lang.String id) {
        super();
    }
    
    public final int getStatus() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * Error sent when no token was provided for the server to process the request.
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/repository/service/download/DownloadFileError$NoToken;", "Lcom/qualcomm/qti/gaiaclient/repository/service/download/DownloadFileError;", "()V", "app_debug"})
    public static final class NoToken extends com.qualcomm.qti.gaiaclient.repository.service.download.DownloadFileError {
        @org.jetbrains.annotations.NotNull
        public static final com.qualcomm.qti.gaiaclient.repository.service.download.DownloadFileError.NoToken INSTANCE = null;
        
        private NoToken() {
            super(0, null);
        }
    }
    
    /**
     * No id was provided for the server to identify the file to download.
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/repository/service/download/DownloadFileError$NoId;", "Lcom/qualcomm/qti/gaiaclient/repository/service/download/DownloadFileError;", "()V", "app_debug"})
    public static final class NoId extends com.qualcomm.qti.gaiaclient.repository.service.download.DownloadFileError {
        @org.jetbrains.annotations.NotNull
        public static final com.qualcomm.qti.gaiaclient.repository.service.download.DownloadFileError.NoId INSTANCE = null;
        
        private NoId() {
            super(0, null);
        }
    }
    
    /**
     * The file for the supplied ID cannot be found.
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/repository/service/download/DownloadFileError$FileNotFound;", "Lcom/qualcomm/qti/gaiaclient/repository/service/download/DownloadFileError;", "()V", "app_debug"})
    public static final class FileNotFound extends com.qualcomm.qti.gaiaclient.repository.service.download.DownloadFileError {
        @org.jetbrains.annotations.NotNull
        public static final com.qualcomm.qti.gaiaclient.repository.service.download.DownloadFileError.FileNotFound INSTANCE = null;
        
        private FileNotFound() {
            super(0, null);
        }
    }
    
    /**
     * Error sent when the provided token for the server to process the request is invalid.
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/repository/service/download/DownloadFileError$InvalidToken;", "Lcom/qualcomm/qti/gaiaclient/repository/service/download/DownloadFileError;", "()V", "app_debug"})
    public static final class InvalidToken extends com.qualcomm.qti.gaiaclient.repository.service.download.DownloadFileError {
        @org.jetbrains.annotations.NotNull
        public static final com.qualcomm.qti.gaiaclient.repository.service.download.DownloadFileError.InvalidToken INSTANCE = null;
        
        private InvalidToken() {
            super(0, null);
        }
    }
    
    /**
     * Error sent when The server encountered a problem.
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/repository/service/download/DownloadFileError$ServerError;", "Lcom/qualcomm/qti/gaiaclient/repository/service/download/DownloadFileError;", "()V", "app_debug"})
    public static final class ServerError extends com.qualcomm.qti.gaiaclient.repository.service.download.DownloadFileError {
        @org.jetbrains.annotations.NotNull
        public static final com.qualcomm.qti.gaiaclient.repository.service.download.DownloadFileError.ServerError INSTANCE = null;
        
        private ServerError() {
            super(0, null);
        }
    }
    
    /**
     * Error sent when Server cannot access the resource.
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/repository/service/download/DownloadFileError$ServiceNotAvailable;", "Lcom/qualcomm/qti/gaiaclient/repository/service/download/DownloadFileError;", "()V", "app_debug"})
    public static final class ServiceNotAvailable extends com.qualcomm.qti.gaiaclient.repository.service.download.DownloadFileError {
        @org.jetbrains.annotations.NotNull
        public static final com.qualcomm.qti.gaiaclient.repository.service.download.DownloadFileError.ServiceNotAvailable INSTANCE = null;
        
        private ServiceNotAvailable() {
            super(0, null);
        }
    }
    
    /**
     * Used when the error sent by the server cannot be identified.
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/repository/service/download/DownloadFileError$UnidentifiedError;", "Lcom/qualcomm/qti/gaiaclient/repository/service/download/DownloadFileError;", "error", "Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceErrorResponse;", "(Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceErrorResponse;)V", "getError", "()Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceErrorResponse;", "toString", "", "app_debug"})
    public static final class UnidentifiedError extends com.qualcomm.qti.gaiaclient.repository.service.download.DownloadFileError {
        @org.jetbrains.annotations.NotNull
        private final com.qualcomm.qti.gaiaclient.repository.service.ServiceErrorResponse error = null;
        
        public UnidentifiedError(@org.jetbrains.annotations.NotNull
        com.qualcomm.qti.gaiaclient.repository.service.ServiceErrorResponse error) {
            super(0, null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.qualcomm.qti.gaiaclient.repository.service.ServiceErrorResponse getError() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/repository/service/download/DownloadFileError$Companion;", "", "()V", "valueOf", "Lcom/qualcomm/qti/gaiaclient/repository/service/download/DownloadFileError;", "error", "Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceErrorResponse;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.qualcomm.qti.gaiaclient.repository.service.download.DownloadFileError valueOf(@org.jetbrains.annotations.NotNull
        com.qualcomm.qti.gaiaclient.repository.service.ServiceErrorResponse error) {
            return null;
        }
    }
}