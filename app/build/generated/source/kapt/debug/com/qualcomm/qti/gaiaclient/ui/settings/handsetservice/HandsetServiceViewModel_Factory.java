package com.qualcomm.qti.gaiaclient.ui.settings.handsetservice;

import android.app.Application;
import com.qualcomm.qti.gaiaclient.repository.connection.ConnectionRepository;
import com.qualcomm.qti.gaiaclient.repository.handsetservice.HandsetServiceRepository;
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
public final class HandsetServiceViewModel_Factory implements Factory<HandsetServiceViewModel> {
  private final Provider<Application> applicationProvider;

  private final Provider<ConnectionRepository> connectionRepositoryProvider;

  private final Provider<HandsetServiceRepository> handsetServiceRepositoryProvider;

  public HandsetServiceViewModel_Factory(Provider<Application> applicationProvider,
      Provider<ConnectionRepository> connectionRepositoryProvider,
      Provider<HandsetServiceRepository> handsetServiceRepositoryProvider) {
    this.applicationProvider = applicationProvider;
    this.connectionRepositoryProvider = connectionRepositoryProvider;
    this.handsetServiceRepositoryProvider = handsetServiceRepositoryProvider;
  }

  @Override
  public HandsetServiceViewModel get() {
    return newInstance(applicationProvider.get(), connectionRepositoryProvider.get(), handsetServiceRepositoryProvider.get());
  }

  public static HandsetServiceViewModel_Factory create(Provider<Application> applicationProvider,
      Provider<ConnectionRepository> connectionRepositoryProvider,
      Provider<HandsetServiceRepository> handsetServiceRepositoryProvider) {
    return new HandsetServiceViewModel_Factory(applicationProvider, connectionRepositoryProvider, handsetServiceRepositoryProvider);
  }

  public static HandsetServiceViewModel newInstance(Application application,
      ConnectionRepository connectionRepository,
      HandsetServiceRepository handsetServiceRepository) {
    return new HandsetServiceViewModel(application, connectionRepository, handsetServiceRepository);
  }
}
