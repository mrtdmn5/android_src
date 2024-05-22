package com.qualcomm.qti.gaiaclient.ui.gestures.configuration;

import android.app.Application;
import com.qualcomm.qti.gaiaclient.repository.features.FeaturesRepository;
import com.qualcomm.qti.gaiaclient.repository.gestureconfiguration.GestureConfigurationRepository;
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
public final class ConfigurationListViewModel_Factory implements Factory<ConfigurationListViewModel> {
  private final Provider<Application> applicationProvider;

  private final Provider<FeaturesRepository> featuresRepositoryProvider;

  private final Provider<GestureConfigurationRepository> gestureConfigurationRepositoryProvider;

  public ConfigurationListViewModel_Factory(Provider<Application> applicationProvider,
      Provider<FeaturesRepository> featuresRepositoryProvider,
      Provider<GestureConfigurationRepository> gestureConfigurationRepositoryProvider) {
    this.applicationProvider = applicationProvider;
    this.featuresRepositoryProvider = featuresRepositoryProvider;
    this.gestureConfigurationRepositoryProvider = gestureConfigurationRepositoryProvider;
  }

  @Override
  public ConfigurationListViewModel get() {
    return newInstance(applicationProvider.get(), featuresRepositoryProvider.get(), gestureConfigurationRepositoryProvider.get());
  }

  public static ConfigurationListViewModel_Factory create(Provider<Application> applicationProvider,
      Provider<FeaturesRepository> featuresRepositoryProvider,
      Provider<GestureConfigurationRepository> gestureConfigurationRepositoryProvider) {
    return new ConfigurationListViewModel_Factory(applicationProvider, featuresRepositoryProvider, gestureConfigurationRepositoryProvider);
  }

  public static ConfigurationListViewModel newInstance(Application application,
      FeaturesRepository featuresRepository,
      GestureConfigurationRepository gestureConfigurationRepository) {
    return new ConfigurationListViewModel(application, featuresRepository, gestureConfigurationRepository);
  }
}
