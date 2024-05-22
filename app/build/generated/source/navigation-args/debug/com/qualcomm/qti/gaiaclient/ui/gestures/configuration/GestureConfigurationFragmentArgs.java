package com.qualcomm.qti.gaiaclient.ui.gestures.configuration;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavArgs;
import com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.gestures.Gesture;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class GestureConfigurationFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private GestureConfigurationFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private GestureConfigurationFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings({
      "unchecked",
      "deprecation"
  })
  public static GestureConfigurationFragmentArgs fromBundle(@NonNull Bundle bundle) {
    GestureConfigurationFragmentArgs __result = new GestureConfigurationFragmentArgs();
    bundle.setClassLoader(GestureConfigurationFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("gesture")) {
      Gesture gesture;
      if (Parcelable.class.isAssignableFrom(Gesture.class) || Serializable.class.isAssignableFrom(Gesture.class)) {
        gesture = (Gesture) bundle.get("gesture");
      } else {
        throw new UnsupportedOperationException(Gesture.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
      if (gesture == null) {
        throw new IllegalArgumentException("Argument \"gesture\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("gesture", gesture);
    } else {
      throw new IllegalArgumentException("Required argument \"gesture\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static GestureConfigurationFragmentArgs fromSavedStateHandle(
      @NonNull SavedStateHandle savedStateHandle) {
    GestureConfigurationFragmentArgs __result = new GestureConfigurationFragmentArgs();
    if (savedStateHandle.contains("gesture")) {
      Gesture gesture;
      gesture = savedStateHandle.get("gesture");
      if (gesture == null) {
        throw new IllegalArgumentException("Argument \"gesture\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("gesture", gesture);
    } else {
      throw new IllegalArgumentException("Required argument \"gesture\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Gesture getGesture() {
    return (Gesture) arguments.get("gesture");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
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

  @SuppressWarnings("unchecked")
  @NonNull
  public SavedStateHandle toSavedStateHandle() {
    SavedStateHandle __result = new SavedStateHandle();
    if (arguments.containsKey("gesture")) {
      Gesture gesture = (Gesture) arguments.get("gesture");
      if (Parcelable.class.isAssignableFrom(Gesture.class) || gesture == null) {
        __result.set("gesture", Parcelable.class.cast(gesture));
      } else if (Serializable.class.isAssignableFrom(Gesture.class)) {
        __result.set("gesture", Serializable.class.cast(gesture));
      } else {
        throw new UnsupportedOperationException(Gesture.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
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
    GestureConfigurationFragmentArgs that = (GestureConfigurationFragmentArgs) object;
    if (arguments.containsKey("gesture") != that.arguments.containsKey("gesture")) {
      return false;
    }
    if (getGesture() != null ? !getGesture().equals(that.getGesture()) : that.getGesture() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getGesture() != null ? getGesture().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "GestureConfigurationFragmentArgs{"
        + "gesture=" + getGesture()
        + "}";
  }

  public static final class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(@NonNull GestureConfigurationFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(@NonNull Gesture gesture) {
      if (gesture == null) {
        throw new IllegalArgumentException("Argument \"gesture\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("gesture", gesture);
    }

    @NonNull
    public GestureConfigurationFragmentArgs build() {
      GestureConfigurationFragmentArgs result = new GestureConfigurationFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setGesture(@NonNull Gesture gesture) {
      if (gesture == null) {
        throw new IllegalArgumentException("Argument \"gesture\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("gesture", gesture);
      return this;
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public Gesture getGesture() {
      return (Gesture) arguments.get("gesture");
    }
  }
}
