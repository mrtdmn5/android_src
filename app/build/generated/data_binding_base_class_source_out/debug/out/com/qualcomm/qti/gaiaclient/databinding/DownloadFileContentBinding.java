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
import androidx.recyclerview.widget.RecyclerView;
import com.qualcomm.qti.gaiaclient.R;
import com.qualcomm.qti.gaiaclient.ui.upgrade.download.DownloadViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class DownloadFileContentBinding extends ViewDataBinding {
  @NonNull
  public final TextView chipFamily;

  @NonNull
  public final TextView date;

  @NonNull
  public final TextView description;

  @NonNull
  public final TextView hardwareVersions;

  @NonNull
  public final TextView id;

  @NonNull
  public final RecyclerView tags;

  @NonNull
  public final TextView title;

  @Bindable
  protected DownloadViewModel mViewModel;

  protected DownloadFileContentBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView chipFamily, TextView date, TextView description, TextView hardwareVersions,
      TextView id, RecyclerView tags, TextView title) {
    super(_bindingComponent, _root, _localFieldCount);
    this.chipFamily = chipFamily;
    this.date = date;
    this.description = description;
    this.hardwareVersions = hardwareVersions;
    this.id = id;
    this.tags = tags;
    this.title = title;
  }

  public abstract void setViewModel(@Nullable DownloadViewModel viewModel);

  @Nullable
  public DownloadViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static DownloadFileContentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.download_file_content, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static DownloadFileContentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<DownloadFileContentBinding>inflateInternal(inflater, R.layout.download_file_content, root, attachToRoot, component);
  }

  @NonNull
  public static DownloadFileContentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.download_file_content, null, false, component)
   */
  @NonNull
  @Deprecated
  public static DownloadFileContentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<DownloadFileContentBinding>inflateInternal(inflater, R.layout.download_file_content, null, false, component);
  }

  public static DownloadFileContentBinding bind(@NonNull View view) {
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
  public static DownloadFileContentBinding bind(@NonNull View view, @Nullable Object component) {
    return (DownloadFileContentBinding)bind(component, view, R.layout.download_file_content);
  }
}