package com.qualcomm.qti.gaiaclient.repository.logs;

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
public final class DeviceLogsRepositoryImpl_Factory implements Factory<DeviceLogsRepositoryImpl> {
  @Override
  public DeviceLogsRepositoryImpl get() {
    return newInstance();
  }

  public static DeviceLogsRepositoryImpl_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static DeviceLogsRepositoryImpl newInstance() {
    return new DeviceLogsRepositoryImpl();
  }

  private static final class InstanceHolder {
    private static final DeviceLogsRepositoryImpl_Factory INSTANCE = new DeviceLogsRepositoryImpl_Factory();
  }
}
