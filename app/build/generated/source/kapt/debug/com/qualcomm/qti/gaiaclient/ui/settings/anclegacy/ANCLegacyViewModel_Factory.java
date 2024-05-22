package com.qualcomm.qti.gaiaclient.ui.settings.anclegacy;

import android.app.Application;
import com.qualcomm.qti.gaiaclient.repository.anclegacy.ANCRepositoryLegacy;
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
public final class ANCLegacyViewModel_Factory implements Factory<ANCLegacyViewModel> {
  private final Provider<Application> applicationProvider;

  private final Provider<ANCRepositoryLegacy> ancRepositoryLegacyProvider;

  private final Provider<ConnectionRepository> connectionRepositoryProvider;

  private final Provider<FeaturesRepository> featuresRepositoryProvider;

  public ANCLegacyViewModel_Factory(Provider<Application> applicationProvider,
      Provider<ANCRepositoryLegacy> ancRepositoryLegacyProvider,
      Provider<ConnectionRepository> connectionRepositoryProvider,
      Provider<FeaturesRepository> featuresRepositoryProvider) {
    this.applicationProvider = applicationProvider;
    this.ancRepositoryLegacyProvider = ancRepositoryLegacyProvider;
    this.connectionRepositoryProvider = connectionRepositoryProvider;
    this.featuresRepositoryProvider = featuresRepositoryProvider;
  }

  @Override
  public ANCLegacyViewModel get() {
    return newInstance(applicationProvider.get(), ancRepositoryLegacyProvider.get(), connectionRepositoryProvider.get(), featuresRepositoryProvider.get());
  }

  public static ANCLegacyViewModel_Factory create(Provider<Application> applicationProvider,
      Provider<ANCRepositoryLegacy> ancRepositoryLegacyProvider,
      Provider<ConnectionRepository> connectionRepositoryProvider,
      Provider<FeaturesRepository> featuresRepositoryProvider) {
    return new ANCLegacyViewModel_Factory(applicationProvider, ancRepositoryLegacyProvider, connectionRepositoryProvider, featuresRepositoryProvider);
  }

  public static ANCLegacyViewModel newInstance(Application application,
      ANCRepositoryLegacy ancRepositoryLegacy, ConnectionRepository connectionRepository,
      FeaturesRepository featuresRepository) {
    return new ANCLegacyViewModel(application, ancRepositoryLegacy, connectionRepository, featuresRepository);
  }
}
