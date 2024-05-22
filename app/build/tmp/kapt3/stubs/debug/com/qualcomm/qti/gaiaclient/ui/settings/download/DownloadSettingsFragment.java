package com.qualcomm.qti.gaiaclient.ui.settings.download;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0013\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0014\u00a2\u0006\u0002\u0010\u000eJ\u0013\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0014\u00a2\u0006\u0002\u0010\u000eJ\b\u0010\u0010\u001a\u00020\u0011H\u0014J\b\u0010\u0012\u001a\u00020\u0004H\u0014J\u001c\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J \u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0014J\u0010\u0010 \u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0018\u0010!\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001dH\u0014J\u0010\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020$H\u0002J\u0010\u0010%\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020&H\u0002J\u0010\u0010\'\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020(H\u0002R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t\u00a8\u0006)"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/settings/download/DownloadSettingsFragment;", "Lcom/qualcomm/qti/gaiaclient/ui/settings/common/PersistentSettingsFragment;", "Lcom/qualcomm/qti/gaiaclient/ui/settings/download/DownloadSettings;", "Lcom/qualcomm/qti/gaiaclient/ui/settings/download/DownloadSettingsViewData;", "Lcom/qualcomm/qti/gaiaclient/ui/settings/download/DownloadSettingsViewModel;", "()V", "args", "Lcom/qualcomm/qti/gaiaclient/ui/settings/download/DownloadSettingsFragmentArgs;", "getArgs", "()Lcom/qualcomm/qti/gaiaclient/ui/settings/download/DownloadSettingsFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "getNonPersistentSettings", "", "()[Lcom/qualcomm/qti/gaiaclient/ui/settings/download/DownloadSettings;", "getPersistentSettings", "getXmlSettingsId", "", "initViewModel", "onCreatePreferences", "", "savedInstanceState", "Landroid/os/Bundle;", "rootKey", "", "onPreferenceChange", "", "key", "preference", "Landroidx/preference/Preference;", "update", "", "onPreferenceTreeClick", "onSharedPreferenceChange", "showDatePicker", "dateInMs", "", "updateHardwareVersionPreference", "Landroidx/preference/EditTextPreference;", "updateTagsPreference", "Landroidx/preference/MultiSelectListPreference;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class DownloadSettingsFragment extends com.qualcomm.qti.gaiaclient.ui.settings.common.PersistentSettingsFragment<com.qualcomm.qti.gaiaclient.ui.settings.download.DownloadSettings, com.qualcomm.qti.gaiaclient.ui.settings.download.DownloadSettingsViewData, com.qualcomm.qti.gaiaclient.ui.settings.download.DownloadSettingsViewModel> {
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    
    public DownloadSettingsFragment() {
        super();
    }
    
    private final com.qualcomm.qti.gaiaclient.ui.settings.download.DownloadSettingsFragmentArgs getArgs() {
        return null;
    }
    
    @java.lang.Override
    protected int getXmlSettingsId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    protected com.qualcomm.qti.gaiaclient.ui.settings.download.DownloadSettings[] getNonPersistentSettings() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    protected com.qualcomm.qti.gaiaclient.ui.settings.download.DownloadSettings[] getPersistentSettings() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    protected com.qualcomm.qti.gaiaclient.ui.settings.download.DownloadSettingsViewModel initViewModel() {
        return null;
    }
    
    @java.lang.Override
    public void onCreatePreferences(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState, @org.jetbrains.annotations.Nullable
    java.lang.String rootKey) {
    }
    
    @java.lang.Override
    public boolean onPreferenceTreeClick(@org.jetbrains.annotations.NotNull
    androidx.preference.Preference preference) {
        return false;
    }
    
    @java.lang.Override
    protected void onSharedPreferenceChange(@org.jetbrains.annotations.NotNull
    java.lang.String key, @org.jetbrains.annotations.NotNull
    androidx.preference.Preference preference) {
    }
    
    private final void updateHardwareVersionPreference(androidx.preference.EditTextPreference preference) {
    }
    
    private final void updateTagsPreference(androidx.preference.MultiSelectListPreference preference) {
    }
    
    private final void showDatePicker(long dateInMs) {
    }
    
    @java.lang.Override
    protected boolean onPreferenceChange(@org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.ui.settings.download.DownloadSettings key, @org.jetbrains.annotations.NotNull
    androidx.preference.Preference preference, @org.jetbrains.annotations.NotNull
    java.lang.Object update) {
        return false;
    }
}