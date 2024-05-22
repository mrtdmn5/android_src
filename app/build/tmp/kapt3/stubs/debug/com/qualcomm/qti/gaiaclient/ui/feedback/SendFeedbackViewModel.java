package com.qualcomm.qti.gaiaclient.ui.feedback;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u00010B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001c\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d0#2\u0006\u0010$\u001a\u00020%H\u0002J\b\u0010&\u001a\u00020\'H\u0014J\u000e\u0010(\u001a\u00020\'2\u0006\u0010\u0014\u001a\u00020\u000bJ$\u0010)\u001a\u00020\'2\u001a\u0010*\u001a\u0016\u0012\u0004\u0012\u00020\'\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020%\u0018\u00010+H\u0002J\u0006\u0010,\u001a\u00020\'J\u000e\u0010-\u001a\u00020\'2\u0006\u0010.\u001a\u00020/R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0012\u0010\u001a\u001a\u00060\u001bR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u001c\u001a\u00020\u001d8F\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00130\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00061"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/feedback/SendFeedbackViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "serviceRepository", "Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceRepository;", "infoRepository", "Lcom/qualcomm/qti/gaiaclient/repository/deviceinfo/DeviceInformationRepository;", "(Landroid/app/Application;Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceRepository;Lcom/qualcomm/qti/gaiaclient/repository/deviceinfo/DeviceInformationRepository;)V", "_action", "Landroidx/lifecycle/MutableLiveData;", "Lcom/qualcomm/qti/gaiaclient/ui/feedback/Action;", "_content", "Lcom/qualcomm/qti/gaiaclient/ui/feedback/FeedbackContent;", "_issue", "Lcom/qualcomm/qti/gaiaclient/repository/service/feedback/Issue;", "_parameters", "Lcom/qualcomm/qti/gaiaclient/repository/service/feedback/FeedbackParameters;", "_progress", "Lcom/qualcomm/qti/gaiaclient/ui/feedback/FeedbackStatus;", "action", "Landroidx/lifecycle/LiveData;", "getAction", "()Landroidx/lifecycle/LiveData;", "content", "getContent", "dataObserver", "Lcom/qualcomm/qti/gaiaclient/ui/feedback/SendFeedbackViewModel$DataObserver;", "link", "", "getLink", "()Ljava/lang/String;", "progress", "getProgress", "getErrorMessage", "Lkotlin/Pair;", "error", "Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceError;", "onCleared", "", "onClick", "onResult", "result", "Lcom/qualcomm/qti/gaiaclient/repository/service/Result;", "sendFeedback", "setContent", "form", "Lcom/qualcomm/qti/gaiaclient/ui/feedback/FeedbackForm;", "DataObserver", "app_debug"})
public final class SendFeedbackViewModel extends androidx.lifecycle.AndroidViewModel {
    private final com.qualcomm.qti.gaiaclient.repository.service.ServiceRepository serviceRepository = null;
    private final com.qualcomm.qti.gaiaclient.repository.deviceinfo.DeviceInformationRepository infoRepository = null;
    private final com.qualcomm.qti.gaiaclient.ui.feedback.SendFeedbackViewModel.DataObserver dataObserver = null;
    private com.qualcomm.qti.gaiaclient.repository.service.feedback.Issue _issue;
    private final androidx.lifecycle.MutableLiveData<com.qualcomm.qti.gaiaclient.ui.feedback.FeedbackStatus> _progress = null;
    private final androidx.lifecycle.MutableLiveData<com.qualcomm.qti.gaiaclient.repository.service.feedback.FeedbackParameters> _parameters = null;
    private final androidx.lifecycle.MutableLiveData<com.qualcomm.qti.gaiaclient.ui.feedback.FeedbackContent> _content = null;
    private final androidx.lifecycle.MutableLiveData<com.qualcomm.qti.gaiaclient.ui.feedback.Action> _action = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.qualcomm.qti.gaiaclient.ui.feedback.FeedbackStatus> progress = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.qualcomm.qti.gaiaclient.ui.feedback.FeedbackContent> content = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.qualcomm.qti.gaiaclient.ui.feedback.Action> action = null;
    
    @javax.inject.Inject
    public SendFeedbackViewModel(@org.jetbrains.annotations.NotNull
    android.app.Application application, @org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.repository.service.ServiceRepository serviceRepository, @org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.repository.deviceinfo.DeviceInformationRepository infoRepository) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLink() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.qualcomm.qti.gaiaclient.ui.feedback.FeedbackStatus> getProgress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.qualcomm.qti.gaiaclient.ui.feedback.FeedbackContent> getContent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.qualcomm.qti.gaiaclient.ui.feedback.Action> getAction() {
        return null;
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
    
    public final void setContent(@org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.ui.feedback.FeedbackForm form) {
    }
    
    public final void sendFeedback() {
    }
    
    public final void onClick(@org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.ui.feedback.Action action) {
    }
    
    private final void onResult(com.qualcomm.qti.gaiaclient.repository.service.Result<kotlin.Unit, com.qualcomm.qti.gaiaclient.repository.service.feedback.Issue, com.qualcomm.qti.gaiaclient.repository.service.ServiceError> result) {
    }
    
    private final kotlin.Pair<java.lang.String, java.lang.String> getErrorMessage(com.qualcomm.qti.gaiaclient.repository.service.ServiceError error) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010\u000e\u001a\u00020\t2\u001e\u0010\u0006\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\b0\u0007J\u0006\u0010\u000f\u001a\u00020\tR\u0011\u0010\u0003\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005R(\u0010\u0006\u001a\u001c\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\b\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R&\u0010\f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\b0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/feedback/SendFeedbackViewModel$DataObserver;", "", "(Lcom/qualcomm/qti/gaiaclient/ui/feedback/SendFeedbackViewModel;)V", "isRunning", "", "()Z", "liveData", "Landroidx/lifecycle/LiveData;", "Lcom/qualcomm/qti/gaiaclient/repository/service/Result;", "", "Lcom/qualcomm/qti/gaiaclient/repository/service/feedback/Issue;", "Lcom/qualcomm/qti/gaiaclient/repository/service/ServiceError;", "progressObserver", "Landroidx/lifecycle/Observer;", "start", "stop", "app_debug"})
    final class DataObserver {
        private final androidx.lifecycle.Observer<com.qualcomm.qti.gaiaclient.repository.service.Result<kotlin.Unit, com.qualcomm.qti.gaiaclient.repository.service.feedback.Issue, com.qualcomm.qti.gaiaclient.repository.service.ServiceError>> progressObserver = null;
        private androidx.lifecycle.LiveData<com.qualcomm.qti.gaiaclient.repository.service.Result<kotlin.Unit, com.qualcomm.qti.gaiaclient.repository.service.feedback.Issue, com.qualcomm.qti.gaiaclient.repository.service.ServiceError>> liveData;
        
        public DataObserver() {
            super();
        }
        
        public final boolean isRunning() {
            return false;
        }
        
        public final void start(@org.jetbrains.annotations.NotNull
        androidx.lifecycle.LiveData<com.qualcomm.qti.gaiaclient.repository.service.Result<kotlin.Unit, com.qualcomm.qti.gaiaclient.repository.service.feedback.Issue, com.qualcomm.qti.gaiaclient.repository.service.ServiceError>> liveData) {
        }
        
        public final void stop() {
        }
    }
}