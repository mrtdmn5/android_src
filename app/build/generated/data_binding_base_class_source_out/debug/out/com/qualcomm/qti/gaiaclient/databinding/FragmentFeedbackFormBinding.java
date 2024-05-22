// Generated by data binding compiler. Do not edit!
package com.qualcomm.qti.gaiaclient.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.qualcomm.qti.gaiaclient.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentFeedbackFormBinding extends ViewDataBinding {
  @NonNull
  public final FeedbackFormEntryBinding description;

  @NonNull
  public final FeedbackFormEntryBinding hardwareVersion;

  @NonNull
  public final FeedbackFormEntryBinding reporter;

  @NonNull
  public final Button send;

  @NonNull
  public final FeedbackFormEntryBinding title;

  protected FragmentFeedbackFormBinding(Object _bindingComponent, View _root, int _localFieldCount,
      FeedbackFormEntryBinding description, FeedbackFormEntryBinding hardwareVersion,
      FeedbackFormEntryBinding reporter, Button send, FeedbackFormEntryBinding title) {
    super(_bindingComponent, _root, _localFieldCount);
    this.description = description;
    this.hardwareVersion = hardwareVersion;
    this.reporter = reporter;
    this.send = send;
    this.title = title;
  }

  @NonNull
  public static FragmentFeedbackFormBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_feedback_form, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentFeedbackFormBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentFeedbackFormBinding>inflateInternal(inflater, R.layout.fragment_feedback_form, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentFeedbackFormBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_feedback_form, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentFeedbackFormBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentFeedbackFormBinding>inflateInternal(inflater, R.layout.fragment_feedback_form, null, false, component);
  }

  public static FragmentFeedbackFormBinding bind(@NonNull View view) {
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
  public static FragmentFeedbackFormBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentFeedbackFormBinding)bind(component, view, R.layout.fragment_feedback_form);
  }
}
