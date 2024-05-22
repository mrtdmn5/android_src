package com.qualcomm.qti.gaiaclient.repository.service;

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
public final class ServiceRepositoryImpl_Factory implements Factory<ServiceRepositoryImpl> {
  @Override
  public ServiceRepositoryImpl get() {
    return newInstance();
  }

  public static ServiceRepositoryImpl_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static ServiceRepositoryImpl newInstance() {
    return new ServiceRepositoryImpl();
  }

  private static final class InstanceHolder {
    private static final ServiceRepositoryImpl_Factory INSTANCE = new ServiceRepositoryImpl_Factory();
  }
}
