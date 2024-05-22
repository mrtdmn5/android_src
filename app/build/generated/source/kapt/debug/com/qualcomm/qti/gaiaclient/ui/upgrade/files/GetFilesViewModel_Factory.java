package com.qualcomm.qti.gaiaclient.ui.upgrade.files;

import android.app.Application;
import com.qualcomm.qti.gaiaclient.repository.deviceinfo.DeviceInformationRepository;
import com.qualcomm.qti.gaiaclient.repository.service.ServiceRepository;
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
public final class GetFilesViewModel_Factory implements Factory<GetFilesViewModel> {
  private final Provider<Application> applicationProvider;

  private final Provider<ServiceRepository> serviceRepositoryProvider;

  private final Provider<DeviceInformationRepository> informationRepositoryProvider;

  public GetFilesViewModel_Factory(Provider<Application> applicationProvider,
      Provider<ServiceRepository> serviceRepositoryProvider,
      Provider<DeviceInformationRepository> informationRepositoryProvider) {
    this.applicationProvider = applicationProvider;
    this.serviceRepositoryProvider = serviceRepositoryProvider;
    this.informationRepositoryProvider = informationRepositoryProvider;
  }

  @Override
  public GetFilesViewModel get() {
    return newInstance(applicationProvider.get(), serviceRepositoryProvider.get(), informationRepositoryProvider.get());
  }

  public static GetFilesViewModel_Factory create(Provider<Application> applicationProvider,
      Provider<ServiceRepository> serviceRepositoryProvider,
      Provider<DeviceInformationRepository> informationRepositoryProvider) {
    return new GetFilesViewModel_Factory(applicationProvider, serviceRepositoryProvider, informationRepositoryProvider);
  }

  public static GetFilesViewModel newInstance(Application application,
      ServiceRepository serviceRepository, DeviceInformationRepository informationRepository) {
    return new GetFilesViewModel(application, serviceRepository, informationRepository);
  }
}
