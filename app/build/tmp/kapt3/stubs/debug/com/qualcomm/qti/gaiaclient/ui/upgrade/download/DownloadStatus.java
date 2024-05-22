package com.qualcomm.qti.gaiaclient.ui.upgrade.download;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u001a\u001b\u001cBG\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\rR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011\u0082\u0001\u0003\u001d\u001e\u001f\u00a8\u0006 "}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/upgrade/download/DownloadStatus;", "", "title", "", "content", "success", "", "error", "actions", "Lcom/qualcomm/qti/gaiaclient/ui/upgrade/download/Actions;", "progress", "", "refs", "(Ljava/lang/String;Ljava/lang/String;ZZLcom/qualcomm/qti/gaiaclient/ui/upgrade/download/Actions;Ljava/lang/Integer;Ljava/lang/String;)V", "getActions", "()Lcom/qualcomm/qti/gaiaclient/ui/upgrade/download/Actions;", "getContent", "()Ljava/lang/String;", "getError", "()Z", "getProgress", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRefs", "getSuccess", "getTitle", "Complete", "Error", "Progress", "Lcom/qualcomm/qti/gaiaclient/ui/upgrade/download/DownloadStatus$Progress;", "Lcom/qualcomm/qti/gaiaclient/ui/upgrade/download/DownloadStatus$Complete;", "Lcom/qualcomm/qti/gaiaclient/ui/upgrade/download/DownloadStatus$Error;", "app_debug"})
public abstract class DownloadStatus {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String title = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String content = null;
    private final boolean success = false;
    private final boolean error = false;
    @org.jetbrains.annotations.NotNull
    private final com.qualcomm.qti.gaiaclient.ui.upgrade.download.Actions actions = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer progress = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String refs = null;
    
    private DownloadStatus(java.lang.String title, java.lang.String content, boolean success, boolean error, com.qualcomm.qti.gaiaclient.ui.upgrade.download.Actions actions, java.lang.Integer progress, java.lang.String refs) {
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
    
    public final boolean getSuccess() {
        return false;
    }
    
    public final boolean getError() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.qualcomm.qti.gaiaclient.ui.upgrade.download.Actions getActions() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getProgress() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getRefs() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/upgrade/download/DownloadStatus$Progress;", "Lcom/qualcomm/qti/gaiaclient/ui/upgrade/download/DownloadStatus;", "title", "", "progress", "", "(Ljava/lang/String;I)V", "app_debug"})
    public static final class Progress extends com.qualcomm.qti.gaiaclient.ui.upgrade.download.DownloadStatus {
        
        public Progress(@org.jetbrains.annotations.NotNull
        java.lang.String title, int progress) {
            super(null, null, false, false, null, null, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/upgrade/download/DownloadStatus$Complete;", "Lcom/qualcomm/qti/gaiaclient/ui/upgrade/download/DownloadStatus;", "context", "Landroid/content/Context;", "title", "", "(Landroid/content/Context;Ljava/lang/String;)V", "app_debug"})
    public static final class Complete extends com.qualcomm.qti.gaiaclient.ui.upgrade.download.DownloadStatus {
        
        public Complete(@org.jetbrains.annotations.NotNull
        android.content.Context context, @org.jetbrains.annotations.NotNull
        java.lang.String title) {
            super(null, null, false, false, null, null, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/upgrade/download/DownloadStatus$Error;", "Lcom/qualcomm/qti/gaiaclient/ui/upgrade/download/DownloadStatus;", "context", "Landroid/content/Context;", "title", "", "content", "refs", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "app_debug"})
    public static final class Error extends com.qualcomm.qti.gaiaclient.ui.upgrade.download.DownloadStatus {
        
        public Error(@org.jetbrains.annotations.NotNull
        android.content.Context context, @org.jetbrains.annotations.NotNull
        java.lang.String title, @org.jetbrains.annotations.NotNull
        java.lang.String content, @org.jetbrains.annotations.NotNull
        java.lang.String refs) {
            super(null, null, false, false, null, null, null);
        }
    }
}