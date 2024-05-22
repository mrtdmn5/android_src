// Generated by data binding compiler. Do not edit!
package com.qualcomm.qti.gaiaclient.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.qualcomm.qti.gaiaclient.R;
import com.qualcomm.qti.gaiaclient.ui.settings.audiocuration.demo.DualRings;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class RingProgressBinding extends ViewDataBinding {
  @NonNull
  public final ProgressBar ring1;

  @NonNull
  public final ProgressBar ring2;

  @NonNull
  public final TextView ringsLabel;

  @NonNull
  public final TextView value1;

  @NonNull
  public final TextView value2;

  @Bindable
  protected DualRings mData;

  @Bindable
  protected String mTitle;

  protected RingProgressBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ProgressBar ring1, ProgressBar ring2, TextView ringsLabel, TextView value1, TextView value2) {
    super(_bindingComponent, _root, _localFieldCount);
    this.ring1 = ring1;
    this.ring2 = ring2;
    this.ringsLabel = ringsLabel;
    this.value1 = value1;
    this.value2 = value2;
  }

  public abstract void setData(@Nullable DualRings data);

  @Nullable
  public DualRings getData() {
    return mData;
  }

  public abstract void setTitle(@Nullable String title);

  @Nullable
  public String getTitle() {
    return mTitle;
  }

  @NonNull
  public static RingProgressBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.ring_progress, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static RingProgressBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<RingProgressBinding>inflateInternal(inflater, R.layout.ring_progress, root, attachToRoot, component);
  }

  @NonNull
  public static RingProgressBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.ring_progress, null, false, component)
   */
  @NonNull
  @Deprecated
  public static RingProgressBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<RingProgressBinding>inflateInternal(inflater, R.layout.ring_progress, null, false, component);
  }

  public static RingProgressBinding bind(@NonNull View view) {
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
  public static RingProgressBinding bind(@NonNull View view, @Nullable Object component) {
    return (RingProgressBinding)bind(component, view, R.layout.ring_progress);
  }
}