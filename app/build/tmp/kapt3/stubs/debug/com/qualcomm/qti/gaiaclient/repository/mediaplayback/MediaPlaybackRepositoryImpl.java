package com.qualcomm.qti.gaiaclient.repository.mediaplayback;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/repository/mediaplayback/MediaPlaybackRepositoryImpl;", "Lcom/qualcomm/qti/gaiaclient/repository/mediaplayback/MediaPlaybackRepositoryData;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "adjustVolume", "", "key", "", "dispatchMediaKeyEvent", "onEvent", "event", "Lcom/qualcomm/qti/gaiaclient/repository/mediaplayback/MediaEvent;", "app_debug"})
@javax.inject.Singleton
public final class MediaPlaybackRepositoryImpl extends com.qualcomm.qti.gaiaclient.repository.mediaplayback.MediaPlaybackRepositoryData {
    private final android.content.Context context = null;
    
    @javax.inject.Inject
    public MediaPlaybackRepositoryImpl(@org.jetbrains.annotations.NotNull
    @dagger.hilt.android.qualifiers.ApplicationContext
    android.content.Context context) {
        super();
    }
    
    @java.lang.Override
    public void onEvent(@org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.repository.mediaplayback.MediaEvent event) {
    }
    
    private final void dispatchMediaKeyEvent(int key) {
    }
    
    private final void adjustVolume(int key) {
    }
}