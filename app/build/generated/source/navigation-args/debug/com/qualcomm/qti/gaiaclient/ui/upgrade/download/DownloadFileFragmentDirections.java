package com.qualcomm.qti.gaiaclient.ui.upgrade.download;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.qualcomm.qti.gaiaclient.R;

public class DownloadFileFragmentDirections {
  private DownloadFileFragmentDirections() {
  }

  @NonNull
  public static NavDirections toUpgrade() {
    return new ActionOnlyNavDirections(R.id.to_upgrade);
  }
}
