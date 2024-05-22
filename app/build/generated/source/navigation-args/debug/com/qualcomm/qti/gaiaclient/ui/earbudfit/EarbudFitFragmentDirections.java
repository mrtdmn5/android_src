package com.qualcomm.qti.gaiaclient.ui.earbudfit;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.qualcomm.qti.gaiaclient.R;

public class EarbudFitFragmentDirections {
  private EarbudFitFragmentDirections() {
  }

  @NonNull
  public static NavDirections back() {
    return new ActionOnlyNavDirections(R.id.back);
  }
}
