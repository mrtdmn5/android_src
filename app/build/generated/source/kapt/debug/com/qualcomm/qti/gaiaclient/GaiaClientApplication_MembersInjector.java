package com.qualcomm.qti.gaiaclient;

import com.qualcomm.qti.gaiaclient.repository.anclegacy.ANCRepositoryLegacy;
import com.qualcomm.qti.gaiaclient.repository.audiocuration.AudioCurationRepository;
import com.qualcomm.qti.gaiaclient.repository.battery.BatteryRepository;
import com.qualcomm.qti.gaiaclient.repository.connection.ConnectionRepository;
import com.qualcomm.qti.gaiaclient.repository.deviceinfo.DeviceInformationRepository;
import com.qualcomm.qti.gaiaclient.repository.discovery.DiscoveryRepository;
import com.qualcomm.qti.gaiaclient.repository.earbudfit.EarbudFitRepository;
import com.qualcomm.qti.gaiaclient.repository.features.FeaturesRepository;
import com.qualcomm.qti.gaiaclient.repository.gestureconfiguration.GestureConfigurationRepository;
import com.qualcomm.qti.gaiaclient.repository.handsetservice.HandsetServiceRepository;
import com.qualcomm.qti.gaiaclient.repository.logs.DeviceLogsRepository;
import com.qualcomm.qti.gaiaclient.repository.mediaplayback.MediaPlaybackRepository;
import com.qualcomm.qti.gaiaclient.repository.musicprocessing.MusicProcessingRepository;
import com.qualcomm.qti.gaiaclient.repository.service.ServiceRepository;
import com.qualcomm.qti.gaiaclient.repository.statistics.StatisticsRepository;
import com.qualcomm.qti.gaiaclient.repository.system.SystemRepository;
import com.qualcomm.qti.gaiaclient.repository.upgrade.UpgradeRepository;
import com.qualcomm.qti.gaiaclient.repository.voiceprocessing.VoiceProcessingRepository;
import com.qualcomm.qti.gaiaclient.repository.voiceui.VoiceUIRepository;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
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
public final class GaiaClientApplication_MembersInjector implements MembersInjector<GaiaClientApplication> {
  private final Provider<DiscoveryRepository> discoveryRepositoryProvider;

  private final Provider<FeaturesRepository> featuresRepositoryProvider;

  private final Provider<ConnectionRepository> connectionRepositoryProvider;

  private final Provider<DeviceInformationRepository> deviceInfoRepositoryProvider;

  private final Provider<UpgradeRepository> upgradeRepositoryProvider;

  private final Provider<VoiceUIRepository> voiceUIRepositoryProvider;

  private final Provider<ANCRepositoryLegacy> ancRepositoryLegacyProvider;

  private final Provider<AudioCurationRepository> audioCurationRepositoryProvider;

  private final Provider<SystemRepository> systemRepositoryProvider;

  private final Provider<DeviceLogsRepository> deviceLogsRepositoryProvider;

  private final Provider<MusicProcessingRepository> musicProcessingRepositoryProvider;

  private final Provider<EarbudFitRepository> earbudFitRepositoryProvider;

  private final Provider<HandsetServiceRepository> handsetServiceRepositoryProvider;

  private final Provider<VoiceProcessingRepository> voiceProcessingRepositoryProvider;

  private final Provider<MediaPlaybackRepository> mediaPlaybackRepositoryProvider;

  private final Provider<GestureConfigurationRepository> gestureConfigurationRepositoryProvider;

  private final Provider<BatteryRepository> batteryRepositoryProvider;

  private final Provider<StatisticsRepository> statisticsRepositoryProvider;

  private final Provider<ServiceRepository> serviceRepositoryProvider;

