package com.qualcomm.qti.gaiaclient.ui;

import android.app.Application;
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
public final class PermissionsViewModel_Factory implements Factory<PermissionsViewModel> {
  private final Provider<Application> applicationProvider;

  public PermissionsViewModel_Factory(Provider<Application> applicationProvider) {
    this.applicationProvider = applicationProvider;
  }

  @Override
  public PermissionsViewModel get() {
    return newInstance(applicationProvider.get());
  }

  public static PermissionsViewModel_Factory create(Provider<Application> applicationProvider) {
    return new PermissionsViewModel_Factory(applicationProvider);
  }

  public static PermissionsViewModel newInstance(Application application) {
    return new PermissionsViewModel(application);
  }
}
