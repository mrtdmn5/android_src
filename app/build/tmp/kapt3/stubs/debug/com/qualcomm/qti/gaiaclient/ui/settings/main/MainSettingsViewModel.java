package com.qualcomm.qti.gaiaclient.ui.settings.main;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00018B7\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002J\u0006\u0010\u0017\u001a\u00020\u0018J\u001e\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0002J.\u0010\u001f\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140!0 2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#H\u0002J\u0010\u0010%\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001bH\u0014J\b\u0010&\u001a\u00020\u0018H\u0014J\u0010\u0010\'\u001a\u00020\u00182\u0006\u0010(\u001a\u00020)H\u0014J\u0006\u0010*\u001a\u00020\u0018J\u001e\u0010+\u001a\u00020\u00182\u0014\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020.\u0018\u00010-H\u0002J\u000e\u0010/\u001a\u00020\u00182\u0006\u00100\u001a\u00020$J\u0016\u00101\u001a\u00020\u00182\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#H\u0002J\u0010\u00102\u001a\u00020\u00182\u0006\u00103\u001a\u000204H\u0002J\u0012\u00105\u001a\u00020\u00182\b\u00100\u001a\u0004\u0018\u00010$H\u0002J\u0016\u00106\u001a\u00020\u00182\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0002J\u0010\u00107\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u0016H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u00060\u0012R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00069"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/settings/main/MainSettingsViewModel;", "Lcom/qualcomm/qti/gaiaclient/ui/settings/common/SettingsViewModel;", "Lcom/qualcomm/qti/gaiaclient/ui/settings/main/MainSettings;", "Lcom/qualcomm/qti/gaiaclient/ui/settings/main/MainSettingsViewData;", "application", "Landroid/app/Application;", "connectionRepository", "Lcom/qualcomm/qti/gaiaclient/repository/connection/ConnectionRepository;", "deviceInfoRepository", "Lcom/qualcomm/qti/gaiaclient/repository/deviceinfo/DeviceInformationRepository;", "featuresRepository", "Lcom/qualcomm/qti/gaiaclient/repository/features/FeaturesRepository;", "voiceUIRepository", "Lcom/qualcomm/qti/gaiaclient/repository/voiceui/VoiceUIRepository;", "systemRepository", "Lcom/qualcomm/qti/gaiaclient/repository/system/SystemRepository;", "(Landroid/app/Application;Lcom/qualcomm/qti/gaiaclient/repository/connection/ConnectionRepository;Lcom/qualcomm/qti/gaiaclient/repository/deviceinfo/DeviceInformationRepository;Lcom/qualcomm/qti/gaiaclient/repository/features/FeaturesRepository;Lcom/qualcomm/qti/gaiaclient/repository/voiceui/VoiceUIRepository;Lcom/qualcomm/qti/gaiaclient/repository/system/SystemRepository;)V", "observers", "Lcom/qualcomm/qti/gaiaclient/ui/settings/main/MainSettingsViewModel$DataObservers;", "buildApplicationFeaturesLabel", "", "userFeatures", "Lcom/qualcomm/qti/gaiaclient/core/gaia/qtil/data/basic/userfeatures/UserFeatures;", "disconnect", "", "fetchData", "context", "Landroid/content/Context;", "features", "", "Lcom/qualcomm/qti/gaiaclient/core/gaia/qtil/data/QTILFeature;", "getEntries", "Landroidx/core/util/Pair;", "", "assistants", "", "Lcom/qualcomm/qti/gaiaclient/core/gaia/qtil/data/VoiceAssistant;", "initViewData", "onCleared", "onConnectionStateUpdated", "state", "Lcom/qualcomm/qti/gaiaclient/core/bluetooth/data/ConnectionState;", "onResumed", "onSupportedFeatures", "supportedFeatures", "Landroidx/collection/ArrayMap;", "", "setAssistant", "assistant", "updateAssistants", "updateLogSupport", "isAndroidDeveloperModeOn", "", "updateSelectedAssistant", "updateSettingSupport", "updateUserFeatures", "DataObservers", "app_debug"})
public final class MainSettingsViewModel extends com.qualcomm.qti.gaiaclient.ui.settings.common.SettingsViewModel<com.qualcomm.qti.gaiaclient.ui.settings.main.MainSettings, com.qualcomm.qti.gaiaclient.ui.settings.main.MainSettingsViewData> {
    private final com.qualcomm.qti.gaiaclient.repository.connection.ConnectionRepository connectionRepository = null;
    private final com.qualcomm.qti.gaiaclient.repository.deviceinfo.DeviceInformationRepository deviceInfoRepository = null;
    private final com.qualcomm.qti.gaiaclient.repository.features.FeaturesRepository featuresRepository = null;
    private final com.qualcomm.qti.gaiaclient.repository.voiceui.VoiceUIRepository voiceUIRepository = null;
    private final com.qualcomm.qti.gaiaclient.repository.system.SystemRepository systemRepository = null;
    private final com.qualcomm.qti.gaiaclient.ui.settings.main.MainSettingsViewModel.DataObservers observers = null;
    
