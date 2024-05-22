package com.qualcomm.qti.gaiaclient.repository.voiceui;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
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
public final class VoiceUIRepositoryImpl_Factory implements Factory<VoiceUIRepositoryImpl> {
  @Override
  public VoiceUIRepositoryImpl get() {
    return newInstance();
  }

  public static VoiceUIRepositoryImpl_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static VoiceUIRepositoryImpl newInstance() {
    return new VoiceUIRepositoryImpl();
  }

  private static final class InstanceHolder {
    private static final VoiceUIRepositoryImpl_Factory INSTANCE = new VoiceUIRepositoryImpl_Factory();
  }
}
