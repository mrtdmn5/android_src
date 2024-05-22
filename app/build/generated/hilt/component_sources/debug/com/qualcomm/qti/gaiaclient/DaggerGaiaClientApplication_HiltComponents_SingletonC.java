package com.qualcomm.qti.gaiaclient;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.qualcomm.qti.gaiaclient.repository.anclegacy.ANCRepositoryLegacyImpl;
import com.qualcomm.qti.gaiaclient.repository.audiocuration.AudioCurationRepositoryImpl;
import com.qualcomm.qti.gaiaclient.repository.battery.BatteryRepositoryImpl;
import com.qualcomm.qti.gaiaclient.repository.connection.ConnectionRepositoryImpl;
import com.qualcomm.qti.gaiaclient.repository.deviceinfo.DeviceInformationRepositoryImpl;
import com.qualcomm.qti.gaiaclient.repository.discovery.DiscoveryRepositoryImpl;
import com.qualcomm.qti.gaiaclient.repository.earbudfit.EarbudFitRepositoryImpl;
import com.qualcomm.qti.gaiaclient.repository.features.FeaturesRepositoryImpl;
import com.qualcomm.qti.gaiaclient.repository.gestureconfiguration.GestureConfigurationRepositoryImpl;
import com.qualcomm.qti.gaiaclient.repository.handsetservice.HandsetServiceRepositoryImpl;
import com.qualcomm.qti.gaiaclient.repository.logs.DeviceLogsRepositoryImpl;
import com.qualcomm.qti.gaiaclient.repository.mediaplayback.MediaPlaybackRepositoryImpl;
import com.qualcomm.qti.gaiaclient.repository.musicprocessing.MusicProcessingRepositoryImpl;
import com.qualcomm.qti.gaiaclient.repository.service.ServiceRepositoryImpl;
import com.qualcomm.qti.gaiaclient.repository.statistics.StatisticsRepositoryImpl;
import com.qualcomm.qti.gaiaclient.repository.system.SystemRepositoryImpl;
import com.qualcomm.qti.gaiaclient.repository.upgrade.UpgradeRepositoryImpl;
import com.qualcomm.qti.gaiaclient.repository.voiceprocessing.VoiceProcessingRepositoryImpl;
import com.qualcomm.qti.gaiaclient.repository.voiceui.VoiceUIRepositoryImpl;
import com.qualcomm.qti.gaiaclient.ui.MainActivity;
import com.qualcomm.qti.gaiaclient.ui.MainActivityViewModel;
import com.qualcomm.qti.gaiaclient.ui.MainActivityViewModel_HiltModules_KeyModule_ProvideFactory;
import com.qualcomm.qti.gaiaclient.ui.PermissionsViewModel;
import com.qualcomm.qti.gaiaclient.ui.PermissionsViewModel_HiltModules_KeyModule_ProvideFactory;
import com.qualcomm.qti.gaiaclient.ui.connection.ConnectionFragment;
import com.qualcomm.qti.gaiaclient.ui.connection.ConnectionViewModel;
import com.qualcomm.qti.gaiaclient.ui.connection.ConnectionViewModel_HiltModules_KeyModule_ProvideFactory;
import com.qualcomm.qti.gaiaclient.ui.devicelogs.DownloadLogsFragment;
import com.qualcomm.qti.gaiaclient.ui.devicelogs.DownloadLogsViewModel;
import com.qualcomm.qti.gaiaclient.ui.devicelogs.DownloadLogsViewModel_HiltModules_KeyModule_ProvideFactory;
import com.qualcomm.qti.gaiaclient.ui.discovery.DiscoveryFragment;
import com.qualcomm.qti.gaiaclient.ui.discovery.DiscoveryViewModel;
import com.qualcomm.qti.gaiaclient.ui.discovery.DiscoveryViewModel_HiltModules_KeyModule_ProvideFactory;
import com.qualcomm.qti.gaiaclient.ui.earbudfit.EarbudFitFragment;
import com.qualcomm.qti.gaiaclient.ui.earbudfit.EarbudFitViewModel;
import com.qualcomm.qti.gaiaclient.ui.earbudfit.EarbudFitViewModel_HiltModules_KeyModule_ProvideFactory;
import com.qualcomm.qti.gaiaclient.ui.feedback.FeedbackFormFragment;
import com.qualcomm.qti.gaiaclient.ui.feedback.SendFeedbackFragment;
import com.qualcomm.qti.gaiaclient.ui.feedback.SendFeedbackViewModel;
import com.qualcomm.qti.gaiaclient.ui.feedback.SendFeedbackViewModel_HiltModules_KeyModule_ProvideFactory;
import com.qualcomm.qti.gaiaclient.ui.gestures.configuration.ConfigurationListFragment;
import com.qualcomm.qti.gaiaclient.ui.gestures.configuration.ConfigurationListViewModel;
import com.qualcomm.qti.gaiaclient.ui.gestures.configuration.ConfigurationListViewModel_HiltModules_KeyModule_ProvideFactory;
import com.qualcomm.qti.gaiaclient.ui.gestures.configuration.GestureConfigurationFragment;
import com.qualcomm.qti.gaiaclient.ui.gestures.configuration.GestureConfigurationViewModel;
import com.qualcomm.qti.gaiaclient.ui.gestures.configuration.GestureConfigurationViewModel_HiltModules_KeyModule_ProvideFactory;
import com.qualcomm.qti.gaiaclient.ui.gestures.gestures.GesturesFragment;
import com.qualcomm.qti.gaiaclient.ui.gestures.gestures.GesturesViewModel;
import com.qualcomm.qti.gaiaclient.ui.gestures.gestures.GesturesViewModel_HiltModules_KeyModule_ProvideFactory;
import com.qualcomm.qti.gaiaclient.ui.information.InformationFragment;
import com.qualcomm.qti.gaiaclient.ui.information.InformationViewModel;
import com.qualcomm.qti.gaiaclient.ui.information.InformationViewModel_HiltModules_KeyModule_ProvideFactory;
import com.qualcomm.qti.gaiaclient.ui.settings.anclegacy.ANCLegacyFragment;
import com.qualcomm.qti.gaiaclient.ui.settings.anclegacy.ANCLegacyViewModel;
import com.qualcomm.qti.gaiaclient.ui.settings.anclegacy.ANCLegacyViewModel_HiltModules_KeyModule_ProvideFactory;
import com.qualcomm.qti.gaiaclient.ui.settings.audiocuration.configuration.AudioCurationSettingsFragment;
import com.qualcomm.qti.gaiaclient.ui.settings.audiocuration.configuration.AudioCurationSettingsViewModel;
import com.qualcomm.qti.gaiaclient.ui.settings.audiocuration.configuration.AudioCurationSettingsViewModel_HiltModules_KeyModule_ProvideFactory;
import com.qualcomm.qti.gaiaclient.ui.settings.audiocuration.demo.AudioCurationDemoFragment;
import com.qualcomm.qti.gaiaclient.ui.settings.audiocuration.demo.AudioCurationDemoViewModel;
import com.qualcomm.qti.gaiaclient.ui.settings.audiocuration.demo.AudioCurationDemoViewModel_HiltModules_KeyModule_ProvideFactory;
import com.qualcomm.qti.gaiaclient.ui.settings.download.DownloadSettingsFragment;
import com.qualcomm.qti.gaiaclient.ui.settings.download.DownloadSettingsViewModel;
import com.qualcomm.qti.gaiaclient.ui.settings.download.DownloadSettingsViewModel_HiltModules_KeyModule_ProvideFactory;
import com.qualcomm.qti.gaiaclient.ui.settings.handsetservice.HandsetServiceFragment;
import com.qualcomm.qti.gaiaclient.ui.settings.handsetservice.HandsetServiceViewModel;
import com.qualcomm.qti.gaiaclient.ui.settings.handsetservice.HandsetServiceViewModel_HiltModules_KeyModule_ProvideFactory;
import com.qualcomm.qti.gaiaclient.ui.settings.logs.LogsSettingsFragment;
import com.qualcomm.qti.gaiaclient.ui.settings.logs.LogsSettingsViewModel;
import com.qualcomm.qti.gaiaclient.ui.settings.logs.LogsSettingsViewModel_HiltModules_KeyModule_ProvideFactory;
import com.qualcomm.qti.gaiaclient.ui.settings.main.MainSettingsFragment;
import com.qualcomm.qti.gaiaclient.ui.settings.main.MainSettingsViewModel;
import com.qualcomm.qti.gaiaclient.ui.settings.main.MainSettingsViewModel_HiltModules_KeyModule_ProvideFactory;
import com.qualcomm.qti.gaiaclient.ui.settings.musicprocessing.MusicProcessingFragment;
import com.qualcomm.qti.gaiaclient.ui.settings.musicprocessing.MusicProcessingViewModel;
import com.qualcomm.qti.gaiaclient.ui.settings.musicprocessing.MusicProcessingViewModel_HiltModules_KeyModule_ProvideFactory;
import com.qualcomm.qti.gaiaclient.ui.settings.statistics.categories.StatisticsCategoriesFragment;
import com.qualcomm.qti.gaiaclient.ui.settings.statistics.categories.StatisticsCategoriesViewModel;
import com.qualcomm.qti.gaiaclient.ui.settings.statistics.categories.StatisticsCategoriesViewModel_HiltModules_KeyModule_ProvideFactory;
import com.qualcomm.qti.gaiaclient.ui.settings.statistics.category.StatisticsStatisticsFragment;
import com.qualcomm.qti.gaiaclient.ui.settings.statistics.category.StatisticsStatisticsViewModel;
import com.qualcomm.qti.gaiaclient.ui.settings.statistics.category.StatisticsStatisticsViewModel_HiltModules_KeyModule_ProvideFactory;
import com.qualcomm.qti.gaiaclient.ui.settings.upgrade.UpgradeSettingsFragment;
import com.qualcomm.qti.gaiaclient.ui.settings.upgrade.UpgradeSettingsViewModel;
import com.qualcomm.qti.gaiaclient.ui.settings.upgrade.UpgradeSettingsViewModel_HiltModules_KeyModule_ProvideFactory;
import com.qualcomm.qti.gaiaclient.ui.settings.voiceprocessing.VoiceProcessingFragment;
import com.qualcomm.qti.gaiaclient.ui.settings.voiceprocessing.VoiceProcessingViewModel;
import com.qualcomm.qti.gaiaclient.ui.settings.voiceprocessing.VoiceProcessingViewModel_HiltModules_KeyModule_ProvideFactory;
import com.qualcomm.qti.gaiaclient.ui.upgrade.download.DownloadFileFragment;
import com.qualcomm.qti.gaiaclient.ui.upgrade.download.DownloadViewModel;
import com.qualcomm.qti.gaiaclient.ui.upgrade.download.DownloadViewModel_HiltModules_KeyModule_ProvideFactory;
import com.qualcomm.qti.gaiaclient.ui.upgrade.files.GetFilesFragment;
import com.qualcomm.qti.gaiaclient.ui.upgrade.files.GetFilesViewModel;
import com.qualcomm.qti.gaiaclient.ui.upgrade.files.GetFilesViewModel_HiltModules_KeyModule_ProvideFactory;
import com.qualcomm.qti.gaiaclient.ui.upgrade.upgrade.UpgradeProgressFragment;
import com.qualcomm.qti.gaiaclient.ui.upgrade.upgrade.UpgradeProgressViewModel;
import com.qualcomm.qti.gaiaclient.ui.upgrade.upgrade.UpgradeProgressViewModel_HiltModules_KeyModule_ProvideFactory;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_Lifecycle_Factory;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.MapBuilder;
import dagger.internal.Preconditions;
import dagger.internal.SetBuilder;
import java.util.Map;
import java.util.Set;
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
public final class DaggerGaiaClientApplication_HiltComponents_SingletonC extends GaiaClientApplication_HiltComponents.SingletonC {
  private final ApplicationContextModule applicationContextModule;

