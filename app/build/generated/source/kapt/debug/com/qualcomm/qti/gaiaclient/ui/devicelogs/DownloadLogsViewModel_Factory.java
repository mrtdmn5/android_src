package com.qualcomm.qti.gaiaclient.ui.devicelogs;

import android.app.Application;
import com.qualcomm.qti.gaiaclient.repository.logs.DeviceLogsRepository;
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
public final class DownloadLogsViewModel_Factory implements Factory<DownloadLogsViewModel> {
  private final Provider<Application> applicationProvider;

  private final Provider<DeviceLogsRepository> deviceLogsRepositoryProvider;

  public DownloadLogsViewModel_Factory(Provider<Application> applicationProvider,
      Provider<DeviceLogsRepository> deviceLogsRepositoryProvider) {
    this.applicationProvider = applicationProvider;
    this.deviceLogsRepositoryProvider = deviceLogsRepositoryProvider;
  }

  @Override
  public DownloadLogsViewModel get() {
    return newInstance(applicationProvider.get(), deviceLogsRepositoryProvider.get());
  }

  public static DownloadLogsViewModel_Factory create(Provider<Application> applicationProvider,
      Provider<DeviceLogsRepository> deviceLogsRepositoryProvider) {
    return new DownloadLogsViewModel_Factory(applicationProvider, deviceLogsRepositoryProvider);
  }

  public static DownloadLogsViewModel newInstance(Application application,
      DeviceLogsRepository deviceLogsRepository) {
    return new DownloadLogsViewModel(application, deviceLogsRepository);
  }
}
