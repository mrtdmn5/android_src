package com.qualcomm.qti.gaiaclient.ui.discovery;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.qualcomm.qti.gaiaclient.R;
import com.qualcomm.qti.gaiaclient.repository.connection.Device;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class DiscoveryFragmentDirections {
  private DiscoveryFragmentDirections() {
  }

  @NonNull
  public static ToConnection toConnection(@NonNull Device device) {
    return new ToConnection(device);
  }

  public static class ToConnection implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ToConnection(@NonNull Device device) {
      if (device == null) {
        throw new IllegalArgumentException("Argument \"device\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("device", device);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ToConnection setDevice(@NonNull Device device) {
      if (device == null) {
        throw new IllegalArgumentException("Argument \"device\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("device", device);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
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

    @Override
    public int getActionId() {
      return R.id.to_connection;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public Device getDevice() {
      return (Device) arguments.get("device");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ToConnection that = (ToConnection) object;
      if (arguments.containsKey("device") != that.arguments.containsKey("device")) {
        return false;
      }
      if (getDevice() != null ? !getDevice().equals(that.getDevice()) : that.getDevice() != null) {
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
      result = 31 * result + (getDevice() != null ? getDevice().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ToConnection(actionId=" + getActionId() + "){"
          + "device=" + getDevice()
          + "}";
    }
  }
}
