package com.qualcomm.qti.gaiaclient;

import androidx.hilt.lifecycle.ViewModelFactoryModules;
import com.qualcomm.qti.gaiaclient.repository.RepositoriesModule;
import com.qualcomm.qti.gaiaclient.ui.MainActivityViewModel_HiltModules;
import com.qualcomm.qti.gaiaclient.ui.MainActivity_GeneratedInjector;
import com.qualcomm.qti.gaiaclient.ui.PermissionsViewModel_HiltModules;
import com.qualcomm.qti.gaiaclient.ui.connection.ConnectionFragment_GeneratedInjector;
import com.qualcomm.qti.gaiaclient.ui.connection.ConnectionViewModel_HiltModules;
import com.qualcomm.qti.gaiaclient.ui.devicelogs.DownloadLogsFragment_GeneratedInjector;
import com.qualcomm.qti.gaiaclient.ui.devicelogs.DownloadLogsViewModel_HiltModules;
import com.qualcomm.qti.gaiaclient.ui.discovery.DiscoveryFragment_GeneratedInjector;
import com.qualcomm.qti.gaiaclient.ui.discovery.DiscoveryViewModel_HiltModules;
import com.qualcomm.qti.gaiaclient.ui.earbudfit.EarbudFitFragment_GeneratedInjector;
import com.qualcomm.qti.gaiaclient.ui.earbudfit.EarbudFitViewModel_HiltModules;
import com.qualcomm.qti.gaiaclient.ui.feedback.FeedbackFormFragment_GeneratedInjector;
import com.qualcomm.qti.gaiaclient.ui.feedback.SendFeedbackFragment_GeneratedInjector;
import com.qualcomm.qti.gaiaclient.ui.feedback.SendFeedbackViewModel_HiltModules;
import com.qualcomm.qti.gaiaclient.ui.gestures.configuration.ConfigurationListFragment_GeneratedInjector;
import com.qualcomm.qti.gaiaclient.ui.gestures.configuration.ConfigurationListViewModel_HiltModules;
import com.qualcomm.qti.gaiaclient.ui.gestures.configuration.GestureConfigurationFragment_GeneratedInjector;
import com.qualcomm.qti.gaiaclient.ui.gestures.configuration.GestureConfigurationViewModel_HiltModules;
import com.qualcomm.qti.gaiaclient.ui.gestures.gestures.GesturesFragment_GeneratedInjector;
import com.qualcomm.qti.gaiaclient.ui.gestures.gestures.GesturesViewModel_HiltModules;
import com.qualcomm.qti.gaiaclient.ui.information.InformationFragment_GeneratedInjector;
import com.qualcomm.qti.gaiaclient.ui.information.InformationViewModel_HiltModules;
import com.qualcomm.qti.gaiaclient.ui.settings.anclegacy.ANCLegacyFragment_GeneratedInjector;
import com.qualcomm.qti.gaiaclient.ui.settings.anclegacy.ANCLegacyViewModel_HiltModules;
import com.qualcomm.qti.gaiaclient.ui.settings.audiocuration.configuration.AudioCurationSettingsFragment_GeneratedInjector;
import com.qualcomm.qti.gaiaclient.ui.settings.audiocuration.configuration.AudioCurationSettingsViewModel_HiltModules;
import com.qualcomm.qti.gaiaclient.ui.settings.audiocuration.demo.AudioCurationDemoFragment_GeneratedInjector;
import com.qualcomm.qti.gaiaclient.ui.settings.audiocuration.demo.AudioCurationDemoViewModel_HiltModules;
import com.qualcomm.qti.gaiaclient.ui.settings.download.DownloadSettingsFragment_GeneratedInjector;
import com.qualcomm.qti.gaiaclient.ui.settings.download.DownloadSettingsViewModel_HiltModules;
import com.qualcomm.qti.gaiaclient.ui.settings.handsetservice.HandsetServiceFragment_GeneratedInjector;
import com.qualcomm.qti.gaiaclient.ui.settings.handsetservice.HandsetServiceViewModel_HiltModules;
import com.qualcomm.qti.gaiaclient.ui.settings.logs.LogsSettingsFragment_GeneratedInjector;
import com.qualcomm.qti.gaiaclient.ui.settings.logs.LogsSettingsViewModel_HiltModules;
import com.qualcomm.qti.gaiaclient.ui.settings.main.MainSettingsFragment_GeneratedInjector;
import com.qualcomm.qti.gaiaclient.ui.settings.main.MainSettingsViewModel_HiltModules;
import com.qualcomm.qti.gaiaclient.ui.settings.musicprocessing.MusicProcessingFragment_GeneratedInjector;
import com.qualcomm.qti.gaiaclient.ui.settings.musicprocessing.MusicProcessingViewModel_HiltModules;
import com.qualcomm.qti.gaiaclient.ui.settings.statistics.categories.StatisticsCategoriesFragment_GeneratedInjector;
import com.qualcomm.qti.gaiaclient.ui.settings.statistics.categories.StatisticsCategoriesViewModel_HiltModules;
import com.qualcomm.qti.gaiaclient.ui.settings.statistics.category.StatisticsStatisticsFragment_GeneratedInjector;
import com.qualcomm.qti.gaiaclient.ui.settings.statistics.category.StatisticsStatisticsViewModel_HiltModules;
import com.qualcomm.qti.gaiaclient.ui.settings.upgrade.UpgradeSettingsFragment_GeneratedInjector;
import com.qualcomm.qti.gaiaclient.ui.settings.upgrade.UpgradeSettingsViewModel_HiltModules;
import com.qualcomm.qti.gaiaclient.ui.settings.voiceprocessing.VoiceProcessingFragment_GeneratedInjector;
import com.qualcomm.qti.gaiaclient.ui.settings.voiceprocessing.VoiceProcessingViewModel_HiltModules;
import com.qualcomm.qti.gaiaclient.ui.upgrade.download.DownloadFileFragment_GeneratedInjector;
import com.qualcomm.qti.gaiaclient.ui.upgrade.download.DownloadViewModel_HiltModules;
import com.qualcomm.qti.gaiaclient.ui.upgrade.files.GetFilesFragment_GeneratedInjector;
import com.qualcomm.qti.gaiaclient.ui.upgrade.files.GetFilesViewModel_HiltModules;
import com.qualcomm.qti.gaiaclient.ui.upgrade.upgrade.UpgradeProgressFragment_GeneratedInjector;
import com.qualcomm.qti.gaiaclient.ui.upgrade.upgrade.UpgradeProgressViewModel_HiltModules;
import dagger.Binds;
import dagger.Component;
import dagger.Module;
import dagger.Subcomponent;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.android.components.FragmentComponent;
import dagger.hilt.android.components.ServiceComponent;
import dagger.hilt.android.components.ViewComponent;
import dagger.hilt.android.components.ViewModelComponent;
import dagger.hilt.android.components.ViewWithFragmentComponent;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.HiltViewModelFactory;
import dagger.hilt.android.internal.lifecycle.HiltWrapper_DefaultViewModelFactories_ActivityModule;
import dagger.hilt.android.internal.lifecycle.HiltWrapper_HiltViewModelFactory_ActivityCreatorEntryPoint;
import dagger.hilt.android.internal.lifecycle.HiltWrapper_HiltViewModelFactory_ViewModelModule;
import dagger.hilt.android.internal.managers.ActivityComponentManager;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.android.internal.managers.HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedComponentBuilderEntryPoint;
import dagger.hilt.android.internal.managers.HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedLifecycleEntryPoint;
import dagger.hilt.android.internal.managers.HiltWrapper_ActivityRetainedComponentManager_LifecycleModule;
import dagger.hilt.android.internal.managers.ServiceComponentManager;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.HiltWrapper_ActivityModule;
import dagger.hilt.android.scopes.ActivityRetainedScoped;
import dagger.hilt.android.scopes.ActivityScoped;
import dagger.hilt.android.scopes.FragmentScoped;
import dagger.hilt.android.scopes.ServiceScoped;
import dagger.hilt.android.scopes.ViewModelScoped;
import dagger.hilt.android.scopes.ViewScoped;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedComponent;
import dagger.hilt.migration.DisableInstallInCheck;
import javax.annotation.processing.Generated;
import javax.inject.Singleton;

