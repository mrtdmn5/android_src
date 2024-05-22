package com.qualcomm.qti.gaiaclient.ui.connection;

import android.app.Application;
import com.qualcomm.qti.gaiaclient.repository.connection.ConnectionRepository;
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
public final class ConnectionViewModel_Factory implements Factory<ConnectionViewModel> {
  private final Provider<Application> applicationProvider;

  private final Provider<ConnectionRepository> connectionRepositoryProvider;

  public ConnectionViewModel_Factory(Provider<Application> applicationProvider,
      Provider<ConnectionRepository> connectionRepositoryProvider) {
    this.applicationProvider = applicationProvider;
    this.connectionRepositoryProvider = connectionRepositoryProvider;
  }

  @Override
  public ConnectionViewModel get() {
    return newInstance(applicationProvider.get(), connectionRepositoryProvider.get());
  }

  public static ConnectionViewModel_Factory create(Provider<Application> applicationProvider,
      Provider<ConnectionRepository> connectionRepositoryProvider) {
    return new ConnectionViewModel_Factory(applicationProvider, connectionRepositoryProvider);
  }

  public static ConnectionViewModel newInstance(Application application,
      ConnectionRepository connectionRepository) {
    return new ConnectionViewModel(application, connectionRepository);
  }
}
