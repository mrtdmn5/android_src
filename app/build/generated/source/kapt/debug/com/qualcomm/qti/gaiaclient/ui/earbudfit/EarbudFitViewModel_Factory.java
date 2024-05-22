package com.qualcomm.qti.gaiaclient.ui.earbudfit;

import android.app.Application;
import com.qualcomm.qti.gaiaclient.repository.earbudfit.EarbudFitRepository;
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
public final class EarbudFitViewModel_Factory implements Factory<EarbudFitViewModel> {
  private final Provider<Application> applicationProvider;

  private final Provider<EarbudFitRepository> earbudFitRepositoryProvider;

  public EarbudFitViewModel_Factory(Provider<Application> applicationProvider,
      Provider<EarbudFitRepository> earbudFitRepositoryProvider) {
    this.applicationProvider = applicationProvider;
    this.earbudFitRepositoryProvider = earbudFitRepositoryProvider;
  }

  @Override
  public EarbudFitViewModel get() {
    return newInstance(applicationProvider.get(), earbudFitRepositoryProvider.get());
  }

  public static EarbudFitViewModel_Factory create(Provider<Application> applicationProvider,
      Provider<EarbudFitRepository> earbudFitRepositoryProvider) {
    return new EarbudFitViewModel_Factory(applicationProvider, earbudFitRepositoryProvider);
  }

  public static EarbudFitViewModel newInstance(Application application,
      EarbudFitRepository earbudFitRepository) {
    return new EarbudFitViewModel(application, earbudFitRepository);
  }
}
