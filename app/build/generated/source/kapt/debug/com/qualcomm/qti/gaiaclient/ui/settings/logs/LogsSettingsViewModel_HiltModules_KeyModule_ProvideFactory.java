package com.qualcomm.qti.gaiaclient.ui.settings.logs;

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
public final class LogsSettingsViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
  @Override
  public String get() {
    return provide();
  }

  public static LogsSettingsViewModel_HiltModules_KeyModule_ProvideFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static String provide() {
    return Preconditions.checkNotNullFromProvides(LogsSettingsViewModel_HiltModules.KeyModule.provide());
  }

  private static final class InstanceHolder {
    private static final LogsSettingsViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new LogsSettingsViewModel_HiltModules_KeyModule_ProvideFactory();
  }
}
