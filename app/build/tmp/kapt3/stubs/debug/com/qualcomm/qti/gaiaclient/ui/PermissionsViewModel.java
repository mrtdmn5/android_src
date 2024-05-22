package com.qualcomm.qti.gaiaclient.ui;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\r2\u0006\u0010\u000e\u001a\u00020\u0007J\u000e\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0007J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\tR \u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/PermissionsViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "_states", "", "Lcom/qualcomm/qti/gaiaclient/ui/Permissions$Categories;", "Lcom/qualcomm/qti/gaiaclient/ui/common/StickyLiveData;", "Lcom/qualcomm/qti/gaiaclient/ui/PermissionState;", "tokens", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getState", "Landroidx/lifecycle/LiveData;", "category", "getToken", "setState", "", "state", "app_debug"})
public final class PermissionsViewModel extends androidx.lifecycle.AndroidViewModel {
    private final java.util.Map<com.qualcomm.qti.gaiaclient.ui.Permissions.Categories, com.qualcomm.qti.gaiaclient.ui.common.StickyLiveData<com.qualcomm.qti.gaiaclient.ui.PermissionState>> _states = null;
    private final java.util.Map<com.qualcomm.qti.gaiaclient.ui.Permissions.Categories, java.util.concurrent.atomic.AtomicBoolean> tokens = null;
    
    @javax.inject.Inject
    public PermissionsViewModel(@org.jetbrains.annotations.NotNull
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.qualcomm.qti.gaiaclient.ui.PermissionState> getState(@org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.ui.Permissions.Categories category) {
        return null;
    }
    
    public final void setState(@org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.ui.Permissions.Categories category, @org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.ui.PermissionState state) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.concurrent.atomic.AtomicBoolean getToken(@org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.ui.Permissions.Categories category) {
        return null;
    }
}