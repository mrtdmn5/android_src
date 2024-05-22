package com.qualcomm.qti.gaiaclient.ui.settings.musicprocessing.plotting;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u001b\u001a\u00020\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004J\u0011\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\nH\u0086\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u00020\n8FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0012@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017\u00a8\u0006 "}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/settings/musicprocessing/plotting/EQFilterBank;", "", "()V", "bands", "", "Lcom/qualcomm/qti/gaiaclient/core/gaia/qtil/data/BandInfo;", "(Ljava/util/List;)V", "getBands", "()Ljava/util/List;", "count", "", "getCount", "()I", "setCount", "(I)V", "filters", "Lcom/qualcomm/qti/gaiaclient/ui/settings/musicprocessing/plotting/BiQuadFilter;", "newValue", "", "frequency", "getFrequency", "()D", "setFrequency", "(D)V", "pregain", "getPregain", "setPregain", "generateDbGainGraph", "Lcom/qualcomm/qti/gaiaclient/ui/settings/musicprocessing/plotting/GraphData;", "frequencies", "get", "idx", "app_debug"})
public final class EQFilterBank {
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.BandInfo> bands = null;
    private java.util.List<com.qualcomm.qti.gaiaclient.ui.settings.musicprocessing.plotting.BiQuadFilter> filters;
    private double frequency = 48000.0;
    private double pregain = 0.0;
    private int count = 0;
    
    public EQFilterBank(@org.jetbrains.annotations.NotNull
    java.util.List<? extends com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.BandInfo> bands) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.BandInfo> getBands() {
        return null;
    }
    
    public EQFilterBank() {
        super();
    }
    
    public final double getFrequency() {
        return 0.0;
    }
    
    public final void setFrequency(double newValue) {
    }
    
    public final double getPregain() {
        return 0.0;
    }
    
    public final void setPregain(double p0) {
    }
    
    public final void setCount(int p0) {
    }
    
    public final int getCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.qualcomm.qti.gaiaclient.ui.settings.musicprocessing.plotting.BiQuadFilter get(int idx) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.qualcomm.qti.gaiaclient.ui.settings.musicprocessing.plotting.GraphData generateDbGainGraph(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.Double> frequencies) {
        return null;
    }
}