  private final DaggerGaiaClientApplication_HiltComponents_SingletonC singletonC = this;

  private Provider<DiscoveryRepositoryImpl> discoveryRepositoryImplProvider;

  private Provider<FeaturesRepositoryImpl> featuresRepositoryImplProvider;

  private Provider<ConnectionRepositoryImpl> connectionRepositoryImplProvider;

  private Provider<DeviceInformationRepositoryImpl> deviceInformationRepositoryImplProvider;

  private Provider<UpgradeRepositoryImpl> upgradeRepositoryImplProvider;

  private Provider<VoiceUIRepositoryImpl> voiceUIRepositoryImplProvider;

  private Provider<ANCRepositoryLegacyImpl> aNCRepositoryLegacyImplProvider;

  private Provider<AudioCurationRepositoryImpl> audioCurationRepositoryImplProvider;

  private Provider<SystemRepositoryImpl> systemRepositoryImplProvider;

  private Provider<DeviceLogsRepositoryImpl> deviceLogsRepositoryImplProvider;

  private Provider<MusicProcessingRepositoryImpl> musicProcessingRepositoryImplProvider;

  private Provider<EarbudFitRepositoryImpl> earbudFitRepositoryImplProvider;

  private Provider<HandsetServiceRepositoryImpl> handsetServiceRepositoryImplProvider;

  private Provider<VoiceProcessingRepositoryImpl> voiceProcessingRepositoryImplProvider;

