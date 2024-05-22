package com.qualcomm.qti.gaiaclient.ui.feedback;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.qualcomm.qti.gaiaclient.R;

public class SendFeedbackFragmentDirections {
  private SendFeedbackFragmentDirections() {
  }

  @NonNull
  public static NavDirections back() {
    return new ActionOnlyNavDirections(R.id.back);
  }
}
