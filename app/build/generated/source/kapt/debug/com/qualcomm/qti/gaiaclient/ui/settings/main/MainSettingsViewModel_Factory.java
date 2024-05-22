package com.qualcomm.qti.gaiaclient.ui.settings.main;

import android.app.Application;
import com.qualcomm.qti.gaiaclient.repository.connection.ConnectionRepository;
import com.qualcomm.qti.gaiaclient.repository.deviceinfo.DeviceInformationRepository;
import com.qualcomm.qti.gaiaclient.repository.features.FeaturesRepository;
import com.qualcomm.qti.gaiaclient.repository.system.SystemRepository;
import com.qualcomm.qti.gaiaclient.repository.voiceui.VoiceUIRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MainSettingsViewModel_Factory implements Factory<MainSettingsViewModel> {
  private final Provider<Application> applicationProvider;

  private final Provider<ConnectionRepository> connectionRepositoryProvider;

  private final Provider<DeviceInformationRepository> deviceInfoRepositoryProvider;

  private final Provider<FeaturesRepository> featuresRepositoryProvider;

  private final Provider<VoiceUIRepository> voiceUIRepositoryProvider;

  private final Provider<SystemRepository> systemRepositoryProvider;

  public MainSettingsViewModel_Factory(Provider<Application> applicationProvider,
      Provider<ConnectionRepository> connectionRepositoryProvider,
      Provider<DeviceInformationRepository> deviceInfoRepositoryProvider,
      Provider<FeaturesRepository> featuresRepositoryProvider,
      Provider<VoiceUIRepository> voiceUIRepositoryProvider,
      Provider<SystemRepository> systemRepositoryProvider) {
    this.applicationProvider = applicationProvider;
    this.connectionRepositoryProvider = connectionRepositoryProvider;
    this.deviceInfoRepositoryProvider = deviceInfoRepositoryProvider;
    this.featuresRepositoryProvider = featuresRepositoryProvider;
    this.voiceUIRepositoryProvider = voiceUIRepositoryProvider;
    this.systemRepositoryProvider = systemRepositoryProvider;
  }

  @Override
  public MainSettingsViewModel get() {
    return newInstance(applicationProvider.get(), connectionRepositoryProvider.get(), deviceInfoRepositoryProvider.get(), featuresRepositoryProvider.get(), voiceUIRepositoryProvider.get(), systemRepositoryProvider.get());
  }

  public static MainSettingsViewModel_Factory create(Provider<Application> applicationProvider,
      Provider<ConnectionRepository> connectionRepositoryProvider,
      Provider<DeviceInformationRepository> deviceInfoRepositoryProvider,
      Provider<FeaturesRepository> featuresRepositoryProvider,
      Provider<VoiceUIRepository> voiceUIRepositoryProvider,
      Provider<SystemRepository> systemRepositoryProvider) {
    return new MainSettingsViewModel_Factory(applicationProvider, connectionRepositoryProvider, deviceInfoRepositoryProvider, featuresRepositoryProvider, voiceUIRepositoryProvider, systemRepositoryProvider);
  }

  public static MainSettingsViewModel newInstance(Application application,
      ConnectionRepository connectionRepository, DeviceInformationRepository deviceInfoRepository,
      FeaturesRepository featuresRepository, VoiceUIRepository voiceUIRepository,
      SystemRepository systemRepository) {
    return new MainSettingsViewModel(application, connectionRepository, deviceInfoRepository, featuresRepository, voiceUIRepository, systemRepository);
  }
}
