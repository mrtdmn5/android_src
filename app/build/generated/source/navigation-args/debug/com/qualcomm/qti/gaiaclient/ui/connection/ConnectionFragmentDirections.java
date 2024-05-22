package com.qualcomm.qti.gaiaclient.ui.connection;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.qualcomm.qti.gaiaclient.R;

public class ConnectionFragmentDirections {
  private ConnectionFragmentDirections() {
  }

  @NonNull
  public static NavDirections toInformation() {
    return new ActionOnlyNavDirections(R.id.to_information);
  }

  @NonNull
  public static NavDirections back() {
    return new ActionOnlyNavDirections(R.id.back);
  }
}
