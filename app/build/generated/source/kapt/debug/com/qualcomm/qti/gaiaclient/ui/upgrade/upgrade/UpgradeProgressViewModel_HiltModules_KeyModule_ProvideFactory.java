package com.qualcomm.qti.gaiaclient.ui.upgrade.upgrade;

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
public final class UpgradeProgressViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
  @Override
  public String get() {
    return provide();
  }

  public static UpgradeProgressViewModel_HiltModules_KeyModule_ProvideFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static String provide() {
    return Preconditions.checkNotNullFromProvides(UpgradeProgressViewModel_HiltModules.KeyModule.provide());
  }

  private static final class InstanceHolder {
    private static final UpgradeProgressViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new UpgradeProgressViewModel_HiltModules_KeyModule_ProvideFactory();
  }
}
