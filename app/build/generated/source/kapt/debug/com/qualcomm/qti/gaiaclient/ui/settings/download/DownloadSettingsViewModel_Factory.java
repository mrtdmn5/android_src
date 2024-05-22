package com.qualcomm.qti.gaiaclient.ui.settings.download;

import android.app.Application;
import com.qualcomm.qti.gaiaclient.repository.connection.ConnectionRepository;
import com.qualcomm.qti.gaiaclient.repository.deviceinfo.DeviceInformationRepository;
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
public final class DownloadSettingsViewModel_Factory implements Factory<DownloadSettingsViewModel> {
  private final Provider<Application> applicationProvider;

  private final Provider<ConnectionRepository> connectionRepositoryProvider;

  private final Provider<DeviceInformationRepository> deviceInfoRepositoryProvider;

  public DownloadSettingsViewModel_Factory(Provider<Application> applicationProvider,
      Provider<ConnectionRepository> connectionRepositoryProvider,
      Provider<DeviceInformationRepository> deviceInfoRepositoryProvider) {
    this.applicationProvider = applicationProvider;
    this.connectionRepositoryProvider = connectionRepositoryProvider;
    this.deviceInfoRepositoryProvider = deviceInfoRepositoryProvider;
  }

  @Override
  public DownloadSettingsViewModel get() {
    return newInstance(applicationProvider.get(), connectionRepositoryProvider.get(), deviceInfoRepositoryProvider.get());
  }

  public static DownloadSettingsViewModel_Factory create(Provider<Application> applicationProvider,
      Provider<ConnectionRepository> connectionRepositoryProvider,
      Provider<DeviceInformationRepository> deviceInfoRepositoryProvider) {
    return new DownloadSettingsViewModel_Factory(applicationProvider, connectionRepositoryProvider, deviceInfoRepositoryProvider);
  }

  public static DownloadSettingsViewModel newInstance(Application application,
      ConnectionRepository connectionRepository, DeviceInformationRepository deviceInfoRepository) {
    return new DownloadSettingsViewModel(application, connectionRepository, deviceInfoRepository);
  }
}
