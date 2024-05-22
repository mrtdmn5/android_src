package com.qualcomm.qti.gaiaclient.ui.settings.audiocuration.demo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007B#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nB+\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u00a2\u0006\u0002\u0010\fJ\u0010\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R&\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0018"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/settings/audiocuration/demo/MediaPreference;", "Landroidx/preference/ListPreference;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "onEvent", "Lkotlin/Function1;", "Lcom/qualcomm/qti/gaiaclient/repository/mediaplayback/MediaEvent;", "", "getOnEvent", "()Lkotlin/jvm/functions/Function1;", "setOnEvent", "(Lkotlin/jvm/functions/Function1;)V", "onBindViewHolder", "holder", "Landroidx/preference/PreferenceViewHolder;", "app_debug"})
public final class MediaPreference extends androidx.preference.ListPreference {
    @org.jetbrains.annotations.NotNull
    private kotlin.jvm.functions.Function1<? super com.qualcomm.qti.gaiaclient.repository.mediaplayback.MediaEvent, kotlin.Unit> onEvent;
    
    @org.jetbrains.annotations.NotNull
    public final kotlin.jvm.functions.Function1<com.qualcomm.qti.gaiaclient.repository.mediaplayback.MediaEvent, kotlin.Unit> getOnEvent() {
        return null;
    }
    
    public final void setOnEvent(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.qualcomm.qti.gaiaclient.repository.mediaplayback.MediaEvent, kotlin.Unit> p0) {
    }
    
    public MediaPreference(@org.jetbrains.annotations.Nullable
    android.content.Context context) {
        super(null, null, 0, 0);
    }
    
    public MediaPreference(@org.jetbrains.annotations.Nullable
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null, null, 0, 0);
    }
    
    public MediaPreference(@org.jetbrains.annotations.Nullable
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null, null, 0, 0);
    }
    
    public MediaPreference(@org.jetbrains.annotations.Nullable
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(null, null, 0, 0);
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    androidx.preference.PreferenceViewHolder holder) {
    }
}