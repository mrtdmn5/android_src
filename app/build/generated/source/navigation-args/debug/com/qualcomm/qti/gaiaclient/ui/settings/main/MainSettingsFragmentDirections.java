package com.qualcomm.qti.gaiaclient.ui.settings.main;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.qualcomm.qti.gaiaclient.R;

public class MainSettingsFragmentDirections {
  private MainSettingsFragmentDirections() {
  }

  @NonNull
  public static NavDirections back() {
    return new ActionOnlyNavDirections(R.id.back);
  }

  @NonNull
  public static NavDirections toAncLegacy() {
    return new ActionOnlyNavDirections(R.id.to_anc_legacy);
  }

  @NonNull
  public static NavDirections toAudioCurationSettings() {
    return new ActionOnlyNavDirections(R.id.to_audio_curation_settings);
  }

  @NonNull
  public static NavDirections toMusicProcessing() {
    return new ActionOnlyNavDirections(R.id.to_music_processing);
  }

  @NonNull
  public static NavDirections toLogsSettings() {
    return new ActionOnlyNavDirections(R.id.to_logs_settings);
  }

  @NonNull
  public static NavDirections toUpgradeSettings() {
    return new ActionOnlyNavDirections(R.id.to_upgrade_settings);
  }

  @NonNull
  public static NavDirections toEarbudFit() {
    return new ActionOnlyNavDirections(R.id.to_earbud_fit);
  }

  @NonNull
  public static NavDirections toHandsetService() {
    return new ActionOnlyNavDirections(R.id.to_handset_service);
  }

  @NonNull
  public static NavDirections toVoiceProcessing() {
    return new ActionOnlyNavDirections(R.id.to_voice_processing);
  }

  @NonNull
  public static NavDirections toGestures() {
    return new ActionOnlyNavDirections(R.id.to_gestures);
  }

  @NonNull
  public static NavDirections toStatistics() {
    return new ActionOnlyNavDirections(R.id.to_statistics);
  }

  @NonNull
  public static NavDirections toFeedbackForm() {
    return new ActionOnlyNavDirections(R.id.to_feedback_form);
  }
}
