package com.qualcomm.qti.gaiaclient.ui.upgrade.tags;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \r2\u00020\u0001:\u0004\r\u000e\u000f\u0010B#\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t\u0082\u0001\u0003\u0011\u0012\u0013\u00a8\u0006\u0014"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/upgrade/tags/Tag;", "", "id", "", "backgroundColor", "", "textColor", "(Ljava/lang/String;II)V", "getBackgroundColor", "()I", "getId", "()Ljava/lang/String;", "getTextColor", "Companion", "Other", "T1", "T2", "Lcom/qualcomm/qti/gaiaclient/ui/upgrade/tags/Tag$T1;", "Lcom/qualcomm/qti/gaiaclient/ui/upgrade/tags/Tag$T2;", "Lcom/qualcomm/qti/gaiaclient/ui/upgrade/tags/Tag$Other;", "app_debug"})
public abstract class Tag {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String id = null;
    private final int backgroundColor = 0;
    private final int textColor = 0;
    @org.jetbrains.annotations.NotNull
    public static final com.qualcomm.qti.gaiaclient.ui.upgrade.tags.Tag.Companion Companion = null;
    
    private Tag(java.lang.String id, @androidx.annotation.ColorRes
    int backgroundColor, @androidx.annotation.ColorRes
    int textColor) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getId() {
        return null;
    }
    
    public final int getBackgroundColor() {
        return 0;
    }
    
    public final int getTextColor() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/upgrade/tags/Tag$T1;", "Lcom/qualcomm/qti/gaiaclient/ui/upgrade/tags/Tag;", "()V", "app_debug"})
    public static final class T1 extends com.qualcomm.qti.gaiaclient.ui.upgrade.tags.Tag {
        @org.jetbrains.annotations.NotNull
        public static final com.qualcomm.qti.gaiaclient.ui.upgrade.tags.Tag.T1 INSTANCE = null;
        
        private T1() {
            super(null, 0, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/upgrade/tags/Tag$T2;", "Lcom/qualcomm/qti/gaiaclient/ui/upgrade/tags/Tag;", "()V", "app_debug"})
    public static final class T2 extends com.qualcomm.qti.gaiaclient.ui.upgrade.tags.Tag {
        @org.jetbrains.annotations.NotNull
        public static final com.qualcomm.qti.gaiaclient.ui.upgrade.tags.Tag.T2 INSTANCE = null;
        
        private T2() {
            super(null, 0, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/upgrade/tags/Tag$Other;", "Lcom/qualcomm/qti/gaiaclient/ui/upgrade/tags/Tag;", "tag", "", "(Ljava/lang/String;)V", "app_debug"})
    public static final class Other extends com.qualcomm.qti.gaiaclient.ui.upgrade.tags.Tag {
        
        public Other(@org.jetbrains.annotations.NotNull
        java.lang.String tag) {
            super(null, 0, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006J\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\f\u00a8\u0006\r"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/upgrade/tags/Tag$Companion;", "", "()V", "entries", "Landroidx/core/util/Pair;", "", "", "valueOf", "Lcom/qualcomm/qti/gaiaclient/ui/upgrade/tags/Tag;", "tag", "valuesFrom", "values", "([Ljava/lang/String;)[Lcom/qualcomm/qti/gaiaclient/ui/upgrade/tags/Tag;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.qualcomm.qti.gaiaclient.ui.upgrade.tags.Tag valueOf(@org.jetbrains.annotations.NotNull
        java.lang.String tag) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.qualcomm.qti.gaiaclient.ui.upgrade.tags.Tag[] valuesFrom(@org.jetbrains.annotations.NotNull
        java.lang.String[] values) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.core.util.Pair<java.lang.String[], java.lang.String[]> entries() {
            return null;
        }
    }
}