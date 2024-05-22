package com.qualcomm.qti.gaiaclient.ui.settings.statistics.category;

import android.app.Application;
import com.qualcomm.qti.gaiaclient.repository.statistics.StatisticsRepository;
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
public final class StatisticsStatisticsViewModel_Factory implements Factory<StatisticsStatisticsViewModel> {
  private final Provider<Application> applicationProvider;

  private final Provider<StatisticsRepository> statisticsRepositoryProvider;

  public StatisticsStatisticsViewModel_Factory(Provider<Application> applicationProvider,
      Provider<StatisticsRepository> statisticsRepositoryProvider) {
    this.applicationProvider = applicationProvider;
    this.statisticsRepositoryProvider = statisticsRepositoryProvider;
  }

  @Override
  public StatisticsStatisticsViewModel get() {
    return newInstance(applicationProvider.get(), statisticsRepositoryProvider.get());
  }

  public static StatisticsStatisticsViewModel_Factory create(
      Provider<Application> applicationProvider,
      Provider<StatisticsRepository> statisticsRepositoryProvider) {
    return new StatisticsStatisticsViewModel_Factory(applicationProvider, statisticsRepositoryProvider);
  }

  public static StatisticsStatisticsViewModel newInstance(Application application,
      StatisticsRepository statisticsRepository) {
    return new StatisticsStatisticsViewModel(application, statisticsRepository);
  }
}