@Generated("dagger.hilt.processor.internal.root.RootProcessor")
public final class GaiaClientApplication_HiltComponents {
  private GaiaClientApplication_HiltComponents() {
  }

  @Module(
      subcomponents = ServiceC.class
  )
  @DisableInstallInCheck
  @Generated("dagger.hilt.processor.internal.root.RootProcessor")
  abstract interface ServiceCBuilderModule {
    @Binds
    ServiceComponentBuilder bind(ServiceC.Builder builder);
  }

  @Module(
      subcomponents = ActivityRetainedC.class
  )
  @DisableInstallInCheck
  @Generated("dagger.hilt.processor.internal.root.RootProcessor")
  abstract interface ActivityRetainedCBuilderModule {
    @Binds
    ActivityRetainedComponentBuilder bind(ActivityRetainedC.Builder builder);
  }

  @Module(
      subcomponents = ActivityC.class
  )
  @DisableInstallInCheck
  @Generated("dagger.hilt.processor.internal.root.RootProcessor")
  abstract interface ActivityCBuilderModule {
    @Binds
    ActivityComponentBuilder bind(ActivityC.Builder builder);
  }

  @Module(
      subcomponents = ViewModelC.class
  )
  @DisableInstallInCheck
  @Generated("dagger.hilt.processor.internal.root.RootProcessor")
  abstract interface ViewModelCBuilderModule {
    @Binds
    ViewModelComponentBuilder bind(ViewModelC.Builder builder);
  }

