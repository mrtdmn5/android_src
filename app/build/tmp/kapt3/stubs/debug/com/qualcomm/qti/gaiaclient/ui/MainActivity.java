package com.qualcomm.qti.gaiaclient.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u00015B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u0017\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002\u00a2\u0006\u0002\u0010\u0018J\u0012\u0010\u0019\u001a\u00020\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014J\u0010\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020$H\u0002J\u0012\u0010%\u001a\u00020\u00142\b\u0010&\u001a\u0004\u0018\u00010\'H\u0002J\b\u0010(\u001a\u00020\u0014H\u0014J\b\u0010)\u001a\u00020\u0014H\u0002J\u0010\u0010*\u001a\u00020\u00142\u0006\u0010+\u001a\u00020,H\u0016J\u0010\u0010-\u001a\u00020\u00142\u0006\u0010.\u001a\u00020/H\u0002J\u0010\u00100\u001a\u00020\u00142\u0006\u00101\u001a\u00020\u0017H\u0002J\u0010\u00102\u001a\u00020\u00142\b\u00103\u001a\u0004\u0018\u000104R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00060\nR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010\u00a8\u00066"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/MainActivity;", "Lcom/qualcomm/qti/gaiaclient/ui/PermissionsActivity;", "()V", "binding", "Lcom/qualcomm/qti/gaiaclient/databinding/ActivityMainBinding;", "launcher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "observers", "Lcom/qualcomm/qti/gaiaclient/ui/MainActivity$DataObservers;", "snackbar", "Lcom/google/android/material/snackbar/Snackbar;", "viewModel", "Lcom/qualcomm/qti/gaiaclient/ui/MainActivityViewModel;", "getViewModel", "()Lcom/qualcomm/qti/gaiaclient/ui/MainActivityViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "initNavigationController", "", "onBluetoothRequestStateChanged", "shouldRequest", "", "(Ljava/lang/Boolean;)V", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestinationChanged", "destination", "Landroidx/navigation/NavDestination;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onPermissionStateChanged", "state", "Lcom/qualcomm/qti/gaiaclient/ui/PermissionState;", "onSnackMessage", "message", "Lcom/qualcomm/qti/gaiaclient/ui/common/SnackMessage;", "onStart", "requestBluetooth", "showPermissionsError", "category", "Lcom/qualcomm/qti/gaiaclient/ui/Permissions$Categories;", "updateBottomMenuVisibility", "visibility", "", "updateIconBarVisibility", "show", "updateTitle", "title", "", "DataObservers", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class MainActivity extends com.qualcomm.qti.gaiaclient.ui.PermissionsActivity {
    private final kotlin.Lazy viewModel$delegate = null;
    private com.qualcomm.qti.gaiaclient.databinding.ActivityMainBinding binding;
    private com.google.android.material.snackbar.Snackbar snackbar;
    private final com.qualcomm.qti.gaiaclient.ui.MainActivity.DataObservers observers = null;
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> launcher = null;
    
    public MainActivity() {
        super();
    }
    
    private final com.qualcomm.qti.gaiaclient.ui.MainActivityViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    protected void onStart() {
    }
    
    @java.lang.Override
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull
    android.view.MenuItem item) {
        return false;
    }
    
    public final void updateTitle(@org.jetbrains.annotations.Nullable
    java.lang.String title) {
    }
    
    @java.lang.Override
    public void showPermissionsError(@org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.ui.Permissions.Categories category) {
    }
    
    private final void initNavigationController() {
    }
    
    private final void updateBottomMenuVisibility(int visibility) {
    }
    
    private final void onDestinationChanged(androidx.navigation.NavDestination destination) {
    }
    
    private final void updateIconBarVisibility(boolean show) {
    }
    
    /**
     * To act dependently to the new bluetooth dialog state: if disabled this method calls the system to
     * enable the Bluetooth. This triggers a system dialog to ask the user to do so.
     */
    private final void onBluetoothRequestStateChanged(java.lang.Boolean shouldRequest) {
    }
    
    private final void requestBluetooth() {
    }
    
    private final void onSnackMessage(com.qualcomm.qti.gaiaclient.ui.common.SnackMessage message) {
    }
    
    private final void onPermissionStateChanged(com.qualcomm.qti.gaiaclient.ui.PermissionState state) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0014J\b\u0010\u0010\u001a\u00020\u000fH\u0014R\u001c\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\b0\b0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u000b0\u000b0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/MainActivity$DataObservers;", "Lcom/qualcomm/qti/gaiaclient/ui/common/Observers;", "(Lcom/qualcomm/qti/gaiaclient/ui/MainActivity;)V", "bluetoothPermissionObserver", "Landroidx/lifecycle/Observer;", "Lcom/qualcomm/qti/gaiaclient/ui/PermissionState;", "kotlin.jvm.PlatformType", "bluetoothRequestObserver", "", "iconBarVisibilityObserver", "navigationObserver", "", "snackMessageObserver", "Lcom/qualcomm/qti/gaiaclient/ui/common/SnackMessage;", "registerObservers", "", "unregisterObservers", "app_debug"})
    final class DataObservers extends com.qualcomm.qti.gaiaclient.ui.common.Observers {
        private final androidx.lifecycle.Observer<java.lang.Integer> navigationObserver = null;
        private final androidx.lifecycle.Observer<java.lang.Boolean> iconBarVisibilityObserver = null;
        private final androidx.lifecycle.Observer<java.lang.Boolean> bluetoothRequestObserver = null;
        private final androidx.lifecycle.Observer<com.qualcomm.qti.gaiaclient.ui.common.SnackMessage> snackMessageObserver = null;
        private final androidx.lifecycle.Observer<com.qualcomm.qti.gaiaclient.ui.PermissionState> bluetoothPermissionObserver = null;
        
        public DataObservers() {
            super();
        }
        
        @java.lang.Override
        protected void registerObservers() {
        }
        
        @java.lang.Override
        protected void unregisterObservers() {
        }
    }
}