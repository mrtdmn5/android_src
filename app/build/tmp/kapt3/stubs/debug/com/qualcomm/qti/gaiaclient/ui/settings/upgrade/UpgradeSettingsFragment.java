package com.qualcomm.qti.gaiaclient.ui.settings.upgrade;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0013\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0014\u00a2\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0014\u00a2\u0006\u0002\u0010\u0011J\b\u0010\u0013\u001a\u00020\u0014H\u0014J\b\u0010\u0015\u001a\u00020\u0004H\u0014J\u001c\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\u001b\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J\"\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u00022\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0014J\u0010\u0010%\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\"H\u0016J\b\u0010&\u001a\u00020\u0017H\u0016J\u0018\u0010\'\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\b2\u0006\u0010!\u001a\u00020\"H\u0014J\b\u0010(\u001a\u00020\u0017H\u0002J\u0010\u0010)\u001a\u00020\u00172\u0006\u0010*\u001a\u00020\u001fH\u0002R\u001c\u0010\u0006\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f\u00a8\u0006+"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/settings/upgrade/UpgradeSettingsFragment;", "Lcom/qualcomm/qti/gaiaclient/ui/settings/common/PersistentSettingsFragment;", "Lcom/qualcomm/qti/gaiaclient/ui/settings/upgrade/UpgradeSettings;", "Lcom/qualcomm/qti/gaiaclient/ui/settings/upgrade/UpgradeSettingsViewData;", "Lcom/qualcomm/qti/gaiaclient/ui/settings/upgrade/UpgradeSettingsViewModel;", "()V", "fileSelectionLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "", "kotlin.jvm.PlatformType", "viewModel", "getViewModel", "()Lcom/qualcomm/qti/gaiaclient/ui/settings/upgrade/UpgradeSettingsViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getNonPersistentSettings", "", "()[Lcom/qualcomm/qti/gaiaclient/ui/settings/upgrade/UpgradeSettings;", "getPersistentSettings", "getXmlSettingsId", "", "initViewModel", "onCreatePreferences", "", "savedInstanceState", "Landroid/os/Bundle;", "rootKey", "onFileSelectionResult", "result", "Landroid/net/Uri;", "onPreferenceChange", "", "key", "preference", "Landroidx/preference/Preference;", "update", "", "onPreferenceTreeClick", "onResume", "onSharedPreferenceChange", "startFileSelection", "updateTransferOptionsVisibility", "show", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class UpgradeSettingsFragment extends com.qualcomm.qti.gaiaclient.ui.settings.common.PersistentSettingsFragment<com.qualcomm.qti.gaiaclient.ui.settings.upgrade.UpgradeSettings, com.qualcomm.qti.gaiaclient.ui.settings.upgrade.UpgradeSettingsViewData, com.qualcomm.qti.gaiaclient.ui.settings.upgrade.UpgradeSettingsViewModel> {
    private final kotlin.Lazy viewModel$delegate = null;
    private final androidx.activity.result.ActivityResultLauncher<java.lang.String> fileSelectionLauncher = null;
    
    public UpgradeSettingsFragment() {
        super();
    }
    
    private final com.qualcomm.qti.gaiaclient.ui.settings.upgrade.UpgradeSettingsViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override
    public void onCreatePreferences(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState, @org.jetbrains.annotations.Nullable
    java.lang.String rootKey) {
    }
    
    @java.lang.Override
    public void onResume() {
    }
    
    @java.lang.Override
    protected int getXmlSettingsId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    protected com.qualcomm.qti.gaiaclient.ui.settings.upgrade.UpgradeSettingsViewModel initViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    protected com.qualcomm.qti.gaiaclient.ui.settings.upgrade.UpgradeSettings[] getNonPersistentSettings() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    protected com.qualcomm.qti.gaiaclient.ui.settings.upgrade.UpgradeSettings[] getPersistentSettings() {
        return null;
    }
    
    @java.lang.Override
    protected boolean onPreferenceChange(@org.jetbrains.annotations.Nullable
    com.qualcomm.qti.gaiaclient.ui.settings.upgrade.UpgradeSettings key, @org.jetbrains.annotations.NotNull
    androidx.preference.Preference preference, @org.jetbrains.annotations.NotNull
    java.lang.Object update) {
        return false;
    }
    
    @java.lang.Override
    protected void onSharedPreferenceChange(@org.jetbrains.annotations.NotNull
    java.lang.String key, @org.jetbrains.annotations.NotNull
    androidx.preference.Preference preference) {
    }
    
    @java.lang.Override
    public boolean onPreferenceTreeClick(@org.jetbrains.annotations.NotNull
    androidx.preference.Preference preference) {
        return false;
    }
    
    private final void onFileSelectionResult(android.net.Uri result) {
    }
    
    private final void startFileSelection() {
    }
    
    private final void updateTransferOptionsVisibility(boolean show) {
    }
}