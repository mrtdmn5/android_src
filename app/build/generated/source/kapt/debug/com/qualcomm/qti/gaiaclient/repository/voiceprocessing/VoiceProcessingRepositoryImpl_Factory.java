package com.qualcomm.qti.gaiaclient.repository.voiceprocessing;

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
public final class VoiceProcessingRepositoryImpl_Factory implements Factory<VoiceProcessingRepositoryImpl> {
  @Override
  public VoiceProcessingRepositoryImpl get() {
    return newInstance();
  }

  public static VoiceProcessingRepositoryImpl_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static VoiceProcessingRepositoryImpl newInstance() {
    return new VoiceProcessingRepositoryImpl();
  }

  private static final class InstanceHolder {
    private static final VoiceProcessingRepositoryImpl_Factory INSTANCE = new VoiceProcessingRepositoryImpl_Factory();
  }
}