  public GaiaClientApplication_MembersInjector(
      Provider<DiscoveryRepository> discoveryRepositoryProvider,
      Provider<FeaturesRepository> featuresRepositoryProvider,
      Provider<ConnectionRepository> connectionRepositoryProvider,
      Provider<DeviceInformationRepository> deviceInfoRepositoryProvider,
      Provider<UpgradeRepository> upgradeRepositoryProvider,
      Provider<VoiceUIRepository> voiceUIRepositoryProvider,
      Provider<ANCRepositoryLegacy> ancRepositoryLegacyProvider,
      Provider<AudioCurationRepository> audioCurationRepositoryProvider,
      Provider<SystemRepository> systemRepositoryProvider,
      Provider<DeviceLogsRepository> deviceLogsRepositoryProvider,
      Provider<MusicProcessingRepository> musicProcessingRepositoryProvider,
      Provider<EarbudFitRepository> earbudFitRepositoryProvider,
      Provider<HandsetServiceRepository> handsetServiceRepositoryProvider,
      Provider<VoiceProcessingRepository> voiceProcessingRepositoryProvider,
      Provider<MediaPlaybackRepository> mediaPlaybackRepositoryProvider,
      Provider<GestureConfigurationRepository> gestureConfigurationRepositoryProvider,
      Provider<BatteryRepository> batteryRepositoryProvider,
      Provider<StatisticsRepository> statisticsRepositoryProvider,
      Provider<ServiceRepository> serviceRepositoryProvider) {
    this.discoveryRepositoryProvider = discoveryRepositoryProvider;
    this.featuresRepositoryProvider = featuresRepositoryProvider;
    this.connectionRepositoryProvider = connectionRepositoryProvider;
    this.deviceInfoRepositoryProvider = deviceInfoRepositoryProvider;
    this.upgradeRepositoryProvider = upgradeRepositoryProvider;
    this.voiceUIRepositoryProvider = voiceUIRepositoryProvider;
    this.ancRepositoryLegacyProvider = ancRepositoryLegacyProvider;
    this.audioCurationRepositoryProvider = audioCurationRepositoryProvider;
    this.systemRepositoryProvider = systemRepositoryProvider;
    this.deviceLogsRepositoryProvider = deviceLogsRepositoryProvider;
    this.musicProcessingRepositoryProvider = musicProcessingRepositoryProvider;
    this.earbudFitRepositoryProvider = earbudFitRepositoryProvider;
    this.handsetServiceRepositoryProvider = handsetServiceRepositoryProvider;
    this.voiceProcessingRepositoryProvider = voiceProcessingRepositoryProvider;
    this.mediaPlaybackRepositoryProvider = mediaPlaybackRepositoryProvider;
    this.gestureConfigurationRepositoryProvider = gestureConfigurationRepositoryProvider;
    this.batteryRepositoryProvider = batteryRepositoryProvider;
    this.statisticsRepositoryProvider = statisticsRepositoryProvider;
    this.serviceRepositoryProvider = serviceRepositoryProvider;
  }

  public static MembersInjector<GaiaClientApplication> create(
      Provider<DiscoveryRepository> discoveryRepositoryProvider,
      Provider<FeaturesRepository> featuresRepositoryProvider,
      Provider<ConnectionRepository> connectionRepositoryProvider,
      Provider<DeviceInformationRepository> deviceInfoRepositoryProvider,
      Provider<UpgradeRepository> upgradeRepositoryProvider,
      Provider<VoiceUIRepository> voiceUIRepositoryProvider,
      Provider<ANCRepositoryLegacy> ancRepositoryLegacyProvider,
      Provider<AudioCurationRepository> audioCurationRepositoryProvider,
      Provider<SystemRepository> systemRepositoryProvider,
      Provider<DeviceLogsRepository> deviceLogsRepositoryProvider,
      Provider<MusicProcessingRepository> musicProcessingRepositoryProvider,
      Provider<EarbudFitRepository> earbudFitRepositoryProvider,
      Provider<HandsetServiceRepository> handsetServiceRepositoryProvider,
      Provider<VoiceProcessingRepository> voiceProcessingRepositoryProvider,
      Provider<MediaPlaybackRepository> mediaPlaybackRepositoryProvider,
      Provider<GestureConfigurationRepository> gestureConfigurationRepositoryProvider,
      Provider<BatteryRepository> batteryRepositoryProvider,
      Provider<StatisticsRepository> statisticsRepositoryProvider,
      Provider<ServiceRepository> serviceRepositoryProvider) {
    return new GaiaClientApplication_MembersInjector(discoveryRepositoryProvider, featuresRepositoryProvider, connectionRepositoryProvider, deviceInfoRepositoryProvider, upgradeRepositoryProvider, voiceUIRepositoryProvider, ancRepositoryLegacyProvider, audioCurationRepositoryProvider, systemRepositoryProvider, deviceLogsRepositoryProvider, musicProcessingRepositoryProvider, earbudFitRepositoryProvider, handsetServiceRepositoryProvider, voiceProcessingRepositoryProvider, mediaPlaybackRepositoryProvider, gestureConfigurationRepositoryProvider, batteryRepositoryProvider, statisticsRepositoryProvider, serviceRepositoryProvider);
  }

