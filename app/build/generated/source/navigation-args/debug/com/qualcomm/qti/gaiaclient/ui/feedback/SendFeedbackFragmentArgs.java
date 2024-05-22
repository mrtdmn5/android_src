package com.qualcomm.qti.gaiaclient.ui.feedback;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavArgs;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class SendFeedbackFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private SendFeedbackFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private SendFeedbackFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings({
      "unchecked",
      "deprecation"
  })
  public static SendFeedbackFragmentArgs fromBundle(@NonNull Bundle bundle) {
    SendFeedbackFragmentArgs __result = new SendFeedbackFragmentArgs();
    bundle.setClassLoader(SendFeedbackFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("form")) {
      FeedbackForm form;
      if (Parcelable.class.isAssignableFrom(FeedbackForm.class) || Serializable.class.isAssignableFrom(FeedbackForm.class)) {
        form = (FeedbackForm) bundle.get("form");
      } else {
        throw new UnsupportedOperationException(FeedbackForm.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
      if (form == null) {
        throw new IllegalArgumentException("Argument \"form\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("form", form);
    } else {
      throw new IllegalArgumentException("Required argument \"form\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static SendFeedbackFragmentArgs fromSavedStateHandle(
      @NonNull SavedStateHandle savedStateHandle) {
    SendFeedbackFragmentArgs __result = new SendFeedbackFragmentArgs();
    if (savedStateHandle.contains("form")) {
      FeedbackForm form;
      form = savedStateHandle.get("form");
      if (form == null) {
        throw new IllegalArgumentException("Argument \"form\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("form", form);
    } else {
      throw new IllegalArgumentException("Required argument \"form\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public FeedbackForm getForm() {
    return (FeedbackForm) arguments.get("form");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("form")) {
      FeedbackForm form = (FeedbackForm) arguments.get("form");
      if (Parcelable.class.isAssignableFrom(FeedbackForm.class) || form == null) {
        __result.putParcelable("form", Parcelable.class.cast(form));
      } else if (Serializable.class.isAssignableFrom(FeedbackForm.class)) {
        __result.putSerializable("form", Serializable.class.cast(form));
      } else {
        throw new UnsupportedOperationException(FeedbackForm.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public SavedStateHandle toSavedStateHandle() {
    SavedStateHandle __result = new SavedStateHandle();
    if (arguments.containsKey("form")) {
      FeedbackForm form = (FeedbackForm) arguments.get("form");
      if (Parcelable.class.isAssignableFrom(FeedbackForm.class) || form == null) {
        __result.set("form", Parcelable.class.cast(form));
      } else if (Serializable.class.isAssignableFrom(FeedbackForm.class)) {
        __result.set("form", Serializable.class.cast(form));
      } else {
        throw new UnsupportedOperationException(FeedbackForm.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
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
    SendFeedbackFragmentArgs that = (SendFeedbackFragmentArgs) object;
    if (arguments.containsKey("form") != that.arguments.containsKey("form")) {
      return false;
    }
    if (getForm() != null ? !getForm().equals(that.getForm()) : that.getForm() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getForm() != null ? getForm().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "SendFeedbackFragmentArgs{"
        + "form=" + getForm()
        + "}";
  }

  public static final class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(@NonNull SendFeedbackFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(@NonNull FeedbackForm form) {
      if (form == null) {
        throw new IllegalArgumentException("Argument \"form\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("form", form);
    }

    @NonNull
    public SendFeedbackFragmentArgs build() {
      SendFeedbackFragmentArgs result = new SendFeedbackFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setForm(@NonNull FeedbackForm form) {
      if (form == null) {
        throw new IllegalArgumentException("Argument \"form\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("form", form);
      return this;
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public FeedbackForm getForm() {
      return (FeedbackForm) arguments.get("form");
    }
  }
}
