package com.qualcomm.qti.gaiaclient.repository.voiceui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R$\u0010\u0003\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/repository/voiceui/VoiceUIRepositoryImpl;", "Lcom/qualcomm/qti/gaiaclient/repository/voiceui/VoiceUIRepositoryData;", "()V", "setAssistantListener", "Lcom/qualcomm/qti/gaiaclient/core/requests/core/RequestListener;", "Ljava/lang/Void;", "Lcom/qualcomm/qti/gaiaclient/core/data/Reason;", "subscriber", "Lcom/qualcomm/qti/gaiaclient/core/publications/qtil/subscribers/VoiceUISubscriber;", "fetchSelectedAssistant", "", "context", "Landroid/content/Context;", "fetchSupportedAssistants", "init", "setAssistant", "assistant", "Lcom/qualcomm/qti/gaiaclient/core/gaia/qtil/data/VoiceAssistant;", "app_debug"})
@javax.inject.Singleton
public final class VoiceUIRepositoryImpl extends com.qualcomm.qti.gaiaclient.repository.voiceui.VoiceUIRepositoryData {
    private final com.qualcomm.qti.gaiaclient.core.publications.qtil.subscribers.VoiceUISubscriber subscriber = null;
    private final com.qualcomm.qti.gaiaclient.core.requests.core.RequestListener<java.lang.Void, java.lang.Void, com.qualcomm.qti.gaiaclient.core.data.Reason> setAssistantListener = null;
    
    @javax.inject.Inject
    public VoiceUIRepositoryImpl() {
        super();
    }
    
    @java.lang.Override
    public void init() {
    }
    
    @java.lang.Override
    public void setAssistant(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.VoiceAssistant assistant) {
    }
    
    @java.lang.Override
    public void fetchSupportedAssistants(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
    
    @java.lang.Override
    public void fetchSelectedAssistant(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
}