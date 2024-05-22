package com.qualcomm.qti.gaiaclient.ui.settings.musicprocessing.plotting;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001:\u00012B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\u001fH\u0002J\b\u0010!\u001a\u00020\u001fH\u0002J\b\u0010\"\u001a\u00020\u001fH\u0002J\u000e\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0007J\u000e\u0010&\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u0007J\b\u0010\'\u001a\u00020\u001fH\u0002J\b\u0010(\u001a\u00020\u001fH\u0002J\b\u0010)\u001a\u00020\u001fH\u0002J\b\u0010*\u001a\u00020\u001fH\u0002J\b\u0010+\u001a\u00020\u001fH\u0002J\b\u0010,\u001a\u00020\u001fH\u0002J\b\u0010-\u001a\u00020\u001fH\u0002J\b\u0010.\u001a\u00020\u001fH\u0002J\b\u0010/\u001a\u00020\u001fH\u0002J\b\u00100\u001a\u00020\u001fH\u0002J\b\u00101\u001a\u00020\u001fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\r@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0014\u0010\n\"\u0004\b\u0015\u0010\fR$\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\n\"\u0004\b\u0018\u0010\fR\u000e\u0010\u0019\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\n\"\u0004\b\u001d\u0010\f\u00a8\u00063"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/settings/musicprocessing/plotting/BiQuadFilter;", "", "()V", "coeffsA", "Lcom/qualcomm/qti/gaiaclient/ui/settings/musicprocessing/plotting/BiQuadFilter$Coefficients;", "coeffsB", "value", "", "fc", "getFc", "()D", "setFc", "(D)V", "Lcom/qualcomm/qti/gaiaclient/core/gaia/qtil/data/Filter;", "filterType", "getFilterType", "()Lcom/qualcomm/qti/gaiaclient/core/gaia/qtil/data/Filter;", "setFilterType", "(Lcom/qualcomm/qti/gaiaclient/core/gaia/qtil/data/Filter;)V", "fs", "getFs", "setFs", "gain", "getGain", "setGain", "m_fc", "m_fs", "q", "getQ", "setQ", "calcAllPassBiQuad", "", "calcAllPassBilinear", "calcBypassFilter", "calcCoeffs", "calcComplexGain", "Lcom/qualcomm/qti/gaiaclient/ui/settings/musicprocessing/plotting/ComplexNumber;", "freq", "calcDbGain", "calcHighPassBiQuad", "calcHighPassBilinear", "calcHighShelfBiQuad", "calcHighShelfBilinear", "calcLowPassBiQuad", "calcLowPassBilinear", "calcLowShelfBiQuad", "calcLowShelfBilinear", "calcParametric", "calcTiltBiQuad", "calcTiltBilinear", "Coefficients", "app_debug"})
public final class BiQuadFilter {
    private com.qualcomm.qti.gaiaclient.ui.settings.musicprocessing.plotting.BiQuadFilter.Coefficients coeffsA;
    private com.qualcomm.qti.gaiaclient.ui.settings.musicprocessing.plotting.BiQuadFilter.Coefficients coeffsB;
    private double m_fc = 48000.0;
    private double m_fs = 48000.0;
    private double gain = 1.0;
    private double q = 0.7;
    @org.jetbrains.annotations.NotNull
    private com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.Filter filterType = com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.Filter.BYPASS;
    
    public BiQuadFilter() {
        super();
    }
    
    public final double getFc() {
        return 0.0;
    }
    
    public final void setFc(double value) {
    }
    
    public final double getFs() {
        return 0.0;
    }
    
    public final void setFs(double value) {
    }
    
    public final double getGain() {
        return 0.0;
    }
    
    public final void setGain(double value) {
    }
    
    public final double getQ() {
        return 0.0;
    }
    
    public final void setQ(double value) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.Filter getFilterType() {
        return null;
    }
    
    public final void setFilterType(@org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.Filter value) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.qualcomm.qti.gaiaclient.ui.settings.musicprocessing.plotting.ComplexNumber calcComplexGain(double freq) {
        return null;
    }
    
    public final double calcDbGain(double freq) {
        return 0.0;
    }
    
    private final void calcCoeffs() {
    }
    
    private final void calcBypassFilter() {
    }
    
    private final void calcLowPassBilinear() {
    }
    
    private final void calcHighPassBilinear() {
    }
    
    private final void calcAllPassBilinear() {
    }
    
    private final void calcLowShelfBilinear() {
    }
    
    private final void calcHighShelfBilinear() {
    }
    
    private final void calcTiltBilinear() {
    }
    
    private final void calcLowPassBiQuad() {
    }
    
    private final void calcHighPassBiQuad() {
    }
    
    private final void calcAllPassBiQuad() {
    }
    
    private final void calcLowShelfBiQuad() {
    }
    
    private final void calcHighShelfBiQuad() {
    }
    
    private final void calcTiltBiQuad() {
    }
    
    private final void calcParametric() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0004H\u00c6\u0003J\'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004H\u00c6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t\u00a8\u0006\u0017"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/settings/musicprocessing/plotting/BiQuadFilter$Coefficients;", "", "()V", "first", "", "second", "third", "(DDD)V", "getFirst", "()D", "getSecond", "getThird", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
    static final class Coefficients {
        private final double first = 0.0;
        private final double second = 0.0;
        private final double third = 0.0;
        
        @org.jetbrains.annotations.NotNull
        public final com.qualcomm.qti.gaiaclient.ui.settings.musicprocessing.plotting.BiQuadFilter.Coefficients copy(double first, double second, double third) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public Coefficients(double first, double second, double third) {
            super();
        }
        
        public final double component1() {
            return 0.0;
        }
        
        public final double getFirst() {
            return 0.0;
        }
        
        public final double component2() {
            return 0.0;
        }
        
        public final double getSecond() {
            return 0.0;
        }
        
        public final double component3() {
            return 0.0;
        }
        
        public final double getThird() {
            return 0.0;
        }
        
        public Coefficients() {
            super();
        }
    }
}