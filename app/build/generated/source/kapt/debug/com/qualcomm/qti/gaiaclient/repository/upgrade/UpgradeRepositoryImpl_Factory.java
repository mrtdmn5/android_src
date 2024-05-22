package com.qualcomm.qti.gaiaclient.repository.upgrade;

import com.qualcomm.qti.gaiaclient.repository.deviceinfo.DeviceInformationRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class UpgradeRepositoryImpl_Factory implements Factory<UpgradeRepositoryImpl> {
  private final Provider<DeviceInformationRepository> deviceInformationRepositoryProvider;

  public UpgradeRepositoryImpl_Factory(
      Provider<DeviceInformationRepository> deviceInformationRepositoryProvider) {
    this.deviceInformationRepositoryProvider = deviceInformationRepositoryProvider;
  }

  @Override
  public UpgradeRepositoryImpl get() {
    return newInstance(deviceInformationRepositoryProvider.get());
  }

  public static UpgradeRepositoryImpl_Factory create(
      Provider<DeviceInformationRepository> deviceInformationRepositoryProvider) {
    return new UpgradeRepositoryImpl_Factory(deviceInformationRepositoryProvider);
  }

  public static UpgradeRepositoryImpl newInstance(
      DeviceInformationRepository deviceInformationRepository) {
    return new UpgradeRepositoryImpl(deviceInformationRepository);
  }
}