  @Module(
      subcomponents = ViewC.class
  )
  @DisableInstallInCheck
  @Generated("dagger.hilt.processor.internal.root.RootProcessor")
  abstract interface ViewCBuilderModule {
    @Binds
    ViewComponentBuilder bind(ViewC.Builder builder);
  }

  @Module(
      subcomponents = FragmentC.class
  )
  @DisableInstallInCheck
  @Generated("dagger.hilt.processor.internal.root.RootProcessor")
  abstract interface FragmentCBuilderModule {
    @Binds
    FragmentComponentBuilder bind(FragmentC.Builder builder);
  }

  @Module(
      subcomponents = ViewWithFragmentC.class
  )
  @DisableInstallInCheck
  @Generated("dagger.hilt.processor.internal.root.RootProcessor")
  abstract interface ViewWithFragmentCBuilderModule {
    @Binds
    ViewWithFragmentComponentBuilder bind(ViewWithFragmentC.Builder builder);
  }

  @Component(
      modules = {
          ApplicationContextModule.class,
          ActivityRetainedCBuilderModule.class,
          ServiceCBuilderModule.class,
          RepositoriesModule.class
      }
  )
  @Singleton
  public abstract static class SingletonC implements GaiaClientApplication_GeneratedInjector,
      HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedComponentBuilderEntryPoint,
      ServiceComponentManager.ServiceComponentBuilderEntryPoint,
      SingletonComponent,
      GeneratedComponent {
  }

