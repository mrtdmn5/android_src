package com.qualcomm.qti.gaiaclient.ui.devicelogs;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class DownloadLogsViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
  @Override
  public String get() {
    return provide();
  }

  public static DownloadLogsViewModel_HiltModules_KeyModule_ProvideFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static String provide() {
    return Preconditions.checkNotNullFromProvides(DownloadLogsViewModel_HiltModules.KeyModule.provide());
  }

  private static final class InstanceHolder {
    private static final DownloadLogsViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new DownloadLogsViewModel_HiltModules_KeyModule_ProvideFactory();
  }
}
