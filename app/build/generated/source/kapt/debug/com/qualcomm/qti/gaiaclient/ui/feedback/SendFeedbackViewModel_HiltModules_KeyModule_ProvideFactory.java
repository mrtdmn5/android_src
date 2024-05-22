package com.qualcomm.qti.gaiaclient.ui.feedback;

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
public final class SendFeedbackViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
  @Override
  public String get() {
    return provide();
  }

  public static SendFeedbackViewModel_HiltModules_KeyModule_ProvideFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static String provide() {
    return Preconditions.checkNotNullFromProvides(SendFeedbackViewModel_HiltModules.KeyModule.provide());
  }

  private static final class InstanceHolder {
    private static final SendFeedbackViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new SendFeedbackViewModel_HiltModules_KeyModule_ProvideFactory();
  }
}
