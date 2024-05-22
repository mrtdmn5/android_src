package com.qualcomm.qti.gaiaclient.ui.upgrade.files;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001,B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ0\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u000e2\u001e\u0010 \u001a\u001a\u0012\u0004\u0012\u00020\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u000b\u0012\u0004\u0012\u00020#0!H\u0002J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020#H\u0002J\u0010\u0010\'\u001a\u00020%2\u0006\u0010(\u001a\u00020)H\u0002J\b\u0010*\u001a\u00020\u001bH\u0014J(\u0010+\u001a\u00020\u001b2\u001e\u0010 \u001a\u001a\u0012\u0004\u0012\u00020\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u000b\u0012\u0004\u0012\u00020#0!H\u0002R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u00060\u0012R\u00020\u0000X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/upgrade/files/GetFilesViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "serviceRepository", "Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceRepository;", "informationRepository", "Lcom/qualcomm/qti/gaiaclient/repository/deviceinfo/DeviceInformationRepository;", "(Landroid/app/Application;Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceRepository;Lcom/qualcomm/qti/gaiaclient/repository/deviceinfo/DeviceInformationRepository;)V", "_files", "Lcom/qualcomm/qti/gaiaclient/ui/common/StickyLiveData;", "", "Lcom/qualcomm/qti/gaiaclient/ui/upgrade/files/FileViewData;", "_isRefreshing", "", "_message", "Lcom/qualcomm/qti/gaiaclient/ui/common/MessageData;", "dataObserver", "Lcom/qualcomm/qti/gaiaclient/ui/upgrade/files/GetFilesViewModel$FilesDataObserver;", "files", "Landroidx/lifecycle/LiveData;", "getFiles", "()Landroidx/lifecycle/LiveData;", "isRefreshing", "message", "getMessage", "fetchFiles", "", "filters", "Lcom/qualcomm/qti/gaiaclient/ui/upgrade/files/FilesFilters;", "getEmptyListMessage", "isListEmpty", "result", "Lcom/qualcomm/qti/gaiaclient/repository/service/Result;", "Lcom/qualcomm/qti/gaiaclient/repository/service/getfiles/FileData;", "Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceError;", "getErrorMessage", "", "error", "getString", "resourceId", "", "onCleared", "updateData", "FilesDataObserver", "app_debug"})
public final class GetFilesViewModel extends androidx.lifecycle.AndroidViewModel {
    private final com.qualcomm.qti.gaiaclient.repository.service.ServiceRepository serviceRepository = null;
    private final com.qualcomm.qti.gaiaclient.repository.deviceinfo.DeviceInformationRepository informationRepository = null;
    private final com.qualcomm.qti.gaiaclient.ui.common.StickyLiveData<java.util.List<com.qualcomm.qti.gaiaclient.ui.upgrade.files.FileViewData>> _files = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<com.qualcomm.qti.gaiaclient.ui.upgrade.files.FileViewData>> files = null;
    private final com.qualcomm.qti.gaiaclient.ui.common.StickyLiveData<com.qualcomm.qti.gaiaclient.ui.common.MessageData> _message = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.qualcomm.qti.gaiaclient.ui.common.MessageData> message = null;
    private final com.qualcomm.qti.gaiaclient.ui.common.StickyLiveData<java.lang.Boolean> _isRefreshing = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.lang.Boolean> isRefreshing = null;
    private com.qualcomm.qti.gaiaclient.ui.upgrade.files.GetFilesViewModel.FilesDataObserver dataObserver;
    
    @javax.inject.Inject
    public GetFilesViewModel(@org.jetbrains.annotations.NotNull
    android.app.Application application, @org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.repository.service.ServiceRepository serviceRepository, @org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.repository.deviceinfo.DeviceInformationRepository informationRepository) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.qualcomm.qti.gaiaclient.ui.upgrade.files.FileViewData>> getFiles() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.qualcomm.qti.gaiaclient.ui.common.MessageData> getMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isRefreshing() {
        return null;
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
    
    public final void fetchFiles(@org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.ui.upgrade.files.FilesFilters filters) {
    }
    
    private final void updateData(com.qualcomm.qti.gaiaclient.repository.service.Result<kotlin.Unit, java.util.List<com.qualcomm.qti.gaiaclient.repository.service.getfiles.FileData>, com.qualcomm.qti.gaiaclient.repository.service.ServiceError> result) {
    }
    
    private final com.qualcomm.qti.gaiaclient.ui.common.MessageData getEmptyListMessage(boolean isListEmpty, com.qualcomm.qti.gaiaclient.repository.service.Result<kotlin.Unit, java.util.List<com.qualcomm.qti.gaiaclient.repository.service.getfiles.FileData>, com.qualcomm.qti.gaiaclient.repository.service.ServiceError> result) {
        return null;
    }
    
    private final java.lang.String getErrorMessage(com.qualcomm.qti.gaiaclient.repository.service.ServiceError error) {
        return null;
    }
    
    private final java.lang.String getString(int resourceId) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J,\u0010\f\u001a\u00020\u00062$\u0010\u0003\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u00050\u0004J\u0006\u0010\r\u001a\u00020\u0006R.\u0010\u0003\u001a\"\u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u0005\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R,\u0010\n\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u00050\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/upgrade/files/GetFilesViewModel$FilesDataObserver;", "", "(Lcom/qualcomm/qti/gaiaclient/ui/upgrade/files/GetFilesViewModel;)V", "liveData", "Landroidx/lifecycle/LiveData;", "Lcom/qualcomm/qti/gaiaclient/repository/service/Result;", "", "", "Lcom/qualcomm/qti/gaiaclient/repository/service/getfiles/FileData;", "Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceError;", "observer", "Landroidx/lifecycle/Observer;", "start", "stop", "app_debug"})
    final class FilesDataObserver {
        private final androidx.lifecycle.Observer<com.qualcomm.qti.gaiaclient.repository.service.Result<kotlin.Unit, java.util.List<com.qualcomm.qti.gaiaclient.repository.service.getfiles.FileData>, com.qualcomm.qti.gaiaclient.repository.service.ServiceError>> observer = null;
        private androidx.lifecycle.LiveData<com.qualcomm.qti.gaiaclient.repository.service.Result<kotlin.Unit, java.util.List<com.qualcomm.qti.gaiaclient.repository.service.getfiles.FileData>, com.qualcomm.qti.gaiaclient.repository.service.ServiceError>> liveData;
        
        public FilesDataObserver() {
            super();
        }
        
        public final void start(@org.jetbrains.annotations.NotNull
        androidx.lifecycle.LiveData<com.qualcomm.qti.gaiaclient.repository.service.Result<kotlin.Unit, java.util.List<com.qualcomm.qti.gaiaclient.repository.service.getfiles.FileData>, com.qualcomm.qti.gaiaclient.repository.service.ServiceError>> liveData) {
        }
        
        public final void stop() {
        }
    }
}