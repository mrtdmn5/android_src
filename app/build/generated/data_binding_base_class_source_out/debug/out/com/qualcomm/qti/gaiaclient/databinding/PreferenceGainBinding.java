// Generated by data binding compiler. Do not edit!
package com.qualcomm.qti.gaiaclient.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.qualcomm.qti.gaiaclient.R;
import com.qualcomm.qti.gaiaclient.ui.settings.audiocuration.demo.GainPreferenceViewData;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class PreferenceGainBinding extends ViewDataBinding {
  @NonNull
  public final RingProgressBinding leftRing;

  @NonNull
  public final RingProgressBinding rightRing;

  @NonNull
  public final TextView title;

  @NonNull
  public final Guideline verticalGuideline;

  @Bindable
  protected GainPreferenceViewData mData;

  protected PreferenceGainBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RingProgressBinding leftRing, RingProgressBinding rightRing, TextView title,
      Guideline verticalGuideline) {
    super(_bindingComponent, _root, _localFieldCount);
    this.leftRing = leftRing;
    this.rightRing = rightRing;
    this.title = title;
    this.verticalGuideline = verticalGuideline;
  }

  public abstract void setData(@Nullable GainPreferenceViewData data);

  @Nullable
  public GainPreferenceViewData getData() {
    return mData;
  }

  @NonNull
  public static PreferenceGainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.preference_gain, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static PreferenceGainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<PreferenceGainBinding>inflateInternal(inflater, R.layout.preference_gain, root, attachToRoot, component);
  }

  @NonNull
  public static PreferenceGainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.preference_gain, null, false, component)
   */
  @NonNull
  @Deprecated
  public static PreferenceGainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<PreferenceGainBinding>inflateInternal(inflater, R.layout.preference_gain, null, false, component);
  }

  public static PreferenceGainBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static PreferenceGainBinding bind(@NonNull View view, @Nullable Object component) {
    return (PreferenceGainBinding)bind(component, view, R.layout.preference_gain);
  }
}
