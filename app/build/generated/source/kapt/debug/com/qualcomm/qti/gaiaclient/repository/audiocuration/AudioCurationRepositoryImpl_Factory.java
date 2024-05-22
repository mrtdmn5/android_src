package com.qualcomm.qti.gaiaclient.repository.audiocuration;

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
public final class AudioCurationRepositoryImpl_Factory implements Factory<AudioCurationRepositoryImpl> {
  @Override
  public AudioCurationRepositoryImpl get() {
    return newInstance();
  }

  public static AudioCurationRepositoryImpl_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static AudioCurationRepositoryImpl newInstance() {
    return new AudioCurationRepositoryImpl();
  }

  private static final class InstanceHolder {
    private static final AudioCurationRepositoryImpl_Factory INSTANCE = new AudioCurationRepositoryImpl_Factory();
  }
}
