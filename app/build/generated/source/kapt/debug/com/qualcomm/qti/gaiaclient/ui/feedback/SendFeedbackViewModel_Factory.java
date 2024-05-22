package com.qualcomm.qti.gaiaclient.ui.feedback;

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
public final class SendFeedbackViewModel_Factory implements Factory<SendFeedbackViewModel> {
  private final Provider<Application> applicationProvider;

  private final Provider<ServiceRepository> serviceRepositoryProvider;

  private final Provider<DeviceInformationRepository> infoRepositoryProvider;

  public SendFeedbackViewModel_Factory(Provider<Application> applicationProvider,
      Provider<ServiceRepository> serviceRepositoryProvider,
      Provider<DeviceInformationRepository> infoRepositoryProvider) {
    this.applicationProvider = applicationProvider;
    this.serviceRepositoryProvider = serviceRepositoryProvider;
    this.infoRepositoryProvider = infoRepositoryProvider;
  }

  @Override
  public SendFeedbackViewModel get() {
    return newInstance(applicationProvider.get(), serviceRepositoryProvider.get(), infoRepositoryProvider.get());
  }

  public static SendFeedbackViewModel_Factory create(Provider<Application> applicationProvider,
      Provider<ServiceRepository> serviceRepositoryProvider,
      Provider<DeviceInformationRepository> infoRepositoryProvider) {
    return new SendFeedbackViewModel_Factory(applicationProvider, serviceRepositoryProvider, infoRepositoryProvider);
  }

  public static SendFeedbackViewModel newInstance(Application application,
      ServiceRepository serviceRepository, DeviceInformationRepository infoRepository) {
    return new SendFeedbackViewModel(application, serviceRepository, infoRepository);
  }
}
