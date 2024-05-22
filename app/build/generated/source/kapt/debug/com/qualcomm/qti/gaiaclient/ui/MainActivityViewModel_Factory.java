package com.qualcomm.qti.gaiaclient.ui;

import android.app.Application;
import com.qualcomm.qti.gaiaclient.repository.connection.ConnectionRepository;
import com.qualcomm.qti.gaiaclient.repository.discovery.DiscoveryRepository;
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
public final class MainActivityViewModel_Factory implements Factory<MainActivityViewModel> {
  private final Provider<Application> applicationProvider;

  private final Provider<ConnectionRepository> connectionRepositoryProvider;

  private final Provider<DiscoveryRepository> discoveryRepositoryProvider;

  private final Provider<SystemRepository> systemRepositoryProvider;

  public MainActivityViewModel_Factory(Provider<Application> applicationProvider,
      Provider<ConnectionRepository> connectionRepositoryProvider,
      Provider<DiscoveryRepository> discoveryRepositoryProvider,
      Provider<SystemRepository> systemRepositoryProvider) {
    this.applicationProvider = applicationProvider;
    this.connectionRepositoryProvider = connectionRepositoryProvider;
    this.discoveryRepositoryProvider = discoveryRepositoryProvider;
    this.systemRepositoryProvider = systemRepositoryProvider;
  }

  @Override
  public MainActivityViewModel get() {
    return newInstance(applicationProvider.get(), connectionRepositoryProvider.get(), discoveryRepositoryProvider.get(), systemRepositoryProvider.get());
  }

  public static MainActivityViewModel_Factory create(Provider<Application> applicationProvider,
      Provider<ConnectionRepository> connectionRepositoryProvider,
      Provider<DiscoveryRepository> discoveryRepositoryProvider,
      Provider<SystemRepository> systemRepositoryProvider) {
    return new MainActivityViewModel_Factory(applicationProvider, connectionRepositoryProvider, discoveryRepositoryProvider, systemRepositoryProvider);
  }

  public static MainActivityViewModel newInstance(Application application,
      ConnectionRepository connectionRepository, DiscoveryRepository discoveryRepository,
      SystemRepository systemRepository) {
    return new MainActivityViewModel(application, connectionRepository, discoveryRepository, systemRepository);
  }
}
