package com.qualcomm.qti.gaiaclient.ui.discovery;

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
public final class DiscoveryViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
  @Override
  public String get() {
    return provide();
  }

  public static DiscoveryViewModel_HiltModules_KeyModule_ProvideFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static String provide() {
    return Preconditions.checkNotNullFromProvides(DiscoveryViewModel_HiltModules.KeyModule.provide());
  }

  private static final class InstanceHolder {
    private static final DiscoveryViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new DiscoveryViewModel_HiltModules_KeyModule_ProvideFactory();
  }
}
