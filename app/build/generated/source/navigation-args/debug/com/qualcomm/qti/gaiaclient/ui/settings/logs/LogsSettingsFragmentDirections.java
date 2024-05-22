package com.qualcomm.qti.gaiaclient.ui.settings.logs;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.qualcomm.qti.gaiaclient.R;

public class LogsSettingsFragmentDirections {
  private LogsSettingsFragmentDirections() {
  }

  @NonNull
  public static NavDirections toDownloadLogs() {
    return new ActionOnlyNavDirections(R.id.to_download_logs);
  }
}
