// Generated by data binding compiler. Do not edit!
package com.qualcomm.qti.gaiaclient.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.qualcomm.qti.gaiaclient.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FeedbackItemBinding extends ViewDataBinding {
  @NonNull
  public final TextView contentTextView;

  @NonNull
  public final TextView titleTextView;

  @Bindable
  protected String mTitle;

  @Bindable
  protected String mContent;

  protected FeedbackItemBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView contentTextView, TextView titleTextView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.contentTextView = contentTextView;
    this.titleTextView = titleTextView;
  }

  public abstract void setTitle(@Nullable String title);

  @Nullable
  public String getTitle() {
    return mTitle;
  }

  public abstract void setContent(@Nullable String content);

  @Nullable
  public String getContent() {
    return mContent;
  }

  @NonNull
  public static FeedbackItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.feedback_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FeedbackItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FeedbackItemBinding>inflateInternal(inflater, R.layout.feedback_item, root, attachToRoot, component);
  }

  @NonNull
  public static FeedbackItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.feedback_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FeedbackItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FeedbackItemBinding>inflateInternal(inflater, R.layout.feedback_item, null, false, component);
  }

  public static FeedbackItemBinding bind(@NonNull View view) {
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
  public static FeedbackItemBinding bind(@NonNull View view, @Nullable Object component) {
    return (FeedbackItemBinding)bind(component, view, R.layout.feedback_item);
  }
}