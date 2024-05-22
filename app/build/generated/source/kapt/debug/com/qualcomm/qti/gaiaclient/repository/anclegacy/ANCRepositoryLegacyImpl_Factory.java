package com.qualcomm.qti.gaiaclient.repository.anclegacy;

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
public final class ANCRepositoryLegacyImpl_Factory implements Factory<ANCRepositoryLegacyImpl> {
  @Override
  public ANCRepositoryLegacyImpl get() {
    return newInstance();
  }

  public static ANCRepositoryLegacyImpl_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static ANCRepositoryLegacyImpl newInstance() {
    return new ANCRepositoryLegacyImpl();
  }

  private static final class InstanceHolder {
    private static final ANCRepositoryLegacyImpl_Factory INSTANCE = new ANCRepositoryLegacyImpl_Factory();
  }
}
