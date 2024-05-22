package com.qualcomm.qti.gaiaclient.ui.settings.statistics.category;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavArgs;
import com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.CategoryID;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class StatisticsStatisticsFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private StatisticsStatisticsFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private StatisticsStatisticsFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings({
      "unchecked",
      "deprecation"
  })
  public static StatisticsStatisticsFragmentArgs fromBundle(@NonNull Bundle bundle) {
    StatisticsStatisticsFragmentArgs __result = new StatisticsStatisticsFragmentArgs();
    bundle.setClassLoader(StatisticsStatisticsFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("category")) {
      CategoryID category;
      if (Parcelable.class.isAssignableFrom(CategoryID.class) || Serializable.class.isAssignableFrom(CategoryID.class)) {
        category = (CategoryID) bundle.get("category");
      } else {
        throw new UnsupportedOperationException(CategoryID.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
      if (category == null) {
        throw new IllegalArgumentException("Argument \"category\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("category", category);
    } else {
      throw new IllegalArgumentException("Required argument \"category\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static StatisticsStatisticsFragmentArgs fromSavedStateHandle(
      @NonNull SavedStateHandle savedStateHandle) {
    StatisticsStatisticsFragmentArgs __result = new StatisticsStatisticsFragmentArgs();
    if (savedStateHandle.contains("category")) {
      CategoryID category;
      category = savedStateHandle.get("category");
      if (category == null) {
        throw new IllegalArgumentException("Argument \"category\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("category", category);
    } else {
      throw new IllegalArgumentException("Required argument \"category\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public CategoryID getCategory() {
    return (CategoryID) arguments.get("category");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("category")) {
      CategoryID category = (CategoryID) arguments.get("category");
      if (Parcelable.class.isAssignableFrom(CategoryID.class) || category == null) {
        __result.putParcelable("category", Parcelable.class.cast(category));
      } else if (Serializable.class.isAssignableFrom(CategoryID.class)) {
        __result.putSerializable("category", Serializable.class.cast(category));
      } else {
        throw new UnsupportedOperationException(CategoryID.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public SavedStateHandle toSavedStateHandle() {
    SavedStateHandle __result = new SavedStateHandle();
    if (arguments.containsKey("category")) {
      CategoryID category = (CategoryID) arguments.get("category");
      if (Parcelable.class.isAssignableFrom(CategoryID.class) || category == null) {
        __result.set("category", Parcelable.class.cast(category));
      } else if (Serializable.class.isAssignableFrom(CategoryID.class)) {
        __result.set("category", Serializable.class.cast(category));
      } else {
        throw new UnsupportedOperationException(CategoryID.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
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
    StatisticsStatisticsFragmentArgs that = (StatisticsStatisticsFragmentArgs) object;
    if (arguments.containsKey("category") != that.arguments.containsKey("category")) {
      return false;
    }
    if (getCategory() != null ? !getCategory().equals(that.getCategory()) : that.getCategory() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getCategory() != null ? getCategory().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "StatisticsStatisticsFragmentArgs{"
        + "category=" + getCategory()
        + "}";
  }

  public static final class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(@NonNull StatisticsStatisticsFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(@NonNull CategoryID category) {
      if (category == null) {
        throw new IllegalArgumentException("Argument \"category\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("category", category);
    }

    @NonNull
    public StatisticsStatisticsFragmentArgs build() {
      StatisticsStatisticsFragmentArgs result = new StatisticsStatisticsFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setCategory(@NonNull CategoryID category) {
      if (category == null) {
        throw new IllegalArgumentException("Argument \"category\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("category", category);
      return this;
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public CategoryID getCategory() {
      return (CategoryID) arguments.get("category");
    }
  }
}
