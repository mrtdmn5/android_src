package com.qualcomm.qti.gaiaclient.ui.information;

import android.app.Application;
import com.qualcomm.qti.gaiaclient.repository.battery.BatteryRepository;
import com.qualcomm.qti.gaiaclient.repository.connection.ConnectionRepository;
import com.qualcomm.qti.gaiaclient.repository.deviceinfo.DeviceInformationRepository;
import com.qualcomm.qti.gaiaclient.repository.features.FeaturesRepository;
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
public final class InformationViewModel_Factory implements Factory<InformationViewModel> {
  private final Provider<Application> applicationProvider;

  private final Provider<ConnectionRepository> connectionRepositoryProvider;

  private final Provider<FeaturesRepository> featuresRepositoryProvider;

  private final Provider<DeviceInformationRepository> deviceInfoRepositoryProvider;

  private final Provider<BatteryRepository> batteryRepositoryProvider;

  public InformationViewModel_Factory(Provider<Application> applicationProvider,
      Provider<ConnectionRepository> connectionRepositoryProvider,
      Provider<FeaturesRepository> featuresRepositoryProvider,
      Provider<DeviceInformationRepository> deviceInfoRepositoryProvider,
      Provider<BatteryRepository> batteryRepositoryProvider) {
    this.applicationProvider = applicationProvider;
    this.connectionRepositoryProvider = connectionRepositoryProvider;
    this.featuresRepositoryProvider = featuresRepositoryProvider;
    this.deviceInfoRepositoryProvider = deviceInfoRepositoryProvider;
    this.batteryRepositoryProvider = batteryRepositoryProvider;
  }

  @Override
  public InformationViewModel get() {
    return newInstance(applicationProvider.get(), connectionRepositoryProvider.get(), featuresRepositoryProvider.get(), deviceInfoRepositoryProvider.get(), batteryRepositoryProvider.get());
  }

  public static InformationViewModel_Factory create(Provider<Application> applicationProvider,
      Provider<ConnectionRepository> connectionRepositoryProvider,
      Provider<FeaturesRepository> featuresRepositoryProvider,
      Provider<DeviceInformationRepository> deviceInfoRepositoryProvider,
      Provider<BatteryRepository> batteryRepositoryProvider) {
    return new InformationViewModel_Factory(applicationProvider, connectionRepositoryProvider, featuresRepositoryProvider, deviceInfoRepositoryProvider, batteryRepositoryProvider);
  }

  public static InformationViewModel newInstance(Application application,
      ConnectionRepository connectionRepository, FeaturesRepository featuresRepository,
      DeviceInformationRepository deviceInfoRepository, BatteryRepository batteryRepository) {
    return new InformationViewModel(application, connectionRepository, featuresRepository, deviceInfoRepository, batteryRepository);
  }
}
