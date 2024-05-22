package com.qualcomm.qti.gaiaclient.ui.settings.download;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.qualcomm.qti.gaiaclient.R;
import com.qualcomm.qti.gaiaclient.repository.upgrade.UpgradeOptions;
import com.qualcomm.qti.gaiaclient.ui.upgrade.files.FilesFilters;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class DownloadSettingsFragmentDirections {
  private DownloadSettingsFragmentDirections() {
  }

  @NonNull
  public static ToGetFiles toGetFiles(@NonNull UpgradeOptions options,
      @NonNull FilesFilters filters) {
    return new ToGetFiles(options, filters);
  }

  public static class ToGetFiles implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ToGetFiles(@NonNull UpgradeOptions options, @NonNull FilesFilters filters) {
      if (options == null) {
        throw new IllegalArgumentException("Argument \"options\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("options", options);
      if (filters == null) {
        throw new IllegalArgumentException("Argument \"filters\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("filters", filters);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ToGetFiles setOptions(@NonNull UpgradeOptions options) {
      if (options == null) {
        throw new IllegalArgumentException("Argument \"options\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("options", options);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ToGetFiles setFilters(@NonNull FilesFilters filters) {
      if (filters == null) {
        throw new IllegalArgumentException("Argument \"filters\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("filters", filters);
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
      if (arguments.containsKey("filters")) {
        FilesFilters filters = (FilesFilters) arguments.get("filters");
        if (Parcelable.class.isAssignableFrom(FilesFilters.class) || filters == null) {
          __result.putParcelable("filters", Parcelable.class.cast(filters));
        } else if (Serializable.class.isAssignableFrom(FilesFilters.class)) {
          __result.putSerializable("filters", Serializable.class.cast(filters));
        } else {
          throw new UnsupportedOperationException(FilesFilters.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.to_get_files;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public UpgradeOptions getOptions() {
      return (UpgradeOptions) arguments.get("options");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public FilesFilters getFilters() {
      return (FilesFilters) arguments.get("filters");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ToGetFiles that = (ToGetFiles) object;
      if (arguments.containsKey("options") != that.arguments.containsKey("options")) {
        return false;
      }
      if (getOptions() != null ? !getOptions().equals(that.getOptions()) : that.getOptions() != null) {
        return false;
      }
      if (arguments.containsKey("filters") != that.arguments.containsKey("filters")) {
        return false;
      }
      if (getFilters() != null ? !getFilters().equals(that.getFilters()) : that.getFilters() != null) {
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
      result = 31 * result + (getFilters() != null ? getFilters().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ToGetFiles(actionId=" + getActionId() + "){"
          + "options=" + getOptions()
          + ", filters=" + getFilters()
          + "}";
    }
  }
}
