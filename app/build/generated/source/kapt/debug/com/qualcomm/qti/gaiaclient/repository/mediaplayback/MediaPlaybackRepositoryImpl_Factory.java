package com.qualcomm.qti.gaiaclient.repository.mediaplayback;

import android.content.Context;
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
public final class MediaPlaybackRepositoryImpl_Factory implements Factory<MediaPlaybackRepositoryImpl> {
  private final Provider<Context> contextProvider;

  public MediaPlaybackRepositoryImpl_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public MediaPlaybackRepositoryImpl get() {
    return newInstance(contextProvider.get());
  }

  public static MediaPlaybackRepositoryImpl_Factory create(Provider<Context> contextProvider) {
    return new MediaPlaybackRepositoryImpl_Factory(contextProvider);
  }

  public static MediaPlaybackRepositoryImpl newInstance(Context context) {
    return new MediaPlaybackRepositoryImpl(context);
  }
}
