package com.qualcomm.qti.gaiaclient.ui;

import java.lang.System;

/**
 * To handle permissions checks and requests for a category.
 *
 * @param category       the category to handle permission for
 * @param run            the function this handler should run when it is safe to do so, aka when the permission is
 *                      granted.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\fH\u0002J\u000e\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001dJ\b\u0010\u001e\u001a\u00020\u0006H\u0002J\b\u0010\u001f\u001a\u00020\u0006H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00020\u000eX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0015\u001a\u00020\u0016X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006 "}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/PermissionHandler;", "", "category", "Lcom/qualcomm/qti/gaiaclient/ui/Permissions$Categories;", "run", "Lkotlin/Function0;", "", "(Lcom/qualcomm/qti/gaiaclient/ui/Permissions$Categories;Lkotlin/jvm/functions/Function0;)V", "getCategory", "()Lcom/qualcomm/qti/gaiaclient/ui/Permissions$Categories;", "observer", "Landroidx/lifecycle/Observer;", "Lcom/qualcomm/qti/gaiaclient/ui/PermissionState;", "owner", "Landroidx/lifecycle/LifecycleOwner;", "getOwner", "()Landroidx/lifecycle/LifecycleOwner;", "getRun", "()Lkotlin/jvm/functions/Function0;", "started", "Ljava/util/concurrent/atomic/AtomicBoolean;", "viewModel", "Lcom/qualcomm/qti/gaiaclient/ui/PermissionsViewModel;", "getViewModel", "()Lcom/qualcomm/qti/gaiaclient/ui/PermissionsViewModel;", "onPermissionStateChanged", "state", "requestOrRun", "activity", "Lcom/qualcomm/qti/gaiaclient/ui/PermissionsActivity;", "start", "stop", "app_debug"})
public abstract class PermissionHandler {
    @org.jetbrains.annotations.NotNull
    private final com.qualcomm.qti.gaiaclient.ui.Permissions.Categories category = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function0<kotlin.Unit> run = null;
    private final java.util.concurrent.atomic.AtomicBoolean started = null;
    private final androidx.lifecycle.Observer<com.qualcomm.qti.gaiaclient.ui.PermissionState> observer = null;
    
    public PermissionHandler(@org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.ui.Permissions.Categories category, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> run) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.qualcomm.qti.gaiaclient.ui.Permissions.Categories getCategory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getRun() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract com.qualcomm.qti.gaiaclient.ui.PermissionsViewModel getViewModel();
    
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LifecycleOwner getOwner();
    
    /**
     * Checks whether the category permissions have been granted, prior to run the function:
     * Launches the permission request if it has not been granted: the result will be provided via the given observer.
     * Launches an error dialog if it has been permanently denied.
     * Runs the given function if it has been granted.
     *
     * @param activity  the permission activity to use immediately to check permissions status and display any
     *                 immediate error/warning.
     */
    public final void requestOrRun(@org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.ui.PermissionsActivity activity) {
    }
    
    /**
     * Receives the result when the permission state is updated for this category after requesting the permission(s)
     * to be granted.
     * This function runs the <code>run</code> function if the permission was granted.
     */
    private final void onPermissionStateChanged(com.qualcomm.qti.gaiaclient.ui.PermissionState state) {
    }
    
    private final void start() {
    }
    
    private final void stop() {
    }
}