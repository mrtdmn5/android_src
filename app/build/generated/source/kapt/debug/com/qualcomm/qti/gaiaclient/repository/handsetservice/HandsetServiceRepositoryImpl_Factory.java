package com.qualcomm.qti.gaiaclient.repository.handsetservice;

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
public final class HandsetServiceRepositoryImpl_Factory implements Factory<HandsetServiceRepositoryImpl> {
  @Override
  public HandsetServiceRepositoryImpl get() {
    return newInstance();
  }

  public static HandsetServiceRepositoryImpl_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static HandsetServiceRepositoryImpl newInstance() {
    return new HandsetServiceRepositoryImpl();
  }

  private static final class InstanceHolder {
    private static final HandsetServiceRepositoryImpl_Factory INSTANCE = new HandsetServiceRepositoryImpl_Factory();
  }
}
