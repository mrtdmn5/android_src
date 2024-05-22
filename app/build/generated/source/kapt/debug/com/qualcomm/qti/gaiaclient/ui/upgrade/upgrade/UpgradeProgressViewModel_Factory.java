package com.qualcomm.qti.gaiaclient.ui.upgrade.upgrade;

import android.app.Application;
import com.qualcomm.qti.gaiaclient.repository.system.SystemRepository;
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
public final class UpgradeProgressViewModel_Factory implements Factory<UpgradeProgressViewModel> {
  private final Provider<Application> applicationProvider;

  private final Provider<UpgradeRepository> upgradeRepositoryProvider;

  private final Provider<SystemRepository> systemRepositoryProvider;

  public UpgradeProgressViewModel_Factory(Provider<Application> applicationProvider,
      Provider<UpgradeRepository> upgradeRepositoryProvider,
      Provider<SystemRepository> systemRepositoryProvider) {
    this.applicationProvider = applicationProvider;
    this.upgradeRepositoryProvider = upgradeRepositoryProvider;
    this.systemRepositoryProvider = systemRepositoryProvider;
  }

  @Override
  public UpgradeProgressViewModel get() {
    return newInstance(applicationProvider.get(), upgradeRepositoryProvider.get(), systemRepositoryProvider.get());
  }

  public static UpgradeProgressViewModel_Factory create(Provider<Application> applicationProvider,
      Provider<UpgradeRepository> upgradeRepositoryProvider,
      Provider<SystemRepository> systemRepositoryProvider) {
    return new UpgradeProgressViewModel_Factory(applicationProvider, upgradeRepositoryProvider, systemRepositoryProvider);
  }

  public static UpgradeProgressViewModel newInstance(Application application,
      UpgradeRepository upgradeRepository, SystemRepository systemRepository) {
    return new UpgradeProgressViewModel(application, upgradeRepository, systemRepository);
  }
}
