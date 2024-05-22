package com.qualcomm.qti.gaiaclient.repository.service.feedback;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \f2\u00020\u0001:\u0007\f\r\u000e\u000f\u0010\u0011\u0012B\u0017\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\u0005H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0001\u0006\u0013\u0014\u0015\u0016\u0017\u0018\u00a8\u0006\u0019"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/repository/service/feedback/FeedbackError;", "Lcom/qualcomm/qti/gaiaclient/repository/service/ApiErrorType;", "status", "", "id", "", "(ILjava/lang/String;)V", "getId", "()Ljava/lang/String;", "getStatus", "()I", "toString", "Companion", "InvalidToken", "NoFeedback", "NoToken", "ServerError", "TrackingSystemUnavailable", "UnidentifiedError", "Lcom/qualcomm/qti/gaiaclient/repository/service/feedback/FeedbackError$NoToken;", "Lcom/qualcomm/qti/gaiaclient/repository/service/feedback/FeedbackError$NoFeedback;", "Lcom/qualcomm/qti/gaiaclient/repository/service/feedback/FeedbackError$InvalidToken;", "Lcom/qualcomm/qti/gaiaclient/repository/service/feedback/FeedbackError$ServerError;", "Lcom/qualcomm/qti/gaiaclient/repository/service/feedback/FeedbackError$TrackingSystemUnavailable;", "Lcom/qualcomm/qti/gaiaclient/repository/service/feedback/FeedbackError$UnidentifiedError;", "app_debug"})
public abstract class FeedbackError implements com.qualcomm.qti.gaiaclient.repository.service.ApiErrorType {
    private final int status = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String id = null;
    @org.jetbrains.annotations.NotNull
    public static final com.qualcomm.qti.gaiaclient.repository.service.feedback.FeedbackError.Companion Companion = null;
    
    private FeedbackError(int status, java.lang.String id) {
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
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/repository/service/feedback/FeedbackError$NoToken;", "Lcom/qualcomm/qti/gaiaclient/repository/service/feedback/FeedbackError;", "()V", "app_debug"})
    public static final class NoToken extends com.qualcomm.qti.gaiaclient.repository.service.feedback.FeedbackError {
        @org.jetbrains.annotations.NotNull
        public static final com.qualcomm.qti.gaiaclient.repository.service.feedback.FeedbackError.NoToken INSTANCE = null;
        
        private NoToken() {
            super(0, null);
        }
    }
    
    /**
     * Error sent when the request did not provide a feedback title or a description.
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/repository/service/feedback/FeedbackError$NoFeedback;", "Lcom/qualcomm/qti/gaiaclient/repository/service/feedback/FeedbackError;", "()V", "app_debug"})
    public static final class NoFeedback extends com.qualcomm.qti.gaiaclient.repository.service.feedback.FeedbackError {
        @org.jetbrains.annotations.NotNull
        public static final com.qualcomm.qti.gaiaclient.repository.service.feedback.FeedbackError.NoFeedback INSTANCE = null;
        
        private NoFeedback() {
            super(0, null);
        }
    }
    
    /**
     * Error sent when the provided token for the server to process the request is invalid.
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/repository/service/feedback/FeedbackError$InvalidToken;", "Lcom/qualcomm/qti/gaiaclient/repository/service/feedback/FeedbackError;", "()V", "app_debug"})
    public static final class InvalidToken extends com.qualcomm.qti.gaiaclient.repository.service.feedback.FeedbackError {
        @org.jetbrains.annotations.NotNull
        public static final com.qualcomm.qti.gaiaclient.repository.service.feedback.FeedbackError.InvalidToken INSTANCE = null;
        
        private InvalidToken() {
            super(0, null);
        }
    }
    
    /**
     * Error sent when the server encountered a problem.
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/repository/service/feedback/FeedbackError$ServerError;", "Lcom/qualcomm/qti/gaiaclient/repository/service/feedback/FeedbackError;", "()V", "app_debug"})
    public static final class ServerError extends com.qualcomm.qti.gaiaclient.repository.service.feedback.FeedbackError {
        @org.jetbrains.annotations.NotNull
        public static final com.qualcomm.qti.gaiaclient.repository.service.feedback.FeedbackError.ServerError INSTANCE = null;
        
        private ServerError() {
            super(0, null);
        }
    }
    
    /**
     * Error sent when the server could not reach the tracking system to create a ticket.
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/repository/service/feedback/FeedbackError$TrackingSystemUnavailable;", "Lcom/qualcomm/qti/gaiaclient/repository/service/feedback/FeedbackError;", "()V", "app_debug"})
    public static final class TrackingSystemUnavailable extends com.qualcomm.qti.gaiaclient.repository.service.feedback.FeedbackError {
        @org.jetbrains.annotations.NotNull
        public static final com.qualcomm.qti.gaiaclient.repository.service.feedback.FeedbackError.TrackingSystemUnavailable INSTANCE = null;
        
        private TrackingSystemUnavailable() {
            super(0, null);
        }
    }
    
    /**
     * Used when the error sent by the server cannot be identified.
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/repository/service/feedback/FeedbackError$UnidentifiedError;", "Lcom/qualcomm/qti/gaiaclient/repository/service/feedback/FeedbackError;", "error", "Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceErrorResponse;", "(Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceErrorResponse;)V", "getError", "()Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceErrorResponse;", "toString", "", "app_debug"})
    public static final class UnidentifiedError extends com.qualcomm.qti.gaiaclient.repository.service.feedback.FeedbackError {
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
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/repository/service/feedback/FeedbackError$Companion;", "", "()V", "valueOf", "Lcom/qualcomm/qti/gaiaclient/repository/service/feedback/FeedbackError;", "error", "Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceErrorResponse;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.qualcomm.qti.gaiaclient.repository.service.feedback.FeedbackError valueOf(@org.jetbrains.annotations.NotNull
        com.qualcomm.qti.gaiaclient.repository.service.ServiceErrorResponse error) {
            return null;
        }
    }
}