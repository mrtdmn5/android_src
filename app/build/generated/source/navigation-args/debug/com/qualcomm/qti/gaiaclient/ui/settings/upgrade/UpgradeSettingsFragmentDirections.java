package com.qualcomm.qti.gaiaclient.ui.settings.upgrade;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.qualcomm.qti.gaiaclient.R;
import com.qualcomm.qti.gaiaclient.repository.upgrade.UpgradeOptions;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class UpgradeSettingsFragmentDirections {
  private UpgradeSettingsFragmentDirections() {
  }

  @NonNull
  public static NavDirections toUpgrade() {
    return new ActionOnlyNavDirections(R.id.to_upgrade);
  }

  @NonNull
  public static ToDownloadSettings toDownloadSettings(@NonNull UpgradeOptions options) {
    return new ToDownloadSettings(options);
  }

  public static class ToDownloadSettings implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ToDownloadSettings(@NonNull UpgradeOptions options) {
      if (options == null) {
        throw new IllegalArgumentException("Argument \"options\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("options", options);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ToDownloadSettings setOptions(@NonNull UpgradeOptions options) {
      if (options == null) {
        throw new IllegalArgumentException("Argument \"options\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("options", options);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("options")) {
        UpgradeOptions options = (UpgradeOptions) arguments.get("options");
        if (Parcelable.class.isAssignableFrom(UpgradeOptions.class) || options == null) {
          __result.putParcelable("options", Parcelable.class.cast(options));
        } else if (Serializable.class.isAssignableFrom(UpgradeOptions.class)) {
          __result.putSerializable("options", Serializable.class.cast(options));
        } else {
          throw new UnsupportedOperationException(UpgradeOptions.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.to_download_settings;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public UpgradeOptions getOptions() {
      return (UpgradeOptions) arguments.get("options");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ToDownloadSettings that = (ToDownloadSettings) object;
      if (arguments.containsKey("options") != that.arguments.containsKey("options")) {
        return false;
      }
      if (getOptions() != null ? !getOptions().equals(that.getOptions()) : that.getOptions() != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getOptions() != null ? getOptions().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ToDownloadSettings(actionId=" + getActionId() + "){"
          + "options=" + getOptions()
          + "}";
    }
  }
}
