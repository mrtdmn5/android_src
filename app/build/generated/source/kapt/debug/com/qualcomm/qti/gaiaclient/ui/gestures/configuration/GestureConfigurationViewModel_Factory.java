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
public final class GestureConfigurationViewModel_Factory implements Factory<GestureConfigurationViewModel> {
  private final Provider<Application> applicationProvider;

  private final Provider<FeaturesRepository> featuresRepositoryProvider;

  private final Provider<GestureConfigurationRepository> gestureConfigurationRepositoryProvider;

  public GestureConfigurationViewModel_Factory(Provider<Application> applicationProvider,
      Provider<FeaturesRepository> featuresRepositoryProvider,
      Provider<GestureConfigurationRepository> gestureConfigurationRepositoryProvider) {
    this.applicationProvider = applicationProvider;
    this.featuresRepositoryProvider = featuresRepositoryProvider;
    this.gestureConfigurationRepositoryProvider = gestureConfigurationRepositoryProvider;
  }

  @Override
  public GestureConfigurationViewModel get() {
    return newInstance(applicationProvider.get(), featuresRepositoryProvider.get(), gestureConfigurationRepositoryProvider.get());
  }

  public static GestureConfigurationViewModel_Factory create(
      Provider<Application> applicationProvider,
      Provider<FeaturesRepository> featuresRepositoryProvider,
      Provider<GestureConfigurationRepository> gestureConfigurationRepositoryProvider) {
    return new GestureConfigurationViewModel_Factory(applicationProvider, featuresRepositoryProvider, gestureConfigurationRepositoryProvider);
  }

  public static GestureConfigurationViewModel newInstance(Application application,
      FeaturesRepository featuresRepository,
      GestureConfigurationRepository gestureConfigurationRepository) {
    return new GestureConfigurationViewModel(application, featuresRepository, gestureConfigurationRepository);
  }
}
