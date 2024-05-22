package com.qualcomm.qti.gaiaclient.repository.musicprocessing;

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
public final class MusicProcessingRepositoryImpl_Factory implements Factory<MusicProcessingRepositoryImpl> {
  @Override
  public MusicProcessingRepositoryImpl get() {
    return newInstance();
  }

  public static MusicProcessingRepositoryImpl_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static MusicProcessingRepositoryImpl newInstance() {
    return new MusicProcessingRepositoryImpl();
  }

  private static final class InstanceHolder {
    private static final MusicProcessingRepositoryImpl_Factory INSTANCE = new MusicProcessingRepositoryImpl_Factory();
  }
}
