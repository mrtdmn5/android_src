package com.qualcomm.qti.gaiaclient.ui.settings.statistics.category;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\rH\u0002J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J$\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u001f\u001a\u00020\u0016H\u0016J\b\u0010 \u001a\u00020\u0016H\u0016J\b\u0010!\u001a\u00020\u0016H\u0002J\b\u0010\"\u001a\u00020\u0016H\u0016J\u001a\u0010#\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u001a2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0010\u0010%\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\'H\u0002J\u0010\u0010(\u001a\u00020\u00162\u0006\u0010)\u001a\u00020*H\u0002J\b\u0010+\u001a\u00020\u0016H\u0002J\b\u0010,\u001a\u00020\u0016H\u0002J\u0010\u0010-\u001a\u00020\u00162\u0006\u0010.\u001a\u00020/H\u0002J\u0010\u00100\u001a\u00020\u00162\u0006\u00101\u001a\u000202H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00100\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00063"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/settings/statistics/category/StatisticsStatisticsFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/qualcomm/qti/gaiaclient/databinding/FragmentStatisticsListBinding;", "adapter", "Lcom/qualcomm/qti/gaiaclient/ui/settings/statistics/category/StatisticsStatisticsAdapter;", "binding", "getBinding", "()Lcom/qualcomm/qti/gaiaclient/databinding/FragmentStatisticsListBinding;", "handler", "Landroid/os/Handler;", "settingsDialogBinding", "Lcom/qualcomm/qti/gaiaclient/databinding/DialogStatisticsSettingsBinding;", "shareFileLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "viewModel", "Lcom/qualcomm/qti/gaiaclient/ui/settings/statistics/category/StatisticsStatisticsViewModel;", "createSettingsDialogView", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onPause", "onRequestSettings", "onResume", "onViewCreated", "view", "showNoAvailableStatisticsMessage", "show", "", "startShareFileActivity", "file", "Ljava/io/File;", "subscribeUI", "updateSettingsDialogView", "updateTitle", "title", "", "updateView", "updated", "Lcom/qualcomm/qti/gaiaclient/ui/settings/statistics/category/StatisticsStatisticsViewData;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class StatisticsStatisticsFragment extends androidx.fragment.app.Fragment {
    private com.qualcomm.qti.gaiaclient.ui.settings.statistics.category.StatisticsStatisticsViewModel viewModel;
    private com.qualcomm.qti.gaiaclient.databinding.FragmentStatisticsListBinding _binding;
    private com.qualcomm.qti.gaiaclient.ui.settings.statistics.category.StatisticsStatisticsAdapter adapter;
    private com.qualcomm.qti.gaiaclient.databinding.DialogStatisticsSettingsBinding settingsDialogBinding;
    private final android.os.Handler handler = null;
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> shareFileLauncher = null;
    
    public StatisticsStatisticsFragment() {
        super();
    }
    
    private final com.qualcomm.qti.gaiaclient.databinding.FragmentStatisticsListBinding getBinding() {
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
    public void onDestroyView() {
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onResume() {
    }
    
    @java.lang.Override
    public void onPause() {
    }
    
    private final void subscribeUI() {
    }
    
    private final void updateView(com.qualcomm.qti.gaiaclient.ui.settings.statistics.category.StatisticsStatisticsViewData updated) {
    }
    
    private final void updateTitle(java.lang.String title) {
    }
    
    private final void onRequestSettings() {
    }
    
    private final com.qualcomm.qti.gaiaclient.databinding.DialogStatisticsSettingsBinding createSettingsDialogView() {
        return null;
    }
    
    private final void startShareFileActivity(java.io.File file) {
    }
    
    private final void updateSettingsDialogView() {
    }
    
    private final void showNoAvailableStatisticsMessage(boolean show) {
    }
}