  @Override
  public void injectMembers(GaiaClientApplication instance) {
    injectDiscoveryRepository(instance, discoveryRepositoryProvider.get());
    injectFeaturesRepository(instance, featuresRepositoryProvider.get());
    injectConnectionRepository(instance, connectionRepositoryProvider.get());
    injectDeviceInfoRepository(instance, deviceInfoRepositoryProvider.get());
    injectUpgradeRepository(instance, upgradeRepositoryProvider.get());
    injectVoiceUIRepository(instance, voiceUIRepositoryProvider.get());
    injectAncRepositoryLegacy(instance, ancRepositoryLegacyProvider.get());
    injectAudioCurationRepository(instance, audioCurationRepositoryProvider.get());
    injectSystemRepository(instance, systemRepositoryProvider.get());
    injectDeviceLogsRepository(instance, deviceLogsRepositoryProvider.get());
    injectMusicProcessingRepository(instance, musicProcessingRepositoryProvider.get());
    injectEarbudFitRepository(instance, earbudFitRepositoryProvider.get());
    injectHandsetServiceRepository(instance, handsetServiceRepositoryProvider.get());
    injectVoiceProcessingRepository(instance, voiceProcessingRepositoryProvider.get());
    injectMediaPlaybackRepository(instance, mediaPlaybackRepositoryProvider.get());
    injectGestureConfigurationRepository(instance, gestureConfigurationRepositoryProvider.get());
    injectBatteryRepository(instance, batteryRepositoryProvider.get());
    injectStatisticsRepository(instance, statisticsRepositoryProvider.get());
    injectServiceRepository(instance, serviceRepositoryProvider.get());
  }

  @InjectedFieldSignature("com.qualcomm.qti.gaiaclient.GaiaClientApplication.discoveryRepository")
  public static void injectDiscoveryRepository(GaiaClientApplication instance,
      DiscoveryRepository discoveryRepository) {
    instance.discoveryRepository = discoveryRepository;
  }

  @InjectedFieldSignature("com.qualcomm.qti.gaiaclient.GaiaClientApplication.featuresRepository")
  public static void injectFeaturesRepository(GaiaClientApplication instance,
      FeaturesRepository featuresRepository) {
    instance.featuresRepository = featuresRepository;
  }

  @InjectedFieldSignature("com.qualcomm.qti.gaiaclient.GaiaClientApplication.connectionRepository")
  public static void injectConnectionRepository(GaiaClientApplication instance,
      ConnectionRepository connectionRepository) {
    instance.connectionRepository = connectionRepository;
  }

  @InjectedFieldSignature("com.qualcomm.qti.gaiaclient.GaiaClientApplication.deviceInfoRepository")
  public static void injectDeviceInfoRepository(GaiaClientApplication instance,
      DeviceInformationRepository deviceInfoRepository) {
    instance.deviceInfoRepository = deviceInfoRepository;
  }

  @InjectedFieldSignature("com.qualcomm.qti.gaiaclient.GaiaClientApplication.upgradeRepository")
  public static void injectUpgradeRepository(GaiaClientApplication instance,
      UpgradeRepository upgradeRepository) {
    instance.upgradeRepository = upgradeRepository;
  }

  @InjectedFieldSignature("com.qualcomm.qti.gaiaclient.GaiaClientApplication.voiceUIRepository")
  public static void injectVoiceUIRepository(GaiaClientApplication instance,
      VoiceUIRepository voiceUIRepository) {
    instance.voiceUIRepository = voiceUIRepository;
  }

