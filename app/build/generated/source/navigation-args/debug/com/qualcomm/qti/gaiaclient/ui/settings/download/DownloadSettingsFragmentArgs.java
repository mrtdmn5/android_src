package com.qualcomm.qti.gaiaclient.ui.settings.download;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavArgs;
import com.qualcomm.qti.gaiaclient.repository.upgrade.UpgradeOptions;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class DownloadSettingsFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private DownloadSettingsFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private DownloadSettingsFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings({
      "unchecked",
      "deprecation"
  })
  public static DownloadSettingsFragmentArgs fromBundle(@NonNull Bundle bundle) {
    DownloadSettingsFragmentArgs __result = new DownloadSettingsFragmentArgs();
    bundle.setClassLoader(DownloadSettingsFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("options")) {
      UpgradeOptions options;
      if (Parcelable.class.isAssignableFrom(UpgradeOptions.class) || Serializable.class.isAssignableFrom(UpgradeOptions.class)) {
        options = (UpgradeOptions) bundle.get("options");
      } else {
        throw new UnsupportedOperationException(UpgradeOptions.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
      if (options == null) {
        throw new IllegalArgumentException("Argument \"options\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("options", options);
    } else {
      throw new IllegalArgumentException("Required argument \"options\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static DownloadSettingsFragmentArgs fromSavedStateHandle(
      @NonNull SavedStateHandle savedStateHandle) {
    DownloadSettingsFragmentArgs __result = new DownloadSettingsFragmentArgs();
    if (savedStateHandle.contains("options")) {
      UpgradeOptions options;
      options = savedStateHandle.get("options");
      if (options == null) {
        throw new IllegalArgumentException("Argument \"options\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("options", options);
    } else {
      throw new IllegalArgumentException("Required argument \"options\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public UpgradeOptions getOptions() {
    return (UpgradeOptions) arguments.get("options");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
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

  @SuppressWarnings("unchecked")
  @NonNull
  public SavedStateHandle toSavedStateHandle() {
    SavedStateHandle __result = new SavedStateHandle();
    if (arguments.containsKey("options")) {
      UpgradeOptions options = (UpgradeOptions) arguments.get("options");
      if (Parcelable.class.isAssignableFrom(UpgradeOptions.class) || options == null) {
        __result.set("options", Parcelable.class.cast(options));
      } else if (Serializable.class.isAssignableFrom(UpgradeOptions.class)) {
        __result.set("options", Serializable.class.cast(options));
      } else {
        throw new UnsupportedOperationException(UpgradeOptions.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    DownloadSettingsFragmentArgs that = (DownloadSettingsFragmentArgs) object;
    if (arguments.containsKey("options") != that.arguments.containsKey("options")) {
      return false;
    }
    if (getOptions() != null ? !getOptions().equals(that.getOptions()) : that.getOptions() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getOptions() != null ? getOptions().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "DownloadSettingsFragmentArgs{"
        + "options=" + getOptions()
        + "}";
  }

  public static final class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(@NonNull DownloadSettingsFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(@NonNull UpgradeOptions options) {
      if (options == null) {
        throw new IllegalArgumentException("Argument \"options\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("options", options);
    }

    @NonNull
    public DownloadSettingsFragmentArgs build() {
      DownloadSettingsFragmentArgs result = new DownloadSettingsFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setOptions(@NonNull UpgradeOptions options) {
      if (options == null) {
        throw new IllegalArgumentException("Argument \"options\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("options", options);
      return this;
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public UpgradeOptions getOptions() {
      return (UpgradeOptions) arguments.get("options");
    }
  }
}
