package com.qualcomm.qti.gaiaclient.repository.deviceinfo;

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
public final class DeviceInformationRepositoryImpl_Factory implements Factory<DeviceInformationRepositoryImpl> {
  @Override
  public DeviceInformationRepositoryImpl get() {
    return newInstance();
  }

  public static DeviceInformationRepositoryImpl_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static DeviceInformationRepositoryImpl newInstance() {
    return new DeviceInformationRepositoryImpl();
  }

  private static final class InstanceHolder {
    private static final DeviceInformationRepositoryImpl_Factory INSTANCE = new DeviceInformationRepositoryImpl_Factory();
  }
}
