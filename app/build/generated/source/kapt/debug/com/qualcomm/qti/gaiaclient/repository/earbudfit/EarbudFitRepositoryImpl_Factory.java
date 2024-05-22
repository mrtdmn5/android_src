package com.qualcomm.qti.gaiaclient.repository.earbudfit;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class EarbudFitRepositoryImpl_Factory implements Factory<EarbudFitRepositoryImpl> {
  @Override
  public EarbudFitRepositoryImpl get() {
    return newInstance();
  }

  public static EarbudFitRepositoryImpl_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static EarbudFitRepositoryImpl newInstance() {
    return new EarbudFitRepositoryImpl();
  }

  private static final class InstanceHolder {
    private static final EarbudFitRepositoryImpl_Factory INSTANCE = new EarbudFitRepositoryImpl_Factory();
  }
}
