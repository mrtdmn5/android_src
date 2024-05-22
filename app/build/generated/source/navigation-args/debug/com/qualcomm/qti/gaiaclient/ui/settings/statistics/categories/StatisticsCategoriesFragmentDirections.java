package com.qualcomm.qti.gaiaclient.ui.settings.statistics.categories;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.qualcomm.qti.gaiaclient.R;
import com.qualcomm.qti.gaiaclient.core.gaia.qtil.data.CategoryID;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class StatisticsCategoriesFragmentDirections {
  private StatisticsCategoriesFragmentDirections() {
  }

  @NonNull
  public static ToStatisticsCategory toStatisticsCategory(@NonNull CategoryID category) {
    return new ToStatisticsCategory(category);
  }

  public static class ToStatisticsCategory implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ToStatisticsCategory(@NonNull CategoryID category) {
      if (category == null) {
        throw new IllegalArgumentException("Argument \"category\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("category", category);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ToStatisticsCategory setCategory(@NonNull CategoryID category) {
      if (category == null) {
        throw new IllegalArgumentException("Argument \"category\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("category", category);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
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

    @Override
    public int getActionId() {
      return R.id.to_statistics_category;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public CategoryID getCategory() {
      return (CategoryID) arguments.get("category");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ToStatisticsCategory that = (ToStatisticsCategory) object;
      if (arguments.containsKey("category") != that.arguments.containsKey("category")) {
        return false;
      }
      if (getCategory() != null ? !getCategory().equals(that.getCategory()) : that.getCategory() != null) {
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
      result = 31 * result + (getCategory() != null ? getCategory().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ToStatisticsCategory(actionId=" + getActionId() + "){"
          + "category=" + getCategory()
          + "}";
    }
  }
}
