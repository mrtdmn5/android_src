package com.qualcomm.qti.gaiaclient.ui.settings.audiocuration.demo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007B#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nB+\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u00a2\u0006\u0002\u0010\fJ\u0010\u0010)\u001a\u00020$2\u0006\u0010*\u001a\u00020+H\u0016R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0014@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR5\u0010\u001f\u001a\u001d\u0012\u0013\u0012\u00110\t\u00a2\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020$0 X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(\u00a8\u0006,"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/settings/audiocuration/demo/SliderPreference;", "Landroidx/preference/Preference;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "binding", "Lcom/qualcomm/qti/gaiaclient/databinding/PreferenceSliderBinding;", "getBinding", "()Lcom/qualcomm/qti/gaiaclient/databinding/PreferenceSliderBinding;", "setBinding", "(Lcom/qualcomm/qti/gaiaclient/databinding/PreferenceSliderBinding;)V", "value", "Lcom/qualcomm/qti/gaiaclient/ui/settings/audiocuration/demo/SliderViewData;", "data", "getData", "()Lcom/qualcomm/qti/gaiaclient/ui/settings/audiocuration/demo/SliderViewData;", "setData", "(Lcom/qualcomm/qti/gaiaclient/ui/settings/audiocuration/demo/SliderViewData;)V", "max", "getMax", "()I", "setMax", "(I)V", "onProgressChanged", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "progress", "", "getOnProgressChanged", "()Lkotlin/jvm/functions/Function1;", "setOnProgressChanged", "(Lkotlin/jvm/functions/Function1;)V", "onBindViewHolder", "holder", "Landroidx/preference/PreferenceViewHolder;", "app_debug"})
public final class SliderPreference extends androidx.preference.Preference {
    @org.jetbrains.annotations.Nullable
    private com.qualcomm.qti.gaiaclient.databinding.PreferenceSliderBinding binding;
    @org.jetbrains.annotations.NotNull
    private kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onProgressChanged;
    @org.jetbrains.annotations.NotNull
    private com.qualcomm.qti.gaiaclient.ui.settings.audiocuration.demo.SliderViewData data;
    private int max = 100;
    
    @org.jetbrains.annotations.Nullable
    public final com.qualcomm.qti.gaiaclient.databinding.PreferenceSliderBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.Nullable
    com.qualcomm.qti.gaiaclient.databinding.PreferenceSliderBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> getOnProgressChanged() {
        return null;
    }
    
    public final void setOnProgressChanged(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.qualcomm.qti.gaiaclient.ui.settings.audiocuration.demo.SliderViewData getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.ui.settings.audiocuration.demo.SliderViewData value) {
    }
    
    public final int getMax() {
        return 0;
    }
    
    public final void setMax(int value) {
    }
    
    public SliderPreference(@org.jetbrains.annotations.Nullable
    android.content.Context context) {
        super(null, null, 0, 0);
    }
    
    public SliderPreference(@org.jetbrains.annotations.Nullable
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null, null, 0, 0);
    }
    
    public SliderPreference(@org.jetbrains.annotations.Nullable
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null, null, 0, 0);
    }
    
    public SliderPreference(@org.jetbrains.annotations.Nullable
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(null, null, 0, 0);
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    androidx.preference.PreferenceViewHolder holder) {
    }
}