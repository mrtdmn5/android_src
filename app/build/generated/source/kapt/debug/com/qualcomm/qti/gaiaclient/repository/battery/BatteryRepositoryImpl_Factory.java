package com.qualcomm.qti.gaiaclient.repository.battery;

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
public final class BatteryRepositoryImpl_Factory implements Factory<BatteryRepositoryImpl> {
  @Override
  public BatteryRepositoryImpl get() {
    return newInstance();
  }

  public static BatteryRepositoryImpl_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static BatteryRepositoryImpl newInstance() {
    return new BatteryRepositoryImpl();
  }

  private static final class InstanceHolder {
    private static final BatteryRepositoryImpl_Factory INSTANCE = new BatteryRepositoryImpl_Factory();
  }
}
