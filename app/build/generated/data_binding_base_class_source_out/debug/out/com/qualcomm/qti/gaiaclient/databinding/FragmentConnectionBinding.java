// Generated by data binding compiler. Do not edit!
package com.qualcomm.qti.gaiaclient.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.qualcomm.qti.gaiaclient.R;
import com.qualcomm.qti.gaiaclient.ui.connection.ConnectionViewData;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentConnectionBinding extends ViewDataBinding {
  @NonNull
  public final Button back;

  @NonNull
  public final TextView connectionLabel;

  @NonNull
  public final ProgressBar connectionProgress;

  @NonNull
  public final TextView connectionReason;

  @NonNull
  public final ImageView imageTick;

  @Bindable
  protected ConnectionViewData mConnection;

  protected FragmentConnectionBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button back, TextView connectionLabel, ProgressBar connectionProgress,
      TextView connectionReason, ImageView imageTick) {
    super(_bindingComponent, _root, _localFieldCount);
    this.back = back;
    this.connectionLabel = connectionLabel;
    this.connectionProgress = connectionProgress;
    this.connectionReason = connectionReason;
    this.imageTick = imageTick;
  }

  public abstract void setConnection(@Nullable ConnectionViewData connection);

  @Nullable
  public ConnectionViewData getConnection() {
    return mConnection;
  }

  @NonNull
  public static FragmentConnectionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_connection, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentConnectionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentConnectionBinding>inflateInternal(inflater, R.layout.fragment_connection, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentConnectionBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_connection, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentConnectionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentConnectionBinding>inflateInternal(inflater, R.layout.fragment_connection, null, false, component);
  }

  public static FragmentConnectionBinding bind(@NonNull View view) {
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
  public static FragmentConnectionBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentConnectionBinding)bind(component, view, R.layout.fragment_connection);
  }
}
