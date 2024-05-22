package com.qualcomm.qti.gaiaclient.ui.settings.musicprocessing;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0003H\u0017J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0003H\u0016J\u0012\u0010\u0016\u001a\u00020\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u000e\u00a8\u0006\u001a"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/settings/musicprocessing/NotchDrawable;", "Landroid/graphics/drawable/Drawable;", "backgroundColor", "", "notchColor", "notches", "", "Lcom/qualcomm/qti/gaiaclient/ui/settings/musicprocessing/Notch;", "density", "", "(II[Lcom/qualcomm/qti/gaiaclient/ui/settings/musicprocessing/Notch;F)V", "backgroundPaint", "Landroid/graphics/Paint;", "notchPaint", "[Lcom/qualcomm/qti/gaiaclient/ui/settings/musicprocessing/Notch;", "draw", "", "canvas", "Landroid/graphics/Canvas;", "getOpacity", "setAlpha", "alpha", "setColorFilter", "colorFilter", "Landroid/graphics/ColorFilter;", "Companion", "app_debug"})
public final class NotchDrawable extends android.graphics.drawable.Drawable {
    private final com.qualcomm.qti.gaiaclient.ui.settings.musicprocessing.Notch[] notches = null;
    private final float density = 0.0F;
    private android.graphics.Paint backgroundPaint;
    private android.graphics.Paint notchPaint;
    @org.jetbrains.annotations.NotNull
    public static final com.qualcomm.qti.gaiaclient.ui.settings.musicprocessing.NotchDrawable.Companion Companion = null;
    public static final int PROGRESS_THICKNESS_DP = 6;
    
    public NotchDrawable(int backgroundColor, int notchColor, @org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.ui.settings.musicprocessing.Notch[] notches, float density) {
        super();
    }
    
    @java.lang.Override
    public void draw(@org.jetbrains.annotations.NotNull
    android.graphics.Canvas canvas) {
    }
    
    @java.lang.Override
    public void setAlpha(int alpha) {
    }
    
    @java.lang.Override
    public void setColorFilter(@org.jetbrains.annotations.Nullable
    android.graphics.ColorFilter colorFilter) {
    }
    
    @kotlin.Suppress(names = {"OverrideDeprecatedMigration"})
    @java.lang.Override
    @java.lang.Deprecated
    public int getOpacity() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/settings/musicprocessing/NotchDrawable$Companion;", "", "()V", "PROGRESS_THICKNESS_DP", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}