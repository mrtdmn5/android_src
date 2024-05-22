package com.qualcomm.qti.gaiaclient.ui.information;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0012\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J$\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0010\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u0010H\u0016J\u001c\u0010\u001e\u001a\u00020\u00102\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0 H\u0002J\b\u0010#\u001a\u00020\u0010H\u0002J\u0010\u0010$\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020%H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f\u00a8\u0006&"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/information/InformationFragment;", "Landroidx/fragment/app/Fragment;", "()V", "backPressedCallback", "Landroidx/activity/OnBackPressedCallback;", "binding", "Lcom/qualcomm/qti/gaiaclient/databinding/FragmentInformationBinding;", "dialog", "Landroidx/appcompat/app/AlertDialog;", "viewModel", "Lcom/qualcomm/qti/gaiaclient/ui/information/InformationViewModel;", "getViewModel", "()Lcom/qualcomm/qti/gaiaclient/ui/information/InformationViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "dismissDialog", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onCrossUpdateVersion", "crossUpdateVersion", "Lcom/qualcomm/qti/gaiaclient/core/gaia/qtil/data/basic/CrossUpdateVersion;", "onPause", "showDialog", "data", "Lcom/qualcomm/qti/gaiaclient/ui/common/progress/DialogViewData;", "", "Lcom/qualcomm/qti/gaiaclient/ui/information/dialog/Options;", "subscribeUI", "updateData", "Lcom/qualcomm/qti/gaiaclient/ui/information/InformationViewData;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class InformationFragment extends androidx.fragment.app.Fragment {
    private final kotlin.Lazy viewModel$delegate = null;
    private com.qualcomm.qti.gaiaclient.databinding.FragmentInformationBinding binding;
    private androidx.appcompat.app.AlertDialog dialog;
    private final androidx.activity.OnBackPressedCallback backPressedCallback = null;
    
    public InformationFragment() {
        super();
    }
    
    private final com.qualcomm.qti.gaiaclient.ui.information.InformationViewModel getViewModel() {
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
    public void onPause() {
    }
    
    private final void subscribeUI() {
    }
    
    private final void onCrossUpdateVersion(com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.basic.CrossUpdateVersion crossUpdateVersion) {
    }
    
    private final void showDialog(com.qualcomm.qti.gaiaclient.ui.common.progress.DialogViewData<java.lang.Integer, com.qualcomm.qti.gaiaclient.ui.information.dialog.Options> data) {
    }
    
    private final void dismissDialog() {
    }
    
    private final void updateData(com.qualcomm.qti.gaiaclient.ui.information.InformationViewData data) {
    }
}