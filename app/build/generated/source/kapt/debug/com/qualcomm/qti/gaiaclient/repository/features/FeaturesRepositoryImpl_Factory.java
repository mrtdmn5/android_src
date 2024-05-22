package com.qualcomm.qti.gaiaclient.repository.features;

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
public final class FeaturesRepositoryImpl_Factory implements Factory<FeaturesRepositoryImpl> {
  @Override
  public FeaturesRepositoryImpl get() {
    return newInstance();
  }

  public static FeaturesRepositoryImpl_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static FeaturesRepositoryImpl newInstance() {
    return new FeaturesRepositoryImpl();
  }

  private static final class InstanceHolder {
    private static final FeaturesRepositoryImpl_Factory INSTANCE = new FeaturesRepositoryImpl_Factory();
  }
}
