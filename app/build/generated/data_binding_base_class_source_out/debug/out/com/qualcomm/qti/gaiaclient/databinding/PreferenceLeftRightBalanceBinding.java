// Generated by data binding compiler. Do not edit!
package com.qualcomm.qti.gaiaclient.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.slider.Slider;
import com.qualcomm.qti.gaiaclient.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class PreferenceLeftRightBalanceBinding extends ViewDataBinding {
  @NonNull
  public final TextView label;

  @NonNull
  public final ImageView leftTouchpad;

  @NonNull
  public final ImageView rightTouchpad;

  @NonNull
  public final Slider slider;

  @NonNull
  public final TextView title;

  @Bindable
  protected Integer mValue;

  @Bindable
  protected String mLabelForValue;

  protected PreferenceLeftRightBalanceBinding(Object _bindingComponent, View _root,
      int _localFieldCount, TextView label, ImageView leftTouchpad, ImageView rightTouchpad,
      Slider slider, TextView title) {
    super(_bindingComponent, _root, _localFieldCount);
    this.label = label;
    this.leftTouchpad = leftTouchpad;
    this.rightTouchpad = rightTouchpad;
    this.slider = slider;
    this.title = title;
  }

  public abstract void setValue(@Nullable Integer value);

  @Nullable
  public Integer getValue() {
    return mValue;
  }

  public abstract void setLabelForValue(@Nullable String labelForValue);

  @Nullable
  public String getLabelForValue() {
    return mLabelForValue;
  }

  @NonNull
  public static PreferenceLeftRightBalanceBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.preference_left_right_balance, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static PreferenceLeftRightBalanceBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<PreferenceLeftRightBalanceBinding>inflateInternal(inflater, R.layout.preference_left_right_balance, root, attachToRoot, component);
  }

  @NonNull
  public static PreferenceLeftRightBalanceBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.preference_left_right_balance, null, false, component)
   */
  @NonNull
  @Deprecated
  public static PreferenceLeftRightBalanceBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<PreferenceLeftRightBalanceBinding>inflateInternal(inflater, R.layout.preference_left_right_balance, null, false, component);
  }

  public static PreferenceLeftRightBalanceBinding bind(@NonNull View view) {
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
  public static PreferenceLeftRightBalanceBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (PreferenceLeftRightBalanceBinding)bind(component, view, R.layout.preference_left_right_balance);
  }
}
