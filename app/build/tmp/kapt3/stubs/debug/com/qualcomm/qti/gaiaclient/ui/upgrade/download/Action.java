package com.qualcomm.qti.gaiaclient.ui.upgrade.download;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\r\u000eB\u0019\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u0082\u0001\u0002\u000f\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/upgrade/download/Action;", "", "context", "Landroid/content/Context;", "labelId", "", "(Landroid/content/Context;I)V", "label", "", "getLabel", "()Ljava/lang/String;", "getLabelId", "()I", "StartUpgrade", "TryAgain", "Lcom/qualcomm/qti/gaiaclient/ui/upgrade/download/Action$StartUpgrade;", "Lcom/qualcomm/qti/gaiaclient/ui/upgrade/download/Action$TryAgain;", "app_debug"})
public abstract class Action {
    private final int labelId = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String label = null;
    
    private Action(android.content.Context context, @androidx.annotation.StringRes
    int labelId) {
        super();
    }
    
    public final int getLabelId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLabel() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/upgrade/download/Action$StartUpgrade;", "Lcom/qualcomm/qti/gaiaclient/ui/upgrade/download/Action;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "app_debug"})
    public static final class StartUpgrade extends com.qualcomm.qti.gaiaclient.ui.upgrade.download.Action {
        
        public StartUpgrade(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            super(null, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/upgrade/download/Action$TryAgain;", "Lcom/qualcomm/qti/gaiaclient/ui/upgrade/download/Action;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "app_debug"})
    public static final class TryAgain extends com.qualcomm.qti.gaiaclient.ui.upgrade.download.Action {
        
        public TryAgain(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            super(null, 0);
        }
    }
}