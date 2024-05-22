package com.qualcomm.qti.gaiaclient.ui.settings.musicprocessing.plotting;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\"\u0010!\u001a\u00020\u001e2\u0010\u0010\"\u001a\f\u0012\u0004\u0012\u00020$0#j\u0002`%2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0012\u0010&\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002J\u0010\u0010\'\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0012\u0010(\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0014J(\u0010)\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u00072\u0006\u0010-\u001a\u00020\u0007H\u0014J\u0010\u0010.\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\b\u0010/\u001a\u00020\u001eH\u0002J\u0010\u00100\u001a\u0002012\u0006\u00102\u001a\u00020$H\u0002R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082D\u00a2\u0006\u0002\n\u0000R$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0007X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\fX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\fX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\fX\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u00063"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/settings/musicprocessing/plotting/GraphView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "currentHeight", "currentWidth", "dbMaxMin", "", "endFrequency", "newValue", "Lcom/qualcomm/qti/gaiaclient/ui/settings/musicprocessing/plotting/EQFilterBank;", "filterBank", "getFilterBank", "()Lcom/qualcomm/qti/gaiaclient/ui/settings/musicprocessing/plotting/EQFilterBank;", "setFilterBank", "(Lcom/qualcomm/qti/gaiaclient/ui/settings/musicprocessing/plotting/EQFilterBank;)V", "graphData", "Lcom/qualcomm/qti/gaiaclient/ui/settings/musicprocessing/plotting/GraphData;", "marginInset", "paints", "", "startFrequency", "yMax", "yMin", "drawAxesLabels", "", "canvas", "Landroid/graphics/Canvas;", "drawCurve", "curve", "", "Lcom/qualcomm/qti/gaiaclient/ui/settings/musicprocessing/plotting/GraphPoint;", "Lcom/qualcomm/qti/gaiaclient/ui/settings/musicprocessing/plotting/GraphCurve;", "drawGraph", "drawScale", "onDraw", "onSizeChanged", "w", "h", "oldw", "oldh", "plotPoints", "recalculate", "screenPoint", "Landroid/graphics/PointF;", "graphPoint", "app_debug"})
public final class GraphView extends android.view.View {
    
    /**
     * Definition of the styles for the different elements to be drawn for this GraphView.
     */
    private final java.lang.Object paints = null;
    private final double dbMaxMin = 12.0;
    private final double startFrequency = 20.0;
    private final double endFrequency = 20000.0;
    private final int marginInset = 40;
    private final double yMin = -18.0;
    private final double yMax = 12.0;
    private int currentWidth = 0;
    private int currentHeight = 0;
    private com.qualcomm.qti.gaiaclient.ui.settings.musicprocessing.plotting.GraphData graphData;
    @org.jetbrains.annotations.NotNull
    private com.qualcomm.qti.gaiaclient.ui.settings.musicprocessing.plotting.EQFilterBank filterBank;
    
    @kotlin.jvm.JvmOverloads
    public GraphView(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public GraphView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public GraphView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.qualcomm.qti.gaiaclient.ui.settings.musicprocessing.plotting.EQFilterBank getFilterBank() {
        return null;
    }
    
    public final void setFilterBank(@org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.ui.settings.musicprocessing.plotting.EQFilterBank newValue) {
    }
    
    @java.lang.Override
    protected void onDraw(@org.jetbrains.annotations.Nullable
    android.graphics.Canvas canvas) {
    }
    
    @java.lang.Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
    }
    
    private final void recalculate() {
    }
    
    private final void drawGraph(android.graphics.Canvas canvas) {
    }
    
    private final void drawScale(android.graphics.Canvas canvas) {
    }
    
    private final void drawAxesLabels(android.graphics.Canvas canvas) {
    }
    
    private final android.graphics.PointF screenPoint(com.qualcomm.qti.gaiaclient.ui.settings.musicprocessing.plotting.GraphPoint graphPoint) {
        return null;
    }
    
    private final void drawCurve(java.util.List<com.qualcomm.qti.gaiaclient.ui.settings.musicprocessing.plotting.GraphPoint> curve, android.graphics.Canvas canvas) {
    }
    
    private final void plotPoints(android.graphics.Canvas canvas) {
    }
}