  private Provider<MediaPlaybackRepositoryImpl> mediaPlaybackRepositoryImplProvider;

  private Provider<GestureConfigurationRepositoryImpl> gestureConfigurationRepositoryImplProvider;

  private Provider<BatteryRepositoryImpl> batteryRepositoryImplProvider;

  private Provider<StatisticsRepositoryImpl> statisticsRepositoryImplProvider;

  private Provider<ServiceRepositoryImpl> serviceRepositoryImplProvider;

  private DaggerGaiaClientApplication_HiltComponents_SingletonC(
      ApplicationContextModule applicationContextModuleParam) {
    this.applicationContextModule = applicationContextModuleParam;
    initialize(applicationContextModuleParam);

  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final ApplicationContextModule applicationContextModuleParam) {
    this.discoveryRepositoryImplProvider = DoubleCheck.provider(new SwitchingProvider<DiscoveryRepositoryImpl>(singletonC, 0));
    this.featuresRepositoryImplProvider = DoubleCheck.provider(new SwitchingProvider<FeaturesRepositoryImpl>(singletonC, 1));
    this.connectionRepositoryImplProvider = DoubleCheck.provider(new SwitchingProvider<ConnectionRepositoryImpl>(singletonC, 2));
    this.deviceInformationRepositoryImplProvider = DoubleCheck.provider(new SwitchingProvider<DeviceInformationRepositoryImpl>(singletonC, 3));
    this.upgradeRepositoryImplProvider = DoubleCheck.provider(new SwitchingProvider<UpgradeRepositoryImpl>(singletonC, 4));
    this.voiceUIRepositoryImplProvider = DoubleCheck.provider(new SwitchingProvider<VoiceUIRepositoryImpl>(singletonC, 5));
    this.aNCRepositoryLegacyImplProvider = DoubleCheck.provider(new SwitchingProvider<ANCRepositoryLegacyImpl>(singletonC, 6));
    this.audioCurationRepositoryImplProvider = DoubleCheck.provider(new SwitchingProvider<AudioCurationRepositoryImpl>(singletonC, 7));
    this.systemRepositoryImplProvider = DoubleCheck.provider(new SwitchingProvider<SystemRepositoryImpl>(singletonC, 8));
    this.deviceLogsRepositoryImplProvider = DoubleCheck.provider(new SwitchingProvider<DeviceLogsRepositoryImpl>(singletonC, 9));
    this.musicProcessingRepositoryImplProvider = DoubleCheck.provider(new SwitchingProvider<MusicProcessingRepositoryImpl>(singletonC, 10));
    this.earbudFitRepositoryImplProvider = DoubleCheck.provider(new SwitchingProvider<EarbudFitRepositoryImpl>(singletonC, 11));
    this.handsetServiceRepositoryImplProvider = DoubleCheck.provider(new SwitchingProvider<HandsetServiceRepositoryImpl>(singletonC, 12));
    this.voiceProcessingRepositoryImplProvider = DoubleCheck.provider(new SwitchingProvider<VoiceProcessingRepositoryImpl>(singletonC, 13));
    this.mediaPlaybackRepositoryImplProvider = DoubleCheck.provider(new SwitchingProvider<MediaPlaybackRepositoryImpl>(singletonC, 14));
    this.gestureConfigurationRepositoryImplProvider = DoubleCheck.provider(new SwitchingProvider<GestureConfigurationRepositoryImpl>(singletonC, 15));
    this.batteryRepositoryImplProvider = DoubleCheck.provider(new SwitchingProvider<BatteryRepositoryImpl>(singletonC, 16));
    this.statisticsRepositoryImplProvider = DoubleCheck.provider(new SwitchingProvider<StatisticsRepositoryImpl>(singletonC, 17));
    this.serviceRepositoryImplProvider = DoubleCheck.provider(new SwitchingProvider<ServiceRepositoryImpl>(singletonC, 18));
  }

  @Override
  public void injectGaiaClientApplication(GaiaClientApplication arg0) {
    injectGaiaClientApplication2(arg0);
  }

  @Override
  public ActivityRetainedComponentBuilder retainedComponentBuilder() {
    return new ActivityRetainedCBuilder(singletonC);
  }

  @Override
  public ServiceComponentBuilder serviceComponentBuilder() {
    return new ServiceCBuilder(singletonC);
  }

  private GaiaClientApplication injectGaiaClientApplication2(GaiaClientApplication instance) {
    GaiaClientApplication_MembersInjector.injectDiscoveryRepository(instance, discoveryRepositoryImplProvider.get());
    GaiaClientApplication_MembersInjector.injectFeaturesRepository(instance, featuresRepositoryImplProvider.get());
    GaiaClientApplication_MembersInjector.injectConnectionRepository(instance, connectionRepositoryImplProvider.get());
    GaiaClientApplication_MembersInjector.injectDeviceInfoRepository(instance, deviceInformationRepositoryImplProvider.get());
    GaiaClientApplication_MembersInjector.injectUpgradeRepository(instance, upgradeRepositoryImplProvider.get());
    GaiaClientApplication_MembersInjector.injectVoiceUIRepository(instance, voiceUIRepositoryImplProvider.get());
    GaiaClientApplication_MembersInjector.injectAncRepositoryLegacy(instance, aNCRepositoryLegacyImplProvider.get());
    GaiaClientApplication_MembersInjector.injectAudioCurationRepository(instance, audioCurationRepositoryImplProvider.get());
    GaiaClientApplication_MembersInjector.injectSystemRepository(instance, systemRepositoryImplProvider.get());
    GaiaClientApplication_MembersInjector.injectDeviceLogsRepository(instance, deviceLogsRepositoryImplProvider.get());
    GaiaClientApplication_MembersInjector.injectMusicProcessingRepository(instance, musicProcessingRepositoryImplProvider.get());
    GaiaClientApplication_MembersInjector.injectEarbudFitRepository(instance, earbudFitRepositoryImplProvider.get());
    GaiaClientApplication_MembersInjector.injectHandsetServiceRepository(instance, handsetServiceRepositoryImplProvider.get());
    GaiaClientApplication_MembersInjector.injectVoiceProcessingRepository(instance, voiceProcessingRepositoryImplProvider.get());
    GaiaClientApplication_MembersInjector.injectMediaPlaybackRepository(instance, mediaPlaybackRepositoryImplProvider.get());
    GaiaClientApplication_MembersInjector.injectGestureConfigurationRepository(instance, gestureConfigurationRepositoryImplProvider.get());
    GaiaClientApplication_MembersInjector.injectBatteryRepository(instance, batteryRepositoryImplProvider.get());
    GaiaClientApplication_MembersInjector.injectStatisticsRepository(instance, statisticsRepositoryImplProvider.get());
    GaiaClientApplication_MembersInjector.injectServiceRepository(instance, serviceRepositoryImplProvider.get());
    return instance;
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private Builder() {
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    public GaiaClientApplication_HiltComponents.SingletonC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      return new DaggerGaiaClientApplication_HiltComponents_SingletonC(applicationContextModule);
    }
  }

