package com.qualcomm.qti.gaiaclient.ui.connection;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavArgs;
import com.qualcomm.qti.gaiaclient.repository.connection.Device;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class ConnectionFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private ConnectionFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private ConnectionFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings({
      "unchecked",
      "deprecation"
  })
  public static ConnectionFragmentArgs fromBundle(@NonNull Bundle bundle) {
    ConnectionFragmentArgs __result = new ConnectionFragmentArgs();
    bundle.setClassLoader(ConnectionFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("device")) {
      Device device;
      if (Parcelable.class.isAssignableFrom(Device.class) || Serializable.class.isAssignableFrom(Device.class)) {
        device = (Device) bundle.get("device");
      } else {
        throw new UnsupportedOperationException(Device.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
      if (device == null) {
        throw new IllegalArgumentException("Argument \"device\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("device", device);
    } else {
      throw new IllegalArgumentException("Required argument \"device\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static ConnectionFragmentArgs fromSavedStateHandle(
      @NonNull SavedStateHandle savedStateHandle) {
    ConnectionFragmentArgs __result = new ConnectionFragmentArgs();
    if (savedStateHandle.contains("device")) {
      Device device;
      device = savedStateHandle.get("device");
      if (device == null) {
        throw new IllegalArgumentException("Argument \"device\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("device", device);
    } else {
      throw new IllegalArgumentException("Required argument \"device\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Device getDevice() {
    return (Device) arguments.get("device");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("device")) {
      Device device = (Device) arguments.get("device");
      if (Parcelable.class.isAssignableFrom(Device.class) || device == null) {
        __result.putParcelable("device", Parcelable.class.cast(device));
      } else if (Serializable.class.isAssignableFrom(Device.class)) {
        __result.putSerializable("device", Serializable.class.cast(device));
      } else {
        throw new UnsupportedOperationException(Device.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public SavedStateHandle toSavedStateHandle() {
    SavedStateHandle __result = new SavedStateHandle();
    if (arguments.containsKey("device")) {
      Device device = (Device) arguments.get("device");
      if (Parcelable.class.isAssignableFrom(Device.class) || device == null) {
        __result.set("device", Parcelable.class.cast(device));
      } else if (Serializable.class.isAssignableFrom(Device.class)) {
        __result.set("device", Serializable.class.cast(device));
      } else {
        throw new UnsupportedOperationException(Device.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
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
    ConnectionFragmentArgs that = (ConnectionFragmentArgs) object;
    if (arguments.containsKey("device") != that.arguments.containsKey("device")) {
      return false;
    }
    if (getDevice() != null ? !getDevice().equals(that.getDevice()) : that.getDevice() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getDevice() != null ? getDevice().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "ConnectionFragmentArgs{"
        + "device=" + getDevice()
        + "}";
  }

  public static final class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(@NonNull ConnectionFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(@NonNull Device device) {
      if (device == null) {
        throw new IllegalArgumentException("Argument \"device\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("device", device);
    }

    @NonNull
    public ConnectionFragmentArgs build() {
      ConnectionFragmentArgs result = new ConnectionFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setDevice(@NonNull Device device) {
      if (device == null) {
        throw new IllegalArgumentException("Argument \"device\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("device", device);
      return this;
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public Device getDevice() {
      return (Device) arguments.get("device");
    }
  }
}
