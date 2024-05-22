// Generated by data binding compiler. Do not edit!
package com.qualcomm.qti.gaiaclient.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.qualcomm.qti.gaiaclient.R;
import com.qualcomm.qti.gaiaclient.ui.common.MessageData;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentDiscoveryBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView devicesList;

  @NonNull
  public final NoDataMessageBinding emptyListMessageId;

  @NonNull
  public final SwipeRefreshLayout swipeRefreshLayout;

  @Bindable
  protected MessageData mMessage;

  protected FragmentDiscoveryBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RecyclerView devicesList, NoDataMessageBinding emptyListMessageId,
      SwipeRefreshLayout swipeRefreshLayout) {
    super(_bindingComponent, _root, _localFieldCount);
    this.devicesList = devicesList;
    this.emptyListMessageId = emptyListMessageId;
    this.swipeRefreshLayout = swipeRefreshLayout;
  }

  public abstract void setMessage(@Nullable MessageData message);

  @Nullable
  public MessageData getMessage() {
    return mMessage;
  }

  @NonNull
  public static FragmentDiscoveryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_discovery, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentDiscoveryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentDiscoveryBinding>inflateInternal(inflater, R.layout.fragment_discovery, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentDiscoveryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_discovery, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentDiscoveryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentDiscoveryBinding>inflateInternal(inflater, R.layout.fragment_discovery, null, false, component);
  }

  public static FragmentDiscoveryBinding bind(@NonNull View view) {
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
  public static FragmentDiscoveryBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentDiscoveryBinding)bind(component, view, R.layout.fragment_discovery);
  }
}