  private static final class ActivityRetainedCBuilder implements GaiaClientApplication_HiltComponents.ActivityRetainedC.Builder {
    private final DaggerGaiaClientApplication_HiltComponents_SingletonC singletonC;

    private ActivityRetainedCBuilder(
        DaggerGaiaClientApplication_HiltComponents_SingletonC singletonC) {
      this.singletonC = singletonC;
    }

    @Override
    public GaiaClientApplication_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl(singletonC);
    }
  }

  private static final class ActivityCBuilder implements GaiaClientApplication_HiltComponents.ActivityC.Builder {
    private final DaggerGaiaClientApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private Activity activity;

    private ActivityCBuilder(DaggerGaiaClientApplication_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ActivityCBuilder activity(Activity activity) {
      this.activity = Preconditions.checkNotNull(activity);
      return this;
    }

    @Override
    public GaiaClientApplication_HiltComponents.ActivityC build() {
      Preconditions.checkBuilderRequirement(activity, Activity.class);
      return new ActivityCImpl(singletonC, activityRetainedCImpl, activity);
    }
  }

  private static final class FragmentCBuilder implements GaiaClientApplication_HiltComponents.FragmentC.Builder {
    private final DaggerGaiaClientApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private Fragment fragment;

    private FragmentCBuilder(DaggerGaiaClientApplication_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public FragmentCBuilder fragment(Fragment fragment) {
      this.fragment = Preconditions.checkNotNull(fragment);
      return this;
    }

    @Override
    public GaiaClientApplication_HiltComponents.FragmentC build() {
      Preconditions.checkBuilderRequirement(fragment, Fragment.class);
      return new FragmentCImpl(singletonC, activityRetainedCImpl, activityCImpl, fragment);
    }
  }

  private static final class ViewWithFragmentCBuilder implements GaiaClientApplication_HiltComponents.ViewWithFragmentC.Builder {
    private final DaggerGaiaClientApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private View view;

    private ViewWithFragmentCBuilder(
        DaggerGaiaClientApplication_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;
    }

    @Override
    public ViewWithFragmentCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public GaiaClientApplication_HiltComponents.ViewWithFragmentC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewWithFragmentCImpl(singletonC, activityRetainedCImpl, activityCImpl, fragmentCImpl, view);
    }
  }

  private static final class ViewCBuilder implements GaiaClientApplication_HiltComponents.ViewC.Builder {
    private final DaggerGaiaClientApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private View view;

    private ViewCBuilder(DaggerGaiaClientApplication_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public ViewCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public GaiaClientApplication_HiltComponents.ViewC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewCImpl(singletonC, activityRetainedCImpl, activityCImpl, view);
    }
  }

  private static final class ViewModelCBuilder implements GaiaClientApplication_HiltComponents.ViewModelC.Builder {
    private final DaggerGaiaClientApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private SavedStateHandle savedStateHandle;

    private ViewModelCBuilder(DaggerGaiaClientApplication_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ViewModelCBuilder savedStateHandle(SavedStateHandle handle) {
      this.savedStateHandle = Preconditions.checkNotNull(handle);
      return this;
    }

    @Override
    public GaiaClientApplication_HiltComponents.ViewModelC build() {
      Preconditions.checkBuilderRequirement(savedStateHandle, SavedStateHandle.class);
      return new ViewModelCImpl(singletonC, activityRetainedCImpl, savedStateHandle);
    }
  }

  private static final class ServiceCBuilder implements GaiaClientApplication_HiltComponents.ServiceC.Builder {
    private final DaggerGaiaClientApplication_HiltComponents_SingletonC singletonC;

    private Service service;

    private ServiceCBuilder(DaggerGaiaClientApplication_HiltComponents_SingletonC singletonC) {
      this.singletonC = singletonC;
    }

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public GaiaClientApplication_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(singletonC, service);
    }
  }

  private static final class ViewWithFragmentCImpl extends GaiaClientApplication_HiltComponents.ViewWithFragmentC {
    private final DaggerGaiaClientApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private final ViewWithFragmentCImpl viewWithFragmentCImpl = this;

    private ViewWithFragmentCImpl(DaggerGaiaClientApplication_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl, View viewParam) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;


    }
  }

  private static final class FragmentCImpl extends GaiaClientApplication_HiltComponents.FragmentC {
    private final DaggerGaiaClientApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl = this;

    private FragmentCImpl(DaggerGaiaClientApplication_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        Fragment fragmentParam) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }

    @Override
    public void injectConnectionFragment(ConnectionFragment arg0) {
    }

    @Override
    public void injectDownloadLogsFragment(DownloadLogsFragment arg0) {
    }

    @Override
    public void injectDiscoveryFragment(DiscoveryFragment arg0) {
    }

    @Override
    public void injectEarbudFitFragment(EarbudFitFragment arg0) {
    }

    @Override
    public void injectFeedbackFormFragment(FeedbackFormFragment arg0) {
    }

    @Override
    public void injectSendFeedbackFragment(SendFeedbackFragment arg0) {
    }

    @Override
    public void injectConfigurationListFragment(ConfigurationListFragment arg0) {
    }

    @Override
    public void injectGestureConfigurationFragment(GestureConfigurationFragment arg0) {
    }

    @Override
    public void injectGesturesFragment(GesturesFragment arg0) {
    }

    @Override
    public void injectInformationFragment(InformationFragment arg0) {
    }

    @Override
    public void injectANCLegacyFragment(ANCLegacyFragment arg0) {
    }

    @Override
    public void injectAudioCurationSettingsFragment(AudioCurationSettingsFragment arg0) {
    }

    @Override
    public void injectAudioCurationDemoFragment(AudioCurationDemoFragment arg0) {
    }

    @Override
    public void injectDownloadSettingsFragment(DownloadSettingsFragment arg0) {
    }

    @Override
    public void injectHandsetServiceFragment(HandsetServiceFragment arg0) {
    }

    @Override
    public void injectLogsSettingsFragment(LogsSettingsFragment arg0) {
    }

    @Override
    public void injectMainSettingsFragment(MainSettingsFragment arg0) {
    }

    @Override
    public void injectMusicProcessingFragment(MusicProcessingFragment arg0) {
    }

    @Override
    public void injectStatisticsCategoriesFragment(StatisticsCategoriesFragment arg0) {
    }

    @Override
    public void injectStatisticsStatisticsFragment(StatisticsStatisticsFragment arg0) {
    }

    @Override
    public void injectUpgradeSettingsFragment(UpgradeSettingsFragment arg0) {
    }

    @Override
    public void injectVoiceProcessingFragment(VoiceProcessingFragment arg0) {
    }

    @Override
    public void injectDownloadFileFragment(DownloadFileFragment arg0) {
    }

    @Override
    public void injectGetFilesFragment(GetFilesFragment arg0) {
    }

    @Override
    public void injectUpgradeProgressFragment(UpgradeProgressFragment arg0) {
    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return activityCImpl.getHiltInternalFactoryFactory();
    }

    @Override
    public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
      return new ViewWithFragmentCBuilder(singletonC, activityRetainedCImpl, activityCImpl, fragmentCImpl);
    }
  }

  private static final class ViewCImpl extends GaiaClientApplication_HiltComponents.ViewC {
    private final DaggerGaiaClientApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final ViewCImpl viewCImpl = this;

    private ViewCImpl(DaggerGaiaClientApplication_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl, View viewParam) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }
  }

  private static final class ActivityCImpl extends GaiaClientApplication_HiltComponents.ActivityC {
    private final DaggerGaiaClientApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl = this;

    private ActivityCImpl(DaggerGaiaClientApplication_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, Activity activityParam) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;


    }

    @Override
    public void injectMainActivity(MainActivity arg0) {
    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(ApplicationContextModule_ProvideApplicationFactory.provideApplication(singletonC.applicationContextModule), getViewModelKeys(), new ViewModelCBuilder(singletonC, activityRetainedCImpl));
    }

    @Override
    public Set<String> getViewModelKeys() {
      return SetBuilder.<String>newSetBuilder(26).add(ANCLegacyViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(AudioCurationDemoViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(AudioCurationSettingsViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(ConfigurationListViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(ConnectionViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(DiscoveryViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(DownloadLogsViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(DownloadSettingsViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(DownloadViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(EarbudFitViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(GestureConfigurationViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(GesturesViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(GetFilesViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(HandsetServiceViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(InformationViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(LogsSettingsViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(MainActivityViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(MainSettingsViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(MusicProcessingViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(PermissionsViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(SendFeedbackViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(StatisticsCategoriesViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(StatisticsStatisticsViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(UpgradeProgressViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(UpgradeSettingsViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(VoiceProcessingViewModel_HiltModules_KeyModule_ProvideFactory.provide()).build();
    }

    @Override
    public ViewModelComponentBuilder getViewModelComponentBuilder() {
      return new ViewModelCBuilder(singletonC, activityRetainedCImpl);
    }

    @Override
    public FragmentComponentBuilder fragmentComponentBuilder() {
      return new FragmentCBuilder(singletonC, activityRetainedCImpl, activityCImpl);
    }

    @Override
    public ViewComponentBuilder viewComponentBuilder() {
      return new ViewCBuilder(singletonC, activityRetainedCImpl, activityCImpl);
    }
  }

  private static final class ViewModelCImpl extends GaiaClientApplication_HiltComponents.ViewModelC {
    private final DaggerGaiaClientApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ViewModelCImpl viewModelCImpl = this;

    private Provider<ANCLegacyViewModel> aNCLegacyViewModelProvider;

    private Provider<AudioCurationDemoViewModel> audioCurationDemoViewModelProvider;

    private Provider<AudioCurationSettingsViewModel> audioCurationSettingsViewModelProvider;

    private Provider<ConfigurationListViewModel> configurationListViewModelProvider;

    private Provider<ConnectionViewModel> connectionViewModelProvider;

    private Provider<DiscoveryViewModel> discoveryViewModelProvider;

    private Provider<DownloadLogsViewModel> downloadLogsViewModelProvider;

    private Provider<DownloadSettingsViewModel> downloadSettingsViewModelProvider;

    private Provider<DownloadViewModel> downloadViewModelProvider;

    private Provider<EarbudFitViewModel> earbudFitViewModelProvider;

    private Provider<GestureConfigurationViewModel> gestureConfigurationViewModelProvider;

    private Provider<GesturesViewModel> gesturesViewModelProvider;

    private Provider<GetFilesViewModel> getFilesViewModelProvider;

    private Provider<HandsetServiceViewModel> handsetServiceViewModelProvider;

    private Provider<InformationViewModel> informationViewModelProvider;

    private Provider<LogsSettingsViewModel> logsSettingsViewModelProvider;

    private Provider<MainActivityViewModel> mainActivityViewModelProvider;

    private Provider<MainSettingsViewModel> mainSettingsViewModelProvider;

    private Provider<MusicProcessingViewModel> musicProcessingViewModelProvider;

    private Provider<PermissionsViewModel> permissionsViewModelProvider;

    private Provider<SendFeedbackViewModel> sendFeedbackViewModelProvider;

    private Provider<StatisticsCategoriesViewModel> statisticsCategoriesViewModelProvider;

    private Provider<StatisticsStatisticsViewModel> statisticsStatisticsViewModelProvider;

    private Provider<UpgradeProgressViewModel> upgradeProgressViewModelProvider;

    private Provider<UpgradeSettingsViewModel> upgradeSettingsViewModelProvider;

    private Provider<VoiceProcessingViewModel> voiceProcessingViewModelProvider;

    private ViewModelCImpl(DaggerGaiaClientApplication_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, SavedStateHandle savedStateHandleParam) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;

      initialize(savedStateHandleParam);

    }

    @SuppressWarnings("unchecked")
    private void initialize(final SavedStateHandle savedStateHandleParam) {
      this.aNCLegacyViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 0);
      this.audioCurationDemoViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 1);
      this.audioCurationSettingsViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 2);
      this.configurationListViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 3);
      this.connectionViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 4);
      this.discoveryViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 5);
      this.downloadLogsViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 6);
      this.downloadSettingsViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 7);
      this.downloadViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 8);
      this.earbudFitViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 9);
      this.gestureConfigurationViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 10);
      this.gesturesViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 11);
      this.getFilesViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 12);
      this.handsetServiceViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 13);
      this.informationViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 14);
      this.logsSettingsViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 15);
      this.mainActivityViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 16);
      this.mainSettingsViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 17);
      this.musicProcessingViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 18);
      this.permissionsViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 19);
      this.sendFeedbackViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 20);
      this.statisticsCategoriesViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 21);
      this.statisticsStatisticsViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 22);
      this.upgradeProgressViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 23);
      this.upgradeSettingsViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 24);
      this.voiceProcessingViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 25);
    }

    @Override
    public Map<String, Provider<ViewModel>> getHiltViewModelMap() {
      return MapBuilder.<String, Provider<ViewModel>>newMapBuilder(26).put("com.qualcomm.qti.gaiaclient.ui.settings.anclegacy.ANCLegacyViewModel", (Provider) aNCLegacyViewModelProvider).put("com.qualcomm.qti.gaiaclient.ui.settings.audiocuration.demo.AudioCurationDemoViewModel", (Provider) audioCurationDemoViewModelProvider).put("com.qualcomm.qti.gaiaclient.ui.settings.audiocuration.configuration.AudioCurationSettingsViewModel", (Provider) audioCurationSettingsViewModelProvider).put("com.qualcomm.qti.gaiaclient.ui.gestures.configuration.ConfigurationListViewModel", (Provider) configurationListViewModelProvider).put("com.qualcomm.qti.gaiaclient.ui.connection.ConnectionViewModel", (Provider) connectionViewModelProvider).put("com.qualcomm.qti.gaiaclient.ui.discovery.DiscoveryViewModel", (Provider) discoveryViewModelProvider).put("com.qualcomm.qti.gaiaclient.ui.devicelogs.DownloadLogsViewModel", (Provider) downloadLogsViewModelProvider).put("com.qualcomm.qti.gaiaclient.ui.settings.download.DownloadSettingsViewModel", (Provider) downloadSettingsViewModelProvider).put("com.qualcomm.qti.gaiaclient.ui.upgrade.download.DownloadViewModel", (Provider) downloadViewModelProvider).put("com.qualcomm.qti.gaiaclient.ui.earbudfit.EarbudFitViewModel", (Provider) earbudFitViewModelProvider).put("com.qualcomm.qti.gaiaclient.ui.gestures.configuration.GestureConfigurationViewModel", (Provider) gestureConfigurationViewModelProvider).put("com.qualcomm.qti.gaiaclient.ui.gestures.gestures.GesturesViewModel", (Provider) gesturesViewModelProvider).put("com.qualcomm.qti.gaiaclient.ui.upgrade.files.GetFilesViewModel", (Provider) getFilesViewModelProvider).put("com.qualcomm.qti.gaiaclient.ui.settings.handsetservice.HandsetServiceViewModel", (Provider) handsetServiceViewModelProvider).put("com.qualcomm.qti.gaiaclient.ui.information.InformationViewModel", (Provider) informationViewModelProvider).put("com.qualcomm.qti.gaiaclient.ui.settings.logs.LogsSettingsViewModel", (Provider) logsSettingsViewModelProvider).put("com.qualcomm.qti.gaiaclient.ui.MainActivityViewModel", (Provider) mainActivityViewModelProvider).put("com.qualcomm.qti.gaiaclient.ui.settings.main.MainSettingsViewModel", (Provider) mainSettingsViewModelProvider).put("com.qualcomm.qti.gaiaclient.ui.settings.musicprocessing.MusicProcessingViewModel", (Provider) musicProcessingViewModelProvider).put("com.qualcomm.qti.gaiaclient.ui.PermissionsViewModel", (Provider) permissionsViewModelProvider).put("com.qualcomm.qti.gaiaclient.ui.feedback.SendFeedbackViewModel", (Provider) sendFeedbackViewModelProvider).put("com.qualcomm.qti.gaiaclient.ui.settings.statistics.categories.StatisticsCategoriesViewModel", (Provider) statisticsCategoriesViewModelProvider).put("com.qualcomm.qti.gaiaclient.ui.settings.statistics.category.StatisticsStatisticsViewModel", (Provider) statisticsStatisticsViewModelProvider).put("com.qualcomm.qti.gaiaclient.ui.upgrade.upgrade.UpgradeProgressViewModel", (Provider) upgradeProgressViewModelProvider).put("com.qualcomm.qti.gaiaclient.ui.settings.upgrade.UpgradeSettingsViewModel", (Provider) upgradeSettingsViewModelProvider).put("com.qualcomm.qti.gaiaclient.ui.settings.voiceprocessing.VoiceProcessingViewModel", (Provider) voiceProcessingViewModelProvider).build();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final DaggerGaiaClientApplication_HiltComponents_SingletonC singletonC;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final ViewModelCImpl viewModelCImpl;

      private final int id;

      SwitchingProvider(DaggerGaiaClientApplication_HiltComponents_SingletonC singletonC,
          ActivityRetainedCImpl activityRetainedCImpl, ViewModelCImpl viewModelCImpl, int id) {
        this.singletonC = singletonC;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.viewModelCImpl = viewModelCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // com.qualcomm.qti.gaiaclient.ui.settings.anclegacy.ANCLegacyViewModel 
          return (T) new ANCLegacyViewModel(ApplicationContextModule_ProvideApplicationFactory.provideApplication(singletonC.applicationContextModule), singletonC.aNCRepositoryLegacyImplProvider.get(), singletonC.connectionRepositoryImplProvider.get(), singletonC.featuresRepositoryImplProvider.get());

          case 1: // com.qualcomm.qti.gaiaclient.ui.settings.audiocuration.demo.AudioCurationDemoViewModel 
          return (T) new AudioCurationDemoViewModel(ApplicationContextModule_ProvideApplicationFactory.provideApplication(singletonC.applicationContextModule), singletonC.audioCurationRepositoryImplProvider.get(), singletonC.connectionRepositoryImplProvider.get(), singletonC.featuresRepositoryImplProvider.get(), singletonC.mediaPlaybackRepositoryImplProvider.get());

          case 2: // com.qualcomm.qti.gaiaclient.ui.settings.audiocuration.configuration.AudioCurationSettingsViewModel 
          return (T) new AudioCurationSettingsViewModel(ApplicationContextModule_ProvideApplicationFactory.provideApplication(singletonC.applicationContextModule), singletonC.audioCurationRepositoryImplProvider.get(), singletonC.connectionRepositoryImplProvider.get(), singletonC.featuresRepositoryImplProvider.get());

          case 3: // com.qualcomm.qti.gaiaclient.ui.gestures.configuration.ConfigurationListViewModel 
          return (T) new ConfigurationListViewModel(ApplicationContextModule_ProvideApplicationFactory.provideApplication(singletonC.applicationContextModule), singletonC.featuresRepositoryImplProvider.get(), singletonC.gestureConfigurationRepositoryImplProvider.get());

          case 4: // com.qualcomm.qti.gaiaclient.ui.connection.ConnectionViewModel 
          return (T) new ConnectionViewModel(ApplicationContextModule_ProvideApplicationFactory.provideApplication(singletonC.applicationContextModule), singletonC.connectionRepositoryImplProvider.get());

          case 5: // com.qualcomm.qti.gaiaclient.ui.discovery.DiscoveryViewModel 
          return (T) new DiscoveryViewModel(ApplicationContextModule_ProvideApplicationFactory.provideApplication(singletonC.applicationContextModule), singletonC.discoveryRepositoryImplProvider.get());

          case 6: // com.qualcomm.qti.gaiaclient.ui.devicelogs.DownloadLogsViewModel 
          return (T) new DownloadLogsViewModel(ApplicationContextModule_ProvideApplicationFactory.provideApplication(singletonC.applicationContextModule), singletonC.deviceLogsRepositoryImplProvider.get());

          case 7: // com.qualcomm.qti.gaiaclient.ui.settings.download.DownloadSettingsViewModel 
          return (T) new DownloadSettingsViewModel(ApplicationContextModule_ProvideApplicationFactory.provideApplication(singletonC.applicationContextModule), singletonC.connectionRepositoryImplProvider.get(), singletonC.deviceInformationRepositoryImplProvider.get());

          case 8: // com.qualcomm.qti.gaiaclient.ui.upgrade.download.DownloadViewModel 
          return (T) new DownloadViewModel(ApplicationContextModule_ProvideApplicationFactory.provideApplication(singletonC.applicationContextModule), singletonC.serviceRepositoryImplProvider.get(), singletonC.upgradeRepositoryImplProvider.get());

          case 9: // com.qualcomm.qti.gaiaclient.ui.earbudfit.EarbudFitViewModel 
          return (T) new EarbudFitViewModel(ApplicationContextModule_ProvideApplicationFactory.provideApplication(singletonC.applicationContextModule), singletonC.earbudFitRepositoryImplProvider.get());

          case 10: // com.qualcomm.qti.gaiaclient.ui.gestures.configuration.GestureConfigurationViewModel 
          return (T) new GestureConfigurationViewModel(ApplicationContextModule_ProvideApplicationFactory.provideApplication(singletonC.applicationContextModule), singletonC.featuresRepositoryImplProvider.get(), singletonC.gestureConfigurationRepositoryImplProvider.get());

          case 11: // com.qualcomm.qti.gaiaclient.ui.gestures.gestures.GesturesViewModel 
          return (T) new GesturesViewModel(ApplicationContextModule_ProvideApplicationFactory.provideApplication(singletonC.applicationContextModule), singletonC.featuresRepositoryImplProvider.get(), singletonC.gestureConfigurationRepositoryImplProvider.get());

          case 12: // com.qualcomm.qti.gaiaclient.ui.upgrade.files.GetFilesViewModel 
          return (T) new GetFilesViewModel(ApplicationContextModule_ProvideApplicationFactory.provideApplication(singletonC.applicationContextModule), singletonC.serviceRepositoryImplProvider.get(), singletonC.deviceInformationRepositoryImplProvider.get());

          case 13: // com.qualcomm.qti.gaiaclient.ui.settings.handsetservice.HandsetServiceViewModel 
          return (T) new HandsetServiceViewModel(ApplicationContextModule_ProvideApplicationFactory.provideApplication(singletonC.applicationContextModule), singletonC.connectionRepositoryImplProvider.get(), singletonC.handsetServiceRepositoryImplProvider.get());

          case 14: // com.qualcomm.qti.gaiaclient.ui.information.InformationViewModel 
          return (T) new InformationViewModel(ApplicationContextModule_ProvideApplicationFactory.provideApplication(singletonC.applicationContextModule), singletonC.connectionRepositoryImplProvider.get(), singletonC.featuresRepositoryImplProvider.get(), singletonC.deviceInformationRepositoryImplProvider.get(), singletonC.batteryRepositoryImplProvider.get());

          case 15: // com.qualcomm.qti.gaiaclient.ui.settings.logs.LogsSettingsViewModel 
          return (T) new LogsSettingsViewModel(ApplicationContextModule_ProvideApplicationFactory.provideApplication(singletonC.applicationContextModule), singletonC.connectionRepositoryImplProvider.get(), singletonC.deviceLogsRepositoryImplProvider.get(), singletonC.featuresRepositoryImplProvider.get(), singletonC.systemRepositoryImplProvider.get());

          case 16: // com.qualcomm.qti.gaiaclient.ui.MainActivityViewModel 
          return (T) new MainActivityViewModel(ApplicationContextModule_ProvideApplicationFactory.provideApplication(singletonC.applicationContextModule), singletonC.connectionRepositoryImplProvider.get(), singletonC.discoveryRepositoryImplProvider.get(), singletonC.systemRepositoryImplProvider.get());

          case 17: // com.qualcomm.qti.gaiaclient.ui.settings.main.MainSettingsViewModel 
          return (T) new MainSettingsViewModel(ApplicationContextModule_ProvideApplicationFactory.provideApplication(singletonC.applicationContextModule), singletonC.connectionRepositoryImplProvider.get(), singletonC.deviceInformationRepositoryImplProvider.get(), singletonC.featuresRepositoryImplProvider.get(), singletonC.voiceUIRepositoryImplProvider.get(), singletonC.systemRepositoryImplProvider.get());

          case 18: // com.qualcomm.qti.gaiaclient.ui.settings.musicprocessing.MusicProcessingViewModel 
          return (T) new MusicProcessingViewModel(ApplicationContextModule_ProvideApplicationFactory.provideApplication(singletonC.applicationContextModule), singletonC.connectionRepositoryImplProvider.get(), singletonC.musicProcessingRepositoryImplProvider.get());

          case 19: // com.qualcomm.qti.gaiaclient.ui.PermissionsViewModel 
          return (T) new PermissionsViewModel(ApplicationContextModule_ProvideApplicationFactory.provideApplication(singletonC.applicationContextModule));

          case 20: // com.qualcomm.qti.gaiaclient.ui.feedback.SendFeedbackViewModel 
          return (T) new SendFeedbackViewModel(ApplicationContextModule_ProvideApplicationFactory.provideApplication(singletonC.applicationContextModule), singletonC.serviceRepositoryImplProvider.get(), singletonC.deviceInformationRepositoryImplProvider.get());

          case 21: // com.qualcomm.qti.gaiaclient.ui.settings.statistics.categories.StatisticsCategoriesViewModel 
          return (T) new StatisticsCategoriesViewModel(ApplicationContextModule_ProvideApplicationFactory.provideApplication(singletonC.applicationContextModule), singletonC.statisticsRepositoryImplProvider.get());

          case 22: // com.qualcomm.qti.gaiaclient.ui.settings.statistics.category.StatisticsStatisticsViewModel 
          return (T) new StatisticsStatisticsViewModel(ApplicationContextModule_ProvideApplicationFactory.provideApplication(singletonC.applicationContextModule), singletonC.statisticsRepositoryImplProvider.get());

          case 23: // com.qualcomm.qti.gaiaclient.ui.upgrade.upgrade.UpgradeProgressViewModel 
          return (T) new UpgradeProgressViewModel(ApplicationContextModule_ProvideApplicationFactory.provideApplication(singletonC.applicationContextModule), singletonC.upgradeRepositoryImplProvider.get(), singletonC.systemRepositoryImplProvider.get());

          case 24: // com.qualcomm.qti.gaiaclient.ui.settings.upgrade.UpgradeSettingsViewModel 
          return (T) new UpgradeSettingsViewModel(ApplicationContextModule_ProvideApplicationFactory.provideApplication(singletonC.applicationContextModule), singletonC.connectionRepositoryImplProvider.get(), singletonC.deviceInformationRepositoryImplProvider.get(), singletonC.upgradeRepositoryImplProvider.get());

          case 25: // com.qualcomm.qti.gaiaclient.ui.settings.voiceprocessing.VoiceProcessingViewModel 
          return (T) new VoiceProcessingViewModel(ApplicationContextModule_ProvideApplicationFactory.provideApplication(singletonC.applicationContextModule), singletonC.connectionRepositoryImplProvider.get(), singletonC.featuresRepositoryImplProvider.get(), singletonC.voiceProcessingRepositoryImplProvider.get());

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ActivityRetainedCImpl extends GaiaClientApplication_HiltComponents.ActivityRetainedC {
    private final DaggerGaiaClientApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl = this;

    @SuppressWarnings("rawtypes")
    private Provider lifecycleProvider;

    private ActivityRetainedCImpl(
        DaggerGaiaClientApplication_HiltComponents_SingletonC singletonC) {
      this.singletonC = singletonC;

      initialize();

    }

    @SuppressWarnings("unchecked")
    private void initialize() {
      this.lifecycleProvider = DoubleCheck.provider(new SwitchingProvider<Object>(singletonC, activityRetainedCImpl, 0));
    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder(singletonC, activityRetainedCImpl);
    }

    @Override
    public ActivityRetainedLifecycle getActivityRetainedLifecycle() {
      return (ActivityRetainedLifecycle) lifecycleProvider.get();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final DaggerGaiaClientApplication_HiltComponents_SingletonC singletonC;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final int id;

      SwitchingProvider(DaggerGaiaClientApplication_HiltComponents_SingletonC singletonC,
          ActivityRetainedCImpl activityRetainedCImpl, int id) {
        this.singletonC = singletonC;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // dagger.hilt.android.internal.managers.ActivityRetainedComponentManager.Lifecycle 
          return (T) ActivityRetainedComponentManager_Lifecycle_Factory.newInstance();

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ServiceCImpl extends GaiaClientApplication_HiltComponents.ServiceC {
    private final DaggerGaiaClientApplication_HiltComponents_SingletonC singletonC;

    private final ServiceCImpl serviceCImpl = this;

    private ServiceCImpl(DaggerGaiaClientApplication_HiltComponents_SingletonC singletonC,
        Service serviceParam) {
      this.singletonC = singletonC;


    }
  }

  private static final class SwitchingProvider<T> implements Provider<T> {
    private final DaggerGaiaClientApplication_HiltComponents_SingletonC singletonC;

    private final int id;

    SwitchingProvider(DaggerGaiaClientApplication_HiltComponents_SingletonC singletonC, int id) {
      this.singletonC = singletonC;
      this.id = id;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T get() {
      switch (id) {
        case 0: // com.qualcomm.qti.gaiaclient.repository.discovery.DiscoveryRepositoryImpl 
        return (T) new DiscoveryRepositoryImpl();

        case 1: // com.qualcomm.qti.gaiaclient.repository.features.FeaturesRepositoryImpl 
        return (T) new FeaturesRepositoryImpl();

        case 2: // com.qualcomm.qti.gaiaclient.repository.connection.ConnectionRepositoryImpl 
        return (T) new ConnectionRepositoryImpl();

        case 3: // com.qualcomm.qti.gaiaclient.repository.deviceinfo.DeviceInformationRepositoryImpl 
        return (T) new DeviceInformationRepositoryImpl();

        case 4: // com.qualcomm.qti.gaiaclient.repository.upgrade.UpgradeRepositoryImpl 
        return (T) new UpgradeRepositoryImpl(singletonC.deviceInformationRepositoryImplProvider.get());

        case 5: // com.qualcomm.qti.gaiaclient.repository.voiceui.VoiceUIRepositoryImpl 
        return (T) new VoiceUIRepositoryImpl();

        case 6: // com.qualcomm.qti.gaiaclient.repository.anclegacy.ANCRepositoryLegacyImpl 
        return (T) new ANCRepositoryLegacyImpl();

        case 7: // com.qualcomm.qti.gaiaclient.repository.audiocuration.AudioCurationRepositoryImpl 
        return (T) new AudioCurationRepositoryImpl();

        case 8: // com.qualcomm.qti.gaiaclient.repository.system.SystemRepositoryImpl 
        return (T) new SystemRepositoryImpl();

        case 9: // com.qualcomm.qti.gaiaclient.repository.logs.DeviceLogsRepositoryImpl 
        return (T) new DeviceLogsRepositoryImpl();

        case 10: // com.qualcomm.qti.gaiaclient.repository.musicprocessing.MusicProcessingRepositoryImpl 
        return (T) new MusicProcessingRepositoryImpl();

        case 11: // com.qualcomm.qti.gaiaclient.repository.earbudfit.EarbudFitRepositoryImpl 
        return (T) new EarbudFitRepositoryImpl();

        case 12: // com.qualcomm.qti.gaiaclient.repository.handsetservice.HandsetServiceRepositoryImpl 
        return (T) new HandsetServiceRepositoryImpl();

        case 13: // com.qualcomm.qti.gaiaclient.repository.voiceprocessing.VoiceProcessingRepositoryImpl 
        return (T) new VoiceProcessingRepositoryImpl();

        case 14: // com.qualcomm.qti.gaiaclient.repository.mediaplayback.MediaPlaybackRepositoryImpl 
        return (T) new MediaPlaybackRepositoryImpl(ApplicationContextModule_ProvideContextFactory.provideContext(singletonC.applicationContextModule));

        case 15: // com.qualcomm.qti.gaiaclient.repository.gestureconfiguration.GestureConfigurationRepositoryImpl 
        return (T) new GestureConfigurationRepositoryImpl();

        case 16: // com.qualcomm.qti.gaiaclient.repository.battery.BatteryRepositoryImpl 
        return (T) new BatteryRepositoryImpl();

        case 17: // com.qualcomm.qti.gaiaclient.repository.statistics.StatisticsRepositoryImpl 
        return (T) new StatisticsRepositoryImpl(ApplicationContextModule_ProvideContextFactory.provideContext(singletonC.applicationContextModule));

        case 18: // com.qualcomm.qti.gaiaclient.repository.service.ServiceRepositoryImpl 
        return (T) new ServiceRepositoryImpl();

        default: throw new AssertionError(id);
      }
    }
  }
}
