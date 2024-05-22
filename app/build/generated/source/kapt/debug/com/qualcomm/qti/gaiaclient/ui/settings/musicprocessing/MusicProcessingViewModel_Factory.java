package com.qualcomm.qti.gaiaclient.ui.settings.musicprocessing;

import android.app.Application;
import com.qualcomm.qti.gaiaclient.repository.connection.ConnectionRepository;
import com.qualcomm.qti.gaiaclient.repository.musicprocessing.MusicProcessingRepository;
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
public final class MusicProcessingViewModel_Factory implements Factory<MusicProcessingViewModel> {
  private final Provider<Application> applicationProvider;

  private final Provider<ConnectionRepository> connectionRepositoryProvider;

  private final Provider<MusicProcessingRepository> musicProcessingRepositoryProvider;

  public MusicProcessingViewModel_Factory(Provider<Application> applicationProvider,
      Provider<ConnectionRepository> connectionRepositoryProvider,
      Provider<MusicProcessingRepository> musicProcessingRepositoryProvider) {
    this.applicationProvider = applicationProvider;
    this.connectionRepositoryProvider = connectionRepositoryProvider;
    this.musicProcessingRepositoryProvider = musicProcessingRepositoryProvider;
  }

  @Override
  public MusicProcessingViewModel get() {
    return newInstance(applicationProvider.get(), connectionRepositoryProvider.get(), musicProcessingRepositoryProvider.get());
  }

  public static MusicProcessingViewModel_Factory create(Provider<Application> applicationProvider,
      Provider<ConnectionRepository> connectionRepositoryProvider,
      Provider<MusicProcessingRepository> musicProcessingRepositoryProvider) {
    return new MusicProcessingViewModel_Factory(applicationProvider, connectionRepositoryProvider, musicProcessingRepositoryProvider);
  }

  public static MusicProcessingViewModel newInstance(Application application,
      ConnectionRepository connectionRepository,
      MusicProcessingRepository musicProcessingRepository) {
    return new MusicProcessingViewModel(application, connectionRepository, musicProcessingRepository);
  }
}
