package com.qualcomm.qti.gaiaclient.ui.upgrade.download;

import android.app.Application;
import com.qualcomm.qti.gaiaclient.repository.service.ServiceRepository;
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
public final class DownloadViewModel_Factory implements Factory<DownloadViewModel> {
  private final Provider<Application> applicationProvider;

  private final Provider<ServiceRepository> serviceRepositoryProvider;

  private final Provider<UpgradeRepository> upgradeRepositoryProvider;

  public DownloadViewModel_Factory(Provider<Application> applicationProvider,
      Provider<ServiceRepository> serviceRepositoryProvider,
      Provider<UpgradeRepository> upgradeRepositoryProvider) {
    this.applicationProvider = applicationProvider;
    this.serviceRepositoryProvider = serviceRepositoryProvider;
    this.upgradeRepositoryProvider = upgradeRepositoryProvider;
  }

  @Override
  public DownloadViewModel get() {
    return newInstance(applicationProvider.get(), serviceRepositoryProvider.get(), upgradeRepositoryProvider.get());
  }

  public static DownloadViewModel_Factory create(Provider<Application> applicationProvider,
      Provider<ServiceRepository> serviceRepositoryProvider,
      Provider<UpgradeRepository> upgradeRepositoryProvider) {
    return new DownloadViewModel_Factory(applicationProvider, serviceRepositoryProvider, upgradeRepositoryProvider);
  }

  public static DownloadViewModel newInstance(Application application,
      ServiceRepository serviceRepository, UpgradeRepository upgradeRepository) {
    return new DownloadViewModel(application, serviceRepository, upgradeRepository);
  }
}
