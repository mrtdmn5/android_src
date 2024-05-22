package com.qualcomm.qti.gaiaclient.ui.feedback;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.qualcomm.qti.gaiaclient.R;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class FeedbackFormFragmentDirections {
  private FeedbackFormFragmentDirections() {
  }

  @NonNull
  public static ToSendFeedback toSendFeedback(@NonNull FeedbackForm form) {
    return new ToSendFeedback(form);
  }

  public static class ToSendFeedback implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ToSendFeedback(@NonNull FeedbackForm form) {
      if (form == null) {
        throw new IllegalArgumentException("Argument \"form\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("form", form);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ToSendFeedback setForm(@NonNull FeedbackForm form) {
      if (form == null) {
        throw new IllegalArgumentException("Argument \"form\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("form", form);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
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

    @Override
    public int getActionId() {
      return R.id.to_send_feedback;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public FeedbackForm getForm() {
      return (FeedbackForm) arguments.get("form");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ToSendFeedback that = (ToSendFeedback) object;
      if (arguments.containsKey("form") != that.arguments.containsKey("form")) {
        return false;
      }
      if (getForm() != null ? !getForm().equals(that.getForm()) : that.getForm() != null) {
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
      result = 31 * result + (getForm() != null ? getForm().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ToSendFeedback(actionId=" + getActionId() + "){"
          + "form=" + getForm()
          + "}";
    }
  }
}
