package com.qualcomm.qti.gaiaclient.ui.upgrade.download;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavArgs;
import com.qualcomm.qti.gaiaclient.repository.service.getfiles.FileData;
import com.qualcomm.qti.gaiaclient.repository.upgrade.UpgradeOptions;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class DownloadFileFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private DownloadFileFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private DownloadFileFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings({
      "unchecked",
      "deprecation"
  })
  public static DownloadFileFragmentArgs fromBundle(@NonNull Bundle bundle) {
    DownloadFileFragmentArgs __result = new DownloadFileFragmentArgs();
    bundle.setClassLoader(DownloadFileFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("file")) {
      FileData file;
      if (Parcelable.class.isAssignableFrom(FileData.class) || Serializable.class.isAssignableFrom(FileData.class)) {
        file = (FileData) bundle.get("file");
      } else {
        throw new UnsupportedOperationException(FileData.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
      if (file == null) {
        throw new IllegalArgumentException("Argument \"file\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("file", file);
    } else {
      throw new IllegalArgumentException("Required argument \"file\" is missing and does not have an android:defaultValue");
    }
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
  public static DownloadFileFragmentArgs fromSavedStateHandle(
      @NonNull SavedStateHandle savedStateHandle) {
    DownloadFileFragmentArgs __result = new DownloadFileFragmentArgs();
    if (savedStateHandle.contains("file")) {
      FileData file;
      file = savedStateHandle.get("file");
      if (file == null) {
        throw new IllegalArgumentException("Argument \"file\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("file", file);
    } else {
      throw new IllegalArgumentException("Required argument \"file\" is missing and does not have an android:defaultValue");
    }
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
  public FileData getFile() {
    return (FileData) arguments.get("file");
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

  @SuppressWarnings("unchecked")
  @NonNull
  public SavedStateHandle toSavedStateHandle() {
    SavedStateHandle __result = new SavedStateHandle();
    if (arguments.containsKey("file")) {
      FileData file = (FileData) arguments.get("file");
      if (Parcelable.class.isAssignableFrom(FileData.class) || file == null) {
        __result.set("file", Parcelable.class.cast(file));
      } else if (Serializable.class.isAssignableFrom(FileData.class)) {
        __result.set("file", Serializable.class.cast(file));
      } else {
        throw new UnsupportedOperationException(FileData.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
    }
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
    DownloadFileFragmentArgs that = (DownloadFileFragmentArgs) object;
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
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getFile() != null ? getFile().hashCode() : 0);
    result = 31 * result + (getOptions() != null ? getOptions().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "DownloadFileFragmentArgs{"
        + "file=" + getFile()
        + ", options=" + getOptions()
        + "}";
  }

  public static final class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(@NonNull DownloadFileFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(@NonNull FileData file, @NonNull UpgradeOptions options) {
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
    public DownloadFileFragmentArgs build() {
      DownloadFileFragmentArgs result = new DownloadFileFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setFile(@NonNull FileData file) {
      if (file == null) {
        throw new IllegalArgumentException("Argument \"file\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("file", file);
      return this;
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
    public FileData getFile() {
      return (FileData) arguments.get("file");
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public UpgradeOptions getOptions() {
      return (UpgradeOptions) arguments.get("options");
    }
  }
}
