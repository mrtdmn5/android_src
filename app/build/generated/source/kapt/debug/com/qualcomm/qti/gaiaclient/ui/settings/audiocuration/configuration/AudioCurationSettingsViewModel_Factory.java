package com.qualcomm.qti.gaiaclient.ui.settings.audiocuration.configuration;

import android.app.Application;
import com.qualcomm.qti.gaiaclient.repository.audiocuration.AudioCurationRepository;
import com.qualcomm.qti.gaiaclient.repository.connection.ConnectionRepository;
import com.qualcomm.qti.gaiaclient.repository.features.FeaturesRepository;
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
public final class AudioCurationSettingsViewModel_Factory implements Factory<AudioCurationSettingsViewModel> {
  private final Provider<Application> applicationProvider;

  private final Provider<AudioCurationRepository> audioCurationRepositoryProvider;

  private final Provider<ConnectionRepository> connectionRepositoryProvider;

  private final Provider<FeaturesRepository> featuresRepositoryProvider;

  public AudioCurationSettingsViewModel_Factory(Provider<Application> applicationProvider,
      Provider<AudioCurationRepository> audioCurationRepositoryProvider,
      Provider<ConnectionRepository> connectionRepositoryProvider,
      Provider<FeaturesRepository> featuresRepositoryProvider) {
    this.applicationProvider = applicationProvider;
    this.audioCurationRepositoryProvider = audioCurationRepositoryProvider;
    this.connectionRepositoryProvider = connectionRepositoryProvider;
    this.featuresRepositoryProvider = featuresRepositoryProvider;
  }

  @Override
  public AudioCurationSettingsViewModel get() {
    return newInstance(applicationProvider.get(), audioCurationRepositoryProvider.get(), connectionRepositoryProvider.get(), featuresRepositoryProvider.get());
  }

  public static AudioCurationSettingsViewModel_Factory create(
      Provider<Application> applicationProvider,
      Provider<AudioCurationRepository> audioCurationRepositoryProvider,
      Provider<ConnectionRepository> connectionRepositoryProvider,
      Provider<FeaturesRepository> featuresRepositoryProvider) {
    return new AudioCurationSettingsViewModel_Factory(applicationProvider, audioCurationRepositoryProvider, connectionRepositoryProvider, featuresRepositoryProvider);
  }

  public static AudioCurationSettingsViewModel newInstance(Application application,
      AudioCurationRepository audioCurationRepository, ConnectionRepository connectionRepository,
      FeaturesRepository featuresRepository) {
    return new AudioCurationSettingsViewModel(application, audioCurationRepository, connectionRepository, featuresRepository);
  }
}
