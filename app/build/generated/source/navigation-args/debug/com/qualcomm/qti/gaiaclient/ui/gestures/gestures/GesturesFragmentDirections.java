package com.qualcomm.qti.gaiaclient.ui.gestures.gestures;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.qualcomm.qti.gaiaclient.R;
import com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.gestures.Gesture;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class GesturesFragmentDirections {
  private GesturesFragmentDirections() {
  }

  @NonNull
  public static ToGestureConfiguration toGestureConfiguration(@NonNull Gesture gesture) {
    return new ToGestureConfiguration(gesture);
  }

  public static class ToGestureConfiguration implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ToGestureConfiguration(@NonNull Gesture gesture) {
      if (gesture == null) {
        throw new IllegalArgumentException("Argument \"gesture\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("gesture", gesture);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ToGestureConfiguration setGesture(@NonNull Gesture gesture) {
      if (gesture == null) {
        throw new IllegalArgumentException("Argument \"gesture\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("gesture", gesture);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("gesture")) {
        Gesture gesture = (Gesture) arguments.get("gesture");
        if (Parcelable.class.isAssignableFrom(Gesture.class) || gesture == null) {
          __result.putParcelable("gesture", Parcelable.class.cast(gesture));
        } else if (Serializable.class.isAssignableFrom(Gesture.class)) {
          __result.putSerializable("gesture", Serializable.class.cast(gesture));
        } else {
          throw new UnsupportedOperationException(Gesture.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.to_gesture_configuration;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public Gesture getGesture() {
      return (Gesture) arguments.get("gesture");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ToGestureConfiguration that = (ToGestureConfiguration) object;
      if (arguments.containsKey("gesture") != that.arguments.containsKey("gesture")) {
        return false;
      }
      if (getGesture() != null ? !getGesture().equals(that.getGesture()) : that.getGesture() != null) {
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
      result = 31 * result + (getGesture() != null ? getGesture().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ToGestureConfiguration(actionId=" + getActionId() + "){"
          + "gesture=" + getGesture()
          + "}";
    }
  }
}
