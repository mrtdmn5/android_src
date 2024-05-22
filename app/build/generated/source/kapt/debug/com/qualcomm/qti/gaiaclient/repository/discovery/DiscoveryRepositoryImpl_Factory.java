package com.qualcomm.qti.gaiaclient.repository.discovery;

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
public final class DiscoveryRepositoryImpl_Factory implements Factory<DiscoveryRepositoryImpl> {
  @Override
  public DiscoveryRepositoryImpl get() {
    return newInstance();
  }

  public static DiscoveryRepositoryImpl_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static DiscoveryRepositoryImpl newInstance() {
    return new DiscoveryRepositoryImpl();
  }

  private static final class InstanceHolder {
    private static final DiscoveryRepositoryImpl_Factory INSTANCE = new DiscoveryRepositoryImpl_Factory();
  }
}
