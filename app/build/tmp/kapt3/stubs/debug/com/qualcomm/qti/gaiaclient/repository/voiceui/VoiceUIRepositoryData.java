package com.qualcomm.qti.gaiaclient.repository.voiceui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0016\u0010\u000f\u001a\u00020\u000e2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0004J\u0012\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006H\u0004R\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n\u00a8\u0006\u0012"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/repository/voiceui/VoiceUIRepositoryData;", "Lcom/qualcomm/qti/gaiaclient/repository/voiceui/VoiceUIRepository;", "()V", "_assistants", "Lcom/qualcomm/qti/gaiaclient/ui/common/StickyLiveData;", "", "Lcom/qualcomm/qti/gaiaclient/core/gaia/qtil/data/VoiceAssistant;", "_selectedAssistant", "assistants", "getAssistants", "()Lcom/qualcomm/qti/gaiaclient/ui/common/StickyLiveData;", "selectedAssistant", "getSelectedAssistant", "reset", "", "updateAssistants", "updateSelectedAssistant", "assistant", "app_debug"})
public abstract class VoiceUIRepositoryData implements com.qualcomm.qti.gaiaclient.repository.voiceui.VoiceUIRepository {
    private final com.qualcomm.qti.gaiaclient.ui.common.StickyLiveData<java.util.List<com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.VoiceAssistant>> _assistants = null;
    @org.jetbrains.annotations.NotNull
    private final com.qualcomm.qti.gaiaclient.ui.common.StickyLiveData<java.util.List<com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.VoiceAssistant>> assistants = null;
    private final com.qualcomm.qti.gaiaclient.ui.common.StickyLiveData<com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.VoiceAssistant> _selectedAssistant = null;
    @org.jetbrains.annotations.NotNull
    private final com.qualcomm.qti.gaiaclient.ui.common.StickyLiveData<com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.VoiceAssistant> selectedAssistant = null;
    
    public VoiceUIRepositoryData() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.qualcomm.qti.gaiaclient.ui.common.StickyLiveData<java.util.List<com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.VoiceAssistant>> getAssistants() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.qualcomm.qti.gaiaclient.ui.common.StickyLiveData<com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.VoiceAssistant> getSelectedAssistant() {
        return null;
    }
    
    @java.lang.Override
    public void reset() {
    }
    
    protected final void updateAssistants(@org.jetbrains.annotations.NotNull
    java.util.List<? extends com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.VoiceAssistant> assistants) {
    }
    
    protected final void updateSelectedAssistant(@org.jetbrains.annotations.Nullable
    com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.VoiceAssistant assistant) {
    }
}