package com.qualcomm.qti.gaiaclient.repository.voiceui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&J\b\u0010\u000f\u001a\u00020\u000bH&J\b\u0010\u0010\u001a\u00020\u000bH&J\u0018\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0005H&R\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u0007\u00a8\u0006\u0013"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/repository/voiceui/VoiceUIRepository;", "", "assistants", "Landroidx/lifecycle/LiveData;", "", "Lcom/qualcomm/qti/gaiaclient/core/gaia/qtil/data/VoiceAssistant;", "getAssistants", "()Landroidx/lifecycle/LiveData;", "selectedAssistant", "getSelectedAssistant", "fetchSelectedAssistant", "", "context", "Landroid/content/Context;", "fetchSupportedAssistants", "init", "reset", "setAssistant", "assistant", "app_debug"})
public abstract interface VoiceUIRepository {
    
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<java.util.List<com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.VoiceAssistant>> getAssistants();
    
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.VoiceAssistant> getSelectedAssistant();
    
    public abstract void init();
    
    public abstract void reset();
    
    public abstract void setAssistant(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.VoiceAssistant assistant);
    
    public abstract void fetchSupportedAssistants(@org.jetbrains.annotations.NotNull
    android.content.Context context);
    
    public abstract void fetchSelectedAssistant(@org.jetbrains.annotations.NotNull
    android.content.Context context);
}