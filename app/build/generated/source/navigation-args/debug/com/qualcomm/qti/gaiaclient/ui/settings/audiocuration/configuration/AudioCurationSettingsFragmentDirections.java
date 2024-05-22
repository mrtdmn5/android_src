package com.qualcomm.qti.gaiaclient.ui.settings.audiocuration.configuration;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.qualcomm.qti.gaiaclient.R;

public class AudioCurationSettingsFragmentDirections {
  private AudioCurationSettingsFragmentDirections() {
  }

  @NonNull
  public static NavDirections toAudioCurationDemo() {
    return new ActionOnlyNavDirections(R.id.to_audio_curation_demo);
  }
}
