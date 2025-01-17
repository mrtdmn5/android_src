// Generated by data binding compiler. Do not edit!
package com.qualcomm.qti.gaiaclient.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.qualcomm.qti.gaiaclient.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class PreferenceMediaBinding extends ViewDataBinding {
  @NonNull
  public final MediaPlaybackBinding mediaPlayback;

  @NonNull
  public final TextView title;

  protected PreferenceMediaBinding(Object _bindingComponent, View _root, int _localFieldCount,
      MediaPlaybackBinding mediaPlayback, TextView title) {
    super(_bindingComponent, _root, _localFieldCount);
    this.mediaPlayback = mediaPlayback;
    this.title = title;
  }

  @NonNull
  public static PreferenceMediaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.preference_media, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static PreferenceMediaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<PreferenceMediaBinding>inflateInternal(inflater, R.layout.preference_media, root, attachToRoot, component);
  }

  @NonNull
  public static PreferenceMediaBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.preference_media, null, false, component)
   */
  @NonNull
  @Deprecated
  public static PreferenceMediaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<PreferenceMediaBinding>inflateInternal(inflater, R.layout.preference_media, null, false, component);
  }

  public static PreferenceMediaBinding bind(@NonNull View view) {
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
  public static PreferenceMediaBinding bind(@NonNull View view, @Nullable Object component) {
    return (PreferenceMediaBinding)bind(component, view, R.layout.preference_media);
  }
}
