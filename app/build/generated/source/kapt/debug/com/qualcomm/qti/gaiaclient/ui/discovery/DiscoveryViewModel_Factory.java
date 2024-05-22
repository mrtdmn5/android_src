package com.qualcomm.qti.gaiaclient.ui.discovery;

import android.app.Application;
import com.qualcomm.qti.gaiaclient.repository.discovery.DiscoveryRepository;
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
public final class DiscoveryViewModel_Factory implements Factory<DiscoveryViewModel> {
  private final Provider<Application> applicationProvider;

  private final Provider<DiscoveryRepository> discoveryRepositoryProvider;

  public DiscoveryViewModel_Factory(Provider<Application> applicationProvider,
      Provider<DiscoveryRepository> discoveryRepositoryProvider) {
    this.applicationProvider = applicationProvider;
    this.discoveryRepositoryProvider = discoveryRepositoryProvider;
  }

  @Override
  public DiscoveryViewModel get() {
    return newInstance(applicationProvider.get(), discoveryRepositoryProvider.get());
  }

  public static DiscoveryViewModel_Factory create(Provider<Application> applicationProvider,
      Provider<DiscoveryRepository> discoveryRepositoryProvider) {
    return new DiscoveryViewModel_Factory(applicationProvider, discoveryRepositoryProvider);
  }

  public static DiscoveryViewModel newInstance(Application application,
      DiscoveryRepository discoveryRepository) {
    return new DiscoveryViewModel(application, discoveryRepository);
  }
}
