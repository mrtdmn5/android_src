package com.qualcomm.qti.gaiaclient.ui.settings.statistics.categories;

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
public final class StatisticsCategoriesViewModel_Factory implements Factory<StatisticsCategoriesViewModel> {
  private final Provider<Application> applicationProvider;

  private final Provider<StatisticsRepository> statisticsRepositoryProvider;

  public StatisticsCategoriesViewModel_Factory(Provider<Application> applicationProvider,
      Provider<StatisticsRepository> statisticsRepositoryProvider) {
    this.applicationProvider = applicationProvider;
    this.statisticsRepositoryProvider = statisticsRepositoryProvider;
  }

  @Override
  public StatisticsCategoriesViewModel get() {
    return newInstance(applicationProvider.get(), statisticsRepositoryProvider.get());
  }

  public static StatisticsCategoriesViewModel_Factory create(
      Provider<Application> applicationProvider,
      Provider<StatisticsRepository> statisticsRepositoryProvider) {
    return new StatisticsCategoriesViewModel_Factory(applicationProvider, statisticsRepositoryProvider);
  }

  public static StatisticsCategoriesViewModel newInstance(Application application,
      StatisticsRepository statisticsRepository) {
    return new StatisticsCategoriesViewModel(application, statisticsRepository);
  }
}
