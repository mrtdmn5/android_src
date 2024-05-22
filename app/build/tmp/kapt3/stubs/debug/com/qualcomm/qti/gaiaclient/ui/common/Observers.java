package com.qualcomm.qti.gaiaclient.ui.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H$J\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\b\u001a\u00020\u0006J\b\u0010\t\u001a\u00020\u0006H$R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/common/Observers;", "", "()V", "started", "Ljava/util/concurrent/atomic/AtomicBoolean;", "registerObservers", "", "start", "stop", "unregisterObservers", "app_debug"})
public abstract class Observers {
    private final java.util.concurrent.atomic.AtomicBoolean started = null;
    
    public Observers() {
        super();
    }
    
    public final void start() {
    }
    
    public final void stop() {
    }
    
    protected abstract void registerObservers();
    
    protected abstract void unregisterObservers();
}