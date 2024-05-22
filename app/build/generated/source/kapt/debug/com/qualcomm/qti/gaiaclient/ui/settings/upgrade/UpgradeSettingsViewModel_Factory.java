package com.qualcomm.qti.gaiaclient.ui.settings.upgrade;

import android.app.Application;
import com.qualcomm.qti.gaiaclient.repository.connection.ConnectionRepository;
import com.qualcomm.qti.gaiaclient.repository.deviceinfo.DeviceInformationRepository;
import com.qualcomm.qti.gaiaclient.repository.upgrade.UpgradeRepository;
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
public final class UpgradeSettingsViewModel_Factory implements Factory<UpgradeSettingsViewModel> {
  private final Provider<Application> applicationProvider;

  private final Provider<ConnectionRepository> connectionRepositoryProvider;

  private final Provider<DeviceInformationRepository> deviceInfoRepositoryProvider;

  private final Provider<UpgradeRepository> upgradeRepositoryProvider;

  public UpgradeSettingsViewModel_Factory(Provider<Application> applicationProvider,
      Provider<ConnectionRepository> connectionRepositoryProvider,
      Provider<DeviceInformationRepository> deviceInfoRepositoryProvider,
      Provider<UpgradeRepository> upgradeRepositoryProvider) {
    this.applicationProvider = applicationProvider;
    this.connectionRepositoryProvider = connectionRepositoryProvider;
    this.deviceInfoRepositoryProvider = deviceInfoRepositoryProvider;
    this.upgradeRepositoryProvider = upgradeRepositoryProvider;
  }

  @Override
  public UpgradeSettingsViewModel get() {
    return newInstance(applicationProvider.get(), connectionRepositoryProvider.get(), deviceInfoRepositoryProvider.get(), upgradeRepositoryProvider.get());
  }

  public static UpgradeSettingsViewModel_Factory create(Provider<Application> applicationProvider,
      Provider<ConnectionRepository> connectionRepositoryProvider,
      Provider<DeviceInformationRepository> deviceInfoRepositoryProvider,
      Provider<UpgradeRepository> upgradeRepositoryProvider) {
    return new UpgradeSettingsViewModel_Factory(applicationProvider, connectionRepositoryProvider, deviceInfoRepositoryProvider, upgradeRepositoryProvider);
  }

  public static UpgradeSettingsViewModel newInstance(Application application,
      ConnectionRepository connectionRepository, DeviceInformationRepository deviceInfoRepository,
      UpgradeRepository upgradeRepository) {
    return new UpgradeSettingsViewModel(application, connectionRepository, deviceInfoRepository, upgradeRepository);
  }
}