    @javax.inject.Inject
    public MainSettingsViewModel(@org.jetbrains.annotations.NotNull
    android.app.Application application, @org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.repository.connection.ConnectionRepository connectionRepository, @org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.repository.deviceinfo.DeviceInformationRepository deviceInfoRepository, @org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.repository.features.FeaturesRepository featuresRepository, @org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.repository.voiceui.VoiceUIRepository voiceUIRepository, @org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.repository.system.SystemRepository systemRepository) {
        super(null, null);
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    protected com.qualcomm.qti.gaiaclient.ui.settings.main.MainSettingsViewData initViewData(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
    
    @java.lang.Override
    protected void onConnectionStateUpdated(@org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.core.bluetooth.data.ConnectionState state) {
    }
    
    public final void onResumed() {
    }
    
    public final void disconnect() {
    }
    
    public final void setAssistant(@org.jetbrains.annotations.NotNull
    com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.VoiceAssistant assistant) {
    }
    
    private final void onSupportedFeatures(androidx.collection.ArrayMap<com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.QTILFeature, java.lang.Integer> supportedFeatures) {
    }
    
    private final void updateSettingSupport(java.util.Set<? extends com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.QTILFeature> features) {
    }
    
    private final void fetchData(android.content.Context context, java.util.Set<? extends com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.QTILFeature> features) {
    }
    
    private final void updateLogSupport(boolean isAndroidDeveloperModeOn) {
    }
    
    private final void updateUserFeatures(com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.basic.userfeatures.UserFeatures features) {
    }
    
    private final void updateSelectedAssistant(com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.VoiceAssistant assistant) {
    }
    
    private final void updateAssistants(java.util.List<? extends com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.VoiceAssistant> assistants) {
    }
    
    private final androidx.core.util.Pair<java.lang.String[], java.lang.String[]> getEntries(java.util.List<? extends com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.VoiceAssistant> assistants) {
        return null;
    }
    
    private final java.lang.String buildApplicationFeaturesLabel(com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.basic.userfeatures.UserFeatures userFeatures) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0018\u001a\u00020\tH\u0014J\b\u0010\u0019\u001a\u00020\tH\u0014R)\u0010\u0003\u001a\u001d\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R/\u0010\n\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R7\u0010\u000e\u001a+\u0012!\u0012\u001f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\u0013\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\f\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R)\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00110\u0016\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/qualcomm/qti/gaiaclient/ui/settings/main/MainSettingsViewModel$DataObservers;", "Lcom/qualcomm/qti/gaiaclient/ui/common/Observers;", "(Lcom/qualcomm/qti/gaiaclient/ui/settings/main/MainSettingsViewModel;)V", "androidDeveloperModeObserver", "Lkotlin/reflect/KFunction1;", "", "Lkotlin/ParameterName;", "name", "isAndroidDeveloperModeOn", "", "assistantsObserver", "", "Lcom/qualcomm/qti/gaiaclient/core/gaia/qtil/data/VoiceAssistant;", "assistants", "featuresObserver", "Landroidx/collection/ArrayMap;", "Lcom/qualcomm/qti/gaiaclient/core/gaia/qtil/data/QTILFeature;", "", "supportedFeatures", "selectedAssistantObserver", "assistant", "userFeaturesObserver", "Lcom/qualcomm/qti/gaiaclient/core/gaia/qtil/data/basic/userfeatures/UserFeatures;", "features", "registerObservers", "unregisterObservers", "app_debug"})
    final class DataObservers extends com.qualcomm.qti.gaiaclient.ui.common.Observers {
        private final kotlin.reflect.KFunction<kotlin.Unit> featuresObserver = null;
        private final kotlin.reflect.KFunction<kotlin.Unit> userFeaturesObserver = null;
        private final kotlin.reflect.KFunction<kotlin.Unit> androidDeveloperModeObserver = null;
        private final kotlin.reflect.KFunction<kotlin.Unit> assistantsObserver = null;
        private final kotlin.reflect.KFunction<kotlin.Unit> selectedAssistantObserver = null;
        
        public DataObservers() {
            super();
        }
        
        @java.lang.Override
        protected void registerObservers() {
        }
        
        @java.lang.Override
        protected void unregisterObservers() {
        }
    }
}