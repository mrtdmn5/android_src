package com.qualcomm.qti.gaiaclient.repository.upgrade;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\b&\u0018\u00002\u00020\u0001B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J(\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\tH\u0005J\b\u0010#\u001a\u00020\u0018H\u0004J \u0010$\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(H\u0016J\u0012\u0010)\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH$J$\u0010*\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010\'\u001a\u00020(H$J\u001c\u0010+\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010,\u001a\u0004\u0018\u00010\u001cH$J\u001a\u0010-\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070.H\u0016J\u0010\u0010/\u001a\u00020\u000f2\u0006\u00100\u001a\u00020\u000eH\u0016J\u0016\u00101\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\u0006\u00100\u001a\u00020\u000eH\u0002J\u0016\u00102\u001a\b\u0012\u0004\u0012\u00020\u000f0.2\u0006\u00100\u001a\u00020\u000eH\u0016J\u001c\u00103\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00110.H\u0016J\u0010\u00104\u001a\u00020\u00182\u0006\u00105\u001a\u00020\u0012H\u0004J\u0010\u00106\u001a\u00020\u00182\u0006\u00107\u001a\u00020\u0013H\u0004J\u0012\u00108\u001a\u00020\u00182\b\u0010\u0014\u001a\u0004\u0018\u00010\u0012H\u0004J\b\u00109\u001a\u00020\u0018H\u0016J\b\u0010:\u001a\u00020\u0018H\u0002J\u0018\u0010;\u001a\u00020\u00182\u0006\u00100\u001a\u00020\u000e2\u0006\u0010<\u001a\u00020\u000fH\u0004J \u0010=\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0018\u0010>\u001a\u00020\u00182\u0006\u0010?\u001a\u00020\b2\u0006\u0010@\u001a\u00020\tH\u0004R \u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00060\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\u0010\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00110\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00128BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006A"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/repository/upgrade/UpgradeRepositoryData;", "Lcom/qualcomm/qti/gaiaclient/repository/upgrade/UpgradeRepository;", "deviceInformationRepository", "Lcom/qualcomm/qti/gaiaclient/repository/deviceinfo/DeviceInformationRepository;", "(Lcom/qualcomm/qti/gaiaclient/repository/deviceinfo/DeviceInformationRepository;)V", "alertLiveData", "Lcom/qualcomm/qti/gaiaclient/ui/common/StickyLiveData;", "Landroidx/core/util/Pair;", "Lcom/qualcomm/qti/libraries/upgrade/messages/UpgradeAlert;", "", "handler", "Landroid/os/Handler;", "sizesLiveData", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/qualcomm/qti/gaiaclient/repository/upgrade/SizeType;", "", "upgradeLiveData", "Lcom/qualcomm/qti/gaiaclient/repository/Result;", "Lcom/qualcomm/qti/gaiaclient/core/upgrade/data/UpgradeProgress;", "Lcom/qualcomm/qti/gaiaclient/core/upgrade/data/UpgradeFail;", "upgradeProgress", "getUpgradeProgress", "()Lcom/qualcomm/qti/gaiaclient/core/upgrade/data/UpgradeProgress;", "abortUpgrade", "", "context", "Landroid/content/Context;", "buildUpdateOptions", "Lcom/qualcomm/qti/gaiaclient/core/upgrade/data/UpdateOptions;", "fileLocation", "Landroid/net/Uri;", "userSelection", "Lcom/qualcomm/qti/gaiaclient/repository/upgrade/UpgradeOptions;", "gaiaVersion", "upgradeOptionsAvailable", "clearAlert", "confirmUpgrade", "confirmation", "Lcom/qualcomm/qti/gaiaclient/core/upgrade/data/UpgradeConfirmation;", "option", "Lcom/qualcomm/qti/libraries/upgrade/data/ConfirmationOptions;", "executeAbort", "executeConfirmation", "executeUpgrade", "options", "getAlertsLiveData", "Landroidx/lifecycle/LiveData;", "getSize", "type", "getSizeData", "getSizeLiveData", "getUpgradeLiveData", "onUpgradeEnd", "info", "onUpgradeError", "upgradeFail", "onUpgradeProgress", "reset", "resetUpgradeProgress", "setSize", "value", "startUpgrade", "updateAlert", "alert", "raised", "app_debug"})
public abstract class UpgradeRepositoryData implements com.qualcomm.qti.gaiaclient.repository.upgrade.UpgradeRepository {
    private final com.qualcomm.qti.gaiaclient.repository.deviceinfo.DeviceInformationRepository deviceInformationRepository = null;
    private final com.qualcomm.qti.gaiaclient.ui.common.StickyLiveData<com.qualcomm.qti.gaiaclient.repository.Result<com.qualcomm.qti.gaiaclient.core.upgrade.data.UpgradeProgress, com.qualcomm.qti.gaiaclient.core.upgrade.data.UpgradeFail>> upgradeLiveData = null;
    private final com.qualcomm.qti.gaiaclient.ui.common.StickyLiveData<androidx.core.util.Pair<com.qualcomm.qti.libraries.upgrade.messages.UpgradeAlert, java.lang.Boolean>> alertLiveData = null;
    private final java.util.concurrent.ConcurrentHashMap<com.qualcomm.qti.gaiaclient.repository.upgrade.SizeType, com.qualcomm.qti.gaiaclient.ui.common.StickyLiveData<java.lang.Integer>> sizesLiveData = null;
    private final android.os.Handler handler = null;
    
    protected UpgradeRepositoryData(@org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.repository.deviceinfo.DeviceInformationRepository deviceInformationRepository) {
        super();
    }
    
    @java.lang.Override
    public int getSize(@org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.repository.upgrade.SizeType type) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public androidx.lifecycle.LiveData<com.qualcomm.qti.gaiaclient.repository.Result<com.qualcomm.qti.gaiaclient.core.upgrade.data.UpgradeProgress, com.qualcomm.qti.gaiaclient.core.upgrade.data.UpgradeFail>> getUpgradeLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public androidx.lifecycle.LiveData<java.lang.Integer> getSizeLiveData(@org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.repository.upgrade.SizeType type) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public androidx.lifecycle.LiveData<androidx.core.util.Pair<com.qualcomm.qti.libraries.upgrade.messages.UpgradeAlert, java.lang.Boolean>> getAlertsLiveData() {
        return null;
    }
    
    @java.lang.Override
    public void startUpgrade(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    android.net.Uri fileLocation, @org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.repository.upgrade.UpgradeOptions userSelection) {
    }
    
    @java.lang.Override
    public void abortUpgrade(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
    
    @java.lang.Override
    public void confirmUpgrade(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.core.upgrade.data.UpgradeConfirmation confirmation, @org.jetbrains.annotations.NotNull
    com.qualcomm.qti.libraries.upgrade.data.ConfirmationOptions option) {
    }
    
    @java.lang.Override
    public void reset() {
    }
    
    protected abstract void executeUpgrade(@org.jetbrains.annotations.Nullable
    android.content.Context context, @org.jetbrains.annotations.Nullable
    com.qualcomm.qti.gaiaclient.core.upgrade.data.UpdateOptions options);
    
    protected abstract void executeAbort(@org.jetbrains.annotations.Nullable
    android.content.Context context);
    
    protected abstract void executeConfirmation(@org.jetbrains.annotations.Nullable
    android.content.Context context, @org.jetbrains.annotations.Nullable
    com.qualcomm.qti.gaiaclient.core.upgrade.data.UpgradeConfirmation confirmation, @org.jetbrains.annotations.NotNull
    com.qualcomm.qti.libraries.upgrade.data.ConfirmationOptions option);
    
    protected final void onUpgradeProgress(@org.jetbrains.annotations.Nullable
    com.qualcomm.qti.gaiaclient.core.upgrade.data.UpgradeProgress upgradeProgress) {
    }
    
    protected final void onUpgradeEnd(@org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.core.upgrade.data.UpgradeProgress info) {
    }
    
    protected final void onUpgradeError(@org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.core.upgrade.data.UpgradeFail upgradeFail) {
    }
    
    private final com.qualcomm.qti.gaiaclient.core.upgrade.data.UpgradeProgress getUpgradeProgress() {
        return null;
    }
    
    protected final void setSize(@org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.repository.upgrade.SizeType type, int value) {
    }
    
    protected final void updateAlert(@org.jetbrains.annotations.NotNull
    com.qualcomm.qti.libraries.upgrade.messages.UpgradeAlert alert, boolean raised) {
    }
    
    protected final void clearAlert() {
    }
    
    @org.jetbrains.annotations.NotNull
    @androidx.annotation.VisibleForTesting
    protected final com.qualcomm.qti.gaiaclient.core.upgrade.data.UpdateOptions buildUpdateOptions(@org.jetbrains.annotations.NotNull
    android.net.Uri fileLocation, @org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.repository.upgrade.UpgradeOptions userSelection, int gaiaVersion, boolean upgradeOptionsAvailable) {
        return null;
    }
    
    private final void resetUpgradeProgress() {
    }
    
    private final com.qualcomm.qti.gaiaclient.ui.common.StickyLiveData<java.lang.Integer> getSizeData(com.qualcomm.qti.gaiaclient.repository.upgrade.SizeType type) {
        return null;
    }
}