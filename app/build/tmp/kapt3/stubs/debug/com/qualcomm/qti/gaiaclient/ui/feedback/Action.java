package com.qualcomm.qti.gaiaclient.ui.feedback;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u000f\u0010\u0011\u0012B\u0019\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u0082\u0001\u0004\u0013\u0014\u0015\u0016\u00a8\u0006\u0017"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/feedback/Action;", "", "context", "Landroid/content/Context;", "labelId", "", "(Landroid/content/Context;I)V", "getContext", "()Landroid/content/Context;", "label", "", "getLabel", "()Ljava/lang/String;", "getLabelId", "()I", "CopyFeedback", "CopyLink", "Done", "TryAgain", "Lcom/qualcomm/qti/gaiaclient/ui/feedback/Action$CopyLink;", "Lcom/qualcomm/qti/gaiaclient/ui/feedback/Action$CopyFeedback;", "Lcom/qualcomm/qti/gaiaclient/ui/feedback/Action$Done;", "Lcom/qualcomm/qti/gaiaclient/ui/feedback/Action$TryAgain;", "app_debug"})
public abstract class Action {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    private final int labelId = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String label = null;
    
    private Action(android.content.Context context, @androidx.annotation.StringRes
    int labelId) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.Context getContext() {
        return null;
    }
    
    public final int getLabelId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLabel() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/feedback/Action$CopyLink;", "Lcom/qualcomm/qti/gaiaclient/ui/feedback/Action;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "app_debug"})
    public static final class CopyLink extends com.qualcomm.qti.gaiaclient.ui.feedback.Action {
        
        public CopyLink(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            super(null, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/feedback/Action$CopyFeedback;", "Lcom/qualcomm/qti/gaiaclient/ui/feedback/Action;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "app_debug"})
    public static final class CopyFeedback extends com.qualcomm.qti.gaiaclient.ui.feedback.Action {
        
        public CopyFeedback(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            super(null, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/feedback/Action$Done;", "Lcom/qualcomm/qti/gaiaclient/ui/feedback/Action;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "app_debug"})
    public static final class Done extends com.qualcomm.qti.gaiaclient.ui.feedback.Action {
        
        public Done(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            super(null, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/feedback/Action$TryAgain;", "Lcom/qualcomm/qti/gaiaclient/ui/feedback/Action;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "app_debug"})
    public static final class TryAgain extends com.qualcomm.qti.gaiaclient.ui.feedback.Action {
        
        public TryAgain(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            super(null, 0);
        }
    }
}