package com.qualcomm.qti.gaiaclient.ui.settings.voiceprocessing;

import android.app.Application;
import com.qualcomm.qti.gaiaclient.repository.connection.ConnectionRepository;
import com.qualcomm.qti.gaiaclient.repository.features.FeaturesRepository;
import com.qualcomm.qti.gaiaclient.repository.voiceprocessing.VoiceProcessingRepository;
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
public final class VoiceProcessingViewModel_Factory implements Factory<VoiceProcessingViewModel> {
  private final Provider<Application> applicationProvider;

  private final Provider<ConnectionRepository> connectionRepositoryProvider;

  private final Provider<FeaturesRepository> featuresRepositoryProvider;

  private final Provider<VoiceProcessingRepository> voiceProcessingRepositoryProvider;

  public VoiceProcessingViewModel_Factory(Provider<Application> applicationProvider,
      Provider<ConnectionRepository> connectionRepositoryProvider,
      Provider<FeaturesRepository> featuresRepositoryProvider,
      Provider<VoiceProcessingRepository> voiceProcessingRepositoryProvider) {
    this.applicationProvider = applicationProvider;
    this.connectionRepositoryProvider = connectionRepositoryProvider;
    this.featuresRepositoryProvider = featuresRepositoryProvider;
    this.voiceProcessingRepositoryProvider = voiceProcessingRepositoryProvider;
  }

  @Override
  public VoiceProcessingViewModel get() {
    return newInstance(applicationProvider.get(), connectionRepositoryProvider.get(), featuresRepositoryProvider.get(), voiceProcessingRepositoryProvider.get());
  }

  public static VoiceProcessingViewModel_Factory create(Provider<Application> applicationProvider,
      Provider<ConnectionRepository> connectionRepositoryProvider,
      Provider<FeaturesRepository> featuresRepositoryProvider,
      Provider<VoiceProcessingRepository> voiceProcessingRepositoryProvider) {
    return new VoiceProcessingViewModel_Factory(applicationProvider, connectionRepositoryProvider, featuresRepositoryProvider, voiceProcessingRepositoryProvider);
  }

  public static VoiceProcessingViewModel newInstance(Application application,
      ConnectionRepository connectionRepository, FeaturesRepository featuresRepository,
      VoiceProcessingRepository voiceProcessingRepository) {
    return new VoiceProcessingViewModel(application, connectionRepository, featuresRepository, voiceProcessingRepository);
  }
}
