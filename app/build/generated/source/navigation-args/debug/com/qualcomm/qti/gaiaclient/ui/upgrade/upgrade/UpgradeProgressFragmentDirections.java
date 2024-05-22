package com.qualcomm.qti.gaiaclient.ui.upgrade.upgrade;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.qualcomm.qti.gaiaclient.R;

public class UpgradeProgressFragmentDirections {
  private UpgradeProgressFragmentDirections() {
  }

  @NonNull
  public static NavDirections back() {
    return new ActionOnlyNavDirections(R.id.back);
  }
}
