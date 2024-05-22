package com.qualcomm.qti.gaiaclient.repository.connection;

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
public final class ConnectionRepositoryImpl_Factory implements Factory<ConnectionRepositoryImpl> {
  @Override
  public ConnectionRepositoryImpl get() {
    return newInstance();
  }

  public static ConnectionRepositoryImpl_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static ConnectionRepositoryImpl newInstance() {
    return new ConnectionRepositoryImpl();
  }

  private static final class InstanceHolder {
    private static final ConnectionRepositoryImpl_Factory INSTANCE = new ConnectionRepositoryImpl_Factory();
  }
}
