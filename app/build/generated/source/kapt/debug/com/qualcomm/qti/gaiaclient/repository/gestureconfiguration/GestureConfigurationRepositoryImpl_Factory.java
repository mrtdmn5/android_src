package com.qualcomm.qti.gaiaclient.repository.gestureconfiguration;

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
public final class GestureConfigurationRepositoryImpl_Factory implements Factory<GestureConfigurationRepositoryImpl> {
  @Override
  public GestureConfigurationRepositoryImpl get() {
    return newInstance();
  }

  public static GestureConfigurationRepositoryImpl_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static GestureConfigurationRepositoryImpl newInstance() {
    return new GestureConfigurationRepositoryImpl();
  }

  private static final class InstanceHolder {
    private static final GestureConfigurationRepositoryImpl_Factory INSTANCE = new GestureConfigurationRepositoryImpl_Factory();
  }
}
