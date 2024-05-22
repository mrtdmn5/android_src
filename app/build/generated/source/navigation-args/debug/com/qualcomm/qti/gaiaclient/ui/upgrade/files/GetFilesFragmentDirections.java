package com.qualcomm.qti.gaiaclient.ui.upgrade.files;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.qualcomm.qti.gaiaclient.R;
import com.qualcomm.qti.gaiaclient.repository.service.getfiles.FileData;
import com.qualcomm.qti.gaiaclient.repository.upgrade.UpgradeOptions;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class GetFilesFragmentDirections {
  private GetFilesFragmentDirections() {
  }

  @NonNull
  public static ToDownloadFile toDownloadFile(@NonNull FileData file,
      @NonNull UpgradeOptions options) {
    return new ToDownloadFile(file, options);
  }

  public static class ToDownloadFile implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ToDownloadFile(@NonNull FileData file, @NonNull UpgradeOptions options) {
      if (file == null) {
        throw new IllegalArgumentException("Argument \"file\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("file", file);
      if (options == null) {
        throw new IllegalArgumentException("Argument \"options\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("options", options);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ToDownloadFile setFile(@NonNull FileData file) {
      if (file == null) {
        throw new IllegalArgumentException("Argument \"file\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("file", file);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ToDownloadFile setOptions(@NonNull UpgradeOptions options) {
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
      if (arguments.containsKey("file")) {
        FileData file = (FileData) arguments.get("file");
        if (Parcelable.class.isAssignableFrom(FileData.class) || file == null) {
          __result.putParcelable("file", Parcelable.class.cast(file));
        } else if (Serializable.class.isAssignableFrom(FileData.class)) {
          __result.putSerializable("file", Serializable.class.cast(file));
        } else {
          throw new UnsupportedOperationException(FileData.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }
      }
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
      return R.id.to_download_file;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public FileData getFile() {
      return (FileData) arguments.get("file");
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
      ToDownloadFile that = (ToDownloadFile) object;
      if (arguments.containsKey("file") != that.arguments.containsKey("file")) {
        return false;
      }
      if (getFile() != null ? !getFile().equals(that.getFile()) : that.getFile() != null) {
        return false;
      }
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
      result = 31 * result + (getFile() != null ? getFile().hashCode() : 0);
      result = 31 * result + (getOptions() != null ? getOptions().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ToDownloadFile(actionId=" + getActionId() + "){"
          + "file=" + getFile()
          + ", options=" + getOptions()
          + "}";
    }
  }
}
