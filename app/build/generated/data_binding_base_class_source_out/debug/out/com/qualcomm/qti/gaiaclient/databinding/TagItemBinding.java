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
import com.qualcomm.qti.gaiaclient.ui.upgrade.tags.TagViewData;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class TagItemBinding extends ViewDataBinding {
  @NonNull
  public final TextView content;

  @Bindable
  protected TagViewData mData;

  protected TagItemBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView content) {
    super(_bindingComponent, _root, _localFieldCount);
    this.content = content;
  }

  public abstract void setData(@Nullable TagViewData data);

  @Nullable
  public TagViewData getData() {
    return mData;
  }

  @NonNull
  public static TagItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.tag_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static TagItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<TagItemBinding>inflateInternal(inflater, R.layout.tag_item, root, attachToRoot, component);
  }

  @NonNull
  public static TagItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.tag_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static TagItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<TagItemBinding>inflateInternal(inflater, R.layout.tag_item, null, false, component);
  }

  public static TagItemBinding bind(@NonNull View view) {
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
  public static TagItemBinding bind(@NonNull View view, @Nullable Object component) {
    return (TagItemBinding)bind(component, view, R.layout.tag_item);
  }
}
