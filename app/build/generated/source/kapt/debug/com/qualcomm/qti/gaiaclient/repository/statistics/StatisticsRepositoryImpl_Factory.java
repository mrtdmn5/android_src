package com.qualcomm.qti.gaiaclient.repository.statistics;

import android.content.Context;
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
public final class StatisticsRepositoryImpl_Factory implements Factory<StatisticsRepositoryImpl> {
  private final Provider<Context> contextProvider;

  public StatisticsRepositoryImpl_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public StatisticsRepositoryImpl get() {
    return newInstance(contextProvider.get());
  }

  public static StatisticsRepositoryImpl_Factory create(Provider<Context> contextProvider) {
    return new StatisticsRepositoryImpl_Factory(contextProvider);
  }

  public static StatisticsRepositoryImpl newInstance(Context context) {
    return new StatisticsRepositoryImpl(context);
  }
}
