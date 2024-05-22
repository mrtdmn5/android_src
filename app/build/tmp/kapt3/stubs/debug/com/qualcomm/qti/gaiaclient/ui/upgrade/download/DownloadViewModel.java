package com.qualcomm.qti.gaiaclient.ui.upgrade.download;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u00011B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010 \u001a\u00020!J\u0006\u0010\"\u001a\u00020!J\u001c\u0010#\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020%0$2\u0006\u0010&\u001a\u00020\'H\u0002J\b\u0010(\u001a\u00020!H\u0014J\u000e\u0010)\u001a\u00020!2\u0006\u0010\u0010\u001a\u00020\u000bJ$\u0010*\u001a\u00020!2\u001a\u0010+\u001a\u0016\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\'\u0018\u00010,H\u0002J\u0016\u0010.\u001a\u00020!2\u0006\u0010/\u001a\u00020\u00192\u0006\u00100\u001a\u00020\u001dR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0012\u0010\u0016\u001a\u00060\u0017R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00062"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/upgrade/download/DownloadViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "serviceRepository", "Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceRepository;", "upgradeRepository", "Lcom/qualcomm/qti/gaiaclient/repository/upgrade/UpgradeRepository;", "(Landroid/app/Application;Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceRepository;Lcom/qualcomm/qti/gaiaclient/repository/upgrade/UpgradeRepository;)V", "_action", "Landroidx/lifecycle/MutableLiveData;", "Lcom/qualcomm/qti/gaiaclient/ui/upgrade/download/Action;", "_content", "Lcom/qualcomm/qti/gaiaclient/ui/upgrade/download/FileContent;", "_progress", "Lcom/qualcomm/qti/gaiaclient/ui/upgrade/download/DownloadStatus;", "action", "Landroidx/lifecycle/LiveData;", "getAction", "()Landroidx/lifecycle/LiveData;", "content", "getContent", "dataObserver", "Lcom/qualcomm/qti/gaiaclient/ui/upgrade/download/DownloadViewModel$DownloadFileObserver;", "fileData", "Lcom/qualcomm/qti/gaiaclient/repository/service/getfiles/FileData;", "progress", "getProgress", "upgradeOptions", "Lcom/qualcomm/qti/gaiaclient/repository/upgrade/UpgradeOptions;", "uri", "Landroid/net/Uri;", "cancelDownload", "", "downloadFile", "getErrorMessage", "Lkotlin/Pair;", "", "error", "Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceError;", "onCleared", "onClick", "onResult", "result", "Lcom/qualcomm/qti/gaiaclient/repository/service/Result;", "Lcom/qualcomm/qti/gaiaclient/repository/service/download/DownloadProgress;", "setData", "file", "options", "DownloadFileObserver", "app_debug"})
public final class DownloadViewModel extends androidx.lifecycle.AndroidViewModel {
    private final com.qualcomm.qti.gaiaclient.repository.service.ServiceRepository serviceRepository = null;
    private final com.qualcomm.qti.gaiaclient.repository.upgrade.UpgradeRepository upgradeRepository = null;
    private final com.qualcomm.qti.gaiaclient.ui.upgrade.download.DownloadViewModel.DownloadFileObserver dataObserver = null;
    private com.qualcomm.qti.gaiaclient.repository.service.getfiles.FileData fileData;
    private android.net.Uri uri;
    private com.qualcomm.qti.gaiaclient.repository.upgrade.UpgradeOptions upgradeOptions;
    private final androidx.lifecycle.MutableLiveData<com.qualcomm.qti.gaiaclient.ui.upgrade.download.DownloadStatus> _progress = null;
    private final androidx.lifecycle.MutableLiveData<com.qualcomm.qti.gaiaclient.ui.upgrade.download.FileContent> _content = null;
    private final androidx.lifecycle.MutableLiveData<com.qualcomm.qti.gaiaclient.ui.upgrade.download.Action> _action = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.qualcomm.qti.gaiaclient.ui.upgrade.download.DownloadStatus> progress = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.qualcomm.qti.gaiaclient.ui.upgrade.download.FileContent> content = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.qualcomm.qti.gaiaclient.ui.upgrade.download.Action> action = null;
    
    @javax.inject.Inject
    public DownloadViewModel(@org.jetbrains.annotations.NotNull
    android.app.Application application, @org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.repository.service.ServiceRepository serviceRepository, @org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.repository.upgrade.UpgradeRepository upgradeRepository) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.qualcomm.qti.gaiaclient.ui.upgrade.download.DownloadStatus> getProgress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.qualcomm.qti.gaiaclient.ui.upgrade.download.FileContent> getContent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.qualcomm.qti.gaiaclient.ui.upgrade.download.Action> getAction() {
        return null;
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.repository.service.getfiles.FileData file, @org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.repository.upgrade.UpgradeOptions options) {
    }
    
    public final void downloadFile() {
    }
    
    public final void cancelDownload() {
    }
    
    public final void onClick(@org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.ui.upgrade.download.Action action) {
    }
    
    private final void onResult(com.qualcomm.qti.gaiaclient.repository.service.Result<com.qualcomm.qti.gaiaclient.repository.service.download.DownloadProgress, android.net.Uri, com.qualcomm.qti.gaiaclient.repository.service.ServiceError> result) {
    }
    
    private final kotlin.Pair<java.lang.String, java.lang.String> getErrorMessage(com.qualcomm.qti.gaiaclient.repository.service.ServiceError error) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010\u000e\u001a\u00020\u000f2\u001e\u0010\u0006\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\b0\u0007J\u0006\u0010\u0010\u001a\u00020\u000fR\u0011\u0010\u0003\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005R(\u0010\u0006\u001a\u001c\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\b\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R&\u0010\f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\b0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/upgrade/download/DownloadViewModel$DownloadFileObserver;", "", "(Lcom/qualcomm/qti/gaiaclient/ui/upgrade/download/DownloadViewModel;)V", "isRunning", "", "()Z", "liveData", "Landroidx/lifecycle/LiveData;", "Lcom/qualcomm/qti/gaiaclient/repository/service/Result;", "Lcom/qualcomm/qti/gaiaclient/repository/service/download/DownloadProgress;", "Landroid/net/Uri;", "Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceError;", "progressObserver", "Landroidx/lifecycle/Observer;", "start", "", "stop", "app_debug"})
    final class DownloadFileObserver {
        private final androidx.lifecycle.Observer<com.qualcomm.qti.gaiaclient.repository.service.Result<com.qualcomm.qti.gaiaclient.repository.service.download.DownloadProgress, android.net.Uri, com.qualcomm.qti.gaiaclient.repository.service.ServiceError>> progressObserver = null;
        private androidx.lifecycle.LiveData<com.qualcomm.qti.gaiaclient.repository.service.Result<com.qualcomm.qti.gaiaclient.repository.service.download.DownloadProgress, android.net.Uri, com.qualcomm.qti.gaiaclient.repository.service.ServiceError>> liveData;
        
        public DownloadFileObserver() {
            super();
        }
        
        public final boolean isRunning() {
            return false;
        }
        
        public final void start(@org.jetbrains.annotations.NotNull
        androidx.lifecycle.LiveData<com.qualcomm.qti.gaiaclient.repository.service.Result<com.qualcomm.qti.gaiaclient.repository.service.download.DownloadProgress, android.net.Uri, com.qualcomm.qti.gaiaclient.repository.service.ServiceError>> liveData) {
        }
        
        public final void stop() {
        }
    }
}