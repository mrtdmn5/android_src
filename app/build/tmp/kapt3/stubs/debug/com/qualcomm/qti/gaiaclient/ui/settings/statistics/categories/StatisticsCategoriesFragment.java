package com.qualcomm.qti.gaiaclient.ui.settings.statistics.categories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J$\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u001fH\u0016J\u001a\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0016\u0010#\u001a\u00020\u001f2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%H\u0002J\u0010\u0010\'\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020)H\u0002J\b\u0010*\u001a\u00020\u001fH\u0002J\b\u0010+\u001a\u00020\u001fH\u0002J\u0010\u0010,\u001a\u00020\u001f2\u0006\u0010-\u001a\u00020.H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u000e0\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006/"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/settings/statistics/categories/StatisticsCategoriesFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/qualcomm/qti/gaiaclient/databinding/FragmentStatisticsListBinding;", "adapter", "Lcom/qualcomm/qti/gaiaclient/ui/settings/statistics/categories/StatisticsCategoriesAdapter;", "binding", "getBinding", "()Lcom/qualcomm/qti/gaiaclient/databinding/FragmentStatisticsListBinding;", "handler", "Landroid/os/Handler;", "shareFileLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "viewModel", "Lcom/qualcomm/qti/gaiaclient/ui/settings/statistics/categories/StatisticsCategoriesViewModel;", "getViewModel", "()Lcom/qualcomm/qti/gaiaclient/ui/settings/statistics/categories/StatisticsCategoriesViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "", "onResume", "onViewCreated", "view", "shareFiles", "files", "", "Ljava/io/File;", "showNoAvailableStatisticsMessage", "show", "", "stopAllRecording", "subscribeUI", "updateUI", "updated", "Lcom/qualcomm/qti/gaiaclient/ui/settings/statistics/categories/StatisticsCategoriesViewData;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class StatisticsCategoriesFragment extends androidx.fragment.app.Fragment {
    private final kotlin.Lazy viewModel$delegate = null;
    private com.qualcomm.qti.gaiaclient.databinding.FragmentStatisticsListBinding _binding;
    private com.qualcomm.qti.gaiaclient.ui.settings.statistics.categories.StatisticsCategoriesAdapter adapter;
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> shareFileLauncher = null;
    private final android.os.Handler handler = null;
    
    public StatisticsCategoriesFragment() {
        super();
    }
    
    private final com.qualcomm.qti.gaiaclient.ui.settings.statistics.categories.StatisticsCategoriesViewModel getViewModel() {
        return null;
    }
    
    private final com.qualcomm.qti.gaiaclient.databinding.FragmentStatisticsListBinding getBinding() {
        return null;
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
    
    private final void subscribeUI() {
    }
    
    private final void stopAllRecording() {
    }
    
    private final void shareFiles(java.util.List<? extends java.io.File> files) {
    }
    
    private final void updateUI(com.qualcomm.qti.gaiaclient.ui.settings.statistics.categories.StatisticsCategoriesViewData updated) {
    }
    
    private final void showNoAvailableStatisticsMessage(boolean show) {
    }
}