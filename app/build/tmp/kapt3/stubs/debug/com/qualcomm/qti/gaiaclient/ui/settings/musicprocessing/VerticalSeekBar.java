package com.qualcomm.qti.gaiaclient.ui.settings.musicprocessing;

import java.lang.System;

@android.annotation.SuppressLint(value = {"RtlHardcoded"})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J\u0018\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\tH\u0014J(\u0010#\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020\t2\u0006\u0010%\u001a\u00020\t2\u0006\u0010&\u001a\u00020\t2\u0006\u0010\'\u001a\u00020\tH\u0014J\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0016J\u0012\u0010,\u001a\u00020\u001d2\b\u0010-\u001a\u0004\u0018\u00010\fH\u0016R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u000eX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000eX\u0082D\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0019\u00a8\u0006."}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/settings/musicprocessing/VerticalSeekBar;", "Landroidx/appcompat/widget/AppCompatSeekBar;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "changeListener", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "newGain", "", "gain", "getGain", "()D", "setGain", "(D)V", "maxGain", "minGain", "notches", "", "Lcom/qualcomm/qti/gaiaclient/ui/settings/musicprocessing/Notch;", "[Lcom/qualcomm/qti/gaiaclient/ui/settings/musicprocessing/Notch;", "getPercent", "", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onSizeChanged", "w", "h", "oldw", "oldh", "onTouchEvent", "", "event", "Landroid/view/MotionEvent;", "setOnSeekBarChangeListener", "newListener", "app_debug"})
public final class VerticalSeekBar extends androidx.appcompat.widget.AppCompatSeekBar {
    private android.widget.SeekBar.OnSeekBarChangeListener changeListener;
    private final double minGain = -12.0;
    private final double maxGain = 3.0;
    private final com.qualcomm.qti.gaiaclient.ui.settings.musicprocessing.Notch[] notches = null;
    
    public VerticalSeekBar(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null);
    }
    
    public VerticalSeekBar(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public VerticalSeekBar(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    public final void setGain(double newGain) {
    }
    
    public final double getGain() {
        return 0.0;
    }
    
    @java.lang.Override
    public void setOnSeekBarChangeListener(@org.jetbrains.annotations.Nullable
    android.widget.SeekBar.OnSeekBarChangeListener newListener) {
    }
    
    @java.lang.Override
    protected void onDraw(@org.jetbrains.annotations.Nullable
    android.graphics.Canvas canvas) {
    }
    
    @java.lang.Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
    }
    
    @java.lang.Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    }
    
    @java.lang.Override
    public boolean onTouchEvent(@org.jetbrains.annotations.NotNull
    android.view.MotionEvent event) {
        return false;
    }
    
    private final float getPercent(double gain) {
        return 0.0F;
    }
}