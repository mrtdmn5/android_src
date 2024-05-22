package com.qualcomm.qti.gaiaclient.ui.settings.logs;

import android.app.Application;
import com.qualcomm.qti.gaiaclient.repository.connection.ConnectionRepository;
import com.qualcomm.qti.gaiaclient.repository.features.FeaturesRepository;
import com.qualcomm.qti.gaiaclient.repository.logs.DeviceLogsRepository;
import com.qualcomm.qti.gaiaclient.repository.system.SystemRepository;
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
public final class LogsSettingsViewModel_Factory implements Factory<LogsSettingsViewModel> {
  private final Provider<Application> applicationProvider;

  private final Provider<ConnectionRepository> connectionRepositoryProvider;

  private final Provider<DeviceLogsRepository> deviceLogsRepositoryProvider;

  private final Provider<FeaturesRepository> featuresRepositoryProvider;

  private final Provider<SystemRepository> systemRepositoryProvider;

  public LogsSettingsViewModel_Factory(Provider<Application> applicationProvider,
      Provider<ConnectionRepository> connectionRepositoryProvider,
      Provider<DeviceLogsRepository> deviceLogsRepositoryProvider,
      Provider<FeaturesRepository> featuresRepositoryProvider,
      Provider<SystemRepository> systemRepositoryProvider) {
    this.applicationProvider = applicationProvider;
    this.connectionRepositoryProvider = connectionRepositoryProvider;
    this.deviceLogsRepositoryProvider = deviceLogsRepositoryProvider;
    this.featuresRepositoryProvider = featuresRepositoryProvider;
    this.systemRepositoryProvider = systemRepositoryProvider;
  }

  @Override
  public LogsSettingsViewModel get() {
    return newInstance(applicationProvider.get(), connectionRepositoryProvider.get(), deviceLogsRepositoryProvider.get(), featuresRepositoryProvider.get(), systemRepositoryProvider.get());
  }

  public static LogsSettingsViewModel_Factory create(Provider<Application> applicationProvider,
      Provider<ConnectionRepository> connectionRepositoryProvider,
      Provider<DeviceLogsRepository> deviceLogsRepositoryProvider,
      Provider<FeaturesRepository> featuresRepositoryProvider,
      Provider<SystemRepository> systemRepositoryProvider) {
    return new LogsSettingsViewModel_Factory(applicationProvider, connectionRepositoryProvider, deviceLogsRepositoryProvider, featuresRepositoryProvider, systemRepositoryProvider);
  }

  public static LogsSettingsViewModel newInstance(Application application,
      ConnectionRepository connectionRepository, DeviceLogsRepository deviceLogsRepository,
      FeaturesRepository featuresRepository, SystemRepository systemRepository) {
    return new LogsSettingsViewModel(application, connectionRepository, deviceLogsRepository, featuresRepository, systemRepository);
  }
}