  @Subcomponent
  @ServiceScoped
  public abstract static class ServiceC implements ServiceComponent,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ServiceComponentBuilder {
    }
  }

  @Subcomponent(
      modules = {
          ANCLegacyViewModel_HiltModules.KeyModule.class,
          AudioCurationDemoViewModel_HiltModules.KeyModule.class,
          AudioCurationSettingsViewModel_HiltModules.KeyModule.class,
          ConfigurationListViewModel_HiltModules.KeyModule.class,
          ConnectionViewModel_HiltModules.KeyModule.class,
          DiscoveryViewModel_HiltModules.KeyModule.class,
          DownloadLogsViewModel_HiltModules.KeyModule.class,
          DownloadSettingsViewModel_HiltModules.KeyModule.class,
          DownloadViewModel_HiltModules.KeyModule.class,
          EarbudFitViewModel_HiltModules.KeyModule.class,
          ActivityCBuilderModule.class,
          ViewModelCBuilderModule.class,
          GestureConfigurationViewModel_HiltModules.KeyModule.class,
          GesturesViewModel_HiltModules.KeyModule.class,
          GetFilesViewModel_HiltModules.KeyModule.class,
          HandsetServiceViewModel_HiltModules.KeyModule.class,
          HiltWrapper_ActivityRetainedComponentManager_LifecycleModule.class,
          InformationViewModel_HiltModules.KeyModule.class,
          LogsSettingsViewModel_HiltModules.KeyModule.class,
          MainActivityViewModel_HiltModules.KeyModule.class,
          MainSettingsViewModel_HiltModules.KeyModule.class,
          MusicProcessingViewModel_HiltModules.KeyModule.class,
          PermissionsViewModel_HiltModules.KeyModule.class,
          SendFeedbackViewModel_HiltModules.KeyModule.class,
          StatisticsCategoriesViewModel_HiltModules.KeyModule.class,
          StatisticsStatisticsViewModel_HiltModules.KeyModule.class,
          UpgradeProgressViewModel_HiltModules.KeyModule.class,
          UpgradeSettingsViewModel_HiltModules.KeyModule.class,
          VoiceProcessingViewModel_HiltModules.KeyModule.class
      }
  )
  @ActivityRetainedScoped
  public abstract static class ActivityRetainedC implements ActivityRetainedComponent,
      ActivityComponentManager.ActivityComponentBuilderEntryPoint,
      HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedLifecycleEntryPoint,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ActivityRetainedComponentBuilder {
    }
  }

  @Subcomponent(
      modules = {
          FragmentCBuilderModule.class,
          ViewCBuilderModule.class,
          HiltWrapper_ActivityModule.class,
          HiltWrapper_DefaultViewModelFactories_ActivityModule.class,
          ViewModelFactoryModules.ActivityModule.class
      }
  )
  @ActivityScoped
  public abstract static class ActivityC implements MainActivity_GeneratedInjector,
      ActivityComponent,
      DefaultViewModelFactories.ActivityEntryPoint,
      HiltWrapper_HiltViewModelFactory_ActivityCreatorEntryPoint,
      FragmentComponentManager.FragmentComponentBuilderEntryPoint,
      ViewComponentManager.ViewComponentBuilderEntryPoint,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ActivityComponentBuilder {
    }
  }

  @Subcomponent(
      modules = {
          ANCLegacyViewModel_HiltModules.BindsModule.class,
          AudioCurationDemoViewModel_HiltModules.BindsModule.class,
          AudioCurationSettingsViewModel_HiltModules.BindsModule.class,
          ConfigurationListViewModel_HiltModules.BindsModule.class,
          ConnectionViewModel_HiltModules.BindsModule.class,
          DiscoveryViewModel_HiltModules.BindsModule.class,
          DownloadLogsViewModel_HiltModules.BindsModule.class,
          DownloadSettingsViewModel_HiltModules.BindsModule.class,
          DownloadViewModel_HiltModules.BindsModule.class,
          EarbudFitViewModel_HiltModules.BindsModule.class,
          GestureConfigurationViewModel_HiltModules.BindsModule.class,
          GesturesViewModel_HiltModules.BindsModule.class,
          GetFilesViewModel_HiltModules.BindsModule.class,
          HandsetServiceViewModel_HiltModules.BindsModule.class,
          HiltWrapper_HiltViewModelFactory_ViewModelModule.class,
          InformationViewModel_HiltModules.BindsModule.class,
          LogsSettingsViewModel_HiltModules.BindsModule.class,
          MainActivityViewModel_HiltModules.BindsModule.class,
          MainSettingsViewModel_HiltModules.BindsModule.class,
          MusicProcessingViewModel_HiltModules.BindsModule.class,
          PermissionsViewModel_HiltModules.BindsModule.class,
          SendFeedbackViewModel_HiltModules.BindsModule.class,
          StatisticsCategoriesViewModel_HiltModules.BindsModule.class,
          StatisticsStatisticsViewModel_HiltModules.BindsModule.class,
          UpgradeProgressViewModel_HiltModules.BindsModule.class,
          UpgradeSettingsViewModel_HiltModules.BindsModule.class,
          VoiceProcessingViewModel_HiltModules.BindsModule.class
      }
  )
  @ViewModelScoped
  public abstract static class ViewModelC implements ViewModelComponent,
      HiltViewModelFactory.ViewModelFactoriesEntryPoint,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ViewModelComponentBuilder {
    }
  }

  @Subcomponent
  @ViewScoped
  public abstract static class ViewC implements ViewComponent,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ViewComponentBuilder {
    }
  }

  @Subcomponent(
      modules = {
          ViewWithFragmentCBuilderModule.class,
          ViewModelFactoryModules.FragmentModule.class
      }
  )
  @FragmentScoped
  public abstract static class FragmentC implements ConnectionFragment_GeneratedInjector,
      DownloadLogsFragment_GeneratedInjector,
      DiscoveryFragment_GeneratedInjector,
      EarbudFitFragment_GeneratedInjector,
      FeedbackFormFragment_GeneratedInjector,
      SendFeedbackFragment_GeneratedInjector,
      ConfigurationListFragment_GeneratedInjector,
      GestureConfigurationFragment_GeneratedInjector,
      GesturesFragment_GeneratedInjector,
      InformationFragment_GeneratedInjector,
      ANCLegacyFragment_GeneratedInjector,
      AudioCurationSettingsFragment_GeneratedInjector,
      AudioCurationDemoFragment_GeneratedInjector,
      DownloadSettingsFragment_GeneratedInjector,
      HandsetServiceFragment_GeneratedInjector,
      LogsSettingsFragment_GeneratedInjector,
      MainSettingsFragment_GeneratedInjector,
      MusicProcessingFragment_GeneratedInjector,
      StatisticsCategoriesFragment_GeneratedInjector,
      StatisticsStatisticsFragment_GeneratedInjector,
      UpgradeSettingsFragment_GeneratedInjector,
      VoiceProcessingFragment_GeneratedInjector,
      DownloadFileFragment_GeneratedInjector,
      GetFilesFragment_GeneratedInjector,
      UpgradeProgressFragment_GeneratedInjector,
      FragmentComponent,
      DefaultViewModelFactories.FragmentEntryPoint,
      ViewComponentManager.ViewWithFragmentComponentBuilderEntryPoint,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends FragmentComponentBuilder {
    }
  }

  @Subcomponent
  @ViewScoped
  public abstract static class ViewWithFragmentC implements ViewWithFragmentComponent,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ViewWithFragmentComponentBuilder {
    }
  }
}
