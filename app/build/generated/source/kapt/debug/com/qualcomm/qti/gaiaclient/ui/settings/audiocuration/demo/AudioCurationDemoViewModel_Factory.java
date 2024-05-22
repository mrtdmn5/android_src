package com.qualcomm.qti.gaiaclient.ui.settings.audiocuration.demo;

import android.app.Application;
import com.qualcomm.qti.gaiaclient.repository.audiocuration.AudioCurationRepository;
import com.qualcomm.qti.gaiaclient.repository.connection.ConnectionRepository;
import com.qualcomm.qti.gaiaclient.repository.features.FeaturesRepository;
import com.qualcomm.qti.gaiaclient.repository.mediaplayback.MediaPlaybackRepository;
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
public final class AudioCurationDemoViewModel_Factory implements Factory<AudioCurationDemoViewModel> {
  private final Provider<Application> applicationProvider;

  private final Provider<AudioCurationRepository> audioCurationRepositoryProvider;

  private final Provider<ConnectionRepository> connectionRepositoryProvider;

  private final Provider<FeaturesRepository> featuresRepositoryProvider;

  private final Provider<MediaPlaybackRepository> mediaPlaybackRepositoryProvider;

  public AudioCurationDemoViewModel_Factory(Provider<Application> applicationProvider,
      Provider<AudioCurationRepository> audioCurationRepositoryProvider,
      Provider<ConnectionRepository> connectionRepositoryProvider,
      Provider<FeaturesRepository> featuresRepositoryProvider,
      Provider<MediaPlaybackRepository> mediaPlaybackRepositoryProvider) {
    this.applicationProvider = applicationProvider;
    this.audioCurationRepositoryProvider = audioCurationRepositoryProvider;
    this.connectionRepositoryProvider = connectionRepositoryProvider;
    this.featuresRepositoryProvider = featuresRepositoryProvider;
    this.mediaPlaybackRepositoryProvider = mediaPlaybackRepositoryProvider;
  }

  @Override
  public AudioCurationDemoViewModel get() {
    return newInstance(applicationProvider.get(), audioCurationRepositoryProvider.get(), connectionRepositoryProvider.get(), featuresRepositoryProvider.get(), mediaPlaybackRepositoryProvider.get());
  }

  public static AudioCurationDemoViewModel_Factory create(Provider<Application> applicationProvider,
      Provider<AudioCurationRepository> audioCurationRepositoryProvider,
      Provider<ConnectionRepository> connectionRepositoryProvider,
      Provider<FeaturesRepository> featuresRepositoryProvider,
      Provider<MediaPlaybackRepository> mediaPlaybackRepositoryProvider) {
    return new AudioCurationDemoViewModel_Factory(applicationProvider, audioCurationRepositoryProvider, connectionRepositoryProvider, featuresRepositoryProvider, mediaPlaybackRepositoryProvider);
  }

  public static AudioCurationDemoViewModel newInstance(Application application,
      AudioCurationRepository audioCurationRepository, ConnectionRepository connectionRepository,
      FeaturesRepository featuresRepository, MediaPlaybackRepository mediaPlaybackRepository) {
    return new AudioCurationDemoViewModel(application, audioCurationRepository, connectionRepository, featuresRepository, mediaPlaybackRepository);
  }
}
