package com.qualcomm.qti.gaiaclient.ui.feedback;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0017\u0018\u0019BC\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\fR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010\u0082\u0001\u0003\u001a\u001b\u001c\u00a8\u0006\u001d"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/feedback/FeedbackStatus;", "", "title", "", "content", "progress", "", "success", "error", "actions", "Lcom/qualcomm/qti/gaiaclient/ui/feedback/Actions;", "refs", "(Ljava/lang/String;Ljava/lang/String;ZZZLcom/qualcomm/qti/gaiaclient/ui/feedback/Actions;Ljava/lang/String;)V", "getActions", "()Lcom/qualcomm/qti/gaiaclient/ui/feedback/Actions;", "getContent", "()Ljava/lang/String;", "getError", "()Z", "getProgress", "getRefs", "getSuccess", "getTitle", "Complete", "Error", "Progress", "Lcom/qualcomm/qti/gaiaclient/ui/feedback/FeedbackStatus$Progress;", "Lcom/qualcomm/qti/gaiaclient/ui/feedback/FeedbackStatus$Complete;", "Lcom/qualcomm/qti/gaiaclient/ui/feedback/FeedbackStatus$Error;", "app_debug"})
public abstract class FeedbackStatus {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String title = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String content = null;
    private final boolean progress = false;
    private final boolean success = false;
    private final boolean error = false;
    @org.jetbrains.annotations.NotNull
    private final com.qualcomm.qti.gaiaclient.ui.feedback.Actions actions = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String refs = null;
    
    private FeedbackStatus(java.lang.String title, java.lang.String content, boolean progress, boolean success, boolean error, com.qualcomm.qti.gaiaclient.ui.feedback.Actions actions, java.lang.String refs) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getContent() {
        return null;
    }
    
    public final boolean getProgress() {
        return false;
    }
    
    public final boolean getSuccess() {
        return false;
    }
    
    public final boolean getError() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.qualcomm.qti.gaiaclient.ui.feedback.Actions getActions() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getRefs() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/feedback/FeedbackStatus$Progress;", "Lcom/qualcomm/qti/gaiaclient/ui/feedback/FeedbackStatus;", "title", "", "(Ljava/lang/String;)V", "app_debug"})
    public static final class Progress extends com.qualcomm.qti.gaiaclient.ui.feedback.FeedbackStatus {
        
        public Progress(@org.jetbrains.annotations.NotNull
        java.lang.String title) {
            super(null, null, false, false, false, null, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/feedback/FeedbackStatus$Complete;", "Lcom/qualcomm/qti/gaiaclient/ui/feedback/FeedbackStatus;", "context", "Landroid/content/Context;", "issue", "Lcom/qualcomm/qti/gaiaclient/repository/service/feedback/Issue;", "(Landroid/content/Context;Lcom/qualcomm/qti/gaiaclient/repository/service/feedback/Issue;)V", "app_debug"})
    public static final class Complete extends com.qualcomm.qti.gaiaclient.ui.feedback.FeedbackStatus {
        
        public Complete(@org.jetbrains.annotations.NotNull
        android.content.Context context, @org.jetbrains.annotations.NotNull
        com.qualcomm.qti.gaiaclient.repository.service.feedback.Issue issue) {
            super(null, null, false, false, false, null, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/feedback/FeedbackStatus$Error;", "Lcom/qualcomm/qti/gaiaclient/ui/feedback/FeedbackStatus;", "context", "Landroid/content/Context;", "title", "", "content", "refs", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "app_debug"})
    public static final class Error extends com.qualcomm.qti.gaiaclient.ui.feedback.FeedbackStatus {
        
        public Error(@org.jetbrains.annotations.NotNull
        android.content.Context context, @org.jetbrains.annotations.NotNull
        java.lang.String title, @org.jetbrains.annotations.NotNull
        java.lang.String content, @org.jetbrains.annotations.NotNull
        java.lang.String refs) {
            super(null, null, false, false, false, null, null);
        }
    }
}