package com.qualcomm.qti.gaiaclient.ui.gestures.gestures;

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
public final class GesturesViewModel_Factory implements Factory<GesturesViewModel> {
  private final Provider<Application> applicationProvider;

  private final Provider<FeaturesRepository> featuresRepositoryProvider;

  private final Provider<GestureConfigurationRepository> gestureConfigurationRepositoryProvider;

  public GesturesViewModel_Factory(Provider<Application> applicationProvider,
      Provider<FeaturesRepository> featuresRepositoryProvider,
      Provider<GestureConfigurationRepository> gestureConfigurationRepositoryProvider) {
    this.applicationProvider = applicationProvider;
    this.featuresRepositoryProvider = featuresRepositoryProvider;
    this.gestureConfigurationRepositoryProvider = gestureConfigurationRepositoryProvider;
  }

  @Override
  public GesturesViewModel get() {
    return newInstance(applicationProvider.get(), featuresRepositoryProvider.get(), gestureConfigurationRepositoryProvider.get());
  }

  public static GesturesViewModel_Factory create(Provider<Application> applicationProvider,
      Provider<FeaturesRepository> featuresRepositoryProvider,
      Provider<GestureConfigurationRepository> gestureConfigurationRepositoryProvider) {
    return new GesturesViewModel_Factory(applicationProvider, featuresRepositoryProvider, gestureConfigurationRepositoryProvider);
  }

  public static GesturesViewModel newInstance(Application application,
      FeaturesRepository featuresRepository,
      GestureConfigurationRepository gestureConfigurationRepository) {
    return new GesturesViewModel(application, featuresRepository, gestureConfigurationRepository);
  }
}
