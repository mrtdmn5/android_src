package com.qualcomm.qti.gaiaclient.repository.system;

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
public final class SystemRepositoryImpl_Factory implements Factory<SystemRepositoryImpl> {
  @Override
  public SystemRepositoryImpl get() {
    return newInstance();
  }

  public static SystemRepositoryImpl_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static SystemRepositoryImpl newInstance() {
    return new SystemRepositoryImpl();
  }

  private static final class InstanceHolder {
    private static final SystemRepositoryImpl_Factory INSTANCE = new SystemRepositoryImpl_Factory();
  }
}
