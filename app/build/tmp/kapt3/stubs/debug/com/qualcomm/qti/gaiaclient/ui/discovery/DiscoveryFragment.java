package com.qualcomm.qti.gaiaclient.ui.discovery;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0012\u0010\u0016\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J$\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u001f\u001a\u00020\u0013H\u0016J\b\u0010 \u001a\u00020\u0013H\u0002J\u0010\u0010!\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020#H\u0002J\u0017\u0010$\u001a\u00020\u00132\b\u0010%\u001a\u0004\u0018\u00010&H\u0002\u00a2\u0006\u0002\u0010\'R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006("}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/discovery/DiscoveryFragment;", "Landroidx/fragment/app/Fragment;", "()V", "backPressedCallback", "Landroidx/activity/OnBackPressedCallback;", "binding", "Lcom/qualcomm/qti/gaiaclient/databinding/FragmentDiscoveryBinding;", "permissionHandlerBluetooth", "Lcom/qualcomm/qti/gaiaclient/ui/PermissionHandler;", "permissionHandlerDiscovery", "permissionsViewModel", "Lcom/qualcomm/qti/gaiaclient/ui/PermissionsViewModel;", "viewModel", "Lcom/qualcomm/qti/gaiaclient/ui/discovery/DiscoveryViewModel;", "getViewModel", "()Lcom/qualcomm/qti/gaiaclient/ui/discovery/DiscoveryViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "navigateToConnection", "", "deviceData", "Lcom/qualcomm/qti/gaiaclient/ui/discovery/viewdata/DeviceViewData;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onResume", "refreshList", "subscribeUI", "adapter", "Lcom/qualcomm/qti/gaiaclient/ui/discovery/DiscoveryDevicesAdapter;", "updateRefreshingState", "isRefreshing", "", "(Ljava/lang/Boolean;)V", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class DiscoveryFragment extends androidx.fragment.app.Fragment {
    private final kotlin.Lazy viewModel$delegate = null;
    private com.qualcomm.qti.gaiaclient.databinding.FragmentDiscoveryBinding binding;
    private final androidx.activity.OnBackPressedCallback backPressedCallback = null;
    private com.qualcomm.qti.gaiaclient.ui.PermissionsViewModel permissionsViewModel;
    private final com.qualcomm.qti.gaiaclient.ui.PermissionHandler permissionHandlerDiscovery = null;
    private final com.qualcomm.qti.gaiaclient.ui.PermissionHandler permissionHandlerBluetooth = null;
    
    public DiscoveryFragment() {
        super();
    }
    
    private final com.qualcomm.qti.gaiaclient.ui.discovery.DiscoveryViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override
    public void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    public void onResume() {
    }
    
    private final void subscribeUI(com.qualcomm.qti.gaiaclient.ui.discovery.DiscoveryDevicesAdapter adapter) {
    }
    
    private final void updateRefreshingState(java.lang.Boolean isRefreshing) {
    }
    
    private final void navigateToConnection(com.qualcomm.qti.gaiaclient.ui.discovery.viewdata.DeviceViewData deviceData) {
    }
    
    private final void refreshList() {
    }
}