  @InjectedFieldSignature("com.qualcomm.qti.gaiaclient.GaiaClientApplication.ancRepositoryLegacy")
  public static void injectAncRepositoryLegacy(GaiaClientApplication instance,
      ANCRepositoryLegacy ancRepositoryLegacy) {
    instance.ancRepositoryLegacy = ancRepositoryLegacy;
  }

  @InjectedFieldSignature("com.qualcomm.qti.gaiaclient.GaiaClientApplication.audioCurationRepository")
  public static void injectAudioCurationRepository(GaiaClientApplication instance,
      AudioCurationRepository audioCurationRepository) {
    instance.audioCurationRepository = audioCurationRepository;
  }

  @InjectedFieldSignature("com.qualcomm.qti.gaiaclient.GaiaClientApplication.systemRepository")
  public static void injectSystemRepository(GaiaClientApplication instance,
      SystemRepository systemRepository) {
    instance.systemRepository = systemRepository;
  }

  @InjectedFieldSignature("com.qualcomm.qti.gaiaclient.GaiaClientApplication.deviceLogsRepository")
  public static void injectDeviceLogsRepository(GaiaClientApplication instance,
      DeviceLogsRepository deviceLogsRepository) {
    instance.deviceLogsRepository = deviceLogsRepository;
  }

  @InjectedFieldSignature("com.qualcomm.qti.gaiaclient.GaiaClientApplication.musicProcessingRepository")
  public static void injectMusicProcessingRepository(GaiaClientApplication instance,
      MusicProcessingRepository musicProcessingRepository) {
    instance.musicProcessingRepository = musicProcessingRepository;
  }

  @InjectedFieldSignature("com.qualcomm.qti.gaiaclient.GaiaClientApplication.earbudFitRepository")
  public static void injectEarbudFitRepository(GaiaClientApplication instance,
      EarbudFitRepository earbudFitRepository) {
    instance.earbudFitRepository = earbudFitRepository;
  }

  @InjectedFieldSignature("com.qualcomm.qti.gaiaclient.GaiaClientApplication.handsetServiceRepository")
  public static void injectHandsetServiceRepository(GaiaClientApplication instance,
      HandsetServiceRepository handsetServiceRepository) {
    instance.handsetServiceRepository = handsetServiceRepository;
  }

  @InjectedFieldSignature("com.qualcomm.qti.gaiaclient.GaiaClientApplication.voiceProcessingRepository")
  public static void injectVoiceProcessingRepository(GaiaClientApplication instance,
      VoiceProcessingRepository voiceProcessingRepository) {
    instance.voiceProcessingRepository = voiceProcessingRepository;
  }

  @InjectedFieldSignature("com.qualcomm.qti.gaiaclient.GaiaClientApplication.mediaPlaybackRepository")
  public static void injectMediaPlaybackRepository(GaiaClientApplication instance,
      MediaPlaybackRepository mediaPlaybackRepository) {
    instance.mediaPlaybackRepository = mediaPlaybackRepository;
  }

  @InjectedFieldSignature("com.qualcomm.qti.gaiaclient.GaiaClientApplication.gestureConfigurationRepository")
  public static void injectGestureConfigurationRepository(GaiaClientApplication instance,
      GestureConfigurationRepository gestureConfigurationRepository) {
    instance.gestureConfigurationRepository = gestureConfigurationRepository;
  }

  @InjectedFieldSignature("com.qualcomm.qti.gaiaclient.GaiaClientApplication.batteryRepository")
  public static void injectBatteryRepository(GaiaClientApplication instance,
      BatteryRepository batteryRepository) {
    instance.batteryRepository = batteryRepository;
  }

  @InjectedFieldSignature("com.qualcomm.qti.gaiaclient.GaiaClientApplication.statisticsRepository")
  public static void injectStatisticsRepository(GaiaClientApplication instance,
      StatisticsRepository statisticsRepository) {
    instance.statisticsRepository = statisticsRepository;
  }

  @InjectedFieldSignature("com.qualcomm.qti.gaiaclient.GaiaClientApplication.serviceRepository")
  public static void injectServiceRepository(GaiaClientApplication instance,
      ServiceRepository serviceRepository) {
    instance.serviceRepository = serviceRepository;
